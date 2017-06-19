package com.fans.pojo;

import java.util.Date;

public class Grapcard {
    private Long id;

    private String openid;

    private String wxnickname;

    private String username;

    private Long cardid;

    private Integer cardtype;

    private String couponname;

    private Integer denomination;

    private String wximageurl;

    private Date addtime;

    private Date starttime;

    private Date endtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getWxnickname() {
        return wxnickname;
    }

    public void setWxnickname(String wxnickname) {
        this.wxnickname = wxnickname == null ? null : wxnickname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getCardid() {
        return cardid;
    }

    public void setCardid(Long cardid) {
        this.cardid = cardid;
    }

    public Integer getCardtype() {
        return cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    public String getCouponname() {
        return couponname;
    }

    public void setCouponname(String couponname) {
        this.couponname = couponname == null ? null : couponname.trim();
    }

    public Integer getDenomination() {
        return denomination;
    }

    public void setDenomination(Integer denomination) {
        this.denomination = denomination;
    }

    public String getWximageurl() {
        return wximageurl;
    }

    public void setWximageurl(String wximageurl) {
        this.wximageurl = wximageurl == null ? null : wximageurl.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}