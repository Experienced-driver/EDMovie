package scu.edu.cn.domain;

public class Catalog {
    private Integer cataId;

    private String cataName;

    private String cataLink;

    private String cataValue;

    public Integer getCataId() {
        return cataId;
    }

    public void setCataId(Integer cataId) {
        this.cataId = cataId;
    }

    public String getCataName() {
        return cataName;
    }

    public void setCataName(String cataName) {
        this.cataName = cataName == null ? null : cataName.trim();
    }

    public String getCataLink() {
        return cataLink;
    }

    public void setCataLink(String cataLink) {
        this.cataLink = cataLink == null ? null : cataLink.trim();
    }

    public String getCataValue() {
        return cataValue;
    }

    public void setCataValue(String cataValue) {
        this.cataValue = cataValue == null ? null : cataValue.trim();
    }
}