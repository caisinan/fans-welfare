package com.fans.mapper;

import com.fans.pojo.OaDepartment;
import com.fans.pojo.OaDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OaDepartmentMapper {
    long countByExample(OaDepartmentExample example);

    int deleteByExample(OaDepartmentExample example);

    int deleteByPrimaryKey(String departmentId);

    int insert(OaDepartment record);

    int insertSelective(OaDepartment record);

    List<OaDepartment> selectByExample(OaDepartmentExample example);

    OaDepartment selectByPrimaryKey(String departmentId);

    int updateByExampleSelective(@Param("record") OaDepartment record, @Param("example") OaDepartmentExample example);

    int updateByExample(@Param("record") OaDepartment record, @Param("example") OaDepartmentExample example);

    int updateByPrimaryKeySelective(OaDepartment record);

    int updateByPrimaryKey(OaDepartment record);
}