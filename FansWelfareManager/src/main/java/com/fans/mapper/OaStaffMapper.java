package com.fans.mapper;

import com.fans.pojo.OaStaff;
import com.fans.pojo.OaStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OaStaffMapper {
    long countByExample(OaStaffExample example);

    int deleteByExample(OaStaffExample example);

    int deleteByPrimaryKey(String staffId);

    int insert(OaStaff record);

    int insertSelective(OaStaff record);

    List<OaStaff> selectByExample(OaStaffExample example);

    OaStaff selectByPrimaryKey(String staffId);

    int updateByExampleSelective(@Param("record") OaStaff record, @Param("example") OaStaffExample example);

    int updateByExample(@Param("record") OaStaff record, @Param("example") OaStaffExample example);

    int updateByPrimaryKeySelective(OaStaff record);

    int updateByPrimaryKey(OaStaff record);
}