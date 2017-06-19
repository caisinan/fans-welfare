package com.fans.pojo;

import java.util.Date;

public class Cponstock {
    private Long couponid;

    private String coupontype;

    private String couponcode;

    private String couponname;

    private Double couponprice;

    private Integer prepnumcoupon;

    private Double prepmoneycoupon;

    private Integer realnumcoupon;

    private Double realmoneycoupon;

    private Date validtimestart;

    private Date validtimeend;

    private String hascardkey;

    private String isvalid;

    private Long activid;

    private Long uploadid;

    public Long getCouponid() {
        return couponid;
    }

    public void setCouponid(Long couponid) {
        this.couponid = couponid;
    }

    public String getCoupontype() {
        return coupontype;
    }

    public void setCoupontype(String coupontype) {
        this.coupontype = coupontype == null ? null : coupontype.trim();
    }

    public String getCouponcode() {
        return couponcode;
    }

    public void setCouponcode(String couponcode) {
        this.couponcode = couponcode == null ? null : couponcode.trim();
    }

    public String getCouponname() {
        return couponname;
    }

    public void setCouponname(String couponname) {
        this.couponname = couponname == null ? null : couponname.trim();
    }

    public Double getCouponprice() {
        return couponprice;
    }

    public void setCouponprice(Double couponprice) {
        this.couponprice = couponprice;
    }

    public Integer getPrepnumcoupon() {
        return prepnumcoupon;
    }

    public void setPrepnumcoupon(Integer prepnumcoupon) {
        this.prepnumcoupon = prepnumcoupon;
    }

    public Double getPrepmoneycoupon() {
        return prepmoneycoupon;
    }

    public void setPrepmoneycoupon(Double prepmoneycoupon) {
        this.prepmoneycoupon = prepmoneycoupon;
    }

    public Integer getRealnumcoupon() {
        return realnumcoupon;
    }

    public void setRealnumcoupon(Integer realnumcoupon) {
        this.realnumcoupon = realnumcoupon;
    }

    public Double getRealmoneycoupon() {
        return realmoneycoupon;
    }

    public void setRealmoneycoupon(Double realmoneycoupon) {
        this.realmoneycoupon = realmoneycoupon;
    }

    public Date getValidtimestart() {
        return validtimestart;
    }

    public void setValidtimestart(Date validtimestart) {
        this.validtimestart = validtimestart;
    }

    public Date getValidtimeend() {
        return validtimeend;
    }

    public void setValidtimeend(Date validtimeend) {
        this.validtimeend = validtimeend;
    }

    public String getHascardkey() {
        return hascardkey;
    }

    public void setHascardkey(String hascardkey) {
        this.hascardkey = hascardkey == null ? null : hascardkey.trim();
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }

    public Long getActivid() {
        return activid;
    }

    public void setActivid(Long activid) {
        this.activid = activid;
    }

    public Long getUploadid() {
        return uploadid;
    }

    public void setUploadid(Long uploadid) {
        this.uploadid = uploadid;
    }
}