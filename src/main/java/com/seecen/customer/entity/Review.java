package com.seecen.customer.entity;

public class Review {
    private Integer reviewId;

    private String reviewProject;

    private String reviewCase;

    private String reviewGrade;

    private Integer customerId;

    private Integer teamId;

    private String reviewRemark;

    private Integer reviewFlag;

    private String userName;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewProject() {
        return reviewProject;
    }

    public void setReviewProject(String reviewProject) {
        this.reviewProject = reviewProject == null ? null : reviewProject.trim();
    }

    public String getReviewCase() {
        return reviewCase;
    }

    public void setReviewCase(String reviewCase) {
        this.reviewCase = reviewCase == null ? null : reviewCase.trim();
    }

    public String getReviewGrade() {
        return reviewGrade;
    }

    public void setReviewGrade(String reviewGrade) {
        this.reviewGrade = reviewGrade == null ? null : reviewGrade.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getReviewRemark() {
        return reviewRemark;
    }

    public void setReviewRemark(String reviewRemark) {
        this.reviewRemark = reviewRemark == null ? null : reviewRemark.trim();
    }

    public Integer getReviewFlag() {
        return reviewFlag;
    }

    public void setReviewFlag(Integer reviewFlag) {
        this.reviewFlag = reviewFlag;
    }
}