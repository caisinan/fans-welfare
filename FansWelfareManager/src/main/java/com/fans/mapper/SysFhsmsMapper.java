package com.fans.mapper;

import com.fans.pojo.SysFhsms;
import com.fans.pojo.SysFhsmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFhsmsMapper {
    long countByExample(SysFhsmsExample example);

    int deleteByExample(SysFhsmsExample example);

    int deleteByPrimaryKey(String fhsmsId);

    int insert(SysFhsms record);

    int insertSelective(SysFhsms record);

    List<SysFhsms> selectByExample(SysFhsmsExample example);

    SysFhsms selectByPrimaryKey(String fhsmsId);

    int updateByExampleSelective(@Param("record") SysFhsms record, @Param("example") SysFhsmsExample example);

    int updateByExample(@Param("record") SysFhsms record, @Param("example") SysFhsmsExample example);

    int updateByPrimaryKeySelective(SysFhsms record);

    int updateByPrimaryKey(SysFhsms record);
}