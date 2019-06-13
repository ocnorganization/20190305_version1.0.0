/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils.pojo.design.size;

public class BranchSizeEditReqParam {
    private int branchSizeId;
    private String branchSizeName;
    private String branchSizePid;

    public int getBranchSizeId() {
        return branchSizeId;
    }

    public void setBranchSizeId(int branchSizeId) {
        this.branchSizeId = branchSizeId;
    }

    public String getBranchSizeName() {
        return branchSizeName;
    }

    public void setBranchSizeName(String branchSizeName) {
        this.branchSizeName = branchSizeName;
    }

    public String getBranchSizePid() {
        return branchSizePid;
    }

    public void setBranchSizePid(String branchSizePid) {
        this.branchSizePid = branchSizePid;
    }
}
