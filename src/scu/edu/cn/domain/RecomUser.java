package scu.edu.cn.domain;

import java.util.Date;

public class RecomUser {
    private Integer recomUserId;

    private Integer userId;

    private Float para1;

    private Float para2;

    private Float para3;

    private Float para4;

    private Float para5;

    private Date lastRecomTime;

    public Integer getRecomUserId() {
        return recomUserId;
    }

    public void setRecomUserId(Integer recomUserId) {
        this.recomUserId = recomUserId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getPara1() {
        return para1;
    }

    public void setPara1(Float para1) {
        this.para1 = para1;
    }

    public Float getPara2() {
        return para2;
    }

    public void setPara2(Float para2) {
        this.para2 = para2;
    }

    public Float getPara3() {
        return para3;
    }

    public void setPara3(Float para3) {
        this.para3 = para3;
    }

    public Float getPara4() {
        return para4;
    }

    public void setPara4(Float para4) {
        this.para4 = para4;
    }

    public Float getPara5() {
        return para5;
    }

    public void setPara5(Float para5) {
        this.para5 = para5;
    }

    public Date getLastRecomTime() {
        return lastRecomTime;
    }

    public void setLastRecomTime(Date lastRecomTime) {
        this.lastRecomTime = lastRecomTime;
    }
}