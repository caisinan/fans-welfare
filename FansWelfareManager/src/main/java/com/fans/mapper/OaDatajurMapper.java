package com.fans.mapper;

import com.fans.pojo.OaDatajur;
import com.fans.pojo.OaDatajurExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OaDatajurMapper {
    long countByExample(OaDatajurExample example);

    int deleteByExample(OaDatajurExample example);

    int deleteByPrimaryKey(String datajurId);

    int insert(OaDatajur record);

    int insertSelective(OaDatajur record);

    List<OaDatajur> selectByExample(OaDatajurExample example);

    OaDatajur selectByPrimaryKey(String datajurId);

    int updateByExampleSelective(@Param("record") OaDatajur record, @Param("example") OaDatajurExample example);

    int updateByExample(@Param("record") OaDatajur record, @Param("example") OaDatajurExample example);

    int updateByPrimaryKeySelective(OaDatajur record);

    int updateByPrimaryKey(OaDatajur record);
}