package com.fans.mapper;

import com.fans.pojo.Rechargerecord;
import com.fans.pojo.RechargerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargerecordMapper {
    long countByExample(RechargerecordExample example);

    int deleteByExample(RechargerecordExample example);

    int deleteByPrimaryKey(Long rechargeid);

    int insert(Rechargerecord record);

    int insertSelective(Rechargerecord record);

    List<Rechargerecord> selectByExample(RechargerecordExample example);

    Rechargerecord selectByPrimaryKey(Long rechargeid);

    int updateByExampleSelective(@Param("record") Rechargerecord record, @Param("example") RechargerecordExample example);

    int updateByExample(@Param("record") Rechargerecord record, @Param("example") RechargerecordExample example);

    int updateByPrimaryKeySelective(Rechargerecord record);

    int updateByPrimaryKey(Rechargerecord record);
}