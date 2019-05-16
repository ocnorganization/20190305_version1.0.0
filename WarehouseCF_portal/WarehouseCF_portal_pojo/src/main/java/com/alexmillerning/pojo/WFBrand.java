/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.pojo;

public class WFBrand {
    private Integer brandId;

    private String brandName;

    private String brandDes;

    private String brandRemark;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandDes() {
        return brandDes;
    }

    public void setBrandDes(String brandDes) {
        this.brandDes = brandDes == null ? null : brandDes.trim();
    }

    public String getBrandRemark() {
        return brandRemark;
    }

    public void setBrandRemark(String brandRemark) {
        this.brandRemark = brandRemark == null ? null : brandRemark.trim();
    }
}