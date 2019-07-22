package com.seecen.customer.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Notice {
    private Integer nId;

    private String nTitle;

    private String nContent;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date nCreatetime;

    private String promulgator;

    private Long pageview;

    private String remark;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle == null ? null : nTitle.trim();
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent == null ? null : nContent.trim();
    }

    public Date getnCreatetime() {
        return nCreatetime;
    }

    public void setnCreatetime(Date nCreatetime) {
        this.nCreatetime = nCreatetime;
    }

    public String getPromulgator() {
        return promulgator;
    }

    public void setPromulgator(String promulgator) {
        this.promulgator = promulgator == null ? null : promulgator.trim();
    }

    public Long getPageview() {
        return pageview;
    }

    public void setPageview(Long pageview) {
        this.pageview = pageview;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}