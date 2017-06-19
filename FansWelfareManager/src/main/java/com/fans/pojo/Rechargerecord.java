package com.fans.pojo;

import java.util.Date;

public class Rechargerecord {
    private Long rechargeid;

    private String rusername;

    private String rwxopenid;

    private Long rmoney;

    private Long rgiftticket;

    private String rordersn;

    private Date raddtime;

    private Integer rpaystate;

    private Integer rpayway;

    public Long getRechargeid() {
        return rechargeid;
    }

    public void setRechargeid(Long rechargeid) {
        this.rechargeid = rechargeid;
    }

    public String getRusername() {
        return rusername;
    }

    public void setRusername(String rusername) {
        this.rusername = rusername == null ? null : rusername.trim();
    }

    public String getRwxopenid() {
        return rwxopenid;
    }

    public void setRwxopenid(String rwxopenid) {
        this.rwxopenid = rwxopenid == null ? null : rwxopenid.trim();
    }

    public Long getRmoney() {
        return rmoney;
    }

    public void setRmoney(Long rmoney) {
        this.rmoney = rmoney;
    }

    public Long getRgiftticket() {
        return rgiftticket;
    }

    public void setRgiftticket(Long rgiftticket) {
        this.rgiftticket = rgiftticket;
    }

    public String getRordersn() {
        return rordersn;
    }

    public void setRordersn(String rordersn) {
        this.rordersn = rordersn == null ? null : rordersn.trim();
    }

    public Date getRaddtime() {
        return raddtime;
    }

    public void setRaddtime(Date raddtime) {
        this.raddtime = raddtime;
    }

    public Integer getRpaystate() {
        return rpaystate;
    }

    public void setRpaystate(Integer rpaystate) {
        this.rpaystate = rpaystate;
    }

    public Integer getRpayway() {
        return rpayway;
    }

    public void setRpayway(Integer rpayway) {
        this.rpayway = rpayway;
    }
}