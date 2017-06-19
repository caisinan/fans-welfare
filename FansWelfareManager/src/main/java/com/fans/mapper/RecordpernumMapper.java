package com.fans.mapper;

import com.fans.pojo.Recordpernum;
import com.fans.pojo.RecordpernumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordpernumMapper {
    long countByExample(RecordpernumExample example);

    int deleteByExample(RecordpernumExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Recordpernum record);

    int insertSelective(Recordpernum record);

    List<Recordpernum> selectByExample(RecordpernumExample example);

    Recordpernum selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Recordpernum record, @Param("example") RecordpernumExample example);

    int updateByExample(@Param("record") Recordpernum record, @Param("example") RecordpernumExample example);

    int updateByPrimaryKeySelective(Recordpernum record);

    int updateByPrimaryKey(Recordpernum record);
}