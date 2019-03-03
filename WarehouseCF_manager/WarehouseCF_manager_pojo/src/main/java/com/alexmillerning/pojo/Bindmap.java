package com.alexmillerning.pojo;

public class Bindmap {
    private String serviceid;

    private String stype;

    private String location;

    private String version;

    private String protocolid;

    private String maptype;

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid == null ? null : serviceid.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getProtocolid() {
        return protocolid;
    }

    public void setProtocolid(String protocolid) {
        this.protocolid = protocolid == null ? null : protocolid.trim();
    }

    public String getMaptype() {
        return maptype;
    }

    public void setMaptype(String maptype) {
        this.maptype = maptype == null ? null : maptype.trim();
    }
}