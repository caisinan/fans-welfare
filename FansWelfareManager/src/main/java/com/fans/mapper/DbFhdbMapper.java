package com.fans.mapper;

import com.fans.pojo.DbFhdb;
import com.fans.pojo.DbFhdbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbFhdbMapper {
    long countByExample(DbFhdbExample example);

    int deleteByExample(DbFhdbExample example);

    int deleteByPrimaryKey(String fhdbId);

    int insert(DbFhdb record);

    int insertSelective(DbFhdb record);

    List<DbFhdb> selectByExample(DbFhdbExample example);

    DbFhdb selectByPrimaryKey(String fhdbId);

    int updateByExampleSelective(@Param("record") DbFhdb record, @Param("example") DbFhdbExample example);

    int updateByExample(@Param("record") DbFhdb record, @Param("example") DbFhdbExample example);

    int updateByPrimaryKeySelective(DbFhdb record);

    int updateByPrimaryKey(DbFhdb record);
}