package com.fans.mapper;

import com.fans.pojo.SysUserphoto;
import com.fans.pojo.SysUserphotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserphotoMapper {
    long countByExample(SysUserphotoExample example);

    int deleteByExample(SysUserphotoExample example);

    int deleteByPrimaryKey(String userphotoId);

    int insert(SysUserphoto record);

    int insertSelective(SysUserphoto record);

    List<SysUserphoto> selectByExample(SysUserphotoExample example);

    SysUserphoto selectByPrimaryKey(String userphotoId);

    int updateByExampleSelective(@Param("record") SysUserphoto record, @Param("example") SysUserphotoExample example);

    int updateByExample(@Param("record") SysUserphoto record, @Param("example") SysUserphotoExample example);

    int updateByPrimaryKeySelective(SysUserphoto record);

    int updateByPrimaryKey(SysUserphoto record);
}