package com.fans.mapper;

import com.fans.pojo.SysFhbutton;
import com.fans.pojo.SysFhbuttonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFhbuttonMapper {
    long countByExample(SysFhbuttonExample example);

    int deleteByExample(SysFhbuttonExample example);

    int deleteByPrimaryKey(String fhbuttonId);

    int insert(SysFhbutton record);

    int insertSelective(SysFhbutton record);

    List<SysFhbutton> selectByExample(SysFhbuttonExample example);

    SysFhbutton selectByPrimaryKey(String fhbuttonId);

    int updateByExampleSelective(@Param("record") SysFhbutton record, @Param("example") SysFhbuttonExample example);

    int updateByExample(@Param("record") SysFhbutton record, @Param("example") SysFhbuttonExample example);

    int updateByPrimaryKeySelective(SysFhbutton record);

    int updateByPrimaryKey(SysFhbutton record);
}