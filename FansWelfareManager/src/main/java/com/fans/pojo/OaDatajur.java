package com.fans.pojo;

public class OaDatajur {
    private String datajurId;

    private String departmentIds;

    private String staffId;

    private String departmentId;

    public String getDatajurId() {
        return datajurId;
    }

    public void setDatajurId(String datajurId) {
        this.datajurId = datajurId == null ? null : datajurId.trim();
    }

    public String getDepartmentIds() {
        return departmentIds;
    }

    public void setDepartmentIds(String departmentIds) {
        this.departmentIds = departmentIds == null ? null : departmentIds.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }
}