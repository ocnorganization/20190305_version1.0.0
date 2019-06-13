/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils.pojo.design.size;

import java.util.List;

public class BranchSizefTable {
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
        private int sizeBranchId;
        private String sizeBranchName;
        private WfSizeBean wfSizeBean;

        public int getSizeBranchId() {
            return sizeBranchId;
        }

        public void setSizeBranchId(int sizeBranchId) {
            this.sizeBranchId = sizeBranchId;
        }

        public String getSizeBranchName() {
            return sizeBranchName;
        }

        public void setSizeBranchName(String sizeBranchName) {
            this.sizeBranchName = sizeBranchName;
        }

        public WfSizeBean getWfSizeBean() {
            return wfSizeBean;
        }

        public void setWfSizeBean(WfSizeBean wfSizeBean) {
            this.wfSizeBean = wfSizeBean;
        }

        public static class WfSizeBean {
            /**
             * colorName : 红
             */

            private String sizeName;

            public String getSizeName() {
                return sizeName;
            }

            public void setSizeName(String sizeName) {
                this.sizeName = sizeName;
            }
        }
    }
}
