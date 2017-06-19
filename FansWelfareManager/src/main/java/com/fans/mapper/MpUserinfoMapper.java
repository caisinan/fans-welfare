package com.fans.mapper;

import com.fans.pojo.MpUserinfo;
import com.fans.pojo.MpUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MpUserinfoMapper {
    long countByExample(MpUserinfoExample example);

    int deleteByExample(MpUserinfoExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(MpUserinfo record);

    int insertSelective(MpUserinfo record);

    List<MpUserinfo> selectByExample(MpUserinfoExample example);

    MpUserinfo selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") MpUserinfo record, @Param("example") MpUserinfoExample example);

    int updateByExample(@Param("record") MpUserinfo record, @Param("example") MpUserinfoExample example);

    int updateByPrimaryKeySelective(MpUserinfo record);

    int updateByPrimaryKey(MpUserinfo record);
}