package com.fans.mapper;

import com.fans.pojo.SysDictionaries;
import com.fans.pojo.SysDictionariesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictionariesMapper {
    long countByExample(SysDictionariesExample example);

    int deleteByExample(SysDictionariesExample example);

    int deleteByPrimaryKey(String dictionariesId);

    int insert(SysDictionaries record);

    int insertSelective(SysDictionaries record);

    List<SysDictionaries> selectByExample(SysDictionariesExample example);

    SysDictionaries selectByPrimaryKey(String dictionariesId);

    int updateByExampleSelective(@Param("record") SysDictionaries record, @Param("example") SysDictionariesExample example);

    int updateByExample(@Param("record") SysDictionaries record, @Param("example") SysDictionariesExample example);

    int updateByPrimaryKeySelective(SysDictionaries record);

    int updateByPrimaryKey(SysDictionaries record);
}