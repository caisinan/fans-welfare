package com.fans.mapper;

import com.fans.pojo.Wincoupon;
import com.fans.pojo.WincouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WincouponMapper {
    long countByExample(WincouponExample example);

    int deleteByExample(WincouponExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Wincoupon record);

    int insertSelective(Wincoupon record);

    List<Wincoupon> selectByExample(WincouponExample example);

    Wincoupon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Wincoupon record, @Param("example") WincouponExample example);

    int updateByExample(@Param("record") Wincoupon record, @Param("example") WincouponExample example);

    int updateByPrimaryKeySelective(Wincoupon record);

    int updateByPrimaryKey(Wincoupon record);
}