package com.fans.pojo;

public class DbFhdb {
    private String fhdbId;

    private String username;

    private String backupTime;

    private String tablename;

    private String sqlpath;

    private Integer type;

    private String dbsize;

    private String bz;

    public String getFhdbId() {
        return fhdbId;
    }

    public void setFhdbId(String fhdbId) {
        this.fhdbId = fhdbId == null ? null : fhdbId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getBackupTime() {
        return backupTime;
    }

    public void setBackupTime(String backupTime) {
        this.backupTime = backupTime == null ? null : backupTime.trim();
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    public String getSqlpath() {
        return sqlpath;
    }

    public void setSqlpath(String sqlpath) {
        this.sqlpath = sqlpath == null ? null : sqlpath.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDbsize() {
        return dbsize;
    }

    public void setDbsize(String dbsize) {
        this.dbsize = dbsize == null ? null : dbsize.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }
}