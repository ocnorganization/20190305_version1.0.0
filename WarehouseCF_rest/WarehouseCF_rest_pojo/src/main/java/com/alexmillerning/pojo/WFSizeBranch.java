/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.pojo;

public class WFSizeBranch {
    private Integer sizeBranchId;

    private String sizeBranchName;

    private Integer sizeBranchParent;

    private Integer sizeBranchRemark;

    //增加父类颜色关联查询
    private WFSize wfSize;
    private String sizeName;

    public Integer getSizeBranchId() {
        return sizeBranchId;
    }

    public void setSizeBranchId(Integer sizeBranchId) {
        this.sizeBranchId = sizeBranchId;
    }

    public String getSizeBranchName() {
        return sizeBranchName;
    }

    public void setSizeBranchName(String sizeBranchName) {
        this.sizeBranchName = sizeBranchName == null ? null : sizeBranchName.trim();
    }

    public Integer getSizeBranchParent() {
        return sizeBranchParent;
    }

    public void setSizeBranchParent(Integer sizeBranchParent) {
        this.sizeBranchParent = sizeBranchParent;
    }

    public Integer getSizeBranchRemark() {
        return sizeBranchRemark;
    }

    public void setSizeBranchRemark(Integer sizeBranchRemark) {
        this.sizeBranchRemark = sizeBranchRemark;
    }

    public WFSize getWfSize() {
        return wfSize;
    }

    public void setWfSize(WFSize wfSize) {
        this.wfSize = wfSize;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }
}