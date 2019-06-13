package com.alexmillerning.pojo;

public class WFPart {
    private Integer partId;

    private String partName;

    private String partDes;

    private String partRemark;

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public String getPartDes() {
        return partDes;
    }

    public void setPartDes(String partDes) {
        this.partDes = partDes == null ? null : partDes.trim();
    }

    public String getPartRemark() {
        return partRemark;
    }

    public void setPartRemark(String partRemark) {
        this.partRemark = partRemark == null ? null : partRemark.trim();
    }
}