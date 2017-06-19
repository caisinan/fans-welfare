package com.fans.mapper;

import com.fans.pojo.OaFhfile;
import com.fans.pojo.OaFhfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OaFhfileMapper {
    long countByExample(OaFhfileExample example);

    int deleteByExample(OaFhfileExample example);

    int deleteByPrimaryKey(String fhfileId);

    int insert(OaFhfile record);

    int insertSelective(OaFhfile record);

    List<OaFhfile> selectByExample(OaFhfileExample example);

    OaFhfile selectByPrimaryKey(String fhfileId);

    int updateByExampleSelective(@Param("record") OaFhfile record, @Param("example") OaFhfileExample example);

    int updateByExample(@Param("record") OaFhfile record, @Param("example") OaFhfileExample example);

    int updateByPrimaryKeySelective(OaFhfile record);

    int updateByPrimaryKey(OaFhfile record);
}