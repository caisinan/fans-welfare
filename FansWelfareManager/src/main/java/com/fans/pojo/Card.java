package com.fans.pojo;

import java.util.Date;

public class Card {
    private Long cardid;

    private String couponcode;

    private String couponname;

    private Double couponprice;

    private String cardstate;

    private String cardcode;

    private String cardpwd;

    private Date validtimestart;

    private Date validtimeend;

    private Date cardgranttime;

    private Date cardvalidtime;

    private String isvalid;

    private String isactive;

    private Long activid;

    private Long couponid;

    private Long uploadid;

    private Long cpontempid;

    public Long getCardid() {
        return cardid;
    }

    public void setCardid(Long cardid) {
        this.cardid = cardid;
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

    public String getCardstate() {
        return cardstate;
    }

    public void setCardstate(String cardstate) {
        this.cardstate = cardstate == null ? null : cardstate.trim();
    }

    public String getCardcode() {
        return cardcode;
    }

    public void setCardcode(String cardcode) {
        this.cardcode = cardcode == null ? null : cardcode.trim();
    }

    public String getCardpwd() {
        return cardpwd;
    }

    public void setCardpwd(String cardpwd) {
        this.cardpwd = cardpwd == null ? null : cardpwd.trim();
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

    public Date getCardgranttime() {
        return cardgranttime;
    }

    public void setCardgranttime(Date cardgranttime) {
        this.cardgranttime = cardgranttime;
    }

    public Date getCardvalidtime() {
        return cardvalidtime;
    }

    public void setCardvalidtime(Date cardvalidtime) {
        this.cardvalidtime = cardvalidtime;
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public Long getActivid() {
        return activid;
    }

    public void setActivid(Long activid) {
        this.activid = activid;
    }

    public Long getCouponid() {
        return couponid;
    }

    public void setCouponid(Long couponid) {
        this.couponid = couponid;
    }

    public Long getUploadid() {
        return uploadid;
    }

    public void setUploadid(Long uploadid) {
        this.uploadid = uploadid;
    }

    public Long getCpontempid() {
        return cpontempid;
    }

    public void setCpontempid(Long cpontempid) {
        this.cpontempid = cpontempid;
    }
}