package com.fans.pojo;

import java.util.Date;

public class Cpontemp {
    private Long cponid;

    private String cpontype;

    private String cponcode;

    private String cponname;

    private Double cponprice;

    private Integer prepnumcoupon;

    private Double prepmoneycoupon;

    private Integer realnumcoupon;

    private Double realmoneycoupon;

    private Date validtimestart;

    private Date validtimeend;

    private Integer validcardnum;

    private Integer unvalidcardnum;

    private Integer expiredcardnum;

    private String hascardkey;

    private String isvalid;

    private Long activid;

    private Long uploadid;

    private Long couponid;

    public Long getCponid() {
        return cponid;
    }

    public void setCponid(Long cponid) {
        this.cponid = cponid;
    }

    public String getCpontype() {
        return cpontype;
    }

    public void setCpontype(String cpontype) {
        this.cpontype = cpontype == null ? null : cpontype.trim();
    }

    public String getCponcode() {
        return cponcode;
    }

    public void setCponcode(String cponcode) {
        this.cponcode = cponcode == null ? null : cponcode.trim();
    }

    public String getCponname() {
        return cponname;
    }

    public void setCponname(String cponname) {
        this.cponname = cponname == null ? null : cponname.trim();
    }

    public Double getCponprice() {
        return cponprice;
    }

    public void setCponprice(Double cponprice) {
        this.cponprice = cponprice;
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

    public Integer getValidcardnum() {
        return validcardnum;
    }

    public void setValidcardnum(Integer validcardnum) {
        this.validcardnum = validcardnum;
    }

    public Integer getUnvalidcardnum() {
        return unvalidcardnum;
    }

    public void setUnvalidcardnum(Integer unvalidcardnum) {
        this.unvalidcardnum = unvalidcardnum;
    }

    public Integer getExpiredcardnum() {
        return expiredcardnum;
    }

    public void setExpiredcardnum(Integer expiredcardnum) {
        this.expiredcardnum = expiredcardnum;
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

    public Long getCouponid() {
        return couponid;
    }

    public void setCouponid(Long couponid) {
        this.couponid = couponid;
    }
}