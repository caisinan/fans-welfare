package com.fans.pojo;

public class Schedule {
    private Long scheid;

    private String schetype;

    private String schename;

    private String schestate;

    private Integer isvalid;

    private String remark;

    public Long getScheid() {
        return scheid;
    }

    public void setScheid(Long scheid) {
        this.scheid = scheid;
    }

    public String getSchetype() {
        return schetype;
    }

    public void setSchetype(String schetype) {
        this.schetype = schetype == null ? null : schetype.trim();
    }

    public String getSchename() {
        return schename;
    }

    public void setSchename(String schename) {
        this.schename = schename == null ? null : schename.trim();
    }

    public String getSchestate() {
        return schestate;
    }

    public void setSchestate(String schestate) {
        this.schestate = schestate == null ? null : schestate.trim();
    }

    public Integer getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalid = isvalid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}