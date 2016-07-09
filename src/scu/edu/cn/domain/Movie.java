package scu.edu.cn.domain;

import java.util.Date;

public class Movie {
    private Integer mvId;

    private String enName;

    private String zhName;

    private String director;

    private String description;

    private String leadAct;

    private Date length;

    private Date initTime;

    private Date modiTime;

    private Date screenDate;

    private Integer scoreTotal;

    private Integer scorerAmount;

    private String img;

    private String prevue;

    private String mvMemo;

    private Double preservedNum;

    private String preservedStr;

    private String uploadId;

    public Integer getMvId() {
        return mvId;
    }

    public void setMvId(Integer mvId) {
        this.mvId = mvId;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getZhName() {
        return zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName == null ? null : zhName.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLeadAct() {
        return leadAct;
    }

    public void setLeadAct(String leadAct) {
        this.leadAct = leadAct == null ? null : leadAct.trim();
    }

    public Date getLength() {
        return length;
    }

    public void setLength(Date length) {
        this.length = length;
    }

    public Date getInitTime() {
        return initTime;
    }

    public void setInitTime(Date initTime) {
        this.initTime = initTime;
    }

    public Date getModiTime() {
        return modiTime;
    }

    public void setModiTime(Date modiTime) {
        this.modiTime = modiTime;
    }

    public Date getScreenDate() {
        return screenDate;
    }

    public void setScreenDate(Date screenDate) {
        this.screenDate = screenDate;
    }

    public Integer getScoreTotal() {
        return scoreTotal;
    }

    public void setScoreTotal(Integer scoreTotal) {
        this.scoreTotal = scoreTotal;
    }

    public Integer getScorerAmount() {
        return scorerAmount;
    }

    public void setScorerAmount(Integer scorerAmount) {
        this.scorerAmount = scorerAmount;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getPrevue() {
        return prevue;
    }

    public void setPrevue(String prevue) {
        this.prevue = prevue == null ? null : prevue.trim();
    }

    public String getMvMemo() {
        return mvMemo;
    }

    public void setMvMemo(String mvMemo) {
        this.mvMemo = mvMemo == null ? null : mvMemo.trim();
    }

    public Double getPreservedNum() {
        return preservedNum;
    }

    public void setPreservedNum(Double preservedNum) {
        this.preservedNum = preservedNum;
    }

    public String getPreservedStr() {
        return preservedStr;
    }

    public void setPreservedStr(String preservedStr) {
        this.preservedStr = preservedStr == null ? null : preservedStr.trim();
    }

    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId == null ? null : uploadId.trim();
    }
}