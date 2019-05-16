/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.pojo;

public class WFColorBranch {

    private Integer colorBranchId;

    private String colorBranchName;

    private String colorBranchParent;

    private String colorBranchRemark;

    //增加父类颜色关联查询
    private WBColor wbColor;
    private String colorName;

    public Integer getColorBranchId() {
        return colorBranchId;
    }

    public void setColorBranchId(Integer colorBranchId) {
        this.colorBranchId = colorBranchId;
    }

    public String getColorBranchName() {
        return colorBranchName;
    }

    public void setColorBranchName(String colorBranchName) {
        this.colorBranchName = colorBranchName == null ? null : colorBranchName.trim();
    }

    public String getColorBranchParent() {
        return colorBranchParent;
    }

    public void setColorBranchParent(String colorBranchParent) {
        this.colorBranchParent = colorBranchParent == null ? null : colorBranchParent.trim();
    }

    public String getColorBranchRemark() {
        return colorBranchRemark;
    }

    public void setColorBranchRemark(String colorBranchRemark) {
        this.colorBranchRemark = colorBranchRemark == null ? null : colorBranchRemark.trim();
    }


    public WBColor getWbColor() {
        return wbColor;
    }

    public void setWbColor(WBColor wbColor) {
        this.wbColor = wbColor;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}