package com.fans.mapper;

import com.fans.pojo.Cponstock;
import com.fans.pojo.CponstockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CponstockMapper {
    long countByExample(CponstockExample example);

    int deleteByExample(CponstockExample example);

    int deleteByPrimaryKey(Long couponid);

    int insert(Cponstock record);

    int insertSelective(Cponstock record);

    List<Cponstock> selectByExample(CponstockExample example);

    Cponstock selectByPrimaryKey(Long couponid);

    int updateByExampleSelective(@Param("record") Cponstock record, @Param("example") CponstockExample example);

    int updateByExample(@Param("record") Cponstock record, @Param("example") CponstockExample example);

    int updateByPrimaryKeySelective(Cponstock record);

    int updateByPrimaryKey(Cponstock record);
}