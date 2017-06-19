package com.fans.mapper;

import com.fans.pojo.Checkin;
import com.fans.pojo.CheckinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckinMapper {
    long countByExample(CheckinExample example);

    int deleteByExample(CheckinExample example);

    int deleteByPrimaryKey(Long playerid);

    int insert(Checkin record);

    int insertSelective(Checkin record);

    List<Checkin> selectByExample(CheckinExample example);

    Checkin selectByPrimaryKey(Long playerid);

    int updateByExampleSelective(@Param("record") Checkin record, @Param("example") CheckinExample example);

    int updateByExample(@Param("record") Checkin record, @Param("example") CheckinExample example);

    int updateByPrimaryKeySelective(Checkin record);

    int updateByPrimaryKey(Checkin record);
}