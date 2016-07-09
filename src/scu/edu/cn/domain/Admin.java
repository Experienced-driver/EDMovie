package scu.edu.cn.domain;

public class Admin {
    private String adminId;

    private String adPsw;

    private String adGroup;

    private Integer adLevel;

    private String adStatus;

    private String adEmail;

    private String adMemo;

    private String adPhone;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getAdPsw() {
        return adPsw;
    }

    public void setAdPsw(String adPsw) {
        this.adPsw = adPsw == null ? null : adPsw.trim();
    }

    public String getAdGroup() {
        return adGroup;
    }

    public void setAdGroup(String adGroup) {
        this.adGroup = adGroup == null ? null : adGroup.trim();
    }

    public Integer getAdLevel() {
        return adLevel;
    }

    public void setAdLevel(Integer adLevel) {
        this.adLevel = adLevel;
    }

    public String getAdStatus() {
        return adStatus;
    }

    public void setAdStatus(String adStatus) {
        this.adStatus = adStatus == null ? null : adStatus.trim();
    }

    public String getAdEmail() {
        return adEmail;
    }

    public void setAdEmail(String adEmail) {
        this.adEmail = adEmail == null ? null : adEmail.trim();
    }

    public String getAdMemo() {
        return adMemo;
    }

    public void setAdMemo(String adMemo) {
        this.adMemo = adMemo == null ? null : adMemo.trim();
    }

    public String getAdPhone() {
        return adPhone;
    }

    public void setAdPhone(String adPhone) {
        this.adPhone = adPhone == null ? null : adPhone.trim();
    }
}