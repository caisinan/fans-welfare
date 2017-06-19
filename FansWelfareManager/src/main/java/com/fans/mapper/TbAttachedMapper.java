package com.fans.mapper;

import com.fans.pojo.TbAttached;
import com.fans.pojo.TbAttachedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAttachedMapper {
    long countByExample(TbAttachedExample example);

    int deleteByExample(TbAttachedExample example);

    int deleteByPrimaryKey(String attachedId);

    int insert(TbAttached record);

    int insertSelective(TbAttached record);

    List<TbAttached> selectByExample(TbAttachedExample example);

    TbAttached selectByPrimaryKey(String attachedId);

    int updateByExampleSelective(@Param("record") TbAttached record, @Param("example") TbAttachedExample example);

    int updateByExample(@Param("record") TbAttached record, @Param("example") TbAttachedExample example);

    int updateByPrimaryKeySelective(TbAttached record);

    int updateByPrimaryKey(TbAttached record);
}