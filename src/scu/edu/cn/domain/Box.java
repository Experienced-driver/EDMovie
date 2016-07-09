package scu.edu.cn.domain;

import java.util.Date;

public class Box {
    private Integer boxId;

    private Integer boxMvId;

    private String boxSerial;

    private Date boxDate;

    private String boxSource;

    public Integer getBoxId() {
        return boxId;
    }

    public void setBoxId(Integer boxId) {
        this.boxId = boxId;
    }

    public Integer getBoxMvId() {
        return boxMvId;
    }

    public void setBoxMvId(Integer boxMvId) {
        this.boxMvId = boxMvId;
    }

    public String getBoxSerial() {
        return boxSerial;
    }

    public void setBoxSerial(String boxSerial) {
        this.boxSerial = boxSerial == null ? null : boxSerial.trim();
    }

    public Date getBoxDate() {
        return boxDate;
    }

    public void setBoxDate(Date boxDate) {
        this.boxDate = boxDate;
    }

    public String getBoxSource() {
        return boxSource;
    }

    public void setBoxSource(String boxSource) {
        this.boxSource = boxSource == null ? null : boxSource.trim();
    }
}