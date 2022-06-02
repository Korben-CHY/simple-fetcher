package com.covid.component.domain;

import java.util.Date;

public class CovidData {
    private Integer id;

    private Integer confirmed;

    private Integer died;

    private Integer crued;

    private Integer asymptomatic;

    private Integer curConfirm;

    private Integer curConfirmRelative;

    private Long relativeTime;

    private Integer confirmedRelative;

    private Integer diedRelative;

    private Integer curedRelative;

    private Integer asymptomaticRelative;

    private Integer nativeRelative;

    private Integer screeningPositive;

    private Integer overseasInputRelative;

    private Integer icuDisable;

    private Long updateTime;

    private String area;

    private String noNativeRelativeDays;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    public Integer getDied() {
        return died;
    }

    public void setDied(Integer died) {
        this.died = died;
    }

    public Integer getCrued() {
        return crued;
    }

    public void setCrued(Integer crued) {
        this.crued = crued;
    }

    public Integer getAsymptomatic() {
        return asymptomatic;
    }

    public void setAsymptomatic(Integer asymptomatic) {
        this.asymptomatic = asymptomatic;
    }

    public Integer getCurConfirm() {
        return curConfirm;
    }

    public void setCurConfirm(Integer curConfirm) {
        this.curConfirm = curConfirm;
    }

    public Integer getCurConfirmRelative() {
        return curConfirmRelative;
    }

    public void setCurConfirmRelative(Integer curConfirmRelative) {
        this.curConfirmRelative = curConfirmRelative;
    }

    public Long getRelativeTime() {
        return relativeTime;
    }

    public void setRelativeTime(Long relativeTime) {
        this.relativeTime = relativeTime;
    }

    public Integer getConfirmedRelative() {
        return confirmedRelative;
    }

    public void setConfirmedRelative(Integer confirmedRelative) {
        this.confirmedRelative = confirmedRelative;
    }

    public Integer getDiedRelative() {
        return diedRelative;
    }

    public void setDiedRelative(Integer diedRelative) {
        this.diedRelative = diedRelative;
    }

    public Integer getCuredRelative() {
        return curedRelative;
    }

    public void setCuredRelative(Integer curedRelative) {
        this.curedRelative = curedRelative;
    }

    public Integer getAsymptomaticRelative() {
        return asymptomaticRelative;
    }

    public void setAsymptomaticRelative(Integer asymptomaticRelative) {
        this.asymptomaticRelative = asymptomaticRelative;
    }

    public Integer getNativeRelative() {
        return nativeRelative;
    }

    public void setNativeRelative(Integer nativeRelative) {
        this.nativeRelative = nativeRelative;
    }

    public Integer getScreeningPositive() {
        return screeningPositive;
    }

    public void setScreeningPositive(Integer screeningPositive) {
        this.screeningPositive = screeningPositive;
    }

    public Integer getOverseasInputRelative() {
        return overseasInputRelative;
    }

    public void setOverseasInputRelative(Integer overseasInputRelative) {
        this.overseasInputRelative = overseasInputRelative;
    }

    public Integer getIcuDisable() {
        return icuDisable;
    }

    public void setIcuDisable(Integer icuDisable) {
        this.icuDisable = icuDisable;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNoNativeRelativeDays() {
        return noNativeRelativeDays;
    }

    public void setNoNativeRelativeDays(String noNativeRelativeDays) {
        this.noNativeRelativeDays = noNativeRelativeDays;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", confirmed=").append(confirmed);
        sb.append(", died=").append(died);
        sb.append(", crued=").append(crued);
        sb.append(", asymptomatic=").append(asymptomatic);
        sb.append(", curConfirm=").append(curConfirm);
        sb.append(", curConfirmRelative=").append(curConfirmRelative);
        sb.append(", relativeTime=").append(relativeTime);
        sb.append(", confirmedRelative=").append(confirmedRelative);
        sb.append(", diedRelative=").append(diedRelative);
        sb.append(", curedRelative=").append(curedRelative);
        sb.append(", asymptomaticRelative=").append(asymptomaticRelative);
        sb.append(", nativeRelative=").append(nativeRelative);
        sb.append(", screeningPositive=").append(screeningPositive);
        sb.append(", overseasInputRelative=").append(overseasInputRelative);
        sb.append(", icuDisable=").append(icuDisable);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", area=").append(area);
        sb.append(", noNativeRelativeDays=").append(noNativeRelativeDays);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}