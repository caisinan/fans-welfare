package com.fans.pojo;

public class SysFhlog {
    private String fhlogId;

    private String username;

    private String cztime;

    private String content;

    public String getFhlogId() {
        return fhlogId;
    }

    public void setFhlogId(String fhlogId) {
        this.fhlogId = fhlogId == null ? null : fhlogId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCztime() {
        return cztime;
    }

    public void setCztime(String cztime) {
        this.cztime = cztime == null ? null : cztime.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}