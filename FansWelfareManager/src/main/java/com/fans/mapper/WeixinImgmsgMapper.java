package com.fans.mapper;

import com.fans.pojo.WeixinImgmsg;
import com.fans.pojo.WeixinImgmsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeixinImgmsgMapper {
    long countByExample(WeixinImgmsgExample example);

    int deleteByExample(WeixinImgmsgExample example);

    int deleteByPrimaryKey(String imgmsgId);

    int insert(WeixinImgmsg record);

    int insertSelective(WeixinImgmsg record);

    List<WeixinImgmsg> selectByExample(WeixinImgmsgExample example);

    WeixinImgmsg selectByPrimaryKey(String imgmsgId);

    int updateByExampleSelective(@Param("record") WeixinImgmsg record, @Param("example") WeixinImgmsgExample example);

    int updateByExample(@Param("record") WeixinImgmsg record, @Param("example") WeixinImgmsgExample example);

    int updateByPrimaryKeySelective(WeixinImgmsg record);

    int updateByPrimaryKey(WeixinImgmsg record);
}