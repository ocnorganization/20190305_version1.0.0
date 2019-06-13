package com.alexmillerning.pojo;

public class WFSeason {
    private Integer seasonId;

    private String seasonName;

    private String seasonRemark;

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName == null ? null : seasonName.trim();
    }

    public String getSeasonRemark() {
        return seasonRemark;
    }

    public void setSeasonRemark(String seasonRemark) {
        this.seasonRemark = seasonRemark == null ? null : seasonRemark.trim();
    }
}