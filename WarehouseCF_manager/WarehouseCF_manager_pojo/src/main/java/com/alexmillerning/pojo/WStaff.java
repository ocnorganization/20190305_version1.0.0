package com.alexmillerning.pojo;

public class WStaff {

  private String staffId;

  private String staffName;

  private String staffGender;

  private String staffPosition;

  private Integer staffPower;

  public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId == null ? null : staffId.trim();
  }

  public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName == null ? null : staffName.trim();
  }

  public String getStaffGender() {
    return staffGender;
  }

  public void setStaffGender(String staffGender) {
    this.staffGender = staffGender == null ? null : staffGender.trim();
  }

  public String getStaffPosition() {
    return staffPosition;
  }

  public void setStaffPosition(String staffPosition) {
    this.staffPosition = staffPosition == null ? null : staffPosition.trim();
  }

  public Integer getStaffPower() {
    return staffPower;
  }

  public void setStaffPower(Integer staffPower) {
    this.staffPower = staffPower;
  }

}