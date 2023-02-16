package com.gf.gifts.busi.order.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;

/**
* ======================================================
* 业务参数-外部系统配置表服务实体类
* @author auto
* @date 2023-02-16
*
* =================该文件自动生成，请勿修改================
*/
@TableName("ext_system")
@Data
public class ExtSystem implements Serializable {


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
    * 系统ID
    */
    @TableId
    private String systemId;
    /**
    * 系统组ID
    */
    private String systemGid;
    /**
    * 网关功能号
    */
    private String funcid;
    /**
    * 柜台接口
    */
    private String pathtype;
    /**
    * 系统路径
    */
    private String systemPath;
    /**
    * 应用ID
    */
    private String appId;
    /**
    * 应用秘钥
    */
    private String appKey;
    /**
    * 系统名称
    */
    private String systemName;
    /**
    * 是否启用
    */
    private String isOpen;
    /**
    * 证书
    */
    private String certificate;
    /**
    * 是否链路监控
    */
    private String isLinkCheck;


}
