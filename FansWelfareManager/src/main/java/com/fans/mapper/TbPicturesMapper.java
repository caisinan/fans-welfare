package com.fans.mapper;

import com.fans.pojo.TbPictures;
import com.fans.pojo.TbPicturesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPicturesMapper {
    long countByExample(TbPicturesExample example);

    int deleteByExample(TbPicturesExample example);

    int deleteByPrimaryKey(String picturesId);

    int insert(TbPictures record);

    int insertSelective(TbPictures record);

    List<TbPictures> selectByExample(TbPicturesExample example);

    TbPictures selectByPrimaryKey(String picturesId);

    int updateByExampleSelective(@Param("record") TbPictures record, @Param("example") TbPicturesExample example);

    int updateByExample(@Param("record") TbPictures record, @Param("example") TbPicturesExample example);

    int updateByPrimaryKeySelective(TbPictures record);

    int updateByPrimaryKey(TbPictures record);
}