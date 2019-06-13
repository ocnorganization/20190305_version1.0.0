/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils.pojo.design.craft;

import java.util.List;

public class CraftfTable {
    private int recordsFiltered;
    private int draw;
    private int recordsTotal;
    private List<DataBean> data;

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private Integer craftId;
        private String craftName;
        private String craftDes;
        private Integer craftRemark;

        public Integer getCraftId() {
            return craftId;
        }

        public void setCraftId(Integer craftId) {
            this.craftId = craftId;
        }

        public String getCraftName() {
            return craftName;
        }

        public void setCraftName(String craftName) {
            this.craftName = craftName;
        }

        public String getCraftDes() {
            return craftDes;
        }

        public void setCraftDes(String craftDes) {
            this.craftDes = craftDes;
        }

        public Integer getCraftRemark() {
            return craftRemark;
        }

        public void setCraftRemark(Integer craftRemark) {
            this.craftRemark = craftRemark;
        }
    }
}
