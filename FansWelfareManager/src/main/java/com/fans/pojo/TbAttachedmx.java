package com.fans.pojo;

public class TbAttachedmx {
    private String attachedmxId;

    private String name;

    private String title;

    private String ctime;

    private Double price;

    private String attachedId;

    public String getAttachedmxId() {
        return attachedmxId;
    }

    public void setAttachedmxId(String attachedmxId) {
        this.attachedmxId = attachedmxId == null ? null : attachedmxId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAttachedId() {
        return attachedId;
    }

    public void setAttachedId(String attachedId) {
        this.attachedId = attachedId == null ? null : attachedId.trim();
    }
}