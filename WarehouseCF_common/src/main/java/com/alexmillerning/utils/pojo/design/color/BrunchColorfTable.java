/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils.pojo.design.color;

import java.util.List;

public class BrunchColorfTable {

    /**
     * recordsFiltered : 20
     * data : [{"colorBranchId":1,"colorBranchName":"朱红","wbColor":{"colorName":"红"}},{"colorBranchId":3,"colorBranchName":"炎","wbColor":{"colorName":"红"}},{"colorBranchId":4,"colorBranchName":"石榴红","wbColor":{"colorName":"红"}},{"colorBranchId":5,"colorBranchName":"大红","wbColor":{"colorName":"红"}},{"colorBranchId":6,"colorBranchName":"酡红","wbColor":{"colorName":"红"}},{"colorBranchId":7,"colorBranchName":"嫣红","wbColor":{"colorName":"红"}},{"colorBranchId":8,"colorBranchName":"粉红","wbColor":{"colorName":"红"}},{"colorBranchId":9,"colorBranchName":"海棠红","wbColor":{"colorName":"红"}},{"colorBranchId":10,"colorBranchName":"茜色","wbColor":{"colorName":"红"}},{"colorBranchId":11,"colorBranchName":"枣红","wbColor":{"colorName":"红"}}]
     * draw : 2
     * recordsTotal : 41
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
         * colorBranchId : 1
         * colorBranchName : 朱红
         * wbColor : {"colorName":"红"}
         */

        private int colorBranchId;
        private String colorBranchName;
        private WbColorBean wbColor;

        public int getColorBranchId() {
            return colorBranchId;
        }

        public void setColorBranchId(int colorBranchId) {
            this.colorBranchId = colorBranchId;
        }

        public String getColorBranchName() {
            return colorBranchName;
        }

        public void setColorBranchName(String colorBranchName) {
            this.colorBranchName = colorBranchName;
        }

        public WbColorBean getWbColor() {
            return wbColor;
        }

        public void setWbColor(WbColorBean wbColor) {
            this.wbColor = wbColor;
        }

        public static class WbColorBean {
            /**
             * colorName : 红
             */

            private String colorName;

            public String getColorName() {
                return colorName;
            }

            public void setColorName(String colorName) {
                this.colorName = colorName;
            }
        }
    }
}
