package com.fans.mapper;

import com.fans.pojo.WeixinTextmsg;
import com.fans.pojo.WeixinTextmsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeixinTextmsgMapper {
    long countByExample(WeixinTextmsgExample example);

    int deleteByExample(WeixinTextmsgExample example);

    int deleteByPrimaryKey(String textmsgId);

    int insert(WeixinTextmsg record);

    int insertSelective(WeixinTextmsg record);

    List<WeixinTextmsg> selectByExample(WeixinTextmsgExample example);

    WeixinTextmsg selectByPrimaryKey(String textmsgId);

    int updateByExampleSelective(@Param("record") WeixinTextmsg record, @Param("example") WeixinTextmsgExample example);

    int updateByExample(@Param("record") WeixinTextmsg record, @Param("example") WeixinTextmsgExample example);

    int updateByPrimaryKeySelective(WeixinTextmsg record);

    int updateByPrimaryKey(WeixinTextmsg record);
}