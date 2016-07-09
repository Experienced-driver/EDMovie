package scu.edu.cn.domain;

import java.util.Date;

public class ChangePsw {
    private Integer changePswId;

    private Integer userId;

    private Date changeTime;

    private String changeEmail;

    private String oldPsw;

    private String newPsw;

    private String pswStatus;

    public Integer getChangePswId() {
        return changePswId;
    }

    public void setChangePswId(Integer changePswId) {
        this.changePswId = changePswId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public String getChangeEmail() {
        return changeEmail;
    }

    public void setChangeEmail(String changeEmail) {
        this.changeEmail = changeEmail == null ? null : changeEmail.trim();
    }

    public String getOldPsw() {
        return oldPsw;
    }

    public void setOldPsw(String oldPsw) {
        this.oldPsw = oldPsw == null ? null : oldPsw.trim();
    }

    public String getNewPsw() {
        return newPsw;
    }

    public void setNewPsw(String newPsw) {
        this.newPsw = newPsw == null ? null : newPsw.trim();
    }

    public String getPswStatus() {
        return pswStatus;
    }

    public void setPswStatus(String pswStatus) {
        this.pswStatus = pswStatus == null ? null : pswStatus.trim();
    }
}