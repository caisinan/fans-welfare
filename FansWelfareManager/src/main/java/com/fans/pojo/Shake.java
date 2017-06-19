package com.fans.pojo;

import java.util.Date;

public class Shake {
    private Long playerid;

    private String openid;

    private String playdate;

    private Integer count;

    private Boolean iswin;

    private Integer wincount;

    private Boolean isshare;

    private String prize;

    private Integer totalpoints;

    private Long cardid;

    private Date addtime;

    public Long getPlayerid() {
        return playerid;
    }

    public void setPlayerid(Long playerid) {
        this.playerid = playerid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getPlaydate() {
        return playdate;
    }

    public void setPlaydate(String playdate) {
        this.playdate = playdate == null ? null : playdate.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getIswin() {
        return iswin;
    }

    public void setIswin(Boolean iswin) {
        this.iswin = iswin;
    }

    public Integer getWincount() {
        return wincount;
    }

    public void setWincount(Integer wincount) {
        this.wincount = wincount;
    }

    public Boolean getIsshare() {
        return isshare;
    }

    public void setIsshare(Boolean isshare) {
        this.isshare = isshare;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize == null ? null : prize.trim();
    }

    public Integer getTotalpoints() {
        return totalpoints;
    }

    public void setTotalpoints(Integer totalpoints) {
        this.totalpoints = totalpoints;
    }

    public Long getCardid() {
        return cardid;
    }

    public void setCardid(Long cardid) {
        this.cardid = cardid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}