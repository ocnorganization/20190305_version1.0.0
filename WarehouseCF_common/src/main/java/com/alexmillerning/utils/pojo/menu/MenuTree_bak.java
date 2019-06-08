/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils.pojo.menu;

import java.util.List;

public class MenuTree_bak {

    /**
     * child : [{"child":[],"menuid":"11","menuname":"颜色","menustatus":"CLOSED","menuurl":"/design/color/data.html","pmenuid":"1"},{"child":[],"menuid":"12","menuname":"品牌","menustatus":"CLOSED","menuurl":"/design/color/data.html","pmenuid":"1"}]
     * menuid : 1
     * menuname : 设计元素
     * menustatus : CLOSED
     * menuurl :
     * pmenuid :
     */

    private String menuid;
    private String menuname;
    private String menustatus;
    private String menuurl;
    private String pmenuid;
    private List<ChildBean> child;

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenustatus() {
        return menustatus;
    }

    public void setMenustatus(String menustatus) {
        this.menustatus = menustatus;
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    public String getPmenuid() {
        return pmenuid;
    }

    public void setPmenuid(String pmenuid) {
        this.pmenuid = pmenuid;
    }

    public List<ChildBean> getChild() {
        return child;
    }

    public void setChild(List<ChildBean> child) {
        this.child = child;
    }

    public static class ChildBean {
        /**
         * child : []
         * menuid : 11
         * menuname : 颜色
         * menustatus : CLOSED
         * menuurl : /design/color/data.html
         * pmenuid : 1
         */

        private String menuid;
        private String menuname;
        private String menustatus;
        private String menuurl;
        private String pmenuid;
        private List<?> child;

        public String getMenuid() {
            return menuid;
        }

        public void setMenuid(String menuid) {
            this.menuid = menuid;
        }

        public String getMenuname() {
            return menuname;
        }

        public void setMenuname(String menuname) {
            this.menuname = menuname;
        }

        public String getMenustatus() {
            return menustatus;
        }

        public void setMenustatus(String menustatus) {
            this.menustatus = menustatus;
        }

        public String getMenuurl() {
            return menuurl;
        }

        public void setMenuurl(String menuurl) {
            this.menuurl = menuurl;
        }

        public String getPmenuid() {
            return pmenuid;
        }

        public void setPmenuid(String pmenuid) {
            this.pmenuid = pmenuid;
        }

        public List<?> getChild() {
            return child;
        }

        public void setChild(List<?> child) {
            this.child = child;
        }
    }
}
