package com.fans.mapper;

import com.fans.pojo.Recgargeticket;
import com.fans.pojo.RecgargeticketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecgargeticketMapper {
    long countByExample(RecgargeticketExample example);

    int deleteByExample(RecgargeticketExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Recgargeticket record);

    int insertSelective(Recgargeticket record);

    List<Recgargeticket> selectByExample(RecgargeticketExample example);

    Recgargeticket selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Recgargeticket record, @Param("example") RecgargeticketExample example);

    int updateByExample(@Param("record") Recgargeticket record, @Param("example") RecgargeticketExample example);

    int updateByPrimaryKeySelective(Recgargeticket record);

    int updateByPrimaryKey(Recgargeticket record);
}