package com.seecen.customer.entity;

public class Permissions {
    private Short perId;

    private String perDescription;

    private Short perRoleid;

    private Integer perAvailable;

    public Short getPerId() {
        return perId;
    }

    public void setPerId(Short perId) {
        this.perId = perId;
    }

    public String getPerDescription() {
        return perDescription;
    }

    public void setPerDescription(String perDescription) {
        this.perDescription = perDescription == null ? null : perDescription.trim();
    }

    public Short getPerRoleid() {
        return perRoleid;
    }

    public void setPerRoleid(Short perRoleid) {
        this.perRoleid = perRoleid;
    }

    public Integer getPerAvailable() {
        return perAvailable;
    }

    public void setPerAvailable(Integer perAvailable) {
        this.perAvailable = perAvailable;
    }
}