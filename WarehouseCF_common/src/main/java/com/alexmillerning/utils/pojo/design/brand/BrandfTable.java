/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils.pojo.design.brand;

import java.util.List;

public class BrandfTable {

    /**
     * recordsFiltered : 21
     * draw : 1
     * recordsTotal : 21
     * data : [{"brandId":1,"brandName":"耐克","brandDes":"耐克运动系列","brandRemark":null},{"brandId":2,"brandName":"阿迪达斯","brandDes":"阿迪达斯运动系列","brandRemark":null}]
     */

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
        /**
         * brandId : 1
         * brandName : 耐克
         * brandDes : 耐克运动系列
         * brandRemark : null
         */

        private int brandId;
        private String brandName;
        private String brandDes;
        private Object brandRemark;

        public int getBrandId() {
            return brandId;
        }

        public void setBrandId(int brandId) {
            this.brandId = brandId;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getBrandDes() {
            return brandDes;
        }

        public void setBrandDes(String brandDes) {
            this.brandDes = brandDes;
        }

        public Object getBrandRemark() {
            return brandRemark;
        }

        public void setBrandRemark(Object brandRemark) {
            this.brandRemark = brandRemark;
        }
    }
}
