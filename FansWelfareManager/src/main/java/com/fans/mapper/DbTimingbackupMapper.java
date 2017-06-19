package com.fans.mapper;

import com.fans.pojo.DbTimingbackup;
import com.fans.pojo.DbTimingbackupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbTimingbackupMapper {
    long countByExample(DbTimingbackupExample example);

    int deleteByExample(DbTimingbackupExample example);

    int deleteByPrimaryKey(String timingbackupId);

    int insert(DbTimingbackup record);

    int insertSelective(DbTimingbackup record);

    List<DbTimingbackup> selectByExample(DbTimingbackupExample example);

    DbTimingbackup selectByPrimaryKey(String timingbackupId);

    int updateByExampleSelective(@Param("record") DbTimingbackup record, @Param("example") DbTimingbackupExample example);

    int updateByExample(@Param("record") DbTimingbackup record, @Param("example") DbTimingbackupExample example);

    int updateByPrimaryKeySelective(DbTimingbackup record);

    int updateByPrimaryKey(DbTimingbackup record);
}