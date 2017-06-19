package com.fans.pojo;

public class DbTimingbackup {
    private String timingbackupId;

    private String jobname;

    private String createTime;

    private String tablename;

    private Integer status;

    private String fhtime;

    private String timeexplain;

    private String bz;

    public String getTimingbackupId() {
        return timingbackupId;
    }

    public void setTimingbackupId(String timingbackupId) {
        this.timingbackupId = timingbackupId == null ? null : timingbackupId.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFhtime() {
        return fhtime;
    }

    public void setFhtime(String fhtime) {
        this.fhtime = fhtime == null ? null : fhtime.trim();
    }

    public String getTimeexplain() {
        return timeexplain;
    }

    public void setTimeexplain(String timeexplain) {
        this.timeexplain = timeexplain == null ? null : timeexplain.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }
}