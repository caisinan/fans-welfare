package com.fans.mapper;

import com.fans.pojo.SysRoleFhbutton;
import com.fans.pojo.SysRoleFhbuttonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleFhbuttonMapper {
    long countByExample(SysRoleFhbuttonExample example);

    int deleteByExample(SysRoleFhbuttonExample example);

    int deleteByPrimaryKey(String rbId);

    int insert(SysRoleFhbutton record);

    int insertSelective(SysRoleFhbutton record);

    List<SysRoleFhbutton> selectByExample(SysRoleFhbuttonExample example);

    SysRoleFhbutton selectByPrimaryKey(String rbId);

    int updateByExampleSelective(@Param("record") SysRoleFhbutton record, @Param("example") SysRoleFhbuttonExample example);

    int updateByExample(@Param("record") SysRoleFhbutton record, @Param("example") SysRoleFhbuttonExample example);

    int updateByPrimaryKeySelective(SysRoleFhbutton record);

    int updateByPrimaryKey(SysRoleFhbutton record);
}