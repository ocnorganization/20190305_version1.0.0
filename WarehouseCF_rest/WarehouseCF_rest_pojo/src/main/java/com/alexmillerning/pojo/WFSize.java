package com.alexmillerning.pojo;

public class WFSize {
    private Integer sizeId;

    private String sizeName;

    private String sizeRemark;

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }

    public String getSizeRemark() {
        return sizeRemark;
    }

    public void setSizeRemark(String sizeRemark) {
        this.sizeRemark = sizeRemark == null ? null : sizeRemark.trim();
    }
}