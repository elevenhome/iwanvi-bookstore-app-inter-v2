package com.iwanvi.bookstore.appinterv2.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName BaseRequest
 * @Description 请求公共参数
 * @Author zzw
 * @Date 2018年7月12日10:23:53
 */
@ApiModel(value = "请求公共实体")
public class BaseRequest extends BaseEntity{

    @ApiModelProperty(value="渠道ID",example = "3000")
    private String cnid;
    @ApiModelProperty(value="用户ID",example = "163645741")
    private Long uid;
    @ApiModelProperty(value="用户ID签名",example = "820c0e97ce06e875eae2ccce382825b1")
    private String idSign;
    @ApiModelProperty(value="SIM卡序列号",example = "460110011754357")
    private String imsi;
    @ApiModelProperty(value="移动设备序列号",example = "99000914016523")
    private String imei;
    @ApiModelProperty(value="移动设备型号",example = "Mi+Note+2")
    private String model;
    @ApiModelProperty(value="移动设备系统",example = "android")
    private String platform;
    @ApiModelProperty(value="APP名称",example = "zwsc")
    private String appname;
    @ApiModelProperty(value="APP包名",example = "com.chineseall.singlebook")
    private String packname;
    @ApiModelProperty(value="APP版本",example = "6.0.0")
    private String version;
    @ApiModelProperty(value="APPURL",example = "appurl")
    private String appurl;

    public String getCnid() {
        return cnid;
    }

    public void setCnid(String cnid) {
        this.cnid = cnid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getIdSign() {
        return idSign;
    }

    public void setIdSign(String idSign) {
        this.idSign = idSign;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getPackname() {
        return packname;
    }

    public void setPackname(String packname) {
        this.packname = packname;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppurl() {
        return "cnid='" + cnid + '\'' +
                ", uid=" + uid +
                ", idSign='" + idSign + '\'' +
                ", imsi='" + imsi + '\'' +
                ", imei='" + imei + '\'' +
                ", model='" + model + '\'' +
                ", platform='" + platform + '\'' +
                ", appname='" + appname + '\'' +
                ", packname='" + packname + '\'' +
                ", version='" + version + '\'';
    }

    public void setAppurl(String appurl) {
        this.appurl = appurl;
    }

}
