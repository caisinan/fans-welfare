package com.fans.mapper;

import com.fans.pojo.Imagetext;
import com.fans.pojo.ImagetextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImagetextMapper {
    long countByExample(ImagetextExample example);

    int deleteByExample(ImagetextExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Imagetext record);

    int insertSelective(Imagetext record);

    List<Imagetext> selectByExampleWithBLOBs(ImagetextExample example);

    List<Imagetext> selectByExample(ImagetextExample example);

    Imagetext selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Imagetext record, @Param("example") ImagetextExample example);

    int updateByExampleWithBLOBs(@Param("record") Imagetext record, @Param("example") ImagetextExample example);

    int updateByExample(@Param("record") Imagetext record, @Param("example") ImagetextExample example);

    int updateByPrimaryKeySelective(Imagetext record);

    int updateByPrimaryKeyWithBLOBs(Imagetext record);

    int updateByPrimaryKey(Imagetext record);
}