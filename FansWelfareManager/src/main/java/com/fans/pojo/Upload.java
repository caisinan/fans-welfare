package com.fans.pojo;

import java.util.Date;

public class Upload {
    private Long uploadid;

    private String uploadstate;

    private String uploadcode;

    private String filename;

    private Date uploadtime;

    private Integer uploadnum;

    private Integer investnum;

    private String operator;

    public Long getUploadid() {
        return uploadid;
    }

    public void setUploadid(Long uploadid) {
        this.uploadid = uploadid;
    }

    public String getUploadstate() {
        return uploadstate;
    }

    public void setUploadstate(String uploadstate) {
        this.uploadstate = uploadstate == null ? null : uploadstate.trim();
    }

    public String getUploadcode() {
        return uploadcode;
    }

    public void setUploadcode(String uploadcode) {
        this.uploadcode = uploadcode == null ? null : uploadcode.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Integer getUploadnum() {
        return uploadnum;
    }

    public void setUploadnum(Integer uploadnum) {
        this.uploadnum = uploadnum;
    }

    public Integer getInvestnum() {
        return investnum;
    }

    public void setInvestnum(Integer investnum) {
        this.investnum = investnum;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}