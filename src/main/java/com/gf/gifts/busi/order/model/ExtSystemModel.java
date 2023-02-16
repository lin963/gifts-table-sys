package com.gf.gifts.busi.order.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;
import java.io.Serializable;

/**
* ======================================================
* 业务参数-外部系统配置表服务实体类
* @author auto
* @date 2023-02-16
*
* =================该文件自动生成，请勿修改================
*/
@Data
@ApiModel("ExtSystemModel对象")
public class ExtSystemModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "操作类型", required = true)
    private String action;

    @ApiModelProperty(value = "系统ID", required = true)
    private String systemId;

    @ApiModelProperty(value = "系统组ID", required = true)
    private String systemGid;

    @ApiModelProperty(value = "网关功能号", required = true)
    private String funcid;

    @ApiModelProperty(value = "柜台接口", required = true)
    private String pathtype;

    @ApiModelProperty(value = "系统路径", required = true)
    private String systemPath;

    @ApiModelProperty(value = "应用ID", required = true)
    private String appId;

    @ApiModelProperty(value = "应用秘钥", required = true)
    private String appKey;

    @ApiModelProperty(value = "系统名称", required = true)
    private String systemName;

    @ApiModelProperty(value = "是否启用", required = true)
    private String isOpen;

    @ApiModelProperty(value = "证书", required = true)
    private String certificate;

    @ApiModelProperty(value = "是否链路监控", required = true)
    private String isLinkCheck;



}
