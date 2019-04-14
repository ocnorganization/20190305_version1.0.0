package com.alexmillerning.pojo;

public class WBColor {
    private String colorId;

    private String colorName;

    private String colorRemark;

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId == null ? null : colorId.trim();
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName == null ? null : colorName.trim();
    }

    public String getColorRemark() {
        return colorRemark;
    }

    public void setColorRemark(String colorRemark) {
        this.colorRemark = colorRemark == null ? null : colorRemark.trim();
    }
}