package com.fans.pojo;

public class SysLoginimg {
    private String loginimgId;

    private String name;

    private String filepath;

    private Integer type;

    private Integer forder;

    public String getLoginimgId() {
        return loginimgId;
    }

    public void setLoginimgId(String loginimgId) {
        this.loginimgId = loginimgId == null ? null : loginimgId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getForder() {
        return forder;
    }

    public void setForder(Integer forder) {
        this.forder = forder;
    }
}