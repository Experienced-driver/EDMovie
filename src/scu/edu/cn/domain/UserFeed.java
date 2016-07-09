package scu.edu.cn.domain;

import java.util.Date;

public class UserFeed {
    private Integer feedId;

    private String feedCont;

    private Integer userId;

    private Date feedTime;

    private String feedStatus;

    private Integer feedReceiver;

    public Integer getFeedId() {
        return feedId;
    }

    public void setFeedId(Integer feedId) {
        this.feedId = feedId;
    }

    public String getFeedCont() {
        return feedCont;
    }

    public void setFeedCont(String feedCont) {
        this.feedCont = feedCont == null ? null : feedCont.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getFeedTime() {
        return feedTime;
    }

    public void setFeedTime(Date feedTime) {
        this.feedTime = feedTime;
    }

    public String getFeedStatus() {
        return feedStatus;
    }

    public void setFeedStatus(String feedStatus) {
        this.feedStatus = feedStatus == null ? null : feedStatus.trim();
    }

    public Integer getFeedReceiver() {
        return feedReceiver;
    }

    public void setFeedReceiver(Integer feedReceiver) {
        this.feedReceiver = feedReceiver;
    }
}