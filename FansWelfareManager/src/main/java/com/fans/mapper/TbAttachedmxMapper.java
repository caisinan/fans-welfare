package com.fans.mapper;

import com.fans.pojo.TbAttachedmx;
import com.fans.pojo.TbAttachedmxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAttachedmxMapper {
    long countByExample(TbAttachedmxExample example);

    int deleteByExample(TbAttachedmxExample example);

    int deleteByPrimaryKey(String attachedmxId);

    int insert(TbAttachedmx record);

    int insertSelective(TbAttachedmx record);

    List<TbAttachedmx> selectByExample(TbAttachedmxExample example);

    TbAttachedmx selectByPrimaryKey(String attachedmxId);

    int updateByExampleSelective(@Param("record") TbAttachedmx record, @Param("example") TbAttachedmxExample example);

    int updateByExample(@Param("record") TbAttachedmx record, @Param("example") TbAttachedmxExample example);

    int updateByPrimaryKeySelective(TbAttachedmx record);

    int updateByPrimaryKey(TbAttachedmx record);
}