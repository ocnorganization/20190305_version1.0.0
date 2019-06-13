package com.alexmillerning.pojo;

public class WFCraft {
    private Integer craftId;

    private String craftName;

    private String craftDes;

    private Integer craftRemark;

    public Integer getCraftId() {
        return craftId;
    }

    public void setCraftId(Integer craftId) {
        this.craftId = craftId;
    }

    public String getCraftName() {
        return craftName;
    }

    public void setCraftName(String craftName) {
        this.craftName = craftName == null ? null : craftName.trim();
    }

    public String getCraftDes() {
        return craftDes;
    }

    public void setCraftDes(String craftDes) {
        this.craftDes = craftDes == null ? null : craftDes.trim();
    }

    public Integer getCraftRemark() {
        return craftRemark;
    }

    public void setCraftRemark(Integer craftRemark) {
        this.craftRemark = craftRemark;
    }
}