package com.fans.pojo;

public class SysUserphoto {
    private String userphotoId;

    private String username;

    private String photo0;

    private String photo1;

    private String photo2;

    private String photo3;

    public String getUserphotoId() {
        return userphotoId;
    }

    public void setUserphotoId(String userphotoId) {
        this.userphotoId = userphotoId == null ? null : userphotoId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhoto0() {
        return photo0;
    }

    public void setPhoto0(String photo0) {
        this.photo0 = photo0 == null ? null : photo0.trim();
    }

    public String getPhoto1() {
        return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1 == null ? null : photo1.trim();
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2 == null ? null : photo2.trim();
    }

    public String getPhoto3() {
        return photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3 == null ? null : photo3.trim();
    }
}