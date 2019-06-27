package com.alexmillerning.pojo;

public class WBStaffBasic {
    private Integer staffId;

    private String staffPassword;

    private Integer staffPower;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword == null ? null : staffPassword.trim();
    }

    public Integer getStaffPower() {
        return staffPower;
    }

    public void setStaffPower(Integer staffPower) {
        this.staffPower = staffPower;
    }
}