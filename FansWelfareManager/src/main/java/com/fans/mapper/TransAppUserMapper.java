package com.fans.mapper;

import com.fans.pojo.TransAppUser;
import com.fans.pojo.TransAppUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransAppUserMapper {
    long countByExample(TransAppUserExample example);

    int deleteByExample(TransAppUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(TransAppUser record);

    int insertSelective(TransAppUser record);

    List<TransAppUser> selectByExample(TransAppUserExample example);

    TransAppUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") TransAppUser record, @Param("example") TransAppUserExample example);

    int updateByExample(@Param("record") TransAppUser record, @Param("example") TransAppUserExample example);

    int updateByPrimaryKeySelective(TransAppUser record);

    int updateByPrimaryKey(TransAppUser record);
}