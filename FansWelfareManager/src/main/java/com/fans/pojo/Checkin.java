package com.fans.pojo;

import java.util.Date;

public class Checkin {
    private Long playerid;

    private String openid;

    private String checkindate;

    private Integer consecutivedays;

    private Integer points;

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

    public String getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(String checkindate) {
        this.checkindate = checkindate == null ? null : checkindate.trim();
    }

    public Integer getConsecutivedays() {
        return consecutivedays;
    }

    public void setConsecutivedays(Integer consecutivedays) {
        this.consecutivedays = consecutivedays;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}