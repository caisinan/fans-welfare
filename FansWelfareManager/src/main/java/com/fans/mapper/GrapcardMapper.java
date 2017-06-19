package com.fans.mapper;

import com.fans.pojo.Grapcard;
import com.fans.pojo.GrapcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrapcardMapper {
    long countByExample(GrapcardExample example);

    int deleteByExample(GrapcardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Grapcard record);

    int insertSelective(Grapcard record);

    List<Grapcard> selectByExample(GrapcardExample example);

    Grapcard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Grapcard record, @Param("example") GrapcardExample example);

    int updateByExample(@Param("record") Grapcard record, @Param("example") GrapcardExample example);

    int updateByPrimaryKeySelective(Grapcard record);

    int updateByPrimaryKey(Grapcard record);
}