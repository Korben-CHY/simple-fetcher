package com.covid.fetcher;

import lombok.Data;

/**
 * @author Korben on 2022/6/1
 */
@Data
public class CovidData {

    /**
     * 累计确诊
     */
    private int confirmed;
    /**
     * 累计死亡
     */
    private int died;
    /**
     * 累计治愈
     */
    private int crued;
    /**
     * 相对时间（昨天）
     */
    private long relativeTime;
    /**
     * 新增确诊
     */
    private int confirmedRelative;
    /**
     * 新增死亡
     */
    private int diedRelative;
    /**
     * 新增治愈
     */
    private int curedRelative;
    /**
     * 新增无症状
     */
    private int asymptomaticRelative;
    /**
     * 累计无症状
     */
    private int asymptomatic;
    /**
     * 新增本土
     */
    private int nativeRelative;
    /**
     * 不知道！
     */
    private int screeningPositive;
    /**
     * 更新时间
     */
    private long updateTime;
    /**
     * 现有确诊
     */
    private int curConfirm;
    /**
     * 现有确认新增
     */
    private int curConfirmRelative;
    /**
     * 连续无本土新增天数
     */
    private String noNativeRelativeDays;
    /**
     * 境外输入
     */
    private int overseasInputRelative;
    /**
     * 不知道！
     */
    private int icuDisable;
    /**
     * 地区
     */
    private String area;
}
