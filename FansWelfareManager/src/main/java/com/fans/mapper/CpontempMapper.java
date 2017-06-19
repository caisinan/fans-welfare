package com.fans.mapper;

import com.fans.pojo.Cpontemp;
import com.fans.pojo.CpontempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpontempMapper {
    long countByExample(CpontempExample example);

    int deleteByExample(CpontempExample example);

    int deleteByPrimaryKey(Long cponid);

    int insert(Cpontemp record);

    int insertSelective(Cpontemp record);

    List<Cpontemp> selectByExample(CpontempExample example);

    Cpontemp selectByPrimaryKey(Long cponid);

    int updateByExampleSelective(@Param("record") Cpontemp record, @Param("example") CpontempExample example);

    int updateByExample(@Param("record") Cpontemp record, @Param("example") CpontempExample example);

    int updateByPrimaryKeySelective(Cpontemp record);

    int updateByPrimaryKey(Cpontemp record);
}