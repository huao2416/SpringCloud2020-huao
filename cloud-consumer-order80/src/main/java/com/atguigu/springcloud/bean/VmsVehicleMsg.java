package com.atguigu.springcloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Hugh.Hu
 * @Date: 2020/4/8 9:25 上午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VmsVehicleMsg
{
    private String vno;
    private String plant;
    private String domainName;
    private String engineName;
    private String engineNo;
    private String carLastUpdateTime;
    private String saleReportLastUpdateTime;
    private String rno;
    private String hui_ID;

    private String vin;
    /**
     * 整车车型代码 车型编码 CC码
     */
    private String vehicleModelCode;

    /**
     * 对应大车型model
     */
    private Long modelId;
    /**
     * 车型 子品牌
     */
    private String model;
    /**
     * 颜色
     */
    private String color;
    /**
     * 选装
     */
    private String optNameInfo;
    /**
     * 配置
     */
    private String config;
    /**
     * 款式
     */
    private String style;
    /**
     * 生产日期  yyyy-MM-dd
     */
    private String productionWeek;

    /**
     * 对应子车型 submodel
     */
    /**
     * 车型编码id
     */
    private Long subModelId;
    /**
     * 生产配置码
     */
    private String productConfig;
    /**
     * 发动机类型
     */
    private String engineStyle;
    /**
     * imsi
     */
    private String imsi;
    /**
     * iccid
     */
    private String iccid;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 客户手机号
     */
    private String customerMobile;
    /**
     * 更新时间  OTA更新数据时间
     */
    private String updateTime;
    /**
     * 客户省份
     */
    private String province;
    /**
     * 客户城市
     */
    private String city;


    /**
     * 异常原因
     */
    private String failReason;
    /**
     * 数据是否正常  1：正常   0：异常
     */
    private Integer correctFlag;

}