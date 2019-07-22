package com.seecen.customer.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Activity {
    private Integer actId;

    private String actName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date actDate;

    private String actContent;

    private String actRemark;

    private Integer teamId;

    private String teamName;

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    public Date getActDate() {
        return actDate;
    }

    public void setActDate(Date actDate) {
        this.actDate = actDate;
    }

    public String getActContent() {
        return actContent;
    }

    public void setActContent(String actContent) {
        this.actContent = actContent == null ? null : actContent.trim();
    }

    public String getActRemark() {
        return actRemark;
    }

    public void setActRemark(String actRemark) {
        this.actRemark = actRemark == null ? null : actRemark.trim();
    }

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
        this.teamName = teamName;
    }
}