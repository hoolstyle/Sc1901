package com.seecen.customer.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Attendance {
    private Integer attId;

    private Integer customerId;

    private Integer attState;

    private String remark;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date attTime;

    private Customer customer;

    private Team team;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getAttId() {
        return attId;
    }

    public void setAttId(Integer attId) {
        this.attId = attId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getAttState() {
        return attState;
    }

    public void setAttState(Integer attState) {
        this.attState = attState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getAttTime() {
        return attTime;
    }

    public void setAttTime(Date attTime) {
        this.attTime = attTime;
    }
}