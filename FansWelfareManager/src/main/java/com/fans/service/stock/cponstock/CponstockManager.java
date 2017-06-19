package com.fans.service.stock.cponstock;

import com.fans.common.util.PageData;
import com.fans.entity.Page;

import java.util.List;

/** 
 * 说明： 上传卡密种类接口
 * 创建人：FH Q313596790
 * 创建时间：2017-06-15
 * @version
 */
public interface CponstockManager{

	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception;

	/**新增(批量)
	 * @param pdList
	 * @throws Exception
	 */
	public void saveAll(List<PageData> pdList)throws Exception;
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception;
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception;
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	public List<PageData> list(Page page)throws Exception;
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listAll(PageData pd)throws Exception;

	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception;
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception;

	/**根据上传表ID获取上传表详情列表
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> getCponstocklistByUploadId(PageData pd)throws Exception;

}

