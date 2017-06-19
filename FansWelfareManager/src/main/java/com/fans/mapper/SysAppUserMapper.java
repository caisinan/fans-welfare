package com.fans.mapper;

import com.fans.pojo.SysAppUser;
import com.fans.pojo.SysAppUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAppUserMapper {
    long countByExample(SysAppUserExample example);

    int deleteByExample(SysAppUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(SysAppUser record);

    int insertSelective(SysAppUser record);

    List<SysAppUser> selectByExample(SysAppUserExample example);

    SysAppUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") SysAppUser record, @Param("example") SysAppUserExample example);

    int updateByExample(@Param("record") SysAppUser record, @Param("example") SysAppUserExample example);

    int updateByPrimaryKeySelective(SysAppUser record);

    int updateByPrimaryKey(SysAppUser record);
}