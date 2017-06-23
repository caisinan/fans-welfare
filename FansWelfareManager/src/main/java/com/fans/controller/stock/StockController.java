package com.fans.controller.stock;

import com.fans.common.util.*;
import com.fans.controller.base.BaseController;
import com.fans.entity.Page;
import com.fans.entity.system.Role;
import com.fans.service.stock.card.CardManager;
import com.fans.service.stock.cponstock.CponstockManager;
import com.fans.service.stock.upload.UploadManager;
import com.fans.service.system.fhlog.FHlogManager;
import com.fans.service.system.menu.MenuManager;
import com.fans.service.system.role.RoleManager;
import com.fans.service.system.user.UserManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by caisinan on 2017/6/14.
 */
@Controller
@RequestMapping(value = "/stock")
public class StockController extends BaseController {

    String menuUrl = "stock/toimport.do"; //菜单地址(权限用)
    @Resource(name = "userService")
    private UserManager userService;
    @Resource(name = "roleService")
    private RoleManager roleService;
    @Resource(name = "menuService")
    private MenuManager menuService;
    @Resource(name = "fhlogService")
    private FHlogManager FHLOG;
    @Resource(name = "uploadService")
    private UploadManager uploadService;
    @Resource(name = "cponstockService")
    private CponstockManager cponstockService;
    @Resource(name = "cardService")
    private CardManager cardService;

    /**
     * 跳转到导入库存页面
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/uploadList")
    public ModelAndView toUploadList(Page page) throws Exception {
        ModelAndView mv = this.getModelAndView();
        PageData pd = new PageData();
        pd = this.getPageData();
        String keywords = pd.getString("keywords");                //关键词检索条件
        if (null != keywords && !"".equals(keywords)) {
            pd.put("keywords", keywords.trim());
        }
        String lastLoginStart = pd.getString("lastLoginStart");    //开始时间
        String lastLoginEnd = pd.getString("lastLoginEnd");        //结束时间
        if (lastLoginStart != null && !"".equals(lastLoginStart)) {
            pd.put("lastLoginStart", lastLoginStart + " 00:00:00");
        }
        if (lastLoginEnd != null && !"".equals(lastLoginEnd)) {
            pd.put("lastLoginEnd", lastLoginEnd + " 00:00:00");
        }
        page.setPd(pd);
        List<PageData> uploadList = uploadService.list(page);    //列出用户列表
        pd.put("ROLE_ID", "1");
        List<Role> roleList = roleService.listAllRolesByPId(pd);//列出所有系统用户角色
        mv.setViewName("stock/uploadList");
        mv.addObject("uploadList", uploadList);
        mv.addObject("roleList", roleList);
        mv.addObject("pd", pd);
        mv.addObject("QX", Jurisdiction.getHC());    //按钮权限
        return mv;

    }


    /**
     * 打开上传EXCEL页面
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/goUploadExcel")
    public ModelAndView goUploadExcel() throws Exception {
        ModelAndView mv = this.getModelAndView();
        mv.setViewName("stock/import");
        return mv;
    }

    /**
     * 从EXCEL导入到数据库
     *
     * @param file
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/readExcel")
    public ModelAndView readExcel(
            @RequestParam(value = "excel", required = false) MultipartFile file
    ) throws Exception {

        FHLOG.save(Jurisdiction.getUsername(), "从EXCEL导入到数据库");
        ModelAndView mv = this.getModelAndView();

        if (!Jurisdiction.buttonJurisdiction(menuUrl, "add")) {
            mv.addObject("msg", "error");
            return null;
        }
        if (null != file && !file.isEmpty()) {
            String filePath = PathUtil.getClasspath() + Const.FILEPATHFILE;                                //文件上传路径
            String fileName = FileUpload.fileUp(file, filePath, "userexcel");                            //执行上传
            List<PageData> listPd = (List) ObjectExcelRead.readExcel(filePath, fileName, 1, 0);        //执行读EXCEL操作,读出的数据导入List 2:从第3行开始；0:从第A列开始；

            /*存入数据库操作======================================*/
            PageData upload = new PageData();
            upload.put("UPLOADID", this.get32UUID());
            upload.put("UPLOADSTATE", 1); //上传状态（0：未上传；1：上传中；2：已上传）
            upload.put("UPLOADCODE", getActivityCode()); //上传批次
            upload.put("FILENAME", file.getOriginalFilename()); //Excel文件名
            upload.put("UPLOADTIME", new Date()); //导入时间
            upload.put("INVESTNUM", 0); //投放数量
            upload.put("OPERATOR", Jurisdiction.getUsername()); //操作人

            List<PageData> cardList = new ArrayList<>();
            List<PageData> cponStockList = new ArrayList<>();

            int uploadSum = 0;
            for (int i = 0; i < listPd.size(); i++) { // 遍历所有shell

                PageData cponStock = new PageData();
                cponStock.put("COUPONID", this.get32UUID());
                cponStock.put("REALNUMCOUPON", 0); //福利券实发数量
                cponStock.put("REALMONEYCOUPON", 0); //福利券实发总额

                cponStock.put("HASCARDKEY", 1); //是否导入卡密（0-未导入；1-已导入）
                cponStock.put("ISVALID", 1); //是否有效（0-无效；1-有效）
                cponStock.put("ACTIVID", null); //活动ID(冗余)
                cponStock.put("UPLOADID", upload.get("UPLOADID")); //上传表ID

                double prepMoney = 0;
                List<PageData> childList = (List) listPd.get(i);
                for (int j = 0; j < childList.size(); j++) { // 遍历当前shell中的所有记录数
                    PageData card = new PageData();
                    card.put("CARDID", this.get32UUID());
                    card.put("COUPONCODE", childList.get(j).getString("var0")); //福利券类型
                    card.put("COUPONNAME", childList.get(j).getString("sheetName")); //福利券名称
                    double cardPrice = Double.valueOf(childList.get(j).getString("var1"));
                    prepMoney += cardPrice;
                    card.put("COUPONPRICE", cardPrice); //福利券面值
                    card.put("CARDSTATE", 0); //卡密状态（0-对应福利券库存；1-对应活动；2-已发放给用户（未充值）；3-已充值；4-已过期；5-回收站）
                    card.put("CARDCODE", childList.get(j).getString("var2")); //卡号
                    card.put("CARDPWD", childList.get(j).getString("var3"));// 密码
                    card.put("CREATETIME", new Date());// 创建时间
                    card.put("VALIDTIMESTART", childList.get(j).getString("var4")); //福利券有效期起
                    card.put("VALIDTIMEEND", childList.get(j).getString("var5"));//福利券有效期止
                    card.put("CARDGRANTTIME", null); //卡密发放时间
                    card.put("CARDVALIDTIME", null);// 卡密激活时间
                    card.put("ISVALID", 1); //是否有效（0-无效；1-有效）
                    card.put("ISACTIVE", 0);// 是否激活（0-未激活；1-已激活）
                    card.put("ACTIVID", null); // 活动ID
                    card.put("COUPONID", cponStock.get("COUPONID")); //福利券ID
                    card.put("UPLOADID", upload.get("UPLOADID")); //上传表ID
                    card.put("CPONTEMPID", null); // cpontemp表id
                    cardList.add(card);
                }
                cponStock.put("VALIDTIMESTART", childList.get(0).getString("var4")); //有效期起
                cponStock.put("VALIDTIMEEND", childList.get(0).getString("var4")); //有效期止
                cponStock.put("COUPONTYPE", childList.get(0).getString("var0").substring(0,1)); //福利券类型(1-中国知网会员卡;2-吾喜杂志阅读券;3-CNKI学问福利券;4-知识超市福利券;5-大成编客福利券;6-手机知网福利券)
                cponStock.put("COUPONCODE", childList.get(0).getString("var0")); //福利券标识
                cponStock.put("COUPONPRICE", Double.valueOf(childList.get(0).getString("var1"))); //福利券面值
                cponStock.put("COUPONNAME", childList.get(0).getString("sheetName")); //福利券名称
                cponStock.put("PREPNUMCOUPON", childList.size()); //福利券预发数量
                cponStock.put("PREPMONEYCOUPON", prepMoney); //福利券预发总额
                cponStockList.add(cponStock);
                uploadSum += childList.size();
            }
            upload.put("UPLOADNUM", uploadSum); //导入总量
            uploadService.save(upload);
            cponstockService.saveAll(cponStockList);
            cardService.saveAll(cardList);
            /*存入数据库操作======================================*/
            mv.addObject("msg", "success");
        }
        mv.setViewName("save_result");
        return mv;
    }

    /**
     * 上传福利券
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/uploadCponstockList.do")
    public ModelAndView uploadCponstockList(Page page) throws Exception {
        ModelAndView mv = this.getModelAndView();
        PageData pd = new PageData();
        pd = this.getPageData();
        String keywords = pd.getString("keywords");                //关键词检索条件
        if (null != keywords && !"".equals(keywords)) {
            pd.put("keywords", keywords.trim());
        }
        String lastLoginStart = pd.getString("lastLoginStart");    //开始时间
        String lastLoginEnd = pd.getString("lastLoginEnd");        //结束时间
        if (lastLoginStart != null && !"".equals(lastLoginStart)) {
            pd.put("lastLoginStart", lastLoginStart + " 00:00:00");
        }
        if (lastLoginEnd != null && !"".equals(lastLoginEnd)) {
            pd.put("lastLoginEnd", lastLoginEnd + " 00:00:00");
        }
        page.setPd(pd);

        PageData upload = uploadService.findById(pd);    // 根据上传表ID查询上传记录
        List<PageData> cponstocklist = cponstockService.getCponstocklistByUploadId(pd);    // 根据上传表ID列出福利券类别
        List<PageData> cardlist = cardService.getCardlistByUploadId(pd);    // 根据上传表ID列出所有上传卡密记录

        String cponTypeStr = "";
        for (PageData pageData : cponstocklist) {
            cponTypeStr += pageData.getString("COUPONTYPE");
        }

        pd.put("ROLE_ID", "1");
        List<Role> roleList = roleService.listAllRolesByPId(pd);//列出所有系统用户角色
        mv.setViewName("stock/uploadCponstockList");
        mv.addObject("upload", upload);
        mv.addObject("cponstocklist", cponstocklist);
        mv.addObject("cardlist", cardlist);
        mv.addObject("roleList", roleList);
        mv.addObject("cponTypeStr", cponTypeStr);
        mv.addObject("pd", pd);
        mv.addObject("QX", Jurisdiction.getHC());    //按钮权限
        return mv;

    }

    /**
     * 上传卡密详情
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/uploadCardList")
    public ModelAndView uploadCardList(Page page) throws Exception {
        ModelAndView mv = this.getModelAndView();
        PageData pd = new PageData();
        pd = this.getPageData();
        String keywords = pd.getString("keywords");                //关键词检索条件
        if (null != keywords && !"".equals(keywords)) {
            pd.put("keywords", keywords.trim());
        }
        String lastLoginStart = pd.getString("lastLoginStart");    //开始时间
        String lastLoginEnd = pd.getString("lastLoginEnd");        //结束时间
        if (lastLoginStart != null && !"".equals(lastLoginStart)) {
            pd.put("lastLoginStart", lastLoginStart + " 00:00:00");
        }
        if (lastLoginEnd != null && !"".equals(lastLoginEnd)) {
            pd.put("lastLoginEnd", lastLoginEnd + " 00:00:00");
        }
        page.setPd(pd);

        PageData upload = uploadService.findById(pd);    // 根据上传表ID查询上传记录

        List<PageData> cardList = cardService.list(page);    // 根据上传表ID列出所有上传卡密记录

        pd.put("ROLE_ID", "1");
        List<Role> roleList = roleService.listAllRolesByPId(pd);//列出所有系统用户角色
        mv.setViewName("stock/uploadCardList");
        mv.addObject("upload", upload);
        mv.addObject("cardList", cardList);
        mv.addObject("roleList", roleList);
        mv.addObject("pd", pd);
        mv.addObject("QX", Jurisdiction.getHC());    //按钮权限
        return mv;

    }


    /**
     * 获取Excel上传批次
     *
     * @return
     */
    public String getActivityCode() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        String noLimit = "CNKI" + sdf.format(new Date());
        return noLimit;
    }

    /**去修改用户页面(系统用户列表修改)
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/goEditCard")
    public ModelAndView goEditCard() throws Exception{
        if(!Jurisdiction.buttonJurisdiction(menuUrl, "edit")){return null;} //校验权限
        ModelAndView mv = this.getModelAndView();
        PageData pd = new PageData();
        pd = this.getPageData();
        pd.put("ROLE_ID", "1");
        List<Role> roleList = roleService.listAllRolesByPId(pd);	//列出所有系统用户角色
        mv.addObject("fx", "user");
        pd = cardService.findById(pd);								//根据ID读取
        mv.setViewName("stock/editCard");
        mv.addObject("msg", "editU");
        mv.addObject("pd", pd);
        mv.addObject("roleList", roleList);
        return mv;
    }

    /**投放卡密，更新活动信息
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/goEditActivity")
    public ModelAndView goEditActivity() throws Exception{
        if(!Jurisdiction.buttonJurisdiction(menuUrl, "edit")){return null;} //校验权限
        ModelAndView mv = this.getModelAndView();
        PageData pd = new PageData();
        pd = this.getPageData();
        pd.put("ROLE_ID", "1");
        List<Role> roleList = roleService.listAllRolesByPId(pd);	//列出所有系统用户角色
        mv.addObject("fx", "user");
        pd = cardService.findById(pd);								//根据ID读取
        mv.setViewName("stock/editActivity");
        mv.addObject("msg", "editU");
        mv.addObject("pd", pd);
        mv.addObject("roleList", roleList);
        return mv;
    }


}
