package scu.edu.cn.domain;

public class HotList {
    private Integer hotId;

    private String hotSerial;

    private Integer hotMvId;

    private Integer hotPos;

    private String hotType;

    public Integer getHotId() {
        return hotId;
    }

    public void setHotId(Integer hotId) {
        this.hotId = hotId;
    }

    public String getHotSerial() {
        return hotSerial;
    }

    public void setHotSerial(String hotSerial) {
        this.hotSerial = hotSerial == null ? null : hotSerial.trim();
    }

    public Integer getHotMvId() {
        return hotMvId;
    }

    public void setHotMvId(Integer hotMvId) {
        this.hotMvId = hotMvId;
    }

    public Integer getHotPos() {
        return hotPos;
    }

    public void setHotPos(Integer hotPos) {
        this.hotPos = hotPos;
    }

    public String getHotType() {
        return hotType;
    }

    public void setHotType(String hotType) {
        this.hotType = hotType == null ? null : hotType.trim();
    }
}