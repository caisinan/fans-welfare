package com.fans.service.stock.cponstock.impl;

import com.fans.common.util.PageData;
import com.fans.dao.DaoSupport;
import com.fans.entity.Page;
import com.fans.service.stock.cponstock.CponstockManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/** 
 * 说明： 上传卡密种类
 * 创建人：FH Q313596790
 * 创建时间：2017-06-15
 * @version
 */
@Service("cponstockService")
public class CponstockService implements CponstockManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("CponstockMapper.save", pd);
	}

	/**新增（批量）
	 * @param pdList
	 * @throws Exception
	 */
	public void saveAll(List<PageData> pdList)throws Exception{
		dao.batchSave("CponstockMapper.batchSave", pdList);
	}

	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("CponstockMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("CponstockMapper.edit", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("CponstockMapper.datalistPage", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("CponstockMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("CponstockMapper.findById", pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("CponstockMapper.deleteAll", ArrayDATA_IDS);
	}

	/**列表
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> getCponstocklistByUploadId(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("CponstockMapper.getCponstocklistByUploadId", pd);
	}

}

