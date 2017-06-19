package com.fans.mapper;

import com.fans.pojo.Pointsdetail;
import com.fans.pojo.PointsdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointsdetailMapper {
    long countByExample(PointsdetailExample example);

    int deleteByExample(PointsdetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Pointsdetail record);

    int insertSelective(Pointsdetail record);

    List<Pointsdetail> selectByExample(PointsdetailExample example);

    Pointsdetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Pointsdetail record, @Param("example") PointsdetailExample example);

    int updateByExample(@Param("record") Pointsdetail record, @Param("example") PointsdetailExample example);

    int updateByPrimaryKeySelective(Pointsdetail record);

    int updateByPrimaryKey(Pointsdetail record);
}