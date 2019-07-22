package com.seecen.customer.entity;

import java.util.Date;
import java.util.List;

public class Team {
    private Integer teamId;

    private String teamName;

    private String teamIntroduce;

    private String teamRemark;

    private Date teamDate;

    private Integer teamFlag;


    private List<Customer> customers;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getTeamIntroduce() {
        return teamIntroduce;
    }

    public void setTeamIntroduce(String teamIntroduce) {
        this.teamIntroduce = teamIntroduce == null ? null : teamIntroduce.trim();
    }

    public String getTeamRemark() {
        return teamRemark;
    }

    public void setTeamRemark(String teamRemark) {
        this.teamRemark = teamRemark == null ? null : teamRemark.trim();
    }

    public Date getTeamDate() {
        return teamDate;
    }

    public void setTeamDate(Date teamDate) {
        this.teamDate = teamDate;
    }

    public Integer getTeamFlag() {
        return teamFlag;
    }

    public void setTeamFlag(Integer teamFlag) {
        this.teamFlag = teamFlag;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}