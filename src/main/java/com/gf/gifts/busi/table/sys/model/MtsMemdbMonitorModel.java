package com.gf.gifts.busi.table.sys.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;
import java.io.Serializable;

/**
* ======================================================
* 系统-内存数据库监控服务实体类
* @author auto
* @date 2023-02-20
*
* =================该文件自动生成，请勿修改================
*/
@Data
@ApiModel("MtsMemdbMonitorModel对象")
public class MtsMemdbMonitorModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "操作类型", required = true)
    private String action;

    @ApiModelProperty(value = "交易所代码", required = true)
    private String market;

    @ApiModelProperty(value = "证券类别", required = true)
    private String stktype;

    @ApiModelProperty(value = "买卖标识", required = true)
    private String bsflag;

    @ApiModelProperty(value = "清算速度", required = true)
    private String clearspeed;

    @ApiModelProperty(value = "资产处理日期", required = true)
    private String assetdealdatetype;

    @ApiModelProperty(value = "资产处理时点", required = true)
    private String assetdealpoint;

    @ApiModelProperty(value = "资金可用控制方式", required = true)
    private String cashctrltype;

    @ApiModelProperty(value = "证券可用控制方式", required = true)
    private String stkctrltype;

    @ApiModelProperty(value = "头寸增加方式", required = true)
    private String cashaddtype;

    @ApiModelProperty(value = "证券增加方式", required = true)
    private String stkaddtype;

    @ApiModelProperty(value = "可用增加时点", required = true)
    private String avladdpoint;

    @ApiModelProperty(value = "交收方式", required = true)
    private String setttype;

    @ApiModelProperty(value = "资金变化方向", required = true)
    private String funddirect;

    @ApiModelProperty(value = "股份流向", required = true)
    private String stkdirect;

    @ApiModelProperty(value = "可撤单标志", required = true)
    private String cancancelflag;

    @ApiModelProperty(value = "可重复委托标志", required = true)
    private String reorderflag;

    @ApiModelProperty(value = "交易金额计算方式", required = true)
    private String amtcalmode;

    @ApiModelProperty(value = "业务类别", required = true)
    private String businclass;

    @ApiModelProperty(value = "买卖方向", required = true)
    private String bsdirect;

    @ApiModelProperty(value = "交易价格计算方式", required = true)
    private String pricecalmode;

    @ApiModelProperty(value = "价格控制类型", required = true)
    private String stktargettype;

    @ApiModelProperty(value = "资金账号", required = true)
    private String fundacct;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券类别", required = true)
    private String stktypes;

    @ApiModelProperty(value = "买卖方向", required = true)
    private String bsflags;

    @ApiModelProperty(value = "费用类型", required = true)
    private String feeid;

    @ApiModelProperty(value = "计算方式", required = true)
    private String calctype;

    @ApiModelProperty(value = "费率", required = true)
    private BigDecimal feerate;

    @ApiModelProperty(value = "最小费用", required = true)
    private BigDecimal minfee;

    @ApiModelProperty(value = "最大费用", required = true)
    private BigDecimal maxfee;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "资金账号", required = true)
    private String fundacct;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券类别", required = true)
    private String stktype;

    @ApiModelProperty(value = "买卖方向", required = true)
    private String bsflag;

    @ApiModelProperty(value = "费用类型", required = true)
    private String feeid;

    @ApiModelProperty(value = "计算方式", required = true)
    private String calctype;

    @ApiModelProperty(value = "费率", required = true)
    private BigDecimal feerate;

    @ApiModelProperty(value = "最小费用", required = true)
    private BigDecimal minfee;

    @ApiModelProperty(value = "最大费用", required = true)
    private BigDecimal maxfee;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "查询索引", required = true)
    private String indexkey;

    @ApiModelProperty(value = "bp节点号", required = true)
    private String bpnode;

    @ApiModelProperty(value = "内存服务组号", required = true)
    private String srvgroup;

    @ApiModelProperty(value = "状态", required = true)
    private String status;

    @ApiModelProperty(value = "服务类别", required = true)
    private String servertypes;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "服务组号", required = true)
    private String servergroup;

    @ApiModelProperty(value = "服务类型", required = true)
    private String endpointtype;

    @ApiModelProperty(value = "bp节点号", required = true)
    private String bpnode;

    @ApiModelProperty(value = "所属服务名", required = true)
    private String srvname;

    @ApiModelProperty(value = "zmq模式", required = true)
    private String zmqmode;

    @ApiModelProperty(value = "协议类型", required = true)
    private String protocoltype;

    @ApiModelProperty(value = "连接地址", required = true)
    private String address;

    @ApiModelProperty(value = "是否备用服务", required = true)
    private String baktype;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "当前状态", required = true)
    private String status;

    @ApiModelProperty(value = "主题串", required = true)
    private String topicString;

    @ApiModelProperty(value = "产品编号", required = true)
    private String fundid;

    @ApiModelProperty(value = "功能号", required = true)
    private String funcid;

    @ApiModelProperty(value = "IP地址", required = true)
    private String ip;

    @ApiModelProperty(value = "端口", required = true)
    private String port;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "服务器编号", required = true)
    private String serverid;

    @ApiModelProperty(value = "上次交易日期", required = true)
    private String lastsysdate;

    @ApiModelProperty(value = "系统日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "委托日期", required = true)
    private String orderdate;

    @ApiModelProperty(value = "系统运行状态", required = true)
    private String status;

    @ApiModelProperty(value = "数据库状态", required = true)
    private String dbstatus;

    @ApiModelProperty(value = "数据库操作员", required = true)
    private String dboperid;

    @ApiModelProperty(value = "监控ID", required = true)
    private String monitorid;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "自增ID", required = true)
    private String id;

    @ApiModelProperty(value = "监控ID", required = true)
    private String monitorid;

    @ApiModelProperty(value = "系统名称", required = true)
    private String servername;

    @ApiModelProperty(value = "上传unix时间戳", required = true)
    private String uploadunixtime;

    @ApiModelProperty(value = "上报次数", required = true)
    private String count;

    @ApiModelProperty(value = "上传机器IP", required = true)
    private String uploadip;

    @ApiModelProperty(value = "上报数值", required = true)
    private String value;

    @ApiModelProperty(value = "bp节点号", required = true)
    private String bpnode;

    @ApiModelProperty(value = "内存服务组号", required = true)
    private String srvgroup;

    @ApiModelProperty(value = "产品编号", required = true)
    private String fundid;

    @ApiModelProperty(value = "状态", required = true)
    private String status;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "服务名称", required = true)
    private String serverName;

    @ApiModelProperty(value = "上传时间", required = true)
    private String uploadTime;

    @ApiModelProperty(value = "日志内容", required = true)
    private String logInfo;

    @ApiModelProperty(value = "服务器IP", required = true)
    private String ip;

    @ApiModelProperty(value = "BP节点号", required = true)
    private String bpnode;

    @ApiModelProperty(value = "功能号", required = true)
    private String funcid;

    @ApiModelProperty(value = "用户ID", required = true)
    private String userid;

    @ApiModelProperty(value = "服务类型", required = true)
    private String servertype;

    @ApiModelProperty(value = "服务名称", required = true)
    private String servername;

    @ApiModelProperty(value = "功能号", required = true)
    private String funcid;

    @ApiModelProperty(value = "启用状态", required = true)
    private String status;

    @ApiModelProperty(value = "备注信息", required = true)
    private String remark;

    @ApiModelProperty(value = "服务特性", required = true)
    private String serverproperty;

    @ApiModelProperty(value = "服务归属", required = true)
    private String serverbind;

    @ApiModelProperty(value = "显示顺序", required = true)
    private String showorder;

    @ApiModelProperty(value = "启动优先级", required = true)
    private String execorder;

    @ApiModelProperty(value = "服务组号", required = true)
    private String servergroup;

    @ApiModelProperty(value = "BP节点号", required = true)
    private String bpnode;

    @ApiModelProperty(value = "功能号", required = true)
    private String funcid;

    @ApiModelProperty(value = "服务启动序号", required = true)
    private String startId;

    @ApiModelProperty(value = "当前服务进程号", required = true)
    private String processId;

    @ApiModelProperty(value = "系统名称", required = true)
    private String servername;

    @ApiModelProperty(value = "上报机器IP", required = true)
    private String ip;

    @ApiModelProperty(value = "最新上报时间", required = true)
    private String updatetime;

    @ApiModelProperty(value = "物理日期", required = true)
    private String phydate;

    @ApiModelProperty(value = "服务启动日期", required = true)
    private String startdate;

    @ApiModelProperty(value = "服务启动时间", required = true)
    private String starttime;

    @ApiModelProperty(value = "KCBP空闲进程数", required = true)
    private String idleAs;

    @ApiModelProperty(value = "字段名", required = true)
    private String columnName;

    @ApiModelProperty(value = "字段类型", required = true)
    private String dataType;

    @ApiModelProperty(value = "字段长度", required = true)
    private String dataLength;

    @ApiModelProperty(value = "字段精度", required = true)
    private String dataPrecision;

    @ApiModelProperty(value = "字段小数", required = true)
    private String dataScale;

    @ApiModelProperty(value = "使用字典", required = true)
    private String dictitem;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "端点类型", required = true)
    private String endpointtype;

    @ApiModelProperty(value = "监听类别", required = true)
    private String bindType;

    @ApiModelProperty(value = "ZMQ 的socket模式类型", required = true)
    private String socketType;

    @ApiModelProperty(value = "通信协议", required = true)
    private String protocol;

    @ApiModelProperty(value = "端点名称", required = true)
    private String endpointName;

    @ApiModelProperty(value = "ZMQ网络模式描述", required = true)
    private String zmqModeDescribe;

    @ApiModelProperty(value = "主题类别", required = true)
    private String topicType;

    @ApiModelProperty(value = "主题串", required = true)
    private String topicString;

    @ApiModelProperty(value = "默认开启标志", required = true)
    private String status;

    @ApiModelProperty(value = "服务标识", required = true)
    private String serverType;

    @ApiModelProperty(value = "端点类型", required = true)
    private String endpointtype;

    @ApiModelProperty(value = "部署模式", required = true)
    private String deployType;

    @ApiModelProperty(value = "发送附加标志", required = true)
    private String sendFlag;

    @ApiModelProperty(value = "上游端点类型", required = true)
    private String connectEndpointtype;

    @ApiModelProperty(value = "下游端点类型", required = true)
    private String bindEndpointtype;

    @ApiModelProperty(value = "连接多实例模式", required = true)
    private String connectType;

    @ApiModelProperty(value = "连接别名", required = true)
    private String connectName;

    @ApiModelProperty(value = "参数标识", required = true)
    private String paramid;

    @ApiModelProperty(value = "组织单元", required = true)
    private String orgid;

    @ApiModelProperty(value = "参数值", required = true)
    private String paramvalue;

    @ApiModelProperty(value = "交易通道", required = true)
    private String pathtype;

    @ApiModelProperty(value = "委托方向", required = true)
    private String bsflag;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券类别", required = true)
    private String stktype;

    @ApiModelProperty(value = "报盘模式", required = true)
    private String rptmode;

    @ApiModelProperty(value = "委托功能号", required = true)
    private String orderBusinessid;

    @ApiModelProperty(value = "批量委托功能号", required = true)
    private String batchorderBusinessid;

    @ApiModelProperty(value = "撤单功能号", required = true)
    private String cancelBusinessid;

    @ApiModelProperty(value = "委托查询功能号", required = true)
    private String orderqryBusinessid;

    @ApiModelProperty(value = "成交处理方式", required = true)
    private String matchWay;

    @ApiModelProperty(value = "序号", required = true)
    private String sno;

    @ApiModelProperty(value = "业务类型", required = true)
    private String msgType;

    @ApiModelProperty(value = "记录类型", required = true)
    private String traceType;

    @ApiModelProperty(value = "流水序号", required = true)
    private String traceSno;

    @ApiModelProperty(value = "消息序列值", required = true)
    private String msgNo;

    @ApiModelProperty(value = "服务组号", required = true)
    private String servergroup;

    @ApiModelProperty(value = "服务节点号", required = true)
    private String bpnodeid;

    @ApiModelProperty(value = "发生时间", required = true)
    private String tradeTime;

    @ApiModelProperty(value = "落库时间", required = true)
    private String dbTime;

    @ApiModelProperty(value = "交易市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "LOF类型", required = true)
    private String loftype;

    @ApiModelProperty(value = "申购上限", required = true)
    private BigDecimal maxbuyqty;

    @ApiModelProperty(value = "申购下限", required = true)
    private BigDecimal minbuyqty;

    @ApiModelProperty(value = "申购最小单位", required = true)
    private String buyunit;

    @ApiModelProperty(value = "赎回上限", required = true)
    private BigDecimal maxsaleqty;

    @ApiModelProperty(value = "赎回下限", required = true)
    private BigDecimal minsaleqty;

    @ApiModelProperty(value = "赎回最小单位", required = true)
    private String saleunit;

    @ApiModelProperty(value = "申购和赎回允许状态", required = true)
    private String tradestate;

    @ApiModelProperty(value = "赎回资金回转天数", required = true)
    private String settlefundays;

    @ApiModelProperty(value = "备用1", required = true)
    private String iBy;

    @ApiModelProperty(value = "备用2", required = true)
    private String cBy;

    @ApiModelProperty(value = "备注信息", required = true)
    private String remark;

    @ApiModelProperty(value = "更新日期", required = true)
    private String lastdate;

    @ApiModelProperty(value = "证券内码", required = true)
    private String stkid;

    @ApiModelProperty(value = "业务日期", required = true)
    private String busiDate;

    @ApiModelProperty(value = "业务时间", required = true)
    private String busiTime;

    @ApiModelProperty(value = "物理日期", required = true)
    private String phyDate;

    @ApiModelProperty(value = "物理时间", required = true)
    private String phyTime;

    @ApiModelProperty(value = "业务功能", required = true)
    private String funcid;

    @ApiModelProperty(value = "服务组号", required = true)
    private String serverGroup;

    @ApiModelProperty(value = "业务序号", required = true)
    private String busiSno;

    @ApiModelProperty(value = "日志记录类型", required = true)
    private String logType;

    @ApiModelProperty(value = "日志信息", required = true)
    private String logInfo;

    @ApiModelProperty(value = "任务编号", required = true)
    private String taskid;

    @ApiModelProperty(value = "日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "开始时间", required = true)
    private String begintime;

    @ApiModelProperty(value = "结束时间", required = true)
    private String endtime;

    @ApiModelProperty(value = "执行结果标志", required = true)
    private String passflag;

    @ApiModelProperty(value = "上次开始时间", required = true)
    private String lastBegintime;

    @ApiModelProperty(value = "上次结束时间", required = true)
    private String lastEndtime;

    @ApiModelProperty(value = "上次执行结果标志", required = true)
    private String lastPassflag;

    @ApiModelProperty(value = "错误原因", required = true)
    private String errorinfo;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "调用功能号", required = true)
    private String lbmid;

    @ApiModelProperty(value = "上报日期", required = true)
    private String securitydate;

    @ApiModelProperty(value = "上报时间", required = true)
    private String securitytime;

    @ApiModelProperty(value = "节点ID", required = true)
    private String nodeid;

    @ApiModelProperty(value = "MAC", required = true)
    private String mac;

    @ApiModelProperty(value = "会话ID", required = true)
    private String sessionid;

    @ApiModelProperty(value = "IP地址", required = true)
    private String ip;

    @ApiModelProperty(value = "用户账号", required = true)
    private String userid;

    @ApiModelProperty(value = "访问数量", required = true)
    private String cnt;

    @ApiModelProperty(value = "开发商标识", required = true)
    private String vendorId;

    @ApiModelProperty(value = "数据采集日期", required = true)
    private String collectDate;

    @ApiModelProperty(value = "数据采集时间", required = true)
    private String collectTime;

    @ApiModelProperty(value = "外挂名称", required = true)
    private String plugName;

    @ApiModelProperty(value = "一码通账号", required = true)
    private String plugAccount;

    @ApiModelProperty(value = "异常客户端ID", required = true)
    private String plugGuuid;

    @ApiModelProperty(value = "异常客户端IP", required = true)
    private String plugIp;

    @ApiModelProperty(value = "异常客户端MAC", required = true)
    private String plugMac;

    @ApiModelProperty(value = "异常类型", required = true)
    private String errType;

    @ApiModelProperty(value = "用户账号", required = true)
    private String userid;

    @ApiModelProperty(value = "节点ID", required = true)
    private String nodeid;

    @ApiModelProperty(value = "MAC地址", required = true)
    private String mac;

    @ApiModelProperty(value = "IP地址", required = true)
    private String ip;

    @ApiModelProperty(value = "用户账号", required = true)
    private String userid;

    @ApiModelProperty(value = "首次触发时间", required = true)
    private String createtime;

    @ApiModelProperty(value = "更新时间", required = true)
    private String updatetime;

    @ApiModelProperty(value = "解冻时间", required = true)
    private String unfreezetime;

    @ApiModelProperty(value = "超频访问限制触发次数", required = true)
    private String overCounts;

    @ApiModelProperty(value = "主动挑战应答触发次数", required = true)
    private String challengeCounts;

    @ApiModelProperty(value = "完整性限制触发次数", required = true)
    private String fileDestroyCounts;

    @ApiModelProperty(value = "冻结状态", required = true)
    private String freezestatus;

    @ApiModelProperty(value = "是否豁免", required = true)
    private String remitstatus;

    @ApiModelProperty(value = "开发商标识", required = true)
    private String vendorId;

    @ApiModelProperty(value = "数据采集日期", required = true)
    private String collectDate;

    @ApiModelProperty(value = "数据采集时间", required = true)
    private String collectTime;

    @ApiModelProperty(value = "异常告警类型", required = true)
    private String plugName;

    @ApiModelProperty(value = "异常告警账号", required = true)
    private String plugAccount;

    @ApiModelProperty(value = "异常告警账号1", required = true)
    private String plugAccount1;

    @ApiModelProperty(value = "异常客户端ID", required = true)
    private String plugGuuid;

    @ApiModelProperty(value = "异常客户端IP", required = true)
    private String plugIp;

    @ApiModelProperty(value = "异常客户端MAC", required = true)
    private String plugMac;

    @ApiModelProperty(value = "数据采集日期", required = true)
    private String collectDate;

    @ApiModelProperty(value = "数据采集时间", required = true)
    private String collectTime;

    @ApiModelProperty(value = "开发商标识", required = true)
    private String vendorId;

    @ApiModelProperty(value = "服务端总数", required = true)
    private String serverOnline;

    @ApiModelProperty(value = "开发商标识", required = true)
    private String vendorId;

    @ApiModelProperty(value = "接入服务端版本", required = true)
    private String version;

    @ApiModelProperty(value = "异常特征库版本", required = true)
    private String plugDb;

    @ApiModelProperty(value = "数据采集日期", required = true)
    private String collectDate;

    @ApiModelProperty(value = "数据采集时间", required = true)
    private String collectTime;

    @ApiModelProperty(value = "接入服务端标识", required = true)
    private String serverId;

    @ApiModelProperty(value = "客户端版本校验策略是否开启", required = true)
    private String verCheck;

    @ApiModelProperty(value = "券商标识校验是否开启", required = true)
    private String qsidCheck;

    @ApiModelProperty(value = "文件完整性策略是否开启", required = true)
    private String fileCheck;

    @ApiModelProperty(value = "主动挑战策略是否开启", required = true)
    private String actChal;

    @ApiModelProperty(value = "超频访问策略是否开启", required = true)
    private String freLimit;

    @ApiModelProperty(value = "文件完整性策略阻断是否开启", required = true)
    private String fileCheckReject;

    @ApiModelProperty(value = "主动挑战阻断是否开启", required = true)
    private String actChalReject;

    @ApiModelProperty(value = "超频访问阻断是否开启", required = true)
    private String freLimitReject;

    @ApiModelProperty(value = "开发商标识", required = true)
    private String vendorId;

    @ApiModelProperty(value = "数据采集日期", required = true)
    private String collectDate;

    @ApiModelProperty(value = "数据采集时间", required = true)
    private String collectTime;

    @ApiModelProperty(value = "异常客户端数量", required = true)
    private String plugClientSum;

    @ApiModelProperty(value = "异常账号数量", required = true)
    private String plugClientAccount;

    @ApiModelProperty(value = "告警汇总数量", required = true)
    private String warnSum;

    @ApiModelProperty(value = "文件完整性告警数量", required = true)
    private String fileCheckWarnSum;

    @ApiModelProperty(value = "主动挑战应答告警数量", required = true)
    private String actChalWarnSum;

    @ApiModelProperty(value = "超频访问告警数量", required = true)
    private String freLimitWarnSum;

    @ApiModelProperty(value = "阻断汇总数量", required = true)
    private String rejSum;

    @ApiModelProperty(value = "文件完整性阻断数量", required = true)
    private String fileCheckRejSum;

    @ApiModelProperty(value = "主动挑战阻断数量", required = true)
    private String actChalRejSum;

    @ApiModelProperty(value = "超频访问阻断数量", required = true)
    private String freLimitRejSum;

    @ApiModelProperty(value = "开发商标识", required = true)
    private String vendorId;

    @ApiModelProperty(value = "数据采集日期", required = true)
    private String collectDate;

    @ApiModelProperty(value = "数据采集时间", required = true)
    private String collectTime;

    @ApiModelProperty(value = "异常客户端类型", required = true)
    private String wgType;

    @ApiModelProperty(value = "异常类型数量", required = true)
    private String wgTypeNum;

    @ApiModelProperty(value = "会话ID", required = true)
    private String sessionid;

    @ApiModelProperty(value = "会话创建时间", required = true)
    private String createtime;

    @ApiModelProperty(value = "会话更新时间", required = true)
    private String updatetime;

    @ApiModelProperty(value = "会话剔除时间", required = true)
    private String killtime;

    @ApiModelProperty(value = "会话是否剔除", required = true)
    private String status;

    @ApiModelProperty(value = "业务日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "流水号", required = true)
    private String logsno;

    @ApiModelProperty(value = "协议签署人", required = true)
    private String userid;

    @ApiModelProperty(value = "协议签署日期", required = true)
    private String signPhydate;

    @ApiModelProperty(value = "协议签署时间", required = true)
    private String signTime;

    @ApiModelProperty(value = "签署人会话编号", required = true)
    private String sessionid;

    @ApiModelProperty(value = "签署动作类型", required = true)
    private String action;

    @ApiModelProperty(value = "协议编号", required = true)
    private String agreementId;

    @ApiModelProperty(value = "协议版本", required = true)
    private String agreementVersion;

    @ApiModelProperty(value = "协议标题", required = true)
    private String agreementTittle;

    @ApiModelProperty(value = "菜单编号", required = true)
    private String menuid;

    @ApiModelProperty(value = "协议签署渠道", required = true)
    private String agreementChannel;

    @ApiModelProperty(value = "外部协议编号", required = true)
    private String extAgreementId;

    @ApiModelProperty(value = "签署主体类别", required = true)
    private String signMainType;

    @ApiModelProperty(value = "签署主体ID", required = true)
    private String signMainId;

    @ApiModelProperty(value = "预留字段", required = true)
    private String reserve;

    @ApiModelProperty(value = "协议编号", required = true)
    private String agreementId;

    @ApiModelProperty(value = "外部协议编号", required = true)
    private String extAgreementId;

    @ApiModelProperty(value = "协议版本号", required = true)
    private String agreeVersion;

    @ApiModelProperty(value = "签署主体类别", required = true)
    private String signMainType;

    @ApiModelProperty(value = "签署主体ID", required = true)
    private String signMainId;

    @ApiModelProperty(value = "协议签署渠道", required = true)
    private String agreementChannel;

    @ApiModelProperty(value = "协议签署人", required = true)
    private String userid;

    @ApiModelProperty(value = "协议首次签署日期", required = true)
    private String signPhydate;

    @ApiModelProperty(value = "协议首次签署时间", required = true)
    private String signTime;

    @ApiModelProperty(value = "协议更新签署日期", required = true)
    private String updateDate;

    @ApiModelProperty(value = "协议更新签署时间", required = true)
    private String updateTime;

    @ApiModelProperty(value = "状态", required = true)
    private String status;

    @ApiModelProperty(value = "预留字段", required = true)
    private String reserve;

    @ApiModelProperty(value = "签署流水", required = true)
    private String logsno;

    @ApiModelProperty(value = "用户ID", required = true)
    private String userid;

    @ApiModelProperty(value = "配置KEY", required = true)
    private String paramname;

    @ApiModelProperty(value = "配置值", required = true)
    private String paramvalue;

    @ApiModelProperty(value = "修改日期", required = true)
    private String upddate;

    @ApiModelProperty(value = "修改时间", required = true)
    private String updtime;

    @ApiModelProperty(value = "序号", required = true)
    private String sno;

    @ApiModelProperty(value = "标题", required = true)
    private String msgtitle;

    @ApiModelProperty(value = "公告内容", required = true)
    private String msginfo;

    @ApiModelProperty(value = "创建日期", required = true)
    private String createdate;

    @ApiModelProperty(value = "公告日期", required = true)
    private String begindate;

    @ApiModelProperty(value = "过期日期", required = true)
    private String expiredate;

    @ApiModelProperty(value = "发布时间", required = true)
    private String opertime;

    @ApiModelProperty(value = "公告类别", required = true)
    private String msgtype;

    @ApiModelProperty(value = "发布机构", required = true)
    private String orgid;

    @ApiModelProperty(value = "发布人ID", required = true)
    private String operuserid;

    @ApiModelProperty(value = "发布人", required = true)
    private String opername;

    @ApiModelProperty(value = "发布状态", required = true)
    private String msgstatus;

    @ApiModelProperty(value = "BP节点号", required = true)
    private String nodeid;

    @ApiModelProperty(value = "数据库实例", required = true)
    private String dbname;

    @ApiModelProperty(value = "数据表名", required = true)
    private String tablename;

    @ApiModelProperty(value = "预设数据容量", required = true)
    private String datacapacity;

    @ApiModelProperty(value = "当前数据量", required = true)
    private String datacount;

    @ApiModelProperty(value = "上次检查时间", required = true)
    private String lastchecktime;

    @ApiModelProperty(value = "数据库总体积", required = true)
    private BigDecimal databasesize;

    @ApiModelProperty(value = "表占用体积", required = true)
    private BigDecimal tablesize;

    @ApiModelProperty(value = "表状态", required = true)
    private String tablestatus;

    @ApiModelProperty(value = "数据库状态", required = true)
    private String databasestatus;

    @ApiModelProperty(value = "协议编号", required = true)
    private String agreementId;

    @ApiModelProperty(value = "协议版本号", required = true)
    private String agreeVersion;

    @ApiModelProperty(value = "协议签署渠道", required = true)
    private String agreementChannel;

    @ApiModelProperty(value = "外部协议编号", required = true)
    private String extAgreementId;

    @ApiModelProperty(value = "协议名称", required = true)
    private String agreeTitle;

    @ApiModelProperty(value = "协议扩展信息", required = true)
    private String extInfo;

    @ApiModelProperty(value = "更新日期", required = true)
    private String updateDate;

    @ApiModelProperty(value = "更新时间", required = true)
    private String updateTime;

    @ApiModelProperty(value = "有效期", required = true)
    private String validPeriod;

    @ApiModelProperty(value = "接口名称", required = true)
    private String interfaceName;

    @ApiModelProperty(value = "字段名称", required = true)
    private String paramName;

    @ApiModelProperty(value = "是否必送", required = true)
    private String ismust;

    @ApiModelProperty(value = "参数方式", required = true)
    private String ispost;

    @ApiModelProperty(value = "生效标识", required = true)
    private String isvalid;

    @ApiModelProperty(value = "控件标识", required = true)
    private String paramid;

    @ApiModelProperty(value = "显示序号", required = true)
    private String dispsno;

    @ApiModelProperty(value = "分组编号", required = true)
    private String groupid;

    @ApiModelProperty(value = "控件名", required = true)
    private String paramname;

    @ApiModelProperty(value = "数据类型", required = true)
    private String datatype;

    @ApiModelProperty(value = "数据长度", required = true)
    private String datalen;

    @ApiModelProperty(value = "精度", required = true)
    private String declen;

    @ApiModelProperty(value = "控件类型", required = true)
    private String ctrltype;

    @ApiModelProperty(value = "控件样式", required = true)
    private String ctrlstyle;

    @ApiModelProperty(value = "控件长度", required = true)
    private String displaywidth;

    @ApiModelProperty(value = "数据字典", required = true)
    private String dictitem;

    @ApiModelProperty(value = "关联列表", required = true)
    private String valuelist;

    @ApiModelProperty(value = "参数状态", required = true)
    private String status;

    @ApiModelProperty(value = "参数设置类型", required = true)
    private String settype;

    @ApiModelProperty(value = "验证方式", required = true)
    private String verifyfunc;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "是否允许为空", required = true)
    private String isnull;

    @ApiModelProperty(value = "默认值", required = true)
    private String defaultvalue;

    @ApiModelProperty(value = "分组编号", required = true)
    private String groupid;

    @ApiModelProperty(value = "父分组编号", required = true)
    private String parentgroupid;

    @ApiModelProperty(value = "分组名称", required = true)
    private String groupname;

    @ApiModelProperty(value = "分组描述", required = true)
    private String describe;

    @ApiModelProperty(value = "组图标编号", required = true)
    private String imgindex;

    @ApiModelProperty(value = "管理端", required = true)
    private String managerment;

    @ApiModelProperty(value = "APP种类", required = true)
    private String appCategory;

    @ApiModelProperty(value = "APP类型", required = true)
    private String appType;

    @ApiModelProperty(value = "环境类型", required = true)
    private String envType;

    @ApiModelProperty(value = "版本类型", required = true)
    private String versionType;

    @ApiModelProperty(value = "版本号", required = true)
    private String versionNo;

    @ApiModelProperty(value = "版本序号", required = true)
    private String versionSno;

    @ApiModelProperty(value = "APP名称", required = true)
    private String appName;

    @ApiModelProperty(value = "版本时间", required = true)
    private String versionTime;

    @ApiModelProperty(value = "版本大小", required = true)
    private String versionSize;

    @ApiModelProperty(value = "版本MD5", required = true)
    private String versionMd5;

    @ApiModelProperty(value = "内容版本文件名", required = true)
    private String fileNameContent;

    @ApiModelProperty(value = "容器版本32位文件名", required = true)
    private String fileNameIa32;

    @ApiModelProperty(value = "容器版本64位文件名", required = true)
    private String fileNameX64;

    @ApiModelProperty(value = "版本升级内容", required = true)
    private String versionText;

    @ApiModelProperty(value = "是否强制升级", required = true)
    private String mustUpdate;

    @ApiModelProperty(value = "版本网站地址", required = true)
    private String versionSite;

    @ApiModelProperty(value = "版本mode", required = true)
    private String versionMode;

    @ApiModelProperty(value = "更新日期", required = true)
    private String updateDate;

    @ApiModelProperty(value = "更新时间", required = true)
    private String updateTime;

    @ApiModelProperty(value = "有效状态", required = true)
    private String valid;

    @ApiModelProperty(value = "备注信息", required = true)
    private String remark;

    @ApiModelProperty(value = "机构代码", required = true)
    private String orgids;

    @ApiModelProperty(value = "用户代码", required = true)
    private String userids;

    @ApiModelProperty(value = "运营标识", required = true)
    private String operationTags;

    @ApiModelProperty(value = "bp节点号", required = true)
    private String bpnode;

    @ApiModelProperty(value = "内存服务组号", required = true)
    private String srvgroup;

    @ApiModelProperty(value = "服务类别", required = true)
    private String servertypes;

    @ApiModelProperty(value = "服务运行数", required = true)
    private String serverscount;

    @ApiModelProperty(value = "状态", required = true)
    private String status;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券内码", required = true)
    private String stkid;

    @ApiModelProperty(value = "证券名称", required = true)
    private String stkname;

    @ApiModelProperty(value = "货币代码", required = true)
    private String moneytype;

    @ApiModelProperty(value = "状态", required = true)
    private String stkstatus;

    @ApiModelProperty(value = "资产类别", required = true)
    private String fundkind;

    @ApiModelProperty(value = "证券类别单位", required = true)
    private String typeunit;

    @ApiModelProperty(value = "修改日期", required = true)
    private String modifydate;

    @ApiModelProperty(value = "修改时间", required = true)
    private String modifytime;

    @ApiModelProperty(value = "修改人", required = true)
    private String modifyoperid;

    @ApiModelProperty(value = "流程类型", required = true)
    private String flowtype;

    @ApiModelProperty(value = "转发节点数", required = true)
    private String transferCount;

    @ApiModelProperty(value = "模板描述", required = true)
    private String modelname;

    @ApiModelProperty(value = "修改人", required = true)
    private String modifyoperid;

    @ApiModelProperty(value = "修改日期", required = true)
    private String modifydate;

    @ApiModelProperty(value = "修改时间", required = true)
    private String modifytime;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "业务类型", required = true)
    private String busiType;

    @ApiModelProperty(value = "订单起始日期", required = true)
    private String busibegindate;

    @ApiModelProperty(value = "订单结束日期", required = true)
    private String busienddate;

    @ApiModelProperty(value = "订单整手数", required = true)
    private BigDecimal reportunit;

    @ApiModelProperty(value = "订单申报最小数量", required = true)
    private BigDecimal minreportqty;

    @ApiModelProperty(value = "订单申报最大数量", required = true)
    private BigDecimal maxreportqty;

    @ApiModelProperty(value = "目标证券代码", required = true)
    private String transinstkcode;

    @ApiModelProperty(value = "目标证券简称", required = true)
    private String transinstkname;

    @ApiModelProperty(value = "业务价格", required = true)
    private BigDecimal busiprice;

    @ApiModelProperty(value = "证券内码", required = true)
    private String stkid;

    @ApiModelProperty(value = "产品ID", required = true)
    private String productid;

    @ApiModelProperty(value = "是否签署产品协议", required = true)
    private String agrtype;

    @ApiModelProperty(value = "后端申购代码", required = true)
    private String backpurchasecode;

    @ApiModelProperty(value = "单位当日收益", required = true)
    private BigDecimal calpmunitincm;

    @ApiModelProperty(value = "变更前存续期截止日期", required = true)
    private BigDecimal changebeforedurationenddate;

    @ApiModelProperty(value = "基金中文名称", required = true)
    private String chiname;

    @ApiModelProperty(value = "封闭期起始日期", required = true)
    private BigDecimal closeperiodbegindate;

    @ApiModelProperty(value = "封闭期截止日期", required = true)
    private BigDecimal closeperiodenddate;

    @ApiModelProperty(value = "封闭期类型代码", required = true)
    private String closeperiodtypecode;

    @ApiModelProperty(value = "募集起始日期", required = true)
    private BigDecimal collectbegindate;

    @ApiModelProperty(value = "募集截止日期", required = true)
    private BigDecimal collectenddate;

    @ApiModelProperty(value = "基金成立日期", required = true)
    private BigDecimal contracteffdate;

    @ApiModelProperty(value = "合同生效公告日期", required = true)
    private BigDecimal contracteffnoticedate;

    @ApiModelProperty(value = "产品状态", required = true)
    private String datastatus;

    @ApiModelProperty(value = "日收益率", required = true)
    private BigDecimal dayreturn;

    @ApiModelProperty(value = "删除标识", required = true)
    private String delid;

    @ApiModelProperty(value = "申购折扣", required = true)
    private BigDecimal discount;

    @ApiModelProperty(value = "存续期起始日期", required = true)
    private BigDecimal durationbegindate;

    @ApiModelProperty(value = "存续期截止日期", required = true)
    private BigDecimal durationenddate;

    @ApiModelProperty(value = "存续年限", required = true)
    private BigDecimal durationyear;

    @ApiModelProperty(value = "终止上市日期", required = true)
    private BigDecimal endlistdate;

    @ApiModelProperty(value = "基金英文名称", required = true)
    private String engname;

    @ApiModelProperty(value = "英文名称缩写", required = true)
    private String engnameshort;

    @ApiModelProperty(value = "交易所代码", required = true)
    private String exchangecode;

    @ApiModelProperty(value = "交易所名称", required = true)
    private String exchangename;

    @ApiModelProperty(value = "扩位简称", required = true)
    private String expchinameabbr;

    @ApiModelProperty(value = "记录落地时间", required = true)
    private BigDecimal recdowntime;

    @ApiModelProperty(value = "记录进表时间", required = true)
    private BigDecimal recfirsttime;

    @ApiModelProperty(value = "记录编号", required = true)
    private String recid;

    @ApiModelProperty(value = "记录更新时间", required = true)
    private BigDecimal recupdatetime;

    @ApiModelProperty(value = "证券编号", required = true)
    private String secuid;

    @ApiModelProperty(value = "前端申购代码", required = true)
    private String frontpurchasecode;

    @ApiModelProperty(value = "基金级别代码", required = true)
    private String fundlevelcode;

    @ApiModelProperty(value = "基金分级模式代码", required = true)
    private String fundlevelmodecode;

    @ApiModelProperty(value = "基金管理公司", required = true)
    private String fundmanagecorp;

    @ApiModelProperty(value = "基金管理公司编号", required = true)
    private String fundmanagecorpid;

    @ApiModelProperty(value = "基金运作方式代码", required = true)
    private String fundopermodecode;

    @ApiModelProperty(value = "基金运作周期", required = true)
    private String fundoperperiod;

    @ApiModelProperty(value = "基金风格代码", required = true)
    private String fundstylecode;

    @ApiModelProperty(value = "基金托管人", required = true)
    private String fundtrustee;

    @ApiModelProperty(value = "基金托管人编号", required = true)
    private String fundtrusteeid;

    @ApiModelProperty(value = "天相一级基金类型", required = true)
    private String fundtype;

    @ApiModelProperty(value = "基金类型代码", required = true)
    private String fundtypecode;

    @ApiModelProperty(value = "天相基金类型代码", required = true)
    private String fundtypecodetx;

    @ApiModelProperty(value = "产品中心配置的是否代销", required = true)
    private String gfselling;

    @ApiModelProperty(value = "是否定期开放型基金", required = true)
    private String iffixdateopenfund;

    @ApiModelProperty(value = "是否可定投", required = true)
    private String iffixed;

    @ApiModelProperty(value = "交易日期", required = true)
    private BigDecimal indextradedate;

    @ApiModelProperty(value = "投资特征代码", required = true)
    private String investfeaturecode;

    @ApiModelProperty(value = "投资品种", required = true)
    private String investtype;

    @ApiModelProperty(value = "是否在柜台可购买该基金", required = true)
    private String isallowbuy;

    @ApiModelProperty(value = "是否在柜台可赎回该基金", required = true)
    private String isallowredeem;

    @ApiModelProperty(value = "是否在交易所交易", required = true)
    private String isexchangetrans;

    @ApiModelProperty(value = "是否是虚拟基金", required = true)
    private String isvirtualfund;

    @ApiModelProperty(value = "发行规模", required = true)
    private BigDecimal issuescale;

    @ApiModelProperty(value = "星级评价代码", required = true)
    private BigDecimal levelcode;

    @ApiModelProperty(value = "星级评级日期", required = true)
    private BigDecimal levelpublishdate;

    @ApiModelProperty(value = "上市板块代码", required = true)
    private String listboarcode;

    @ApiModelProperty(value = "上市板块名称", required = true)
    private String listboarname;

    @ApiModelProperty(value = "上市日期", required = true)
    private BigDecimal listdate;

    @ApiModelProperty(value = "上市规模", required = true)
    private BigDecimal listscale;

    @ApiModelProperty(value = "上市状态代码", required = true)
    private String liststatuscode;

    @ApiModelProperty(value = "indexTradeDate前一天后复权份额净值", required = true)
    private BigDecimal lstdafterrorshrnav;

    @ApiModelProperty(value = "最低持有份额", required = true)
    private BigDecimal minholdshare;

    @ApiModelProperty(value = "个人首次最低申购金额", required = true)
    private BigDecimal minperfappbalance;

    @ApiModelProperty(value = "最低赎回份额", required = true)
    private BigDecimal minredemptionshare;

    @ApiModelProperty(value = "净值交易日期", required = true)
    private BigDecimal navtradedate;

    @ApiModelProperty(value = "是否上柜", required = true)
    private String oncounter;

    @ApiModelProperty(value = "个人首次最低认购金额", required = true)
    private BigDecimal openshare;

    @ApiModelProperty(value = "面值", required = true)
    private BigDecimal parvalue;

    @ApiModelProperty(value = "面值货币代码", required = true)
    private String parvaluecrrccode;

    @ApiModelProperty(value = "业绩比较基准", required = true)
    private String perfbenchmark;

    @ApiModelProperty(value = "投资期限", required = true)
    private String periodtype;

    @ApiModelProperty(value = "拼音简称", required = true)
    private String pinyinabbr;

    @ApiModelProperty(value = "navTradeDate每万元基金单位当日收益", required = true)
    private BigDecimal pmunitincm;

    @ApiModelProperty(value = "日历状态", required = true)
    private String prodstatus;

    @ApiModelProperty(value = "产品TA编号", required = true)
    private String prodtano;

    @ApiModelProperty(value = "购买渠道:柜台", required = true)
    private String purchaseway;

    @ApiModelProperty(value = "navTradeDate最近7日年化收益率", required = true)
    private BigDecimal recent7dayannreturn;

    @ApiModelProperty(value = "indexTradeDate近一个月收益率", required = true)
    private BigDecimal return1m;

    @ApiModelProperty(value = "indexTradeDate近一周收益率", required = true)
    private BigDecimal return1w;

    @ApiModelProperty(value = "indexTradeDate近一年收益率", required = true)
    private BigDecimal return1y;

    @ApiModelProperty(value = "indexTradeDate近二年收益率", required = true)
    private BigDecimal return2y;

    @ApiModelProperty(value = "indexTradeDate近三个月收益率", required = true)
    private BigDecimal return3m;

    @ApiModelProperty(value = "indexTradeDate近三年收益率", required = true)
    private BigDecimal return3y;

    @ApiModelProperty(value = "indexTradeDate近五年收益率", required = true)
    private BigDecimal return5y;

    @ApiModelProperty(value = "indexTradeDate近六个月收益率", required = true)
    private BigDecimal return6m;

    @ApiModelProperty(value = "indexTradeDate成立以来收益率", required = true)
    private BigDecimal returntn;

    @ApiModelProperty(value = "indexTradeDate今年以来收益率", required = true)
    private BigDecimal returnty;

    @ApiModelProperty(value = "收益类型代码", required = true)
    private String returntypecode;

    @ApiModelProperty(value = "风险等级", required = true)
    private String risklevel;

    @ApiModelProperty(value = "基金最新规模", required = true)
    private BigDecimal scale;

    @ApiModelProperty(value = "基金简称", required = true)
    private String secuabbr;

    @ApiModelProperty(value = "证券主编号", required = true)
    private String secumainid;

    @ApiModelProperty(value = "产品类型", required = true)
    private String secutype;

    @ApiModelProperty(value = "份额结转日期", required = true)
    private BigDecimal sharecaroverdate;

    @ApiModelProperty(value = "navTradeDate单位净值", required = true)
    private BigDecimal sharenav;

    @ApiModelProperty(value = "indexTradeDate后复权单位净值", required = true)
    private BigDecimal sharenavafterror;

    @ApiModelProperty(value = "navTradeDate累计净值", required = true)
    private BigDecimal sharesumnav;

    @ApiModelProperty(value = "份额结转日类型代码", required = true)
    private String shrcaroverdaytypecode;

    @ApiModelProperty(value = "份额结转方式代码", required = true)
    private String shrcarovermodecode;

    @ApiModelProperty(value = "近一年定投收益率", required = true)
    private BigDecimal timereturn1y;

    @ApiModelProperty(value = "近两年定投收益率", required = true)
    private BigDecimal timereturn2y;

    @ApiModelProperty(value = "近三年定投收益率", required = true)
    private BigDecimal timereturn3y;

    @ApiModelProperty(value = "交易代码", required = true)
    private String tradecode;

    @ApiModelProperty(value = "历史最大回撤", required = true)
    private BigDecimal maxretracement;

    @ApiModelProperty(value = "机构单日购买上限", required = true)
    private BigDecimal orgmaxpdshare;

    @ApiModelProperty(value = "机构首次最低申购金额", required = true)
    private BigDecimal minorgfappbalance;

    @ApiModelProperty(value = "机构最低申购金额", required = true)
    private BigDecimal orglowlimitbalance2;

    @ApiModelProperty(value = "基金规模日期", required = true)
    private BigDecimal scalenoticedate;

    @ApiModelProperty(value = "基金经理", required = true)
    private String invmgrs;

    @ApiModelProperty(value = "认购费率", required = true)
    private BigDecimal subfeeratio;

    @ApiModelProperty(value = "折后认购费率", required = true)
    private BigDecimal discountsubfeeratio;

    @ApiModelProperty(value = "申购费率", required = true)
    private BigDecimal applyfeeratio;

    @ApiModelProperty(value = "折后申购费率", required = true)
    private BigDecimal discountapplyfeeratio;

    @ApiModelProperty(value = "赎回费率", required = true)
    private BigDecimal redeemfeeratio;

    @ApiModelProperty(value = "折后赎回费率", required = true)
    private BigDecimal discountredeemfeeratio;

    @ApiModelProperty(value = "托管费率", required = true)
    private BigDecimal trusteeshipfeeratio;

    @ApiModelProperty(value = "管理费率", required = true)
    private BigDecimal managefeeratio;

    @ApiModelProperty(value = "业绩报酬", required = true)
    private BigDecimal rewardfeeratio;

    @ApiModelProperty(value = "收费方式", required = true)
    private String chargetype;

    @ApiModelProperty(value = "分红方式", required = true)
    private String bonusmethod;

    @ApiModelProperty(value = "赎回单位", required = true)
    private BigDecimal redemptionunit;

    @ApiModelProperty(value = "赎回最大份额", required = true)
    private BigDecimal maxorgredshare;

    @ApiModelProperty(value = "资管精选", required = true)
    private String assetrecommend;

    @ApiModelProperty(value = "财富精选", required = true)
    private String wealthrecommend;

    @ApiModelProperty(value = "新发产品", required = true)
    private String newproduct;

    @ApiModelProperty(value = "资产分类", required = true)
    private String assetstype;

    @ApiModelProperty(value = "期末基金资产净值", required = true)
    private BigDecimal endfundassetnav;

    @ApiModelProperty(value = "截止日期", required = true)
    private BigDecimal enddate;

    @ApiModelProperty(value = "同步状态", required = true)
    private String syncStat;

    @ApiModelProperty(value = "记录更新日期", required = true)
    private String recordDate;

    @ApiModelProperty(value = "记录状态", required = true)
    private String recordStat;

    @ApiModelProperty(value = "标签名", required = true)
    private String labelName;

    @ApiModelProperty(value = "点评标题", required = true)
    private String commentTitle;

    @ApiModelProperty(value = "点评正文", required = true)
    private String commExplain;

    @ApiModelProperty(value = "标签", required = true)
    private String subLabel;

    @ApiModelProperty(value = "代码收费类型", required = true)
    private String purchasecodetype;

    @ApiModelProperty(value = "接口来源", required = true)
    private String interfacenames;

    @ApiModelProperty(value = "原始代码", required = true)
    private String orgtradecode;

    @ApiModelProperty(value = "推荐词", required = true)
    private String introduce;

    @ApiModelProperty(value = "推荐原因", required = true)
    private String reason;

    @ApiModelProperty(value = "债券基金类型", required = true)
    private String bondtypecode;

    @ApiModelProperty(value = "基金赎回资金可取日", required = true)
    private String moneydate;

    @ApiModelProperty(value = "机构单笔最高申购金额", required = true)
    private BigDecimal orgoneappmaxbalance;

    @ApiModelProperty(value = "机构追加认购金额", required = true)
    private BigDecimal orgappendbalance;

    @ApiModelProperty(value = "机构单笔最高认购金额", required = true)
    private BigDecimal orgonesubmaxbalance;

    @ApiModelProperty(value = "机构最低认购金额", required = true)
    private BigDecimal orglowlimitbalance;

    @ApiModelProperty(value = "基金赎回资金到账日", required = true)
    private String withdrawdate;

    @ApiModelProperty(value = "同业存单指数基金", required = true)
    private String ncdindexfund;

    @ApiModelProperty(value = "封闭期", required = true)
    private String closeperiod;

    @ApiModelProperty(value = "预计份额确认日", required = true)
    private String expectbuydate;

    @ApiModelProperty(value = "预计资金到账日", required = true)
    private String expectwithdrawdate;

    @ApiModelProperty(value = "个人最低认购金额", required = true)
    private BigDecimal minshare;

    @ApiModelProperty(value = "个人追加认购金额", required = true)
    private BigDecimal allotlimitshare;

    @ApiModelProperty(value = "个人最低申购金额", required = true)
    private BigDecimal minshare2;

    @ApiModelProperty(value = "个人追加申购金额", required = true)
    private BigDecimal allotlimitshare2;

    @ApiModelProperty(value = "机构追加申购金额", required = true)
    private BigDecimal orgappendbalance2;

    @ApiModelProperty(value = "机构首次最低金额", required = true)
    private BigDecimal minsize;

    @ApiModelProperty(value = "个人单笔最高认购金额", required = true)
    private BigDecimal peronesubmaxbalance;

    @ApiModelProperty(value = "个人单笔最高申购金额", required = true)
    private BigDecimal peroneappmaxbalance;

    @ApiModelProperty(value = "个人最高赎回份额", required = true)
    private BigDecimal maxperredshare;

    @ApiModelProperty(value = "个人最高申购金额", required = true)
    private BigDecimal maxperappbalance;

    @ApiModelProperty(value = "机构最高申购金额", required = true)
    private BigDecimal maxorgappbalance;

    @ApiModelProperty(value = "个人认购累计金额", required = true)
    private BigDecimal sumsubbalance;

    @ApiModelProperty(value = "机构认购累计金额", required = true)
    private BigDecimal orgsumsubbalance;

    @ApiModelProperty(value = "最少转换份额", required = true)
    private BigDecimal translimitshare;

    @ApiModelProperty(value = "允许转换状态", required = true)
    private String prodconvertstatus;

    @ApiModelProperty(value = "代码允许转换代码", required = true)
    private String enchangecode;

    @ApiModelProperty(value = "持仓量的最低值", required = true)
    private BigDecimal currentamountlow;

    @ApiModelProperty(value = "客户单日申购最高金额", required = true)
    private BigDecimal maxpdshare;

    @ApiModelProperty(value = "赎回最低份额", required = true)
    private BigDecimal redeemlimitshare;

    @ApiModelProperty(value = "机构份额标签", required = true)
    private String orgsharelbl;

    @ApiModelProperty(value = "柜台产品类型", required = true)
    private String prodType;

    @ApiModelProperty(value = "证券内码", required = true)
    private String stkid;

    @ApiModelProperty(value = "产品ID", required = true)
    private String productid;

    @ApiModelProperty(value = "是否海外资产", required = true)
    private String abroadasset;

    @ApiModelProperty(value = "累计净值", required = true)
    private BigDecimal accumnav;

    @ApiModelProperty(value = "追加金额", required = true)
    private BigDecimal additionamount;

    @ApiModelProperty(value = "是否签署产品协议", required = true)
    private String agrtype;

    @ApiModelProperty(value = "是否需要适当性匹配", required = true)
    private String approtype;

    @ApiModelProperty(value = "资产详细分类", required = true)
    private String assetalltype;

    @ApiModelProperty(value = "资管产品类别", required = true)
    private String assetmgrtype;

    @ApiModelProperty(value = "是否报价", required = true)
    private String isquoted;

    @ApiModelProperty(value = "代销规模(份)", required = true)
    private BigDecimal sellsize;

    @ApiModelProperty(value = "资产第一级分类", required = true)
    private String assetonetype;

    @ApiModelProperty(value = "资产分类", required = true)
    private String assetstype;

    @ApiModelProperty(value = "业绩比较基准", required = true)
    private BigDecimal benchmark;

    @ApiModelProperty(value = "中文名称", required = true)
    private String chiname;

    @ApiModelProperty(value = "简称", required = true)
    private String chinameabbr;

    @ApiModelProperty(value = "拼音简称", required = true)
    private String chispelling;

    @ApiModelProperty(value = "产品到期日,毫秒计", required = true)
    private BigDecimal closedate;

    @ApiModelProperty(value = "是否分级", required = true)
    private String composetag;

    @ApiModelProperty(value = "关联代码", required = true)
    private String connectedcode;

    @ApiModelProperty(value = "币种", required = true)
    private String currencytype;

    @ApiModelProperty(value = "是否定制", required = true)
    private String customizedornot;

    @ApiModelProperty(value = "产品状态", required = true)
    private String datastatus;

    @ApiModelProperty(value = "日涨幅", required = true)
    private BigDecimal dateraise;

    @ApiModelProperty(value = "参与金额", required = true)
    private BigDecimal firstamount;

    @ApiModelProperty(value = "面向客户类型", required = true)
    private String forcustomertype;

    @ApiModelProperty(value = "是否代销", required = true)
    private String gfselling;

    @ApiModelProperty(value = "对冲属性", required = true)
    private String hedgingflag;

    @ApiModelProperty(value = "收益类型", required = true)
    private String incometype;

    @ApiModelProperty(value = "记录息天数", required = true)
    private String interestdays;

    @ApiModelProperty(value = "投资风格", required = true)
    private String investstyle;

    @ApiModelProperty(value = "投资品种", required = true)
    private String investtype;

    @ApiModelProperty(value = "投资经理名称", required = true)
    private String invmgrs;

    @ApiModelProperty(value = "实际发行规模(份)", required = true)
    private BigDecimal isssize;

    @ApiModelProperty(value = "发行公司", required = true)
    private String issuecompany;

    @ApiModelProperty(value = "发行主体", required = true)
    private String issuer;

    @ApiModelProperty(value = "管理期限,毫秒计", required = true)
    private String mgmtperiod;

    @ApiModelProperty(value = "近1月涨幅", required = true)
    private BigDecimal monraise;

    @ApiModelProperty(value = "近3月涨幅", required = true)
    private BigDecimal monraise3;

    @ApiModelProperty(value = "近6月涨幅", required = true)
    private BigDecimal monraise6;

    @ApiModelProperty(value = "近1年涨幅", required = true)
    private BigDecimal raiseoneyear;

    @ApiModelProperty(value = "投资期限天数", required = true)
    private String prodterm;

    @ApiModelProperty(value = "净值计算日期", required = true)
    private BigDecimal navdate;

    @ApiModelProperty(value = "面值", required = true)
    private BigDecimal parvalue;

    @ApiModelProperty(value = "母份额编码", required = true)
    private String parentsecucode;

    @ApiModelProperty(value = "支付方式", required = true)
    private String payway;

    @ApiModelProperty(value = "业绩比较基准1", required = true)
    private String perfben;

    @ApiModelProperty(value = "是否业绩比较基准", required = true)
    private String perfbenshow;

    @ApiModelProperty(value = "投资期限", required = true)
    private String periodtype;

    @ApiModelProperty(value = "资管产品", required = true)
    private String prodmodel;

    @ApiModelProperty(value = "产品运作方式", required = true)
    private String prodoperationtype;

    @ApiModelProperty(value = "专项产品标志", required = true)
    private String prodreleaseobject;

    @ApiModelProperty(value = "日历状态", required = true)
    private String prodstatus;

    @ApiModelProperty(value = "产品TA编号", required = true)
    private String prodtano;

    @ApiModelProperty(value = "产品子类", required = true)
    private String productsubtype;

    @ApiModelProperty(value = "资管产品分类", required = true)
    private String psecutype;

    @ApiModelProperty(value = "购买渠道", required = true)
    private String purchaseway;

    @ApiModelProperty(value = "量化属性", required = true)
    private String quantitativeflag;

    @ApiModelProperty(value = "自成立来涨幅", required = true)
    private BigDecimal raise;

    @ApiModelProperty(value = "收益日期", required = true)
    private BigDecimal raisedate;

    @ApiModelProperty(value = "评审状态", required = true)
    private String reviewstatus;

    @ApiModelProperty(value = "风险等级", required = true)
    private String risklevel;

    @ApiModelProperty(value = "产品编码", required = true)
    private String secucode;

    @ApiModelProperty(value = "产品类型", required = true)
    private String secutype;

    @ApiModelProperty(value = "成立日期,毫秒计", required = true)
    private BigDecimal setupdate;

    @ApiModelProperty(value = "投资策略", required = true)
    private String strategy;

    @ApiModelProperty(value = "是否子公司产品", required = true)
    private String subcompanyornot;

    @ApiModelProperty(value = "产品净值", required = true)
    private BigDecimal unitnav;

    @ApiModelProperty(value = "更新时间", required = true)
    private String updatetime;

    @ApiModelProperty(value = "起息日期,毫秒计", required = true)
    private BigDecimal valuedate;

    @ApiModelProperty(value = "产品财富分类", required = true)
    private String wealthtype;

    @ApiModelProperty(value = "是否支持退订，服务产品特有", required = true)
    private String withdrawtype;

    @ApiModelProperty(value = "自今年涨幅", required = true)
    private BigDecimal yearraise;

    @ApiModelProperty(value = "机构单日购买上限", required = true)
    private BigDecimal orgmaxpdshare;

    @ApiModelProperty(value = "基金是否可购买", required = true)
    private String isallowbuy;

    @ApiModelProperty(value = "机构首次最低申购金额", required = true)
    private BigDecimal minorgfappbalance;

    @ApiModelProperty(value = "机构最低申购金额", required = true)
    private BigDecimal orglowlimitbalance2;

    @ApiModelProperty(value = "近一年涨幅", required = true)
    private BigDecimal yearraise1;

    @ApiModelProperty(value = "认购费率", required = true)
    private BigDecimal subfeeratio;

    @ApiModelProperty(value = "折后认购费率", required = true)
    private BigDecimal discountsubfeeratio;

    @ApiModelProperty(value = "申购费率", required = true)
    private BigDecimal applyfeeratio;

    @ApiModelProperty(value = "折后申购费率", required = true)
    private BigDecimal discountapplyfeeratio;

    @ApiModelProperty(value = "赎回费率", required = true)
    private BigDecimal redeemfeeratio;

    @ApiModelProperty(value = "折后赎回费率", required = true)
    private BigDecimal discountredeemfeeratio;

    @ApiModelProperty(value = "托管费率", required = true)
    private BigDecimal trusteeshipfeeratio;

    @ApiModelProperty(value = "管理费率", required = true)
    private BigDecimal managefeeratio;

    @ApiModelProperty(value = "业绩报酬", required = true)
    private BigDecimal rewardfeeratio;

    @ApiModelProperty(value = "赎回单位", required = true)
    private BigDecimal redemptionunit;

    @ApiModelProperty(value = "赎回最大份额", required = true)
    private BigDecimal maxorgredshare;

    @ApiModelProperty(value = "资管精选", required = true)
    private String assetrecommend;

    @ApiModelProperty(value = "财富精选", required = true)
    private String wealthrecommend;

    @ApiModelProperty(value = "新发产品", required = true)
    private String newproduct;

    @ApiModelProperty(value = "收益率类型", required = true)
    private String incomeratetype;

    @ApiModelProperty(value = "最高业绩比较基准", required = true)
    private BigDecimal maxcompref;

    @ApiModelProperty(value = "最低业绩比较基准", required = true)
    private BigDecimal mincompref;

    @ApiModelProperty(value = "到期收益率", required = true)
    private BigDecimal ytm;

    @ApiModelProperty(value = "购买日", required = true)
    private String buydate;

    @ApiModelProperty(value = "万份单位收益", required = true)
    private BigDecimal permyriadincome;

    @ApiModelProperty(value = "7日年化收益率", required = true)
    private BigDecimal sevenincomeratio;

    @ApiModelProperty(value = "预期年收益率", required = true)
    private BigDecimal prodpreratio;

    @ApiModelProperty(value = "总销售额度", required = true)
    private BigDecimal totalQuota;

    @ApiModelProperty(value = "已销售额度", required = true)
    private BigDecimal saleQuota;

    @ApiModelProperty(value = "总购买人数上限", required = true)
    private String totalHolderNum;

    @ApiModelProperty(value = "已购买人数", required = true)
    private String currentHolderNum;

    @ApiModelProperty(value = "柜台类别", required = true)
    private String t2type;

    @ApiModelProperty(value = "同步状态", required = true)
    private String syncStat;

    @ApiModelProperty(value = "记录更新日期", required = true)
    private String recordDate;

    @ApiModelProperty(value = "记录状态", required = true)
    private String recordStat;

    @ApiModelProperty(value = "标签名", required = true)
    private String labelName;

    @ApiModelProperty(value = "点评标题", required = true)
    private String commentTitle;

    @ApiModelProperty(value = "点评正文", required = true)
    private String commExplain;

    @ApiModelProperty(value = "标签", required = true)
    private String subLabel;

    @ApiModelProperty(value = "接口来源", required = true)
    private String interfacenames;

    @ApiModelProperty(value = "参公集合产品", required = true)
    private String referpublicprod;

    @ApiModelProperty(value = "推荐词", required = true)
    private String introduce;

    @ApiModelProperty(value = "推荐原因", required = true)
    private String reason;

    @ApiModelProperty(value = "机构单笔最高申购金额", required = true)
    private BigDecimal orgoneappmaxbalance;

    @ApiModelProperty(value = "机构追加认购金额", required = true)
    private BigDecimal orgappendbalance;

    @ApiModelProperty(value = "机构单笔最高认购金额", required = true)
    private BigDecimal orgonesubmaxbalance;

    @ApiModelProperty(value = "机构最低认购金额", required = true)
    private BigDecimal orglowlimitbalance;

    @ApiModelProperty(value = "同业存单指数基金", required = true)
    private String ncdindexfund;

    @ApiModelProperty(value = "个人最低认购金额", required = true)
    private BigDecimal minshare;

    @ApiModelProperty(value = "个人追加认购金额", required = true)
    private BigDecimal allotlimitshare;

    @ApiModelProperty(value = "个人最低申购金额", required = true)
    private BigDecimal minshare2;

    @ApiModelProperty(value = "个人追加申购金额", required = true)
    private BigDecimal allotlimitshare2;

    @ApiModelProperty(value = "机构追加申购金额", required = true)
    private BigDecimal orgappendbalance2;

    @ApiModelProperty(value = "机构首次最低金额", required = true)
    private BigDecimal minsize;

    @ApiModelProperty(value = "个人单笔最高认购金额", required = true)
    private BigDecimal peronesubmaxbalance;

    @ApiModelProperty(value = "个人单笔最高申购金额", required = true)
    private BigDecimal peroneappmaxbalance;

    @ApiModelProperty(value = "个人最高赎回份额", required = true)
    private BigDecimal maxperredshare;

    @ApiModelProperty(value = "个人最高申购金额", required = true)
    private BigDecimal maxperappbalance;

    @ApiModelProperty(value = "机构最高申购金额", required = true)
    private BigDecimal maxorgappbalance;

    @ApiModelProperty(value = "个人认购累计金额", required = true)
    private BigDecimal sumsubbalance;

    @ApiModelProperty(value = "机构认购累计金额", required = true)
    private BigDecimal orgsumsubbalance;

    @ApiModelProperty(value = "最少转换份额", required = true)
    private BigDecimal translimitshare;

    @ApiModelProperty(value = "允许转换状态", required = true)
    private String prodconvertstatus;

    @ApiModelProperty(value = "前后收费类型", required = true)
    private String chargetype;

    @ApiModelProperty(value = "代码允许转换代码", required = true)
    private String enchangecode;

    @ApiModelProperty(value = "持仓量的最低值", required = true)
    private BigDecimal currentamountlow;

    @ApiModelProperty(value = "客户单日申购最高金额", required = true)
    private BigDecimal maxpdshare;

    @ApiModelProperty(value = "个人首次最低申购金额", required = true)
    private BigDecimal minperfappbalance;

    @ApiModelProperty(value = "个人首次最低认购金额", required = true)
    private BigDecimal openshare;

    @ApiModelProperty(value = "赎回最低份额", required = true)
    private BigDecimal redeemlimitshare;

    @ApiModelProperty(value = "是否预约委托", required = true)
    private String limitpreentrust;

    @ApiModelProperty(value = "是否预约赎回", required = true)
    private String appointredeem;

    @ApiModelProperty(value = "希望处理日期", required = true)
    private String hopedate;

    @ApiModelProperty(value = "赎回截止日可提交时间", required = true)
    private String redeemdeadline;

    @ApiModelProperty(value = "预约委托日", required = true)
    private String appointredeemdate;

    @ApiModelProperty(value = "机构份额标签", required = true)
    private String orgsharelbl;

    @ApiModelProperty(value = "任务组", required = true)
    private String taskgroup;

    @ApiModelProperty(value = "任务ID", required = true)
    private String taskid;

    @ApiModelProperty(value = "执行顺序", required = true)
    private String execorder;

    @ApiModelProperty(value = "前置任务", required = true)
    private String pretask;

    @ApiModelProperty(value = "任务有效性", required = true)
    private String status;

    @ApiModelProperty(value = "暂停标识", required = true)
    private String stopflag;

    @ApiModelProperty(value = "任务功能号", required = true)
    private String lbmid;

    @ApiModelProperty(value = "超时时间", required = true)
    private String timeout;

    @ApiModelProperty(value = "业务参数", required = true)
    private String busiparam;

    @ApiModelProperty(value = "失败处理方式", required = true)
    private String failtype;

    @ApiModelProperty(value = "成功处理方式", required = true)
    private String succtype;

    @ApiModelProperty(value = "本轮失败次数", required = true)
    private String roundfailtimes;

    @ApiModelProperty(value = "本轮失败次数上限", required = true)
    private String roundfailmax;

    @ApiModelProperty(value = "本轮运行状态", required = true)
    private String roundruning;

    @ApiModelProperty(value = "执行状态", required = true)
    private String execstat;

    @ApiModelProperty(value = "任务组", required = true)
    private String taskgroup;

    @ApiModelProperty(value = "任务ID", required = true)
    private String taskid;

    @ApiModelProperty(value = "操作日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "操作员", required = true)
    private String operid;

    @ApiModelProperty(value = "操作时间", required = true)
    private String opertime;

    @ApiModelProperty(value = "执行通过标志", required = true)
    private String passFlag;

    @ApiModelProperty(value = "备注信息", required = true)
    private String remark;

    @ApiModelProperty(value = "排序方式", required = true)
    private String rankMode;

    @ApiModelProperty(value = "产品类型", required = true)
    private String prdType;

    @ApiModelProperty(value = "产品小类", required = true)
    private String subPrdType;

    @ApiModelProperty(value = "时间区间", required = true)
    private String period;

    @ApiModelProperty(value = "序号", required = true)
    private String rowNo;

    @ApiModelProperty(value = "产品代码", required = true)
    private String prdNo;

    @ApiModelProperty(value = "产品简称", required = true)
    private String prdName;

    @ApiModelProperty(value = "客户购买金额", required = true)
    private BigDecimal trdBal;

    @ApiModelProperty(value = "购买客户数", required = true)
    private String trdCust;

    @ApiModelProperty(value = "近1月涨幅", required = true)
    private BigDecimal ror1m;

    @ApiModelProperty(value = "近3月涨幅", required = true)
    private BigDecimal ror3m;

    @ApiModelProperty(value = "今年以来涨幅", required = true)
    private BigDecimal rorThsYear;

    @ApiModelProperty(value = "业绩基准", required = true)
    private BigDecimal benchmark;

    @ApiModelProperty(value = "投资期限", required = true)
    private String ivstTerm;

    @ApiModelProperty(value = "产品成立日", required = true)
    private BigDecimal setupDate;

    @ApiModelProperty(value = "到期日期", required = true)
    private BigDecimal closeDate;

    @ApiModelProperty(value = "万份收益", required = true)
    private BigDecimal perMyriadIncome;

    @ApiModelProperty(value = "7日年化收益", required = true)
    private BigDecimal annualizedYield7d;

    @ApiModelProperty(value = "近一月年化收益", required = true)
    private BigDecimal annualizedYield1m;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busiDate;

    @ApiModelProperty(value = "资讯ID", required = true)
    private String infoid;

    @ApiModelProperty(value = "资讯标题", required = true)
    private String title;

    @ApiModelProperty(value = "资讯摘要", required = true)
    private String roundup;

    @ApiModelProperty(value = "资讯URL", required = true)
    private String url;

    @ApiModelProperty(value = "多空情感分数", required = true)
    private BigDecimal sentimentScore;

    @ApiModelProperty(value = "同步日期", required = true)
    private String syncDate;

    @ApiModelProperty(value = "同步时间", required = true)
    private String syncTime;

    @ApiModelProperty(value = "发布日期", required = true)
    private String publishDate;

    @ApiModelProperty(value = "发布时间", required = true)
    private String publishTime;

    @ApiModelProperty(value = "资讯ID", required = true)
    private String infoid;

    @ApiModelProperty(value = "用户ID", required = true)
    private String userid;

    @ApiModelProperty(value = "是否有用", required = true)
    private String useful;

    @ApiModelProperty(value = "反馈信息", required = true)
    private String text;

    @ApiModelProperty(value = "反馈日期", required = true)
    private String feedbackDate;

    @ApiModelProperty(value = "反馈时间", required = true)
    private String feedbackTime;

    @ApiModelProperty(value = "资讯ID", required = true)
    private String infoid;

    @ApiModelProperty(value = "0度证券内码", required = true)
    private String parentStkid;

    @ApiModelProperty(value = "证券内码", required = true)
    private String stkid;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "市场代码", required = true)
    private String market;

    @ApiModelProperty(value = "0度关系", required = true)
    private String relationship;

    @ApiModelProperty(value = "资讯ID", required = true)
    private String infoid;

    @ApiModelProperty(value = "证券内码", required = true)
    private String stkid;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "交易所代码", required = true)
    private String market;

    @ApiModelProperty(value = "环境类型", required = true)
    private String envType;

    @ApiModelProperty(value = "参数KEY", required = true)
    private String paramKey;

    @ApiModelProperty(value = "参数VALUE", required = true)
    private String paramValue;

    @ApiModelProperty(value = "功能号", required = true)
    private String funcid;

    @ApiModelProperty(value = "功能号级别", required = true)
    private String funclevel;

    @ApiModelProperty(value = "业务日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "物理日期", required = true)
    private String phydate;

    @ApiModelProperty(value = "收集时间", required = true)
    private String phytime;

    @ApiModelProperty(value = "BP节点号", required = true)
    private String bpnodeid;

    @ApiModelProperty(value = "功能号", required = true)
    private String funcid;

    @ApiModelProperty(value = "调用次数", required = true)
    private String calltimes;

    @ApiModelProperty(value = "最大耗时", required = true)
    private String maxcost;

    @ApiModelProperty(value = "平均耗时", required = true)
    private String avgcost;

    @ApiModelProperty(value = "接口ID", required = true)
    private String interfaceId;

    @ApiModelProperty(value = "接口路径", required = true)
    private String interfacePath;

    @ApiModelProperty(value = "接口名称", required = true)
    private String interfaceName;

    @ApiModelProperty(value = "系统ID", required = true)
    private String systemId;

    @ApiModelProperty(value = "系统组ID", required = true)
    private String systemGid;

    @ApiModelProperty(value = "包体类型", required = true)
    private String contentType;

    @ApiModelProperty(value = "请求方法", required = true)
    private String method;

    @ApiModelProperty(value = "超时时间", required = true)
    private String timeout;

    @ApiModelProperty(value = "回调网关", required = true)
    private String targetMsgtype;

    @ApiModelProperty(value = "附加uri参数", required = true)
    private String extUriParam;

    @ApiModelProperty(value = "附加请求体参数", required = true)
    private String extBodyParam;

    @ApiModelProperty(value = "是否链路检查接口", required = true)
    private String isLinkCheck;

    @ApiModelProperty(value = "是否启用", required = true)
    private String isOpen;

    @ApiModelProperty(value = "请求别名", required = true)
    private String interfaceAlias;

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

    @ApiModelProperty(value = "系统ID", required = true)
    private String systemId;

    @ApiModelProperty(value = "系统组ID", required = true)
    private String systemGid;

    @ApiModelProperty(value = "监控日期", required = true)
    private String lastMonitorDate;

    @ApiModelProperty(value = "监控时间", required = true)
    private String lastMonitorTime;

    @ApiModelProperty(value = "链路状态", required = true)
    private String lastLinkStatus;

    @ApiModelProperty(value = "外部系统日期", required = true)
    private String systemBusidate;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "业务日期", required = true)
    private String logDate;

    @ApiModelProperty(value = "日志流水号", required = true)
    private String logSno;

    @ApiModelProperty(value = "系统ID", required = true)
    private String systemId;

    @ApiModelProperty(value = "系统组ID", required = true)
    private String systemGid;

    @ApiModelProperty(value = "监控日期", required = true)
    private String lastMonitorDate;

    @ApiModelProperty(value = "监控时间", required = true)
    private String lastMonitorTime;

    @ApiModelProperty(value = "链路状态", required = true)
    private String lastLinkStatus;

    @ApiModelProperty(value = "外部系统日期", required = true)
    private String systemBusidate;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "委托方向", required = true)
    private String bsflag;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券类别", required = true)
    private String stktype;

    @ApiModelProperty(value = "交易类型", required = true)
    private String trdid;

    @ApiModelProperty(value = "证券级别", required = true)
    private String stklevel;

    @ApiModelProperty(value = "证券板块", required = true)
    private String stkblock;

    @ApiModelProperty(value = "资产类别", required = true)
    private String fundkind;

    @ApiModelProperty(value = "报错信息", required = true)
    private String errmsg;

    @ApiModelProperty(value = "外部系统ID", required = true)
    private String systemId;

    @ApiModelProperty(value = "系统名称", required = true)
    private String systemName;

    @ApiModelProperty(value = "应用ID", required = true)
    private String appId;

    @ApiModelProperty(value = "应用秘钥", required = true)
    private String appKey;

    @ApiModelProperty(value = "鉴权超时时间", required = true)
    private String authTimeout;

    @ApiModelProperty(value = "是否开启鉴权", required = true)
    private String authFlag;

    @ApiModelProperty(value = "来源标识", required = true)
    private String appType;

    @ApiModelProperty(value = "应答类型", required = true)
    private String ansType;

    @ApiModelProperty(value = "状态", required = true)
    private String status;

    @ApiModelProperty(value = "外部系统ID", required = true)
    private String systemId;

    @ApiModelProperty(value = "接口ID", required = true)
    private String interfaceId;

    @ApiModelProperty(value = "流量控制标志", required = true)
    private String flowLimit;

    @ApiModelProperty(value = "授权状态", required = true)
    private String status;

    @ApiModelProperty(value = "接口ID", required = true)
    private String interfaceId;

    @ApiModelProperty(value = "接口路径", required = true)
    private String interfacePath;

    @ApiModelProperty(value = "接口名称", required = true)
    private String interfaceName;

    @ApiModelProperty(value = "功能号", required = true)
    private String funcid;

    @ApiModelProperty(value = "请求方法", required = true)
    private String method;

    @ApiModelProperty(value = "附加uri参数", required = true)
    private String extUriParam;

    @ApiModelProperty(value = "附加请求体参数", required = true)
    private String extBodyParam;

    @ApiModelProperty(value = "状态", required = true)
    private String status;

    @ApiModelProperty(value = "所属机构", required = true)
    private String orgid;

    @ApiModelProperty(value = "费用类型", required = true)
    private String feeid;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "ETF代码", required = true)
    private String etfcode0;

    @ApiModelProperty(value = "股票买卖费率", required = true)
    private BigDecimal feeSxf;

    @ApiModelProperty(value = "股票买卖最低费用", required = true)
    private BigDecimal feeSxfMin;

    @ApiModelProperty(value = "股票买印花税率", required = true)
    private BigDecimal feeYhs;

    @ApiModelProperty(value = "ETF申赎费率", required = true)
    private BigDecimal feeEtf;

    @ApiModelProperty(value = "ETF申赎最小费用", required = true)
    private BigDecimal feeEtfMin;

    @ApiModelProperty(value = "基金买卖费率", required = true)
    private BigDecimal feeFund;

    @ApiModelProperty(value = "基金买卖最小费用", required = true)
    private BigDecimal feeFundMin;

    @ApiModelProperty(value = "成份股过户费", required = true)
    private BigDecimal feeGhf;

    @ApiModelProperty(value = "其他费用", required = true)
    private BigDecimal feeOther;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "所属机构", required = true)
    private String orgid;

    @ApiModelProperty(value = "菜单ID", required = true)
    private String menuid;

    @ApiModelProperty(value = "bp节点号", required = true)
    private String bpnode;

    @ApiModelProperty(value = "内存服务组号", required = true)
    private String srvgroup;

    @ApiModelProperty(value = "服务类别", required = true)
    private String servertypes;

    @ApiModelProperty(value = "服务运行数", required = true)
    private String serverscount;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "交易方式", required = true)
    private String tradingtype;

    @ApiModelProperty(value = "价格档位", required = true)
    private BigDecimal priceunit;

    @ApiModelProperty(value = "涨停价", required = true)
    private BigDecimal maxriseprice;

    @ApiModelProperty(value = "跌停价", required = true)
    private BigDecimal maxdownprice;

    @ApiModelProperty(value = "买数量上限", required = true)
    private BigDecimal maxbuyqty;

    @ApiModelProperty(value = "卖数量上限", required = true)
    private BigDecimal maxsaleqty;

    @ApiModelProperty(value = "买数量下限", required = true)
    private BigDecimal minbuyqty;

    @ApiModelProperty(value = "卖数量下限", required = true)
    private BigDecimal minsaleqty;

    @ApiModelProperty(value = "买数量单位", required = true)
    private BigDecimal buyunit;

    @ApiModelProperty(value = "卖数量单位", required = true)
    private BigDecimal saleunit;

    @ApiModelProperty(value = "更新日期", required = true)
    private String updatedate;

    @ApiModelProperty(value = "币种", required = true)
    private String currType;

    @ApiModelProperty(value = "计算类型", required = true)
    private String calcType;

    @ApiModelProperty(value = "汇率类型", required = true)
    private String rateType;

    @ApiModelProperty(value = "计算汇率", required = true)
    private BigDecimal calcRate;

    @ApiModelProperty(value = "更新日期", required = true)
    private String updatedate;

    @ApiModelProperty(value = "更新时间", required = true)
    private String updatetime;

    @ApiModelProperty(value = "详细事件类型", required = true)
    private String subeventtype;

    @ApiModelProperty(value = "事件大类", required = true)
    private String eventtype;

    @ApiModelProperty(value = "事件业务大类", required = true)
    private String busitype;

    @ApiModelProperty(value = "事件业务小类", required = true)
    private String subbusitype;

    @ApiModelProperty(value = "证券分类", required = true)
    private String category;

    @ApiModelProperty(value = "是否生成事件", required = true)
    private String isMakeEvent;

    @ApiModelProperty(value = "是否提前提醒", required = true)
    private String isRemind;

    @ApiModelProperty(value = "交易菜单编号", required = true)
    private String gotoMenuid;

    @ApiModelProperty(value = "是否有效", required = true)
    private String isValid;

    @ApiModelProperty(value = "事件ID", required = true)
    private BigDecimal eventid;

    @ApiModelProperty(value = "事件父ID", required = true)
    private BigDecimal parentid;

    @ApiModelProperty(value = "事件索引", required = true)
    private String indexid;

    @ApiModelProperty(value = "用户ID", required = true)
    private String userid;

    @ApiModelProperty(value = "资产单元列表", required = true)
    private String projectids;

    @ApiModelProperty(value = "所属机构", required = true)
    private String orgid;

    @ApiModelProperty(value = "事件标题", required = true)
    private String title;

    @ApiModelProperty(value = "详细事件类型", required = true)
    private String subeventtype;

    @ApiModelProperty(value = "事件来源", required = true)
    private String source;

    @ApiModelProperty(value = "提醒模式", required = true)
    private String notifyMode;

    @ApiModelProperty(value = "是否开启声音提醒", required = true)
    private String voice;

    @ApiModelProperty(value = "是否全天事件", required = true)
    private String allday;

    @ApiModelProperty(value = "是否系列事件", required = true)
    private String series;

    @ApiModelProperty(value = "摘要", required = true)
    private String abstract;

    @ApiModelProperty(value = "事件开始日期", required = true)
    private String begindate;

    @ApiModelProperty(value = "事件开始时间", required = true)
    private String begintime;

    @ApiModelProperty(value = "事件结束日期", required = true)
    private String enddate;

    @ApiModelProperty(value = "事件结束时间", required = true)
    private String endtime;

    @ApiModelProperty(value = "重复结束日期", required = true)
    private String recurEnddate;

    @ApiModelProperty(value = "重复模式", required = true)
    private String rule;

    @ApiModelProperty(value = "消息生成日期", required = true)
    private String msgCreatedate;

    @ApiModelProperty(value = "消息生成时间", required = true)
    private String msgCreatetime;

    @ApiModelProperty(value = "消息生成状态", required = true)
    private String msgCreatestat;

    @ApiModelProperty(value = "事件录入日期", required = true)
    private String createdate;

    @ApiModelProperty(value = "事件录入时间", required = true)
    private String createtime;

    @ApiModelProperty(value = "事件更新日期", required = true)
    private String upddate;

    @ApiModelProperty(value = "事件更新时间", required = true)
    private String updtime;

    @ApiModelProperty(value = "事件过期日期", required = true)
    private String expiredate;

    @ApiModelProperty(value = "事件状态", required = true)
    private String stat;

    @ApiModelProperty(value = "消息标题", required = true)
    private String msgtitle;

    @ApiModelProperty(value = "关联基金消息唯一标识", required = true)
    private String investfundMsgserialno;

    @ApiModelProperty(value = "事件ID", required = true)
    private BigDecimal eventid;

    @ApiModelProperty(value = "详细信息", required = true)
    private String detail;

    @ApiModelProperty(value = "存储类型", required = true)
    private String storetype;

    @ApiModelProperty(value = "事件过期日期", required = true)
    private String expiredate;

    @ApiModelProperty(value = "消息ID", required = true)
    private BigDecimal msgid;

    @ApiModelProperty(value = "事件ID", required = true)
    private BigDecimal eventid;

    @ApiModelProperty(value = "事件父ID", required = true)
    private BigDecimal parentid;

    @ApiModelProperty(value = "用户ID", required = true)
    private String userid;

    @ApiModelProperty(value = "资产单元列表", required = true)
    private String projectids;

    @ApiModelProperty(value = "所属机构", required = true)
    private String orgid;

    @ApiModelProperty(value = "事件标题", required = true)
    private String title;

    @ApiModelProperty(value = "详细事件类型", required = true)
    private String subeventtype;

    @ApiModelProperty(value = "事件来源", required = true)
    private String source;

    @ApiModelProperty(value = "提醒模式", required = true)
    private String notifyMode;

    @ApiModelProperty(value = "是否开启声音提醒", required = true)
    private String voice;

    @ApiModelProperty(value = "是否全天事件", required = true)
    private String allday;

    @ApiModelProperty(value = "是否今日必做", required = true)
    private String mustdo;

    @ApiModelProperty(value = "摘要", required = true)
    private String abstract;

    @ApiModelProperty(value = "消息通知日期", required = true)
    private String notifydate;

    @ApiModelProperty(value = "消息通知时间", required = true)
    private String notifytime;

    @ApiModelProperty(value = "消息生成日期", required = true)
    private String createdate;

    @ApiModelProperty(value = "消息生成时间", required = true)
    private String createtime;

    @ApiModelProperty(value = "消息更新日期", required = true)
    private String upddate;

    @ApiModelProperty(value = "消息更新时间", required = true)
    private String updtime;

    @ApiModelProperty(value = "消息状态", required = true)
    private String stat;

    @ApiModelProperty(value = "关联基金消息唯一标识", required = true)
    private String investfundMsgserialno;

    @ApiModelProperty(value = "消息ID", required = true)
    private BigDecimal msgid;

    @ApiModelProperty(value = "详细信息", required = true)
    private String detail;

    @ApiModelProperty(value = "存储类型", required = true)
    private String storetype;

    @ApiModelProperty(value = "消息生成日期", required = true)
    private String createdate;

    @ApiModelProperty(value = "用户ID", required = true)
    private String userid;

    @ApiModelProperty(value = "详细事件类型", required = true)
    private String subeventtype;

    @ApiModelProperty(value = "是否关注", required = true)
    private String attention;

    @ApiModelProperty(value = "是否开启声音提醒", required = true)
    private String voice;

    @ApiModelProperty(value = "提醒模式", required = true)
    private String notifyMode;

    @ApiModelProperty(value = "更新日期", required = true)
    private String upddate;

    @ApiModelProperty(value = "更新时间", required = true)
    private String updtime;

    @ApiModelProperty(value = "消息ID", required = true)
    private BigDecimal msgid;

    @ApiModelProperty(value = "事件ID", required = true)
    private BigDecimal eventid;

    @ApiModelProperty(value = "用户ID", required = true)
    private String userid;

    @ApiModelProperty(value = "提醒日期", required = true)
    private String notifydate;

    @ApiModelProperty(value = "提醒时间", required = true)
    private String notifytime;

    @ApiModelProperty(value = "站点地址", required = true)
    private String netaddr;

    @ApiModelProperty(value = "会话id", required = true)
    private String sessionid;

    @ApiModelProperty(value = "终端流水号", required = true)
    private String msgNo;

    @ApiModelProperty(value = "流水日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "流水时间", required = true)
    private String busitime;

    @ApiModelProperty(value = "详细事件类型", required = true)
    private String subeventtype;

    @ApiModelProperty(value = "事件来源", required = true)
    private String source;

    @ApiModelProperty(value = "操作日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "操作员", required = true)
    private String operid;

    @ApiModelProperty(value = "操作时间", required = true)
    private String opertime;

    @ApiModelProperty(value = "执行通过标志", required = true)
    private String passFlag;

    @ApiModelProperty(value = "备注信息", required = true)
    private String remark;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券内码", required = true)
    private String stkid;

    @ApiModelProperty(value = "银行间代码", required = true)
    private String bankstkcode;

    @ApiModelProperty(value = "证券简称", required = true)
    private String simplename;

    @ApiModelProperty(value = "扩位证券简称", required = true)
    private String extsimplename;

    @ApiModelProperty(value = "上市日期", required = true)
    private String marketdate;

    @ApiModelProperty(value = "面值", required = true)
    private BigDecimal ticketprice;

    @ApiModelProperty(value = "发行价格", required = true)
    private BigDecimal issueprice;

    @ApiModelProperty(value = "票面利率", required = true)
    private BigDecimal ticketrate;

    @ApiModelProperty(value = "起息日", required = true)
    private String begindate;

    @ApiModelProperty(value = "到期日", required = true)
    private String enddate;

    @ApiModelProperty(value = "付息频率", required = true)
    private String payinterval;

    @ApiModelProperty(value = "期限", required = true)
    private BigDecimal existlimit;

    @ApiModelProperty(value = "期限单位", required = true)
    private String limitunit;

    @ApiModelProperty(value = "证券全称", required = true)
    private String fullname;

    @ApiModelProperty(value = "债券类型", required = true)
    private String bondtype;

    @ApiModelProperty(value = "利率类型", required = true)
    private String ratetype;

    @ApiModelProperty(value = "发行方式", required = true)
    private String issuetype;

    @ApiModelProperty(value = "发行人", required = true)
    private String issuer;

    @ApiModelProperty(value = "发行人类型", required = true)
    private String issuertype;

    @ApiModelProperty(value = "主体评级", required = true)
    private String mainrating;

    @ApiModelProperty(value = "债项评级", required = true)
    private String facilityrating;

    @ApiModelProperty(value = "评级机构", required = true)
    private String ratingorg;

    @ApiModelProperty(value = "是否本所上市公司", required = true)
    private String isthismarket;

    @ApiModelProperty(value = "发行量", required = true)
    private BigDecimal circulation;

    @ApiModelProperty(value = "特殊债券类型", required = true)
    private String specbondtype;

    @ApiModelProperty(value = "结构化分档", required = true)
    private String structgrading;

    @ApiModelProperty(value = "资产支持专项计划名称", required = true)
    private String absname;

    @ApiModelProperty(value = "交易方式", required = true)
    private String tradetype;

    @ApiModelProperty(value = "结算方式", required = true)
    private String settletype;

    @ApiModelProperty(value = "价格方式", required = true)
    private String pricetype;

    @ApiModelProperty(value = "投资者适当性要求", required = true)
    private String appropriateness;

    @ApiModelProperty(value = "特殊转让板", required = true)
    private String spectrans;

    @ApiModelProperty(value = "是否基准做市品种", required = true)
    private String isbasemarkettype;

    @ApiModelProperty(value = "摘牌日", required = true)
    private String delistdate;

    @ApiModelProperty(value = "含权类型", required = true)
    private String rightypes;

    @ApiModelProperty(value = "回售选择权", required = true)
    private String putright;

    @ApiModelProperty(value = "赎回选择权", required = true)
    private String redeemright;

    @ApiModelProperty(value = "主承销商", required = true)
    private String underwriter;

    @ApiModelProperty(value = "发行起始日", required = true)
    private String beginissuedate;

    @ApiModelProperty(value = "发行终止日", required = true)
    private String endissuedate;

    @ApiModelProperty(value = "出库起始日", required = true)
    private String outimpawndate;

    @ApiModelProperty(value = "入库起始日", required = true)
    private String inimpawndate;

    @ApiModelProperty(value = "标准券折算率", required = true)
    private BigDecimal exchrate;

    @ApiModelProperty(value = "ISIN代码", required = true)
    private String isincode;

    @ApiModelProperty(value = "回售起始日", required = true)
    private String putbegindate;

    @ApiModelProperty(value = "回售终止日", required = true)
    private String putenddate;

    @ApiModelProperty(value = "回售资金发放日", required = true)
    private String putassetdate;

    @ApiModelProperty(value = "回售可撤销起始日", required = true)
    private String putcancelbegdate;

    @ApiModelProperty(value = "回售可撤销结束日", required = true)
    private String putcancelenddate;

    @ApiModelProperty(value = "是否转售", required = true)
    private String istransput;

    @ApiModelProperty(value = "转股类型", required = true)
    private String transstktype;

    @ApiModelProperty(value = "A股证券代码(转股)", required = true)
    private String transstkcode;

    @ApiModelProperty(value = "A股证券简称(转股)", required = true)
    private String transstkname;

    @ApiModelProperty(value = "转股价格", required = true)
    private BigDecimal transprice;

    @ApiModelProperty(value = "转股起始日", required = true)
    private String transstkbegdate;

    @ApiModelProperty(value = "转股终止日", required = true)
    private String transstkenddate;

    @ApiModelProperty(value = "A股证券代码(换股)", required = true)
    private String exchangestkcode;

    @ApiModelProperty(value = "A股证券简称(换股)", required = true)
    private String exchangestkname;

    @ApiModelProperty(value = "换股价格", required = true)
    private BigDecimal exchangeprice;

    @ApiModelProperty(value = "换股起始日", required = true)
    private String exchangebegdate;

    @ApiModelProperty(value = "换股结束日", required = true)
    private String exchangeenddate;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "无条件回售期", required = true)
    private String mandPutPd;

    @ApiModelProperty(value = "无条件回售价", required = true)
    private BigDecimal mandPutPric;

    @ApiModelProperty(value = "无条件回售开始日期", required = true)
    private String mandPutStartDt;

    @ApiModelProperty(value = "无条件回售结束日期", required = true)
    private String mandPutEndDt;

    @ApiModelProperty(value = "无条件回售文字条款", required = true)
    private String mandPutText;

    @ApiModelProperty(value = "有条件回售起始日期", required = true)
    private String condPutStartDt;

    @ApiModelProperty(value = "有条件回售结束日期", required = true)
    private String condPutEndDt;

    @ApiModelProperty(value = "有条件赎回起始日期", required = true)
    private String condRedpStartDt;

    @ApiModelProperty(value = "有条件赎回结束日期", required = true)
    private String condRedpEndDt;

    @ApiModelProperty(value = "到期赎回价", required = true)
    private BigDecimal redpTermPric;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "回售公告日", required = true)
    private String putAnnDt;

    @ApiModelProperty(value = "回售行使开始日", required = true)
    private String putStartDt;

    @ApiModelProperty(value = "回售行使截止日", required = true)
    private String putEndDt;

    @ApiModelProperty(value = "回售资金到帐日", required = true)
    private String fndArivlDt;

    @ApiModelProperty(value = "每百元面值回售价格(元)", required = true)
    private BigDecimal repoPric;

    @ApiModelProperty(value = "回售履行结果公告日", required = true)
    private String putExecDt;

    @ApiModelProperty(value = "回售总面额(亿元)", required = true)
    private BigDecimal putAmt;

    @ApiModelProperty(value = "回售代码", required = true)
    private String putCd;

    @ApiModelProperty(value = "回售日", required = true)
    private String putDt;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "业务类型代码", required = true)
    private String typeCd;

    @ApiModelProperty(value = "质押券名称", required = true)
    private String plgName;

    @ApiModelProperty(value = "是否有效", required = true)
    private String vldFlag;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "法人投资者ID", required = true)
    private String ivstrId;

    @ApiModelProperty(value = "法人投资者类型", required = true)
    private String ivstrType;

    @ApiModelProperty(value = "法人投资者", required = true)
    private String ivstrName;

    @ApiModelProperty(value = "获配数量(万股/万张)", required = true)
    private BigDecimal placShr;

    @ApiModelProperty(value = "冻结期限(月)", required = true)
    private String lockMth;

    @ApiModelProperty(value = "实际申购数量", required = true)
    private BigDecimal actlOrdShr;

    @ApiModelProperty(value = "公告日期", required = true)
    private String annDt;

    @ApiModelProperty(value = "配售截止日期", required = true)
    private String endDt;

    @ApiModelProperty(value = "退款或补缴金额", required = true)
    private BigDecimal refndPaybkAmt;

    @ApiModelProperty(value = "股份类型", required = true)
    private String shrType;

    @ApiModelProperty(value = "可流通日期", required = true)
    private String trdbDt;

    @ApiModelProperty(value = "最新持股数量", required = true)
    private BigDecimal lastHoldShr;

    @ApiModelProperty(value = "最新持股数量(配套融资)", required = true)
    private BigDecimal lastHoldShrFin;

    @ApiModelProperty(value = "投资者类型代码", required = true)
    private String ivstrTypeCd;

    @ApiModelProperty(value = "公布获配公司名称", required = true)
    private String annIvstrName;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "公告日期", required = true)
    private String annDt;

    @ApiModelProperty(value = "转股申报代码", required = true)
    private String covtCd;

    @ApiModelProperty(value = "转股简称", required = true)
    private String covtAbbr;

    @ApiModelProperty(value = "转股价格", required = true)
    private BigDecimal covtPric;

    @ApiModelProperty(value = "关联证券编码", required = true)
    private String relaSecuId;

    @ApiModelProperty(value = "关联证券交易代码", required = true)
    private String relaScrCd;

    @ApiModelProperty(value = "自愿转换期起始日", required = true)
    private String covtStartDt;

    @ApiModelProperty(value = "自愿转换期截止日", required = true)
    private String covtEndDt;

    @ApiModelProperty(value = "可转债停止交易日", required = true)
    private String lastTrdDt;

    @ApiModelProperty(value = "强制转换日", required = true)
    private String frcCovtDt;

    @ApiModelProperty(value = "强制转换价格", required = true)
    private BigDecimal frcCovtPric;

    @ApiModelProperty(value = "是否强制转股", required = true)
    private String frcFlag;

    @ApiModelProperty(value = "强制转换原因", required = true)
    private String frcCovtRsn;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "债权债务登记日期", required = true)
    private String debtRtDebtRegDt;

    @ApiModelProperty(value = "本次计息周期开始日期", required = true)
    private String thimIrPrdBgnDt;

    @ApiModelProperty(value = "本次计息周期截止日期", required = true)
    private String thimIrPrdEndDt;

    @ApiModelProperty(value = "付息起始日期", required = true)
    private String intaBgnDt;

    @ApiModelProperty(value = "付息截止日期", required = true)
    private String intaEndDt;

    @ApiModelProperty(value = "付息兑付方式", required = true)
    private String intaCashMode;

    @ApiModelProperty(value = "兑付登记日期", required = true)
    private String cashRegDt;

    @ApiModelProperty(value = "兑付起始日期", required = true)
    private String cashBgnDt;

    @ApiModelProperty(value = "兑付截止日期", required = true)
    private String cashEndDt;

    @ApiModelProperty(value = "兑付清算日期", required = true)
    private String cashClrDt;

    @ApiModelProperty(value = "除权除息日期", required = true)
    private String exRtDt;

    @ApiModelProperty(value = "每百元应付利息税前(元)", required = true)
    private BigDecimal ohyPayIntBtax;

    @ApiModelProperty(value = "每百元应付利息税后(元)", required = true)
    private BigDecimal ohyPayIntAftTax;

    @ApiModelProperty(value = "每百元兑付本金(元)", required = true)
    private BigDecimal ohyCashPrinp;

    @ApiModelProperty(value = "每百元兑付本息和(元)", required = true)
    private BigDecimal ohyCashPrinpInt;

    @ApiModelProperty(value = "每百元提前兑付/赎回净价", required = true)
    private BigDecimal ohyIaCaseNetprice;

    @ApiModelProperty(value = "本次兑付本金", required = true)
    private BigDecimal thimCashPrinp;

    @ApiModelProperty(value = "本次支付利息", required = true)
    private BigDecimal thimPayInt;

    @ApiModelProperty(value = "兑付本息和", required = true)
    private BigDecimal cashPrinpInt;

    @ApiModelProperty(value = "本次还本比例%", required = true)
    private BigDecimal thimBackPrincRati;

    @ApiModelProperty(value = "本次还本金额(亿元)", required = true)
    private String thimBackPrincAmt;

    @ApiModelProperty(value = "本次付息和", required = true)
    private BigDecimal thimIntpAnd;

    @ApiModelProperty(value = "本次兑付本金和", required = true)
    private BigDecimal thimCashPrinpAnd;

    @ApiModelProperty(value = "兑付总额(元)", required = true)
    private BigDecimal cashGamt;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "债券名称", required = true)
    private String fullName;

    @ApiModelProperty(value = "债券简称", required = true)
    private String abbrName;

    @ApiModelProperty(value = "简称拼音", required = true)
    private String abbrPinyin;

    @ApiModelProperty(value = "上市公告日", required = true)
    private String listAnnDate;

    @ApiModelProperty(value = "上市日期", required = true)
    private String listDate;

    @ApiModelProperty(value = "退市日期", required = true)
    private String delist;

    @ApiModelProperty(value = "上网发行截止日期", required = true)
    private String netIssEndDate;

    @ApiModelProperty(value = "上网发行起始日期", required = true)
    private String netIssBeginDate;

    @ApiModelProperty(value = "上网发行数量(亿元)", required = true)
    private BigDecimal netIssAmount;

    @ApiModelProperty(value = "上网发行认购代码", required = true)
    private String netIssScrpCd;

    @ApiModelProperty(value = "付息频率", required = true)
    private String payIntrFreq;

    @ApiModelProperty(value = "债券期限(年)", required = true)
    private String bondTermYear;

    @ApiModelProperty(value = "兑付登记起始日", required = true)
    private String cashRegBeginDate;

    @ApiModelProperty(value = "兑付日", required = true)
    private String cashDate;

    @ApiModelProperty(value = "利率说明", required = true)
    private String irIntro;

    @ApiModelProperty(value = "利差(%)", required = true)
    private BigDecimal irSpread;

    @ApiModelProperty(value = "附息利率品种", required = true)
    private String irType;

    @ApiModelProperty(value = "到期日", required = true)
    private String dueDate;

    @ApiModelProperty(value = "参考收益率", required = true)
    private BigDecimal refYield;

    @ApiModelProperty(value = "发行起始日", required = true)
    private String issBeginDate;

    @ApiModelProperty(value = "发行截止日", required = true)
    private String issEndDate;

    @ApiModelProperty(value = "发行票面利率(%)", required = true)
    private BigDecimal issCoupRate;

    @ApiModelProperty(value = "发行公告日", required = true)
    private String issAnnDate;

    @ApiModelProperty(value = "发行方式", required = true)
    private String issMethod;

    @ApiModelProperty(value = "发行人名称", required = true)
    private String issrName;

    @ApiModelProperty(value = "发行人编号", required = true)
    private String issrNo;

    @ApiModelProperty(value = "发行人类型", required = true)
    private String issrType;

    @ApiModelProperty(value = "发行对象", required = true)
    private String issObj;

    @ApiModelProperty(value = "发行金额上限", required = true)
    private BigDecimal issAmtUl;

    @ApiModelProperty(value = "发行时债券评级", required = true)
    private String issBondRate;

    @ApiModelProperty(value = "发行价格", required = true)
    private BigDecimal issPric;

    @ApiModelProperty(value = "实际发行总量(亿元)", required = true)
    private BigDecimal actlIssAmts;

    @ApiModelProperty(value = "计划发行总量(亿元)", required = true)
    private BigDecimal planIssAmts;

    @ApiModelProperty(value = "面值", required = true)
    private BigDecimal parVal;

    @ApiModelProperty(value = "最新面值", required = true)
    private BigDecimal lastParVal;

    @ApiModelProperty(value = "计息截止日", required = true)
    private String intaEndDate;

    @ApiModelProperty(value = "计息起始日", required = true)
    private String intaBeginDate;

    @ApiModelProperty(value = "计息方式", required = true)
    private String intaMethod;

    @ApiModelProperty(value = "计息基准", required = true)
    private String intaBasic;

    @ApiModelProperty(value = "原债券代码", required = true)
    private String formerBondCd;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "评级对象名称", required = true)
    private String objName;

    @ApiModelProperty(value = "公告日期", required = true)
    private String annDate;

    @ApiModelProperty(value = "评级日期", required = true)
    private String ratDate;

    @ApiModelProperty(value = "评级机构代码", required = true)
    private String ratOrgCd;

    @ApiModelProperty(value = "评级机构名称", required = true)
    private String ratOrgName;

    @ApiModelProperty(value = "信用评级", required = true)
    private String credRat;

    @ApiModelProperty(value = "评级说明", required = true)
    private String ratIntro;

    @ApiModelProperty(value = "前次信用评级", required = true)
    private String prevCredRat;

    @ApiModelProperty(value = "评级到期日", required = true)
    private String ratingVldEndDate;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "赎回日", required = true)
    private String redpDt;

    @ApiModelProperty(value = "每百元面值赎回价格(元)", required = true)
    private BigDecimal redpPric;

    @ApiModelProperty(value = "赎回公告日", required = true)
    private String redpAnnDt;

    @ApiModelProperty(value = "赎回履行结果公告日", required = true)
    private String execRsltAnnDt;

    @ApiModelProperty(value = "赎回总面额(亿元)", required = true)
    private BigDecimal redpTotVol;

    @ApiModelProperty(value = "赎回日(公布)", required = true)
    private String pubRedpDt;

    @ApiModelProperty(value = "赎回原因", required = true)
    private String redpRsn;

    @ApiModelProperty(value = "赎回资金到账日", required = true)
    private String redpAcctDt;

    @ApiModelProperty(value = "赎回登记日", required = true)
    private String redpRegDt;

    @ApiModelProperty(value = "每百元面值赎回净价", required = true)
    private BigDecimal redpNetPric;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "违约发生日", required = true)
    private String defltDate;

    @ApiModelProperty(value = "债券名称", required = true)
    private String abbrName;

    @ApiModelProperty(value = "公告日", required = true)
    private String annDate;

    @ApiModelProperty(value = "违约类型", required = true)
    private String defltType;

    @ApiModelProperty(value = "违约原因", required = true)
    private String defltRsn;

    @ApiModelProperty(value = "违约日债券余额(元)", required = true)
    private BigDecimal defltDateBondBal;

    @ApiModelProperty(value = "违约发生日百元应兑付本金(元)", required = true)
    private BigDecimal defltDatePayablecapital;

    @ApiModelProperty(value = "违约发生日百元应兑付利息(元)", required = true)
    private BigDecimal defltDatePayableinterest;

    @ApiModelProperty(value = "违约发生日百元应兑付本息(元)", required = true)
    private BigDecimal defltDatePayableCapInt;

    @ApiModelProperty(value = "违约发生日实际百元兑付本金(元)", required = true)
    private BigDecimal defltDatePaymentcapital;

    @ApiModelProperty(value = "违约发生日实际百元兑付利息(元)", required = true)
    private BigDecimal defltDatePaymentinterest;

    @ApiModelProperty(value = "违约发生日实际百元兑付本息(元)", required = true)
    private BigDecimal defltDatePaymentCapInt;

    @ApiModelProperty(value = "违约日债券余额(日终)(元)", required = true)
    private BigDecimal defltDateBondBal1;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "保荐机构", required = true)
    private String guarAgySht;

    @ApiModelProperty(value = "保荐机构简称", required = true)
    private String guarAgyShtAbb;

    @ApiModelProperty(value = "公告日期", required = true)
    private String annDate;

    @ApiModelProperty(value = "上市公告日", required = true)
    private String listNtcDate;

    @ApiModelProperty(value = "上市日期", required = true)
    private String listDate;

    @ApiModelProperty(value = "初始转股价格", required = true)
    private BigDecimal initTranPric;

    @ApiModelProperty(value = "初始转股价溢价比例(%)", required = true)
    private BigDecimal initTranPricPreRati;

    @ApiModelProperty(value = "发行公告日", required = true)
    private String issNtcDate;

    @ApiModelProperty(value = "发行结果公告日", required = true)
    private String issRlstNtcDate;

    @ApiModelProperty(value = "老股东配售日期", required = true)
    private String oshPrioPlacDate;

    @ApiModelProperty(value = "老股东配售股权登记日", required = true)
    private String oshPrioPlacEquiRegDate;

    @ApiModelProperty(value = "老股东配售缴款日", required = true)
    private String oshPrioPlacPayDate;

    @ApiModelProperty(value = "老股东配售代码", required = true)
    private String oshPrioPlacCd;

    @ApiModelProperty(value = "老股东配售简称", required = true)
    private String oshPrioPlacAbbr;

    @ApiModelProperty(value = "老股东配售价格", required = true)
    private BigDecimal oshPrioPlacPric;

    @ApiModelProperty(value = "老股东配售比例分母", required = true)
    private BigDecimal oshPrioPlacRatiDen;

    @ApiModelProperty(value = "老股东配售比例分子", required = true)
    private BigDecimal oshPrioPlacRatiMole;

    @ApiModelProperty(value = "上网发行日期", required = true)
    private String onleIssDate;

    @ApiModelProperty(value = "上网发行申购代码", required = true)
    private String onleIssPurchCd;

    @ApiModelProperty(value = "上网发行申购名称", required = true)
    private String onleIssPurchName;

    @ApiModelProperty(value = "上网发行申购价格", required = true)
    private BigDecimal onleIssPurchPric;

    @ApiModelProperty(value = "上网发行数量(不含优先配售)(张)", required = true)
    private BigDecimal onleIssNum;

    @ApiModelProperty(value = "转股公司ID", required = true)
    private String tranCorpId;

    @ApiModelProperty(value = "发行规模(万元)", required = true)
    private BigDecimal issScal;

    @ApiModelProperty(value = "发行数量(万张)", required = true)
    private BigDecimal issNum;

    @ApiModelProperty(value = "证券ID", required = true)
    private String scrId;

    @ApiModelProperty(value = "网下最小申购数量(机构)", required = true)
    private BigDecimal ofleMinPurchNum;

    @ApiModelProperty(value = "网下定金比例(机构)", required = true)
    private BigDecimal ofleDepRati;

    @ApiModelProperty(value = "网下最大申购数量(机构)", required = true)
    private BigDecimal ofleMaxPurchNum;

    @ApiModelProperty(value = "网上最小申购数量(公众)(元)", required = true)
    private BigDecimal onleMinPurchNum;

    @ApiModelProperty(value = "网上最大申购数量(公众)(万元)", required = true)
    private BigDecimal onleMaxPurchNum;

    @ApiModelProperty(value = "债券期限", required = true)
    private String bondTerm;

    @ApiModelProperty(value = "利率类型", required = true)
    private String irType;

    @ApiModelProperty(value = "利率", required = true)
    private BigDecimal ir;

    @ApiModelProperty(value = "付息频率", required = true)
    private String intPayFreq;

    @ApiModelProperty(value = "利率说明", required = true)
    private String irIntro;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "可分配收益基准日", required = true)
    private String divdBasiDate;

    @ApiModelProperty(value = "每股派息(元)", required = true)
    private BigDecimal cashDvdPerShr;

    @ApiModelProperty(value = "权益登记日", required = true)
    private String equiRegDate;

    @ApiModelProperty(value = "除息日", required = true)
    private String exDvdDate;

    @ApiModelProperty(value = "除息日(场外)", required = true)
    private String exDvdDateOtc;

    @ApiModelProperty(value = "派息日", required = true)
    private String payDivdDate;

    @ApiModelProperty(value = "派息日(场外)", required = true)
    private String payDivdDateOtc;

    @ApiModelProperty(value = "分红实施公告日", required = true)
    private String implNtcDate;

    @ApiModelProperty(value = "份额基准年度", required = true)
    private String shrBasiY;

    @ApiModelProperty(value = "基准基金份额(万份)", required = true)
    private BigDecimal basiShr;

    @ApiModelProperty(value = "可分配收益(元)", required = true)
    private BigDecimal asgnablePrft;

    @ApiModelProperty(value = "净值除权日", required = true)
    private String netvalExRighDate;

    @ApiModelProperty(value = "收益分配金额(元)", required = true)
    private BigDecimal prftAmts;

    @ApiModelProperty(value = "红利再投资到账日", required = true)
    private String reinvOnacctDate;

    @ApiModelProperty(value = "公告日期", required = true)
    private String annDate;

    @ApiModelProperty(value = "收益支付日", required = true)
    private String prftPayDate;

    @ApiModelProperty(value = "基准日基金份额净值", required = true)
    private BigDecimal basiDateUnitnav;

    @ApiModelProperty(value = "红利到帐日", required = true)
    private String dvdToAcctDate;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "配股价格(元)", required = true)
    private BigDecimal allotPric;

    @ApiModelProperty(value = "配股比例", required = true)
    private BigDecimal allotRati;

    @ApiModelProperty(value = "配股计划数量(万股)", required = true)
    private BigDecimal allotAmt;

    @ApiModelProperty(value = "配股实际数量(万股)", required = true)
    private BigDecimal allotAmtAct;

    @ApiModelProperty(value = "募集资金(元)", required = true)
    private BigDecimal allotCollFnd;

    @ApiModelProperty(value = "股权登记日", required = true)
    private String allotRegDate;

    @ApiModelProperty(value = "除权日", required = true)
    private String exAllotDate;

    @ApiModelProperty(value = "配股上市日", required = true)
    private String listDate;

    @ApiModelProperty(value = "缴款起始日", required = true)
    private String pymtBegnDate;

    @ApiModelProperty(value = "缴款终止日", required = true)
    private String pymtEndDate;

    @ApiModelProperty(value = "配股实施公告日", required = true)
    private String implAnnDate;

    @ApiModelProperty(value = "配股结果公告日", required = true)
    private String rsltAnnDate;

    @ApiModelProperty(value = "上市公告日", required = true)
    private String listAnnDate;

    @ApiModelProperty(value = "配售代码", required = true)
    private String placCd;

    @ApiModelProperty(value = "配股简称", required = true)
    private String allotScrAbbr;

    @ApiModelProperty(value = "预计募集资金(元)", required = true)
    private BigDecimal expeCollFnd;

    @ApiModelProperty(value = "数据日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "发行价格(元)", required = true)
    private BigDecimal issPrice;

    @ApiModelProperty(value = "发行市盈率(发行前股本)", required = true)
    private BigDecimal issBefPer;

    @ApiModelProperty(value = "发行市盈率(发行后股本)", required = true)
    private BigDecimal issAftPer;

    @ApiModelProperty(value = "公开及老股发行数量合计(万股)", required = true)
    private BigDecimal issAmt;

    @ApiModelProperty(value = "网上发行数量(万股)", required = true)
    private BigDecimal onlneIssCnt;

    @ApiModelProperty(value = "网下发行数量(万股)", required = true)
    private BigDecimal ofleIssAmount;

    @ApiModelProperty(value = "募集资金(万元)", required = true)
    private BigDecimal collFnd;

    @ApiModelProperty(value = "网上发行中签率(%)", required = true)
    private BigDecimal onleIssAlloRati;

    @ApiModelProperty(value = "网上申购代码", required = true)
    private String onlePurchCd;

    @ApiModelProperty(value = "申购日", required = true)
    private String purchDate;

    @ApiModelProperty(value = "预计上市日期", required = true)
    private String planListDate;

    @ApiModelProperty(value = "申购资金验资日", required = true)
    private String purchFndVerDate;

    @ApiModelProperty(value = "中签率公布日", required = true)
    private String alloPubDate;

    @ApiModelProperty(value = "网上中签结果公告日", required = true)
    private String onlneAlloPubDate;

    @ApiModelProperty(value = "上市日", required = true)
    private String listDate;

    @ApiModelProperty(value = "发行公告日", required = true)
    private String issPubDate;

    @ApiModelProperty(value = "上市公告日", required = true)
    private String listPubDate;

    @ApiModelProperty(value = "网下配售发行公告日", required = true)
    private String oflePlacIssPubDate;

    @ApiModelProperty(value = "网下申购起始日期", required = true)
    private String oflePursBgnDate;

    @ApiModelProperty(value = "网下申购截止日期", required = true)
    private String oflePurchEndDate;

    @ApiModelProperty(value = "网下申购资金到帐截止日", required = true)
    private String oflePurchFndEndDate;

    @ApiModelProperty(value = "网下验资日", required = true)
    private String ofleVerDate;

    @ApiModelProperty(value = "预计募集资金(万元)", required = true)
    private BigDecimal planCollFnd;

    @ApiModelProperty(value = "申购上限(机构)", required = true)
    private BigDecimal purchMax;

    @ApiModelProperty(value = "申购金额上限(机构)", required = true)
    private BigDecimal purchAmtMax;

    @ApiModelProperty(value = "网上发行简称", required = true)
    private String onlneIssAbbr;

    @ApiModelProperty(value = "网上申购上限(个人)（股）", required = true)
    private BigDecimal onlnePurchMax;

    @ApiModelProperty(value = "网下申购上限（万股）", required = true)
    private BigDecimal oflePurchMax;

    @ApiModelProperty(value = "网下申购下限（万股）", required = true)
    private BigDecimal oflePurchMin;

    @ApiModelProperty(value = "新股发行数量", required = true)
    private BigDecimal newStkIssCnt;

    @ApiModelProperty(value = "最新公告日期", required = true)
    private String newPubDate;

    @ApiModelProperty(value = "网上申购缴款日", required = true)
    private String onlePurchPayDate;

    @ApiModelProperty(value = "网下发行数量", required = true)
    private BigDecimal ofleIssNum;

    @ApiModelProperty(value = "挂牌日", required = true)
    private String listedDate;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "证券名称", required = true)
    private String stkname;

    @ApiModelProperty(value = "基金状态", required = true)
    private String ofcodestatus;

    @ApiModelProperty(value = "申购最小单位", required = true)
    private BigDecimal appunit;

    @ApiModelProperty(value = "认购/申购的单位", required = true)
    private BigDecimal subunit;

    @ApiModelProperty(value = "赎回最小单位", required = true)
    private BigDecimal redemptionunit;

    @ApiModelProperty(value = "赎回资金到账间隔日期", required = true)
    private BigDecimal redemptiondate;

    @ApiModelProperty(value = "个人追加认购份数", required = true)
    private BigDecimal indiappsubsvol;

    @ApiModelProperty(value = "个人追加认购金额", required = true)
    private BigDecimal indiappsubsamount;

    @ApiModelProperty(value = "个人最低申购金额", required = true)
    private BigDecimal minsubsvolbyindi;

    @ApiModelProperty(value = "个人最低认购金额", required = true)
    private BigDecimal minsubsamountbyindi;

    @ApiModelProperty(value = "法人追加认购份数", required = true)
    private BigDecimal instappsubsvol;

    @ApiModelProperty(value = "法人追加认购金额", required = true)
    private BigDecimal instappsubsamnt;

    @ApiModelProperty(value = "法人最低认购金额", required = true)
    private BigDecimal minamountbyinst;

    @ApiModelProperty(value = "法人最低认购份数", required = true)
    private BigDecimal minvolbyinst;

    @ApiModelProperty(value = "基金认购开始日期", required = true)
    private BigDecimal ipostartdate;

    @ApiModelProperty(value = "基金认购结束日期", required = true)
    private BigDecimal ipoenddate;

    @ApiModelProperty(value = "最高赎回份额", required = true)
    private BigDecimal maxredemptionvol;

    @ApiModelProperty(value = "最低赎回份额", required = true)
    private BigDecimal minredemptionvol;

    @ApiModelProperty(value = "最低持有份额", required = true)
    private BigDecimal minaccountbalance;

    @ApiModelProperty(value = "分红延期天数", required = true)
    private BigDecimal drawdelaydate;

    @ApiModelProperty(value = "担保交收标识", required = true)
    private String unassureflag;

    @ApiModelProperty(value = "首次最低认购金额", required = true)
    private BigDecimal minfsubbalance;

    @ApiModelProperty(value = "修改日期", required = true)
    private BigDecimal modifydate;

    @ApiModelProperty(value = "定位串", required = true)
    private String positionstr;

    @ApiModelProperty(value = "基金名称", required = true)
    private String fundname;

    @ApiModelProperty(value = "协议签署标志", required = true)
    private String constractflag;

    @ApiModelProperty(value = "协议控制串", required = true)
    private String constractctrlstr;

    @ApiModelProperty(value = "证券名称(长)", required = true)
    private String stocknamelong;

    @ApiModelProperty(value = "个人客户维护费比例", required = true)
    private BigDecimal indimaintenanrate;

    @ApiModelProperty(value = "非个人客户维护费比例", required = true)
    private BigDecimal organmaintenanrate;

    @ApiModelProperty(value = "基金产品全称", required = true)
    private String offullfundname;

    @ApiModelProperty(value = "基金管理人全称", required = true)
    private String offundmanagername;

    @ApiModelProperty(value = "基金管理人网站", required = true)
    private String offundwebaddress;

    @ApiModelProperty(value = "法人最高申购金额", required = true)
    private BigDecimal maxinstsubsvolbyindi;

    @ApiModelProperty(value = "评估公司代码", required = true)
    private String agencyno;

    @ApiModelProperty(value = "评估公司名称", required = true)
    private String agencyname;

    @ApiModelProperty(value = "拼音代码", required = true)
    private String chscode;

    @ApiModelProperty(value = "外部代码", required = true)
    private String outkey;

    @ApiModelProperty(value = "更新日期", required = true)
    private String updatedate;

    @ApiModelProperty(value = "机构id", required = true)
    private String orgid;

    @ApiModelProperty(value = "事件类型", required = true)
    private String busitype;

    @ApiModelProperty(value = "导出时间", required = true)
    private String busitime;

    @ApiModelProperty(value = "导出状态", required = true)
    private String status;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;

    @ApiModelProperty(value = "公司代码", required = true)
    private String sInfoCompcode;

    @ApiModelProperty(value = "评级类型", required = true)
    private String bRateStyle;

    @ApiModelProperty(value = "评级机构代码", required = true)
    private String bInfoCreditratingagency;

    @ApiModelProperty(value = "公司名称", required = true)
    private String sInfoCompname;

    @ApiModelProperty(value = "评级日期", required = true)
    private String annDt;

    @ApiModelProperty(value = "公告日期", required = true)
    private String annDt2;

    @ApiModelProperty(value = "信用评级", required = true)
    private String bInfoCreditrating;

    @ApiModelProperty(value = "前次信用评级", required = true)
    private String bInfoPrecreditrating;

    @ApiModelProperty(value = "评级变动方向", required = true)
    private String bCreditratingChange;

    @ApiModelProperty(value = "更新日期", required = true)
    private String updatedate;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "市场", required = true)
    private String market;

    @ApiModelProperty(value = "评级类型", required = true)
    private String bRateStyle;

    @ApiModelProperty(value = "评级机构代码", required = true)
    private String bInfoCreditratingagency;

    @ApiModelProperty(value = "证券内码", required = true)
    private String stkid;

    @ApiModelProperty(value = "评级日期", required = true)
    private String annDt;

    @ApiModelProperty(value = "公告日期", required = true)
    private String annDt2;

    @ApiModelProperty(value = "交易所代码", required = true)
    private String exchmarket;

    @ApiModelProperty(value = "统一证券代码", required = true)
    private String sInfoWindcode;

    @ApiModelProperty(value = "证券名称", required = true)
    private String stkname;

    @ApiModelProperty(value = "信用评级", required = true)
    private String bInfoCreditrating;

    @ApiModelProperty(value = "前次信用评级", required = true)
    private String bInfoPrecreditrating;

    @ApiModelProperty(value = "评级变动方向", required = true)
    private String bCreditratingChange;

    @ApiModelProperty(value = "公司代码", required = true)
    private String sInfoCompcode;

    @ApiModelProperty(value = "更新日期", required = true)
    private String updatedate;

    @ApiModelProperty(value = "证券代码", required = true)
    private String stockCode;

    @ApiModelProperty(value = "市场类型", required = true)
    private String exchangeType;

    @ApiModelProperty(value = "风险证券级别", required = true)
    private String stockLevel;

    @ApiModelProperty(value = "证券名称", required = true)
    private String stockName;

    @ApiModelProperty(value = "同步日期", required = true)
    private String syncDate;

    @ApiModelProperty(value = "同步时间", required = true)
    private String syncTime;

    @ApiModelProperty(value = "机构id", required = true)
    private String orgid;

    @ApiModelProperty(value = "导出状态", required = true)
    private String status;

    @ApiModelProperty(value = "导出路径", required = true)
    private String path;

    @ApiModelProperty(value = "上传用户名", required = true)
    private String appid;

    @ApiModelProperty(value = "上传密码", required = true)
    private String appkey;

    @ApiModelProperty(value = "更新日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "更新时间", required = true)
    private String busitime;

    @ApiModelProperty(value = "产品代码", required = true)
    private String stkcode;

    @ApiModelProperty(value = "客户编号", required = true)
    private String custid;

    @ApiModelProperty(value = "数据来源", required = true)
    private String datasource;

    @ApiModelProperty(value = "状态", required = true)
    private String status;

    @ApiModelProperty(value = "更新日期", required = true)
    private String busidate;

    @ApiModelProperty(value = "更新时间", required = true)
    private String busitime;



}
