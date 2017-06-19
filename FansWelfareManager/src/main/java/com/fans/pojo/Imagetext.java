package com.fans.pojo;

import java.util.Date;

public class Imagetext {
    private Long id;

    private String buttontype;

    private String title;

    private String author;

    private String picurl;

    private String zhaiyao;

    private String sourcelink;

    private Date createon;

    private Date date;

    private Integer weekofyear;

    private String twurl;

    private String bodytext;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getButtontype() {
        return buttontype;
    }

    public void setButtontype(String buttontype) {
        this.buttontype = buttontype == null ? null : buttontype.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public String getZhaiyao() {
        return zhaiyao;
    }

    public void setZhaiyao(String zhaiyao) {
        this.zhaiyao = zhaiyao == null ? null : zhaiyao.trim();
    }

    public String getSourcelink() {
        return sourcelink;
    }

    public void setSourcelink(String sourcelink) {
        this.sourcelink = sourcelink == null ? null : sourcelink.trim();
    }

    public Date getCreateon() {
        return createon;
    }

    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getWeekofyear() {
        return weekofyear;
    }

    public void setWeekofyear(Integer weekofyear) {
        this.weekofyear = weekofyear;
    }

    public String getTwurl() {
        return twurl;
    }

    public void setTwurl(String twurl) {
        this.twurl = twurl == null ? null : twurl.trim();
    }

    public String getBodytext() {
        return bodytext;
    }

    public void setBodytext(String bodytext) {
        this.bodytext = bodytext == null ? null : bodytext.trim();
    }
}