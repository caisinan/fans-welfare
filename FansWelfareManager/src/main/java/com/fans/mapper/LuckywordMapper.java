package com.fans.mapper;

import com.fans.pojo.Luckyword;
import com.fans.pojo.LuckywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LuckywordMapper {
    long countByExample(LuckywordExample example);

    int deleteByExample(LuckywordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Luckyword record);

    int insertSelective(Luckyword record);

    List<Luckyword> selectByExample(LuckywordExample example);

    Luckyword selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Luckyword record, @Param("example") LuckywordExample example);

    int updateByExample(@Param("record") Luckyword record, @Param("example") LuckywordExample example);

    int updateByPrimaryKeySelective(Luckyword record);

    int updateByPrimaryKey(Luckyword record);
}