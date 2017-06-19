package com.fans.mapper;

import com.fans.pojo.Shake;
import com.fans.pojo.ShakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShakeMapper {
    long countByExample(ShakeExample example);

    int deleteByExample(ShakeExample example);

    int deleteByPrimaryKey(Long playerid);

    int insert(Shake record);

    int insertSelective(Shake record);

    List<Shake> selectByExample(ShakeExample example);

    Shake selectByPrimaryKey(Long playerid);

    int updateByExampleSelective(@Param("record") Shake record, @Param("example") ShakeExample example);

    int updateByExample(@Param("record") Shake record, @Param("example") ShakeExample example);

    int updateByPrimaryKeySelective(Shake record);

    int updateByPrimaryKey(Shake record);
}