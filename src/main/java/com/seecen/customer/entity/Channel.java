package com.seecen.customer.entity;

public class Channel {
    private Integer id;

    private Integer cenId;

    private String channelName;

    private Integer channelFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCenId() {
        return cenId;
    }

    public void setCenId(Integer cenId) {
        this.cenId = cenId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Integer getChannelFlag() {
        return channelFlag;
    }

    public void setChannelFlag(Integer channelFlag) {
        this.channelFlag = channelFlag;
    }
}