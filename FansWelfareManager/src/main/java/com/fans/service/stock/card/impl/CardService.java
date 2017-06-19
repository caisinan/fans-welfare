package com.fans.service.stock.card.impl;

import com.fans.common.util.PageData;
import com.fans.dao.DaoSupport;
import com.fans.entity.Page;
import com.fans.service.stock.card.CardManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/** 
 * 说明： 卡密
 * 创建人：FH Q313596790
 * 创建时间：2017-06-15
 * @version
 */
@Service("cardService")
public class CardService implements CardManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("CardMapper.save", pd);
	}

	/**新增（批量）
	 * @param pdList
	 * @throws Exception
	 */
	public void saveAll(List<PageData> pdList)throws Exception{
		dao.batchSave("CardMapper.batchSave", pdList);
	}

	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("CardMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("CardMapper.edit", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("CardMapper.datalistPage", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("CardMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("CardMapper.findById", pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("CardMapper.deleteAll", ArrayDATA_IDS);
	}

	/**根据上传ID获取卡密(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> getCardlistByUploadId(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("CardMapper.getCardlistByUploadId", pd);
	}
}

