package com.fans.mapper;

import com.fans.pojo.Shakedetails;
import com.fans.pojo.ShakedetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShakedetailsMapper {
    long countByExample(ShakedetailsExample example);

    int deleteByExample(ShakedetailsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Shakedetails record);

    int insertSelective(Shakedetails record);

    List<Shakedetails> selectByExample(ShakedetailsExample example);

    Shakedetails selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Shakedetails record, @Param("example") ShakedetailsExample example);

    int updateByExample(@Param("record") Shakedetails record, @Param("example") ShakedetailsExample example);

    int updateByPrimaryKeySelective(Shakedetails record);

    int updateByPrimaryKey(Shakedetails record);
}