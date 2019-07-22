package com.seecen.customer.entity;

import java.util.List;

public class Center {
    private Integer id;

    private String centerName;

    private String centerAddress;

    private String centerPhone;

    private Integer centerFlag;

    private List<Customer> customerList;

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName == null ? null : centerName.trim();
    }

    public String getCenterAddress() {
        return centerAddress;
    }

    public void setCenterAddress(String centerAddress) {
        this.centerAddress = centerAddress == null ? null : centerAddress.trim();
    }

    public String getCenterPhone() {
        return centerPhone;
    }

    public void setCenterPhone(String centerPhone) {
        this.centerPhone = centerPhone == null ? null : centerPhone.trim();
    }

    public Integer getCenterFlag() {
        return centerFlag;
    }

    public void setCenterFlag(Integer centerFlag) {
        this.centerFlag = centerFlag;
    }
}