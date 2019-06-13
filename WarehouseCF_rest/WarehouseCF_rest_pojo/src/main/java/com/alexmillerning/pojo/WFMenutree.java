package com.alexmillerning.pojo;

public class WFMenutree {
    private String menuid;

    private String pmenuid;

    private String menuname;

    private String menustatus;

    private String menuurl;

    private String menuicon;

    private String menuauth;

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }

    public String getPmenuid() {
        return pmenuid;
    }

    public void setPmenuid(String pmenuid) {
        this.pmenuid = pmenuid == null ? null : pmenuid.trim();
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenustatus() {
        return menustatus;
    }

    public void setMenustatus(String menustatus) {
        this.menustatus = menustatus == null ? null : menustatus.trim();
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public String getMenuicon() {
        return menuicon;
    }

    public void setMenuicon(String menuicon) {
        this.menuicon = menuicon == null ? null : menuicon.trim();
    }

    public String getMenuauth() {
        return menuauth;
    }

    public void setMenuauth(String menuauth) {
        this.menuauth = menuauth == null ? null : menuauth.trim();
    }
}