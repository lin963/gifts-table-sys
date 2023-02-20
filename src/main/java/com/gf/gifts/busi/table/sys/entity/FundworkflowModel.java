package com.gf.gifts.busi.table.sys.entity;

import java.math.BigDecimal;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;

/**
* ======================================================
* 工作流多节点模板服务实体类
* @author auto
* @date 2023-02-20
*
* =================该文件自动生成，请勿修改================
*/
@TableName("fundworkflow_model")
@Data
public class FundworkflowModel implements Serializable {


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
    * 交易所代码
    */
    private String market;
    /**
    * 证券类别
    */
    private String stktype;
    /**
    * 买卖标识
    */
    private String bsflag;
    /**
    * 清算速度
    */
    private String clearspeed;
    /**
    * 资产处理日期
    */
    private String assetdealdatetype;
    /**
    * 资产处理时点
    */
    private String assetdealpoint;
    /**
    * 资金可用控制方式
    */
    private String cashctrltype;
    /**
    * 证券可用控制方式
    */
    private String stkctrltype;
    /**
    * 头寸增加方式
    */
    private String cashaddtype;
    /**
    * 证券增加方式
    */
    private String stkaddtype;
    /**
    * 可用增加时点
    */
    private String avladdpoint;
    /**
    * 交收方式
    */
    private String setttype;
    /**
    * 资金变化方向
    */
    private String funddirect;
    /**
    * 股份流向
    */
    private String stkdirect;
    /**
    * 可撤单标志
    */
    private String cancancelflag;
    /**
    * 可重复委托标志
    */
    private String reorderflag;
    /**
    * 交易金额计算方式
    */
    private String amtcalmode;
    /**
    * 业务类别
    */
    private String businclass;
    /**
    * 买卖方向
    */
    private String bsdirect;
    /**
    * 交易价格计算方式
    */
    private String pricecalmode;
    /**
    * 价格控制类型
    */
    private String stktargettype;
    /**
    * 资金账号
    */
    private String fundacct;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券类别
    */
    private String stktypes;
    /**
    * 买卖方向
    */
    private String bsflags;
    /**
    * 费用类型
    */
    private String feeid;
    /**
    * 计算方式
    */
    private String calctype;
    /**
    * 费率
    */
    private BigDecimal feerate;
    /**
    * 最小费用
    */
    private BigDecimal minfee;
    /**
    * 最大费用
    */
    private BigDecimal maxfee;
    /**
    * 备注
    */
    private String remark;
    /**
    * 资金账号
    */
    private String fundacct;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券类别
    */
    private String stktype;
    /**
    * 买卖方向
    */
    private String bsflag;
    /**
    * 费用类型
    */
    private String feeid;
    /**
    * 计算方式
    */
    private String calctype;
    /**
    * 费率
    */
    private BigDecimal feerate;
    /**
    * 最小费用
    */
    private BigDecimal minfee;
    /**
    * 最大费用
    */
    private BigDecimal maxfee;
    /**
    * 备注
    */
    private String remark;
    /**
    * 查询索引
    */
    private String indexkey;
    /**
    * bp节点号
    */
    private String bpnode;
    /**
    * 内存服务组号
    */
    private String srvgroup;
    /**
    * 状态
    */
    private String status;
    /**
    * 服务类别
    */
    private String servertypes;
    /**
    * 备注
    */
    private String remark;
    /**
    * 服务组号
    */
    private String servergroup;
    /**
    * 服务类型
    */
    private String endpointtype;
    /**
    * bp节点号
    */
    private String bpnode;
    /**
    * 所属服务名
    */
    private String srvname;
    /**
    * zmq模式
    */
    private String zmqmode;
    /**
    * 协议类型
    */
    private String protocoltype;
    /**
    * 连接地址
    */
    private String address;
    /**
    * 是否备用服务
    */
    private String baktype;
    /**
    * 备注
    */
    private String remark;
    /**
    * 当前状态
    */
    private String status;
    /**
    * 主题串
    */
    private String topicString;
    /**
    * 产品编号
    */
    private String fundid;
    /**
    * 功能号
    */
    private String funcid;
    /**
    * IP地址
    */
    private String ip;
    /**
    * 端口
    */
    private String port;
    /**
    * 备注
    */
    private String remark;
    /**
    * 服务器编号
    */
    private String serverid;
    /**
    * 上次交易日期
    */
    private String lastsysdate;
    /**
    * 系统日期
    */
    private String busidate;
    /**
    * 委托日期
    */
    private String orderdate;
    /**
    * 系统运行状态
    */
    private String status;
    /**
    * 数据库状态
    */
    private String dbstatus;
    /**
    * 数据库操作员
    */
    private String dboperid;
    /**
    * 监控ID
    */
    private String monitorid;
    /**
    * 备注
    */
    private String remark;
    /**
    * 自增ID
    */
    private String id;
    /**
    * 监控ID
    */
    private String monitorid;
    /**
    * 系统名称
    */
    private String servername;
    /**
    * 上传unix时间戳
    */
    private String uploadunixtime;
    /**
    * 上报次数
    */
    private String count;
    /**
    * 上传机器IP
    */
    private String uploadip;
    /**
    * 上报数值
    */
    private String value;
    /**
    * bp节点号
    */
    private String bpnode;
    /**
    * 内存服务组号
    */
    private String srvgroup;
    /**
    * 产品编号
    */
    private String fundid;
    /**
    * 状态
    */
    private String status;
    /**
    * 备注
    */
    private String remark;
    /**
    * 服务名称
    */
    private String serverName;
    /**
    * 上传时间
    */
    private String uploadTime;
    /**
    * 日志内容
    */
    private String logInfo;
    /**
    * 服务器IP
    */
    private String ip;
    /**
    * BP节点号
    */
    private String bpnode;
    /**
    * 功能号
    */
    private String funcid;
    /**
    * 用户ID
    */
    private String userid;
    /**
    * 服务类型
    */
    private String servertype;
    /**
    * 服务名称
    */
    private String servername;
    /**
    * 功能号
    */
    private String funcid;
    /**
    * 启用状态
    */
    private String status;
    /**
    * 备注信息
    */
    private String remark;
    /**
    * 服务特性
    */
    private String serverproperty;
    /**
    * 服务归属
    */
    private String serverbind;
    /**
    * 显示顺序
    */
    private String showorder;
    /**
    * 启动优先级
    */
    private String execorder;
    /**
    * 服务组号
    */
    private String servergroup;
    /**
    * BP节点号
    */
    private String bpnode;
    /**
    * 功能号
    */
    private String funcid;
    /**
    * 服务启动序号
    */
    private String startId;
    /**
    * 当前服务进程号
    */
    private String processId;
    /**
    * 系统名称
    */
    private String servername;
    /**
    * 上报机器IP
    */
    private String ip;
    /**
    * 最新上报时间
    */
    private String updatetime;
    /**
    * 物理日期
    */
    private String phydate;
    /**
    * 服务启动日期
    */
    private String startdate;
    /**
    * 服务启动时间
    */
    private String starttime;
    /**
    * KCBP空闲进程数
    */
    private String idleAs;
    /**
    * 字段名
    */
    private String columnName;
    /**
    * 字段类型
    */
    private String dataType;
    /**
    * 字段长度
    */
    private String dataLength;
    /**
    * 字段精度
    */
    private String dataPrecision;
    /**
    * 字段小数
    */
    private String dataScale;
    /**
    * 使用字典
    */
    private String dictitem;
    /**
    * 备注
    */
    private String remark;
    /**
    * 端点类型
    */
    private String endpointtype;
    /**
    * 监听类别
    */
    private String bindType;
    /**
    * ZMQ 的socket模式类型
    */
    private String socketType;
    /**
    * 通信协议
    */
    private String protocol;
    /**
    * 端点名称
    */
    private String endpointName;
    /**
    * ZMQ网络模式描述
    */
    private String zmqModeDescribe;
    /**
    * 主题类别
    */
    private String topicType;
    /**
    * 主题串
    */
    private String topicString;
    /**
    * 默认开启标志
    */
    private String status;
    /**
    * 服务标识
    */
    private String serverType;
    /**
    * 端点类型
    */
    private String endpointtype;
    /**
    * 部署模式
    */
    private String deployType;
    /**
    * 发送附加标志
    */
    private String sendFlag;
    /**
    * 上游端点类型
    */
    private String connectEndpointtype;
    /**
    * 下游端点类型
    */
    private String bindEndpointtype;
    /**
    * 连接多实例模式
    */
    private String connectType;
    /**
    * 连接别名
    */
    private String connectName;
    /**
    * 参数标识
    */
    private String paramid;
    /**
    * 组织单元
    */
    private String orgid;
    /**
    * 参数值
    */
    private String paramvalue;
    /**
    * 交易通道
    */
    private String pathtype;
    /**
    * 委托方向
    */
    private String bsflag;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券类别
    */
    private String stktype;
    /**
    * 报盘模式
    */
    private String rptmode;
    /**
    * 委托功能号
    */
    private String orderBusinessid;
    /**
    * 批量委托功能号
    */
    private String batchorderBusinessid;
    /**
    * 撤单功能号
    */
    private String cancelBusinessid;
    /**
    * 委托查询功能号
    */
    private String orderqryBusinessid;
    /**
    * 成交处理方式
    */
    private String matchWay;
    /**
    * 序号
    */
    private String sno;
    /**
    * 业务类型
    */
    private String msgType;
    /**
    * 记录类型
    */
    private String traceType;
    /**
    * 流水序号
    */
    private String traceSno;
    /**
    * 消息序列值
    */
    private String msgNo;
    /**
    * 服务组号
    */
    private String servergroup;
    /**
    * 服务节点号
    */
    private String bpnodeid;
    /**
    * 发生时间
    */
    private String tradeTime;
    /**
    * 落库时间
    */
    private String dbTime;
    /**
    * 交易市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * LOF类型
    */
    private String loftype;
    /**
    * 申购上限
    */
    private BigDecimal maxbuyqty;
    /**
    * 申购下限
    */
    private BigDecimal minbuyqty;
    /**
    * 申购最小单位
    */
    private String buyunit;
    /**
    * 赎回上限
    */
    private BigDecimal maxsaleqty;
    /**
    * 赎回下限
    */
    private BigDecimal minsaleqty;
    /**
    * 赎回最小单位
    */
    private String saleunit;
    /**
    * 申购和赎回允许状态
    */
    private String tradestate;
    /**
    * 赎回资金回转天数
    */
    private String settlefundays;
    /**
    * 备用1
    */
    private String iBy;
    /**
    * 备用2
    */
    private String cBy;
    /**
    * 备注信息
    */
    private String remark;
    /**
    * 更新日期
    */
    private String lastdate;
    /**
    * 证券内码
    */
    private String stkid;
    /**
    * 业务日期
    */
    private String busiDate;
    /**
    * 业务时间
    */
    private String busiTime;
    /**
    * 物理日期
    */
    private String phyDate;
    /**
    * 物理时间
    */
    private String phyTime;
    /**
    * 业务功能
    */
    private String funcid;
    /**
    * 服务组号
    */
    private String serverGroup;
    /**
    * 业务序号
    */
    private String busiSno;
    /**
    * 日志记录类型
    */
    private String logType;
    /**
    * 日志信息
    */
    private String logInfo;
    /**
    * 任务编号
    */
    private String taskid;
    /**
    * 日期
    */
    private String busidate;
    /**
    * 开始时间
    */
    private String begintime;
    /**
    * 结束时间
    */
    private String endtime;
    /**
    * 执行结果标志
    */
    private String passflag;
    /**
    * 上次开始时间
    */
    private String lastBegintime;
    /**
    * 上次结束时间
    */
    private String lastEndtime;
    /**
    * 上次执行结果标志
    */
    private String lastPassflag;
    /**
    * 错误原因
    */
    private String errorinfo;
    /**
    * 备注
    */
    private String remark;
    /**
    * 调用功能号
    */
    private String lbmid;
    /**
    * 上报日期
    */
    private String securitydate;
    /**
    * 上报时间
    */
    private String securitytime;
    /**
    * 节点ID
    */
    private String nodeid;
    /**
    * MAC
    */
    private String mac;
    /**
    * 会话ID
    */
    private String sessionid;
    /**
    * IP地址
    */
    private String ip;
    /**
    * 用户账号
    */
    private String userid;
    /**
    * 访问数量
    */
    private String cnt;
    /**
    * 开发商标识
    */
    private String vendorId;
    /**
    * 数据采集日期
    */
    private String collectDate;
    /**
    * 数据采集时间
    */
    private String collectTime;
    /**
    * 外挂名称
    */
    private String plugName;
    /**
    * 一码通账号
    */
    private String plugAccount;
    /**
    * 异常客户端ID
    */
    private String plugGuuid;
    /**
    * 异常客户端IP
    */
    private String plugIp;
    /**
    * 异常客户端MAC
    */
    private String plugMac;
    /**
    * 异常类型
    */
    private String errType;
    /**
    * 用户账号
    */
    private String userid;
    /**
    * 节点ID
    */
    private String nodeid;
    /**
    * MAC地址
    */
    private String mac;
    /**
    * IP地址
    */
    private String ip;
    /**
    * 用户账号
    */
    private String userid;
    /**
    * 首次触发时间
    */
    private String createtime;
    /**
    * 更新时间
    */
    private String updatetime;
    /**
    * 解冻时间
    */
    private String unfreezetime;
    /**
    * 超频访问限制触发次数
    */
    private String overCounts;
    /**
    * 主动挑战应答触发次数
    */
    private String challengeCounts;
    /**
    * 完整性限制触发次数
    */
    private String fileDestroyCounts;
    /**
    * 冻结状态
    */
    private String freezestatus;
    /**
    * 是否豁免
    */
    private String remitstatus;
    /**
    * 开发商标识
    */
    private String vendorId;
    /**
    * 数据采集日期
    */
    private String collectDate;
    /**
    * 数据采集时间
    */
    private String collectTime;
    /**
    * 异常告警类型
    */
    private String plugName;
    /**
    * 异常告警账号
    */
    private String plugAccount;
    /**
    * 异常告警账号1
    */
    private String plugAccount1;
    /**
    * 异常客户端ID
    */
    private String plugGuuid;
    /**
    * 异常客户端IP
    */
    private String plugIp;
    /**
    * 异常客户端MAC
    */
    private String plugMac;
    /**
    * 数据采集日期
    */
    private String collectDate;
    /**
    * 数据采集时间
    */
    private String collectTime;
    /**
    * 开发商标识
    */
    private String vendorId;
    /**
    * 服务端总数
    */
    private String serverOnline;
    /**
    * 开发商标识
    */
    private String vendorId;
    /**
    * 接入服务端版本
    */
    private String version;
    /**
    * 异常特征库版本
    */
    private String plugDb;
    /**
    * 数据采集日期
    */
    private String collectDate;
    /**
    * 数据采集时间
    */
    private String collectTime;
    /**
    * 接入服务端标识
    */
    private String serverId;
    /**
    * 客户端版本校验策略是否开启
    */
    private String verCheck;
    /**
    * 券商标识校验是否开启
    */
    private String qsidCheck;
    /**
    * 文件完整性策略是否开启
    */
    private String fileCheck;
    /**
    * 主动挑战策略是否开启
    */
    private String actChal;
    /**
    * 超频访问策略是否开启
    */
    private String freLimit;
    /**
    * 文件完整性策略阻断是否开启
    */
    private String fileCheckReject;
    /**
    * 主动挑战阻断是否开启
    */
    private String actChalReject;
    /**
    * 超频访问阻断是否开启
    */
    private String freLimitReject;
    /**
    * 开发商标识
    */
    private String vendorId;
    /**
    * 数据采集日期
    */
    private String collectDate;
    /**
    * 数据采集时间
    */
    private String collectTime;
    /**
    * 异常客户端数量
    */
    private String plugClientSum;
    /**
    * 异常账号数量
    */
    private String plugClientAccount;
    /**
    * 告警汇总数量
    */
    private String warnSum;
    /**
    * 文件完整性告警数量
    */
    private String fileCheckWarnSum;
    /**
    * 主动挑战应答告警数量
    */
    private String actChalWarnSum;
    /**
    * 超频访问告警数量
    */
    private String freLimitWarnSum;
    /**
    * 阻断汇总数量
    */
    private String rejSum;
    /**
    * 文件完整性阻断数量
    */
    private String fileCheckRejSum;
    /**
    * 主动挑战阻断数量
    */
    private String actChalRejSum;
    /**
    * 超频访问阻断数量
    */
    private String freLimitRejSum;
    /**
    * 开发商标识
    */
    private String vendorId;
    /**
    * 数据采集日期
    */
    private String collectDate;
    /**
    * 数据采集时间
    */
    private String collectTime;
    /**
    * 异常客户端类型
    */
    private String wgType;
    /**
    * 异常类型数量
    */
    private String wgTypeNum;
    /**
    * 会话ID
    */
    private String sessionid;
    /**
    * 会话创建时间
    */
    private String createtime;
    /**
    * 会话更新时间
    */
    private String updatetime;
    /**
    * 会话剔除时间
    */
    private String killtime;
    /**
    * 会话是否剔除
    */
    private String status;
    /**
    * 业务日期
    */
    private String busidate;
    /**
    * 流水号
    */
    private String logsno;
    /**
    * 协议签署人
    */
    private String userid;
    /**
    * 协议签署日期
    */
    private String signPhydate;
    /**
    * 协议签署时间
    */
    private String signTime;
    /**
    * 签署人会话编号
    */
    private String sessionid;
    /**
    * 签署动作类型
    */
    private String action;
    /**
    * 协议编号
    */
    private String agreementId;
    /**
    * 协议版本
    */
    private String agreementVersion;
    /**
    * 协议标题
    */
    private String agreementTittle;
    /**
    * 菜单编号
    */
    private String menuid;
    /**
    * 协议签署渠道
    */
    private String agreementChannel;
    /**
    * 外部协议编号
    */
    private String extAgreementId;
    /**
    * 签署主体类别
    */
    private String signMainType;
    /**
    * 签署主体ID
    */
    private String signMainId;
    /**
    * 预留字段
    */
    private String reserve;
    /**
    * 协议编号
    */
    private String agreementId;
    /**
    * 外部协议编号
    */
    private String extAgreementId;
    /**
    * 协议版本号
    */
    private String agreeVersion;
    /**
    * 签署主体类别
    */
    private String signMainType;
    /**
    * 签署主体ID
    */
    private String signMainId;
    /**
    * 协议签署渠道
    */
    private String agreementChannel;
    /**
    * 协议签署人
    */
    private String userid;
    /**
    * 协议首次签署日期
    */
    private String signPhydate;
    /**
    * 协议首次签署时间
    */
    private String signTime;
    /**
    * 协议更新签署日期
    */
    private String updateDate;
    /**
    * 协议更新签署时间
    */
    private String updateTime;
    /**
    * 状态
    */
    private String status;
    /**
    * 预留字段
    */
    private String reserve;
    /**
    * 签署流水
    */
    private String logsno;
    /**
    * 用户ID
    */
    private String userid;
    /**
    * 配置KEY
    */
    private String paramname;
    /**
    * 配置值
    */
    private String paramvalue;
    /**
    * 修改日期
    */
    private String upddate;
    /**
    * 修改时间
    */
    private String updtime;
    /**
    * 序号
    */
    private String sno;
    /**
    * 标题
    */
    private String msgtitle;
    /**
    * 公告内容
    */
    private String msginfo;
    /**
    * 创建日期
    */
    private String createdate;
    /**
    * 公告日期
    */
    private String begindate;
    /**
    * 过期日期
    */
    private String expiredate;
    /**
    * 发布时间
    */
    private String opertime;
    /**
    * 公告类别
    */
    private String msgtype;
    /**
    * 发布机构
    */
    private String orgid;
    /**
    * 发布人ID
    */
    private String operuserid;
    /**
    * 发布人
    */
    private String opername;
    /**
    * 发布状态
    */
    private String msgstatus;
    /**
    * BP节点号
    */
    private String nodeid;
    /**
    * 数据库实例
    */
    private String dbname;
    /**
    * 数据表名
    */
    private String tablename;
    /**
    * 预设数据容量
    */
    private String datacapacity;
    /**
    * 当前数据量
    */
    private String datacount;
    /**
    * 上次检查时间
    */
    private String lastchecktime;
    /**
    * 数据库总体积
    */
    private BigDecimal databasesize;
    /**
    * 表占用体积
    */
    private BigDecimal tablesize;
    /**
    * 表状态
    */
    private String tablestatus;
    /**
    * 数据库状态
    */
    private String databasestatus;
    /**
    * 协议编号
    */
    private String agreementId;
    /**
    * 协议版本号
    */
    private String agreeVersion;
    /**
    * 协议签署渠道
    */
    private String agreementChannel;
    /**
    * 外部协议编号
    */
    private String extAgreementId;
    /**
    * 协议名称
    */
    private String agreeTitle;
    /**
    * 协议扩展信息
    */
    private String extInfo;
    /**
    * 更新日期
    */
    private String updateDate;
    /**
    * 更新时间
    */
    private String updateTime;
    /**
    * 有效期
    */
    private String validPeriod;
    /**
    * 接口名称
    */
    private String interfaceName;
    /**
    * 字段名称
    */
    private String paramName;
    /**
    * 是否必送
    */
    private String ismust;
    /**
    * 参数方式
    */
    private String ispost;
    /**
    * 生效标识
    */
    private String isvalid;
    /**
    * 控件标识
    */
    private String paramid;
    /**
    * 显示序号
    */
    private String dispsno;
    /**
    * 分组编号
    */
    private String groupid;
    /**
    * 控件名
    */
    private String paramname;
    /**
    * 数据类型
    */
    private String datatype;
    /**
    * 数据长度
    */
    private String datalen;
    /**
    * 精度
    */
    private String declen;
    /**
    * 控件类型
    */
    private String ctrltype;
    /**
    * 控件样式
    */
    private String ctrlstyle;
    /**
    * 控件长度
    */
    private String displaywidth;
    /**
    * 数据字典
    */
    private String dictitem;
    /**
    * 关联列表
    */
    private String valuelist;
    /**
    * 参数状态
    */
    private String status;
    /**
    * 参数设置类型
    */
    private String settype;
    /**
    * 验证方式
    */
    private String verifyfunc;
    /**
    * 备注
    */
    private String remark;
    /**
    * 是否允许为空
    */
    private String isnull;
    /**
    * 默认值
    */
    private String defaultvalue;
    /**
    * 分组编号
    */
    private String groupid;
    /**
    * 父分组编号
    */
    private String parentgroupid;
    /**
    * 分组名称
    */
    private String groupname;
    /**
    * 分组描述
    */
    private String describe;
    /**
    * 组图标编号
    */
    private String imgindex;
    /**
    * 管理端
    */
    private String managerment;
    /**
    * APP种类
    */
    private String appCategory;
    /**
    * APP类型
    */
    private String appType;
    /**
    * 环境类型
    */
    private String envType;
    /**
    * 版本类型
    */
    private String versionType;
    /**
    * 版本号
    */
    private String versionNo;
    /**
    * 版本序号
    */
    private String versionSno;
    /**
    * APP名称
    */
    private String appName;
    /**
    * 版本时间
    */
    private String versionTime;
    /**
    * 版本大小
    */
    private String versionSize;
    /**
    * 版本MD5
    */
    private String versionMd5;
    /**
    * 内容版本文件名
    */
    private String fileNameContent;
    /**
    * 容器版本32位文件名
    */
    private String fileNameIa32;
    /**
    * 容器版本64位文件名
    */
    private String fileNameX64;
    /**
    * 版本升级内容
    */
    private String versionText;
    /**
    * 是否强制升级
    */
    private String mustUpdate;
    /**
    * 版本网站地址
    */
    private String versionSite;
    /**
    * 版本mode
    */
    private String versionMode;
    /**
    * 更新日期
    */
    private String updateDate;
    /**
    * 更新时间
    */
    private String updateTime;
    /**
    * 有效状态
    */
    private String valid;
    /**
    * 备注信息
    */
    private String remark;
    /**
    * 机构代码
    */
    private String orgids;
    /**
    * 用户代码
    */
    private String userids;
    /**
    * 运营标识
    */
    private String operationTags;
    /**
    * bp节点号
    */
    private String bpnode;
    /**
    * 内存服务组号
    */
    private String srvgroup;
    /**
    * 服务类别
    */
    private String servertypes;
    /**
    * 服务运行数
    */
    private String serverscount;
    /**
    * 状态
    */
    private String status;
    /**
    * 备注
    */
    private String remark;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券内码
    */
    private String stkid;
    /**
    * 证券名称
    */
    private String stkname;
    /**
    * 货币代码
    */
    private String moneytype;
    /**
    * 状态
    */
    private String stkstatus;
    /**
    * 资产类别
    */
    private String fundkind;
    /**
    * 证券类别单位
    */
    private String typeunit;
    /**
    * 修改日期
    */
    private String modifydate;
    /**
    * 修改时间
    */
    private String modifytime;
    /**
    * 修改人
    */
    private String modifyoperid;
    /**
    * 流程类型
    */
    private String flowtype;
    /**
    * 转发节点数
    */
    private String transferCount;
    /**
    * 模板描述
    */
    private String modelname;
    /**
    * 修改人
    */
    private String modifyoperid;
    /**
    * 修改日期
    */
    private String modifydate;
    /**
    * 修改时间
    */
    private String modifytime;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 市场
    */
    private String market;
    /**
    * 业务类型
    */
    private String busiType;
    /**
    * 订单起始日期
    */
    private String busibegindate;
    /**
    * 订单结束日期
    */
    private String busienddate;
    /**
    * 订单整手数
    */
    private BigDecimal reportunit;
    /**
    * 订单申报最小数量
    */
    private BigDecimal minreportqty;
    /**
    * 订单申报最大数量
    */
    private BigDecimal maxreportqty;
    /**
    * 目标证券代码
    */
    private String transinstkcode;
    /**
    * 目标证券简称
    */
    private String transinstkname;
    /**
    * 业务价格
    */
    private BigDecimal busiprice;
    /**
    * 证券内码
    */
    private String stkid;
    /**
    * 产品ID
    */
    private String productid;
    /**
    * 是否签署产品协议
    */
    private String agrtype;
    /**
    * 后端申购代码
    */
    private String backpurchasecode;
    /**
    * 单位当日收益
    */
    private BigDecimal calpmunitincm;
    /**
    * 变更前存续期截止日期
    */
    private BigDecimal changebeforedurationenddate;
    /**
    * 基金中文名称
    */
    private String chiname;
    /**
    * 封闭期起始日期
    */
    private BigDecimal closeperiodbegindate;
    /**
    * 封闭期截止日期
    */
    private BigDecimal closeperiodenddate;
    /**
    * 封闭期类型代码
    */
    private String closeperiodtypecode;
    /**
    * 募集起始日期
    */
    private BigDecimal collectbegindate;
    /**
    * 募集截止日期
    */
    private BigDecimal collectenddate;
    /**
    * 基金成立日期
    */
    private BigDecimal contracteffdate;
    /**
    * 合同生效公告日期
    */
    private BigDecimal contracteffnoticedate;
    /**
    * 产品状态
    */
    private String datastatus;
    /**
    * 日收益率
    */
    private BigDecimal dayreturn;
    /**
    * 删除标识
    */
    private String delid;
    /**
    * 申购折扣
    */
    private BigDecimal discount;
    /**
    * 存续期起始日期
    */
    private BigDecimal durationbegindate;
    /**
    * 存续期截止日期
    */
    private BigDecimal durationenddate;
    /**
    * 存续年限
    */
    private BigDecimal durationyear;
    /**
    * 终止上市日期
    */
    private BigDecimal endlistdate;
    /**
    * 基金英文名称
    */
    private String engname;
    /**
    * 英文名称缩写
    */
    private String engnameshort;
    /**
    * 交易所代码
    */
    private String exchangecode;
    /**
    * 交易所名称
    */
    private String exchangename;
    /**
    * 扩位简称
    */
    private String expchinameabbr;
    /**
    * 记录落地时间
    */
    private BigDecimal recdowntime;
    /**
    * 记录进表时间
    */
    private BigDecimal recfirsttime;
    /**
    * 记录编号
    */
    private String recid;
    /**
    * 记录更新时间
    */
    private BigDecimal recupdatetime;
    /**
    * 证券编号
    */
    private String secuid;
    /**
    * 前端申购代码
    */
    private String frontpurchasecode;
    /**
    * 基金级别代码
    */
    private String fundlevelcode;
    /**
    * 基金分级模式代码
    */
    private String fundlevelmodecode;
    /**
    * 基金管理公司
    */
    private String fundmanagecorp;
    /**
    * 基金管理公司编号
    */
    private String fundmanagecorpid;
    /**
    * 基金运作方式代码
    */
    private String fundopermodecode;
    /**
    * 基金运作周期
    */
    private String fundoperperiod;
    /**
    * 基金风格代码
    */
    private String fundstylecode;
    /**
    * 基金托管人
    */
    private String fundtrustee;
    /**
    * 基金托管人编号
    */
    private String fundtrusteeid;
    /**
    * 天相一级基金类型
    */
    private String fundtype;
    /**
    * 基金类型代码
    */
    private String fundtypecode;
    /**
    * 天相基金类型代码
    */
    private String fundtypecodetx;
    /**
    * 产品中心配置的是否代销
    */
    private String gfselling;
    /**
    * 是否定期开放型基金
    */
    private String iffixdateopenfund;
    /**
    * 是否可定投
    */
    private String iffixed;
    /**
    * 交易日期
    */
    private BigDecimal indextradedate;
    /**
    * 投资特征代码
    */
    private String investfeaturecode;
    /**
    * 投资品种
    */
    private String investtype;
    /**
    * 是否在柜台可购买该基金
    */
    private String isallowbuy;
    /**
    * 是否在柜台可赎回该基金
    */
    private String isallowredeem;
    /**
    * 是否在交易所交易
    */
    private String isexchangetrans;
    /**
    * 是否是虚拟基金
    */
    private String isvirtualfund;
    /**
    * 发行规模
    */
    private BigDecimal issuescale;
    /**
    * 星级评价代码
    */
    private BigDecimal levelcode;
    /**
    * 星级评级日期
    */
    private BigDecimal levelpublishdate;
    /**
    * 上市板块代码
    */
    private String listboarcode;
    /**
    * 上市板块名称
    */
    private String listboarname;
    /**
    * 上市日期
    */
    private BigDecimal listdate;
    /**
    * 上市规模
    */
    private BigDecimal listscale;
    /**
    * 上市状态代码
    */
    private String liststatuscode;
    /**
    * indexTradeDate前一天后复权份额净值
    */
    private BigDecimal lstdafterrorshrnav;
    /**
    * 最低持有份额
    */
    private BigDecimal minholdshare;
    /**
    * 个人首次最低申购金额
    */
    private BigDecimal minperfappbalance;
    /**
    * 最低赎回份额
    */
    private BigDecimal minredemptionshare;
    /**
    * 净值交易日期
    */
    private BigDecimal navtradedate;
    /**
    * 是否上柜
    */
    private String oncounter;
    /**
    * 个人首次最低认购金额
    */
    private BigDecimal openshare;
    /**
    * 面值
    */
    private BigDecimal parvalue;
    /**
    * 面值货币代码
    */
    private String parvaluecrrccode;
    /**
    * 业绩比较基准
    */
    private String perfbenchmark;
    /**
    * 投资期限
    */
    private String periodtype;
    /**
    * 拼音简称
    */
    private String pinyinabbr;
    /**
    * navTradeDate每万元基金单位当日收益
    */
    private BigDecimal pmunitincm;
    /**
    * 日历状态
    */
    private String prodstatus;
    /**
    * 产品TA编号
    */
    private String prodtano;
    /**
    * 购买渠道:柜台
    */
    private String purchaseway;
    /**
    * navTradeDate最近7日年化收益率
    */
    private BigDecimal recent7dayannreturn;
    /**
    * indexTradeDate近一个月收益率
    */
    private BigDecimal return1m;
    /**
    * indexTradeDate近一周收益率
    */
    private BigDecimal return1w;
    /**
    * indexTradeDate近一年收益率
    */
    private BigDecimal return1y;
    /**
    * indexTradeDate近二年收益率
    */
    private BigDecimal return2y;
    /**
    * indexTradeDate近三个月收益率
    */
    private BigDecimal return3m;
    /**
    * indexTradeDate近三年收益率
    */
    private BigDecimal return3y;
    /**
    * indexTradeDate近五年收益率
    */
    private BigDecimal return5y;
    /**
    * indexTradeDate近六个月收益率
    */
    private BigDecimal return6m;
    /**
    * indexTradeDate成立以来收益率
    */
    private BigDecimal returntn;
    /**
    * indexTradeDate今年以来收益率
    */
    private BigDecimal returnty;
    /**
    * 收益类型代码
    */
    private String returntypecode;
    /**
    * 风险等级
    */
    private String risklevel;
    /**
    * 基金最新规模
    */
    private BigDecimal scale;
    /**
    * 基金简称
    */
    private String secuabbr;
    /**
    * 证券主编号
    */
    private String secumainid;
    /**
    * 产品类型
    */
    private String secutype;
    /**
    * 份额结转日期
    */
    private BigDecimal sharecaroverdate;
    /**
    * navTradeDate单位净值
    */
    private BigDecimal sharenav;
    /**
    * indexTradeDate后复权单位净值
    */
    private BigDecimal sharenavafterror;
    /**
    * navTradeDate累计净值
    */
    private BigDecimal sharesumnav;
    /**
    * 份额结转日类型代码
    */
    private String shrcaroverdaytypecode;
    /**
    * 份额结转方式代码
    */
    private String shrcarovermodecode;
    /**
    * 近一年定投收益率
    */
    private BigDecimal timereturn1y;
    /**
    * 近两年定投收益率
    */
    private BigDecimal timereturn2y;
    /**
    * 近三年定投收益率
    */
    private BigDecimal timereturn3y;
    /**
    * 交易代码
    */
    private String tradecode;
    /**
    * 历史最大回撤
    */
    private BigDecimal maxretracement;
    /**
    * 机构单日购买上限
    */
    private BigDecimal orgmaxpdshare;
    /**
    * 机构首次最低申购金额
    */
    private BigDecimal minorgfappbalance;
    /**
    * 机构最低申购金额
    */
    private BigDecimal orglowlimitbalance2;
    /**
    * 基金规模日期
    */
    private BigDecimal scalenoticedate;
    /**
    * 基金经理
    */
    private String invmgrs;
    /**
    * 认购费率
    */
    private BigDecimal subfeeratio;
    /**
    * 折后认购费率
    */
    private BigDecimal discountsubfeeratio;
    /**
    * 申购费率
    */
    private BigDecimal applyfeeratio;
    /**
    * 折后申购费率
    */
    private BigDecimal discountapplyfeeratio;
    /**
    * 赎回费率
    */
    private BigDecimal redeemfeeratio;
    /**
    * 折后赎回费率
    */
    private BigDecimal discountredeemfeeratio;
    /**
    * 托管费率
    */
    private BigDecimal trusteeshipfeeratio;
    /**
    * 管理费率
    */
    private BigDecimal managefeeratio;
    /**
    * 业绩报酬
    */
    private BigDecimal rewardfeeratio;
    /**
    * 收费方式
    */
    private String chargetype;
    /**
    * 分红方式
    */
    private String bonusmethod;
    /**
    * 赎回单位
    */
    private BigDecimal redemptionunit;
    /**
    * 赎回最大份额
    */
    private BigDecimal maxorgredshare;
    /**
    * 资管精选
    */
    private String assetrecommend;
    /**
    * 财富精选
    */
    private String wealthrecommend;
    /**
    * 新发产品
    */
    private String newproduct;
    /**
    * 资产分类
    */
    private String assetstype;
    /**
    * 期末基金资产净值
    */
    private BigDecimal endfundassetnav;
    /**
    * 截止日期
    */
    private BigDecimal enddate;
    /**
    * 同步状态
    */
    private String syncStat;
    /**
    * 记录更新日期
    */
    private String recordDate;
    /**
    * 记录状态
    */
    private String recordStat;
    /**
    * 标签名
    */
    private String labelName;
    /**
    * 点评标题
    */
    private String commentTitle;
    /**
    * 点评正文
    */
    private String commExplain;
    /**
    * 标签
    */
    private String subLabel;
    /**
    * 代码收费类型
    */
    private String purchasecodetype;
    /**
    * 接口来源
    */
    private String interfacenames;
    /**
    * 原始代码
    */
    private String orgtradecode;
    /**
    * 推荐词
    */
    private String introduce;
    /**
    * 推荐原因
    */
    private String reason;
    /**
    * 债券基金类型
    */
    private String bondtypecode;
    /**
    * 基金赎回资金可取日
    */
    private String moneydate;
    /**
    * 机构单笔最高申购金额
    */
    private BigDecimal orgoneappmaxbalance;
    /**
    * 机构追加认购金额
    */
    private BigDecimal orgappendbalance;
    /**
    * 机构单笔最高认购金额
    */
    private BigDecimal orgonesubmaxbalance;
    /**
    * 机构最低认购金额
    */
    private BigDecimal orglowlimitbalance;
    /**
    * 基金赎回资金到账日
    */
    private String withdrawdate;
    /**
    * 同业存单指数基金
    */
    private String ncdindexfund;
    /**
    * 封闭期
    */
    private String closeperiod;
    /**
    * 预计份额确认日
    */
    private String expectbuydate;
    /**
    * 预计资金到账日
    */
    private String expectwithdrawdate;
    /**
    * 个人最低认购金额
    */
    private BigDecimal minshare;
    /**
    * 个人追加认购金额
    */
    private BigDecimal allotlimitshare;
    /**
    * 个人最低申购金额
    */
    private BigDecimal minshare2;
    /**
    * 个人追加申购金额
    */
    private BigDecimal allotlimitshare2;
    /**
    * 机构追加申购金额
    */
    private BigDecimal orgappendbalance2;
    /**
    * 机构首次最低金额
    */
    private BigDecimal minsize;
    /**
    * 个人单笔最高认购金额
    */
    private BigDecimal peronesubmaxbalance;
    /**
    * 个人单笔最高申购金额
    */
    private BigDecimal peroneappmaxbalance;
    /**
    * 个人最高赎回份额
    */
    private BigDecimal maxperredshare;
    /**
    * 个人最高申购金额
    */
    private BigDecimal maxperappbalance;
    /**
    * 机构最高申购金额
    */
    private BigDecimal maxorgappbalance;
    /**
    * 个人认购累计金额
    */
    private BigDecimal sumsubbalance;
    /**
    * 机构认购累计金额
    */
    private BigDecimal orgsumsubbalance;
    /**
    * 最少转换份额
    */
    private BigDecimal translimitshare;
    /**
    * 允许转换状态
    */
    private String prodconvertstatus;
    /**
    * 代码允许转换代码
    */
    private String enchangecode;
    /**
    * 持仓量的最低值
    */
    private BigDecimal currentamountlow;
    /**
    * 客户单日申购最高金额
    */
    private BigDecimal maxpdshare;
    /**
    * 赎回最低份额
    */
    private BigDecimal redeemlimitshare;
    /**
    * 机构份额标签
    */
    private String orgsharelbl;
    /**
    * 柜台产品类型
    */
    private String prodType;
    /**
    * 证券内码
    */
    private String stkid;
    /**
    * 产品ID
    */
    private String productid;
    /**
    * 是否海外资产
    */
    private String abroadasset;
    /**
    * 累计净值
    */
    private BigDecimal accumnav;
    /**
    * 追加金额
    */
    private BigDecimal additionamount;
    /**
    * 是否签署产品协议
    */
    private String agrtype;
    /**
    * 是否需要适当性匹配
    */
    private String approtype;
    /**
    * 资产详细分类
    */
    private String assetalltype;
    /**
    * 资管产品类别
    */
    private String assetmgrtype;
    /**
    * 是否报价
    */
    private String isquoted;
    /**
    * 代销规模(份)
    */
    private BigDecimal sellsize;
    /**
    * 资产第一级分类
    */
    private String assetonetype;
    /**
    * 资产分类
    */
    private String assetstype;
    /**
    * 业绩比较基准
    */
    private BigDecimal benchmark;
    /**
    * 中文名称
    */
    private String chiname;
    /**
    * 简称
    */
    private String chinameabbr;
    /**
    * 拼音简称
    */
    private String chispelling;
    /**
    * 产品到期日,毫秒计
    */
    private BigDecimal closedate;
    /**
    * 是否分级
    */
    private String composetag;
    /**
    * 关联代码
    */
    private String connectedcode;
    /**
    * 币种
    */
    private String currencytype;
    /**
    * 是否定制
    */
    private String customizedornot;
    /**
    * 产品状态
    */
    private String datastatus;
    /**
    * 日涨幅
    */
    private BigDecimal dateraise;
    /**
    * 参与金额
    */
    private BigDecimal firstamount;
    /**
    * 面向客户类型
    */
    private String forcustomertype;
    /**
    * 是否代销
    */
    private String gfselling;
    /**
    * 对冲属性
    */
    private String hedgingflag;
    /**
    * 收益类型
    */
    private String incometype;
    /**
    * 记录息天数
    */
    private String interestdays;
    /**
    * 投资风格
    */
    private String investstyle;
    /**
    * 投资品种
    */
    private String investtype;
    /**
    * 投资经理名称
    */
    private String invmgrs;
    /**
    * 实际发行规模(份)
    */
    private BigDecimal isssize;
    /**
    * 发行公司
    */
    private String issuecompany;
    /**
    * 发行主体
    */
    private String issuer;
    /**
    * 管理期限,毫秒计
    */
    private String mgmtperiod;
    /**
    * 近1月涨幅
    */
    private BigDecimal monraise;
    /**
    * 近3月涨幅
    */
    private BigDecimal monraise3;
    /**
    * 近6月涨幅
    */
    private BigDecimal monraise6;
    /**
    * 近1年涨幅
    */
    private BigDecimal raiseoneyear;
    /**
    * 投资期限天数
    */
    private String prodterm;
    /**
    * 净值计算日期
    */
    private BigDecimal navdate;
    /**
    * 面值
    */
    private BigDecimal parvalue;
    /**
    * 母份额编码
    */
    private String parentsecucode;
    /**
    * 支付方式
    */
    private String payway;
    /**
    * 业绩比较基准1
    */
    private String perfben;
    /**
    * 是否业绩比较基准
    */
    private String perfbenshow;
    /**
    * 投资期限
    */
    private String periodtype;
    /**
    * 资管产品
    */
    private String prodmodel;
    /**
    * 产品运作方式
    */
    private String prodoperationtype;
    /**
    * 专项产品标志
    */
    private String prodreleaseobject;
    /**
    * 日历状态
    */
    private String prodstatus;
    /**
    * 产品TA编号
    */
    private String prodtano;
    /**
    * 产品子类
    */
    private String productsubtype;
    /**
    * 资管产品分类
    */
    private String psecutype;
    /**
    * 购买渠道
    */
    private String purchaseway;
    /**
    * 量化属性
    */
    private String quantitativeflag;
    /**
    * 自成立来涨幅
    */
    private BigDecimal raise;
    /**
    * 收益日期
    */
    private BigDecimal raisedate;
    /**
    * 评审状态
    */
    private String reviewstatus;
    /**
    * 风险等级
    */
    private String risklevel;
    /**
    * 产品编码
    */
    private String secucode;
    /**
    * 产品类型
    */
    private String secutype;
    /**
    * 成立日期,毫秒计
    */
    private BigDecimal setupdate;
    /**
    * 投资策略
    */
    private String strategy;
    /**
    * 是否子公司产品
    */
    private String subcompanyornot;
    /**
    * 产品净值
    */
    private BigDecimal unitnav;
    /**
    * 更新时间
    */
    private String updatetime;
    /**
    * 起息日期,毫秒计
    */
    private BigDecimal valuedate;
    /**
    * 产品财富分类
    */
    private String wealthtype;
    /**
    * 是否支持退订，服务产品特有
    */
    private String withdrawtype;
    /**
    * 自今年涨幅
    */
    private BigDecimal yearraise;
    /**
    * 机构单日购买上限
    */
    private BigDecimal orgmaxpdshare;
    /**
    * 基金是否可购买
    */
    private String isallowbuy;
    /**
    * 机构首次最低申购金额
    */
    private BigDecimal minorgfappbalance;
    /**
    * 机构最低申购金额
    */
    private BigDecimal orglowlimitbalance2;
    /**
    * 近一年涨幅
    */
    private BigDecimal yearraise1;
    /**
    * 认购费率
    */
    private BigDecimal subfeeratio;
    /**
    * 折后认购费率
    */
    private BigDecimal discountsubfeeratio;
    /**
    * 申购费率
    */
    private BigDecimal applyfeeratio;
    /**
    * 折后申购费率
    */
    private BigDecimal discountapplyfeeratio;
    /**
    * 赎回费率
    */
    private BigDecimal redeemfeeratio;
    /**
    * 折后赎回费率
    */
    private BigDecimal discountredeemfeeratio;
    /**
    * 托管费率
    */
    private BigDecimal trusteeshipfeeratio;
    /**
    * 管理费率
    */
    private BigDecimal managefeeratio;
    /**
    * 业绩报酬
    */
    private BigDecimal rewardfeeratio;
    /**
    * 赎回单位
    */
    private BigDecimal redemptionunit;
    /**
    * 赎回最大份额
    */
    private BigDecimal maxorgredshare;
    /**
    * 资管精选
    */
    private String assetrecommend;
    /**
    * 财富精选
    */
    private String wealthrecommend;
    /**
    * 新发产品
    */
    private String newproduct;
    /**
    * 收益率类型
    */
    private String incomeratetype;
    /**
    * 最高业绩比较基准
    */
    private BigDecimal maxcompref;
    /**
    * 最低业绩比较基准
    */
    private BigDecimal mincompref;
    /**
    * 到期收益率
    */
    private BigDecimal ytm;
    /**
    * 购买日
    */
    private String buydate;
    /**
    * 万份单位收益
    */
    private BigDecimal permyriadincome;
    /**
    * 7日年化收益率
    */
    private BigDecimal sevenincomeratio;
    /**
    * 预期年收益率
    */
    private BigDecimal prodpreratio;
    /**
    * 总销售额度
    */
    private BigDecimal totalQuota;
    /**
    * 已销售额度
    */
    private BigDecimal saleQuota;
    /**
    * 总购买人数上限
    */
    private String totalHolderNum;
    /**
    * 已购买人数
    */
    private String currentHolderNum;
    /**
    * 柜台类别
    */
    private String t2type;
    /**
    * 同步状态
    */
    private String syncStat;
    /**
    * 记录更新日期
    */
    private String recordDate;
    /**
    * 记录状态
    */
    private String recordStat;
    /**
    * 标签名
    */
    private String labelName;
    /**
    * 点评标题
    */
    private String commentTitle;
    /**
    * 点评正文
    */
    private String commExplain;
    /**
    * 标签
    */
    private String subLabel;
    /**
    * 接口来源
    */
    private String interfacenames;
    /**
    * 参公集合产品
    */
    private String referpublicprod;
    /**
    * 推荐词
    */
    private String introduce;
    /**
    * 推荐原因
    */
    private String reason;
    /**
    * 机构单笔最高申购金额
    */
    private BigDecimal orgoneappmaxbalance;
    /**
    * 机构追加认购金额
    */
    private BigDecimal orgappendbalance;
    /**
    * 机构单笔最高认购金额
    */
    private BigDecimal orgonesubmaxbalance;
    /**
    * 机构最低认购金额
    */
    private BigDecimal orglowlimitbalance;
    /**
    * 同业存单指数基金
    */
    private String ncdindexfund;
    /**
    * 个人最低认购金额
    */
    private BigDecimal minshare;
    /**
    * 个人追加认购金额
    */
    private BigDecimal allotlimitshare;
    /**
    * 个人最低申购金额
    */
    private BigDecimal minshare2;
    /**
    * 个人追加申购金额
    */
    private BigDecimal allotlimitshare2;
    /**
    * 机构追加申购金额
    */
    private BigDecimal orgappendbalance2;
    /**
    * 机构首次最低金额
    */
    private BigDecimal minsize;
    /**
    * 个人单笔最高认购金额
    */
    private BigDecimal peronesubmaxbalance;
    /**
    * 个人单笔最高申购金额
    */
    private BigDecimal peroneappmaxbalance;
    /**
    * 个人最高赎回份额
    */
    private BigDecimal maxperredshare;
    /**
    * 个人最高申购金额
    */
    private BigDecimal maxperappbalance;
    /**
    * 机构最高申购金额
    */
    private BigDecimal maxorgappbalance;
    /**
    * 个人认购累计金额
    */
    private BigDecimal sumsubbalance;
    /**
    * 机构认购累计金额
    */
    private BigDecimal orgsumsubbalance;
    /**
    * 最少转换份额
    */
    private BigDecimal translimitshare;
    /**
    * 允许转换状态
    */
    private String prodconvertstatus;
    /**
    * 前后收费类型
    */
    private String chargetype;
    /**
    * 代码允许转换代码
    */
    private String enchangecode;
    /**
    * 持仓量的最低值
    */
    private BigDecimal currentamountlow;
    /**
    * 客户单日申购最高金额
    */
    private BigDecimal maxpdshare;
    /**
    * 个人首次最低申购金额
    */
    private BigDecimal minperfappbalance;
    /**
    * 个人首次最低认购金额
    */
    private BigDecimal openshare;
    /**
    * 赎回最低份额
    */
    private BigDecimal redeemlimitshare;
    /**
    * 是否预约委托
    */
    private String limitpreentrust;
    /**
    * 是否预约赎回
    */
    private String appointredeem;
    /**
    * 希望处理日期
    */
    private String hopedate;
    /**
    * 赎回截止日可提交时间
    */
    private String redeemdeadline;
    /**
    * 预约委托日
    */
    private String appointredeemdate;
    /**
    * 机构份额标签
    */
    private String orgsharelbl;
    /**
    * 任务组
    */
    private String taskgroup;
    /**
    * 任务ID
    */
    private String taskid;
    /**
    * 执行顺序
    */
    private String execorder;
    /**
    * 前置任务
    */
    private String pretask;
    /**
    * 任务有效性
    */
    private String status;
    /**
    * 暂停标识
    */
    private String stopflag;
    /**
    * 任务功能号
    */
    private String lbmid;
    /**
    * 超时时间
    */
    private String timeout;
    /**
    * 业务参数
    */
    private String busiparam;
    /**
    * 失败处理方式
    */
    private String failtype;
    /**
    * 成功处理方式
    */
    private String succtype;
    /**
    * 本轮失败次数
    */
    private String roundfailtimes;
    /**
    * 本轮失败次数上限
    */
    private String roundfailmax;
    /**
    * 本轮运行状态
    */
    private String roundruning;
    /**
    * 执行状态
    */
    private String execstat;
    /**
    * 任务组
    */
    private String taskgroup;
    /**
    * 任务ID
    */
    private String taskid;
    /**
    * 操作日期
    */
    private String busidate;
    /**
    * 操作员
    */
    private String operid;
    /**
    * 操作时间
    */
    private String opertime;
    /**
    * 执行通过标志
    */
    private String passFlag;
    /**
    * 备注信息
    */
    private String remark;
    /**
    * 排序方式
    */
    private String rankMode;
    /**
    * 产品类型
    */
    private String prdType;
    /**
    * 产品小类
    */
    private String subPrdType;
    /**
    * 时间区间
    */
    private String period;
    /**
    * 序号
    */
    private String rowNo;
    /**
    * 产品代码
    */
    private String prdNo;
    /**
    * 产品简称
    */
    private String prdName;
    /**
    * 客户购买金额
    */
    private BigDecimal trdBal;
    /**
    * 购买客户数
    */
    private String trdCust;
    /**
    * 近1月涨幅
    */
    private BigDecimal ror1m;
    /**
    * 近3月涨幅
    */
    private BigDecimal ror3m;
    /**
    * 今年以来涨幅
    */
    private BigDecimal rorThsYear;
    /**
    * 业绩基准
    */
    private BigDecimal benchmark;
    /**
    * 投资期限
    */
    private String ivstTerm;
    /**
    * 产品成立日
    */
    private BigDecimal setupDate;
    /**
    * 到期日期
    */
    private BigDecimal closeDate;
    /**
    * 万份收益
    */
    private BigDecimal perMyriadIncome;
    /**
    * 7日年化收益
    */
    private BigDecimal annualizedYield7d;
    /**
    * 近一月年化收益
    */
    private BigDecimal annualizedYield1m;
    /**
    * 数据日期
    */
    private String busiDate;
    /**
    * 资讯ID
    */
    private String infoid;
    /**
    * 资讯标题
    */
    private String title;
    /**
    * 资讯摘要
    */
    private String roundup;
    /**
    * 资讯URL
    */
    private String url;
    /**
    * 多空情感分数
    */
    private BigDecimal sentimentScore;
    /**
    * 同步日期
    */
    private String syncDate;
    /**
    * 同步时间
    */
    private String syncTime;
    /**
    * 发布日期
    */
    private String publishDate;
    /**
    * 发布时间
    */
    private String publishTime;
    /**
    * 资讯ID
    */
    private String infoid;
    /**
    * 用户ID
    */
    private String userid;
    /**
    * 是否有用
    */
    private String useful;
    /**
    * 反馈信息
    */
    private String text;
    /**
    * 反馈日期
    */
    private String feedbackDate;
    /**
    * 反馈时间
    */
    private String feedbackTime;
    /**
    * 资讯ID
    */
    private String infoid;
    /**
    * 0度证券内码
    */
    private String parentStkid;
    /**
    * 证券内码
    */
    private String stkid;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 市场代码
    */
    private String market;
    /**
    * 0度关系
    */
    private String relationship;
    /**
    * 资讯ID
    */
    private String infoid;
    /**
    * 证券内码
    */
    private String stkid;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 交易所代码
    */
    private String market;
    /**
    * 环境类型
    */
    private String envType;
    /**
    * 参数KEY
    */
    private String paramKey;
    /**
    * 参数VALUE
    */
    private String paramValue;
    /**
    * 功能号
    */
    private String funcid;
    /**
    * 功能号级别
    */
    private String funclevel;
    /**
    * 业务日期
    */
    private String busidate;
    /**
    * 物理日期
    */
    private String phydate;
    /**
    * 收集时间
    */
    private String phytime;
    /**
    * BP节点号
    */
    private String bpnodeid;
    /**
    * 功能号
    */
    private String funcid;
    /**
    * 调用次数
    */
    private String calltimes;
    /**
    * 最大耗时
    */
    private String maxcost;
    /**
    * 平均耗时
    */
    private String avgcost;
    /**
    * 接口ID
    */
    private String interfaceId;
    /**
    * 接口路径
    */
    private String interfacePath;
    /**
    * 接口名称
    */
    private String interfaceName;
    /**
    * 系统ID
    */
    private String systemId;
    /**
    * 系统组ID
    */
    private String systemGid;
    /**
    * 包体类型
    */
    private String contentType;
    /**
    * 请求方法
    */
    private String method;
    /**
    * 超时时间
    */
    private String timeout;
    /**
    * 回调网关
    */
    private String targetMsgtype;
    /**
    * 附加uri参数
    */
    private String extUriParam;
    /**
    * 附加请求体参数
    */
    private String extBodyParam;
    /**
    * 是否链路检查接口
    */
    private String isLinkCheck;
    /**
    * 是否启用
    */
    private String isOpen;
    /**
    * 请求别名
    */
    private String interfaceAlias;
    /**
    * 系统ID
    */
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
    /**
    * 系统ID
    */
    private String systemId;
    /**
    * 系统组ID
    */
    private String systemGid;
    /**
    * 监控日期
    */
    private String lastMonitorDate;
    /**
    * 监控时间
    */
    private String lastMonitorTime;
    /**
    * 链路状态
    */
    private String lastLinkStatus;
    /**
    * 外部系统日期
    */
    private String systemBusidate;
    /**
    * 备注
    */
    private String remark;
    /**
    * 业务日期
    */
    private String logDate;
    /**
    * 日志流水号
    */
    private String logSno;
    /**
    * 系统ID
    */
    private String systemId;
    /**
    * 系统组ID
    */
    private String systemGid;
    /**
    * 监控日期
    */
    private String lastMonitorDate;
    /**
    * 监控时间
    */
    private String lastMonitorTime;
    /**
    * 链路状态
    */
    private String lastLinkStatus;
    /**
    * 外部系统日期
    */
    private String systemBusidate;
    /**
    * 备注
    */
    private String remark;
    /**
    * 委托方向
    */
    private String bsflag;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券类别
    */
    private String stktype;
    /**
    * 交易类型
    */
    private String trdid;
    /**
    * 证券级别
    */
    private String stklevel;
    /**
    * 证券板块
    */
    private String stkblock;
    /**
    * 资产类别
    */
    private String fundkind;
    /**
    * 报错信息
    */
    private String errmsg;
    /**
    * 外部系统ID
    */
    private String systemId;
    /**
    * 系统名称
    */
    private String systemName;
    /**
    * 应用ID
    */
    private String appId;
    /**
    * 应用秘钥
    */
    private String appKey;
    /**
    * 鉴权超时时间
    */
    private String authTimeout;
    /**
    * 是否开启鉴权
    */
    private String authFlag;
    /**
    * 来源标识
    */
    private String appType;
    /**
    * 应答类型
    */
    private String ansType;
    /**
    * 状态
    */
    private String status;
    /**
    * 外部系统ID
    */
    private String systemId;
    /**
    * 接口ID
    */
    private String interfaceId;
    /**
    * 流量控制标志
    */
    private String flowLimit;
    /**
    * 授权状态
    */
    private String status;
    /**
    * 接口ID
    */
    private String interfaceId;
    /**
    * 接口路径
    */
    private String interfacePath;
    /**
    * 接口名称
    */
    private String interfaceName;
    /**
    * 功能号
    */
    private String funcid;
    /**
    * 请求方法
    */
    private String method;
    /**
    * 附加uri参数
    */
    private String extUriParam;
    /**
    * 附加请求体参数
    */
    private String extBodyParam;
    /**
    * 状态
    */
    private String status;
    /**
    * 所属机构
    */
    private String orgid;
    /**
    * 费用类型
    */
    private String feeid;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 市场
    */
    private String market;
    /**
    * ETF代码
    */
    private String etfcode0;
    /**
    * 股票买卖费率
    */
    private BigDecimal feeSxf;
    /**
    * 股票买卖最低费用
    */
    private BigDecimal feeSxfMin;
    /**
    * 股票买印花税率
    */
    private BigDecimal feeYhs;
    /**
    * ETF申赎费率
    */
    private BigDecimal feeEtf;
    /**
    * ETF申赎最小费用
    */
    private BigDecimal feeEtfMin;
    /**
    * 基金买卖费率
    */
    private BigDecimal feeFund;
    /**
    * 基金买卖最小费用
    */
    private BigDecimal feeFundMin;
    /**
    * 成份股过户费
    */
    private BigDecimal feeGhf;
    /**
    * 其他费用
    */
    private BigDecimal feeOther;
    /**
    * 备注
    */
    private String remark;
    /**
    * 所属机构
    */
    private String orgid;
    /**
    * 菜单ID
    */
    private String menuid;
    /**
    * bp节点号
    */
    private String bpnode;
    /**
    * 内存服务组号
    */
    private String srvgroup;
    /**
    * 服务类别
    */
    private String servertypes;
    /**
    * 服务运行数
    */
    private String serverscount;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 市场
    */
    private String market;
    /**
    * 交易方式
    */
    private String tradingtype;
    /**
    * 价格档位
    */
    private BigDecimal priceunit;
    /**
    * 涨停价
    */
    private BigDecimal maxriseprice;
    /**
    * 跌停价
    */
    private BigDecimal maxdownprice;
    /**
    * 买数量上限
    */
    private BigDecimal maxbuyqty;
    /**
    * 卖数量上限
    */
    private BigDecimal maxsaleqty;
    /**
    * 买数量下限
    */
    private BigDecimal minbuyqty;
    /**
    * 卖数量下限
    */
    private BigDecimal minsaleqty;
    /**
    * 买数量单位
    */
    private BigDecimal buyunit;
    /**
    * 卖数量单位
    */
    private BigDecimal saleunit;
    /**
    * 更新日期
    */
    private String updatedate;
    /**
    * 币种
    */
    private String currType;
    /**
    * 计算类型
    */
    private String calcType;
    /**
    * 汇率类型
    */
    private String rateType;
    /**
    * 计算汇率
    */
    private BigDecimal calcRate;
    /**
    * 更新日期
    */
    private String updatedate;
    /**
    * 更新时间
    */
    private String updatetime;
    /**
    * 详细事件类型
    */
    private String subeventtype;
    /**
    * 事件大类
    */
    private String eventtype;
    /**
    * 事件业务大类
    */
    private String busitype;
    /**
    * 事件业务小类
    */
    private String subbusitype;
    /**
    * 证券分类
    */
    private String category;
    /**
    * 是否生成事件
    */
    private String isMakeEvent;
    /**
    * 是否提前提醒
    */
    private String isRemind;
    /**
    * 交易菜单编号
    */
    private String gotoMenuid;
    /**
    * 是否有效
    */
    private String isValid;
    /**
    * 事件ID
    */
    private BigDecimal eventid;
    /**
    * 事件父ID
    */
    private BigDecimal parentid;
    /**
    * 事件索引
    */
    private String indexid;
    /**
    * 用户ID
    */
    private String userid;
    /**
    * 资产单元列表
    */
    private String projectids;
    /**
    * 所属机构
    */
    private String orgid;
    /**
    * 事件标题
    */
    private String title;
    /**
    * 详细事件类型
    */
    private String subeventtype;
    /**
    * 事件来源
    */
    private String source;
    /**
    * 提醒模式
    */
    private String notifyMode;
    /**
    * 是否开启声音提醒
    */
    private String voice;
    /**
    * 是否全天事件
    */
    private String allday;
    /**
    * 是否系列事件
    */
    private String series;
    /**
    * 摘要
    */
    private String abstract;
    /**
    * 事件开始日期
    */
    private String begindate;
    /**
    * 事件开始时间
    */
    private String begintime;
    /**
    * 事件结束日期
    */
    private String enddate;
    /**
    * 事件结束时间
    */
    private String endtime;
    /**
    * 重复结束日期
    */
    private String recurEnddate;
    /**
    * 重复模式
    */
    private String rule;
    /**
    * 消息生成日期
    */
    private String msgCreatedate;
    /**
    * 消息生成时间
    */
    private String msgCreatetime;
    /**
    * 消息生成状态
    */
    private String msgCreatestat;
    /**
    * 事件录入日期
    */
    private String createdate;
    /**
    * 事件录入时间
    */
    private String createtime;
    /**
    * 事件更新日期
    */
    private String upddate;
    /**
    * 事件更新时间
    */
    private String updtime;
    /**
    * 事件过期日期
    */
    private String expiredate;
    /**
    * 事件状态
    */
    private String stat;
    /**
    * 消息标题
    */
    private String msgtitle;
    /**
    * 关联基金消息唯一标识
    */
    private String investfundMsgserialno;
    /**
    * 事件ID
    */
    private BigDecimal eventid;
    /**
    * 详细信息
    */
    private String detail;
    /**
    * 存储类型
    */
    private String storetype;
    /**
    * 事件过期日期
    */
    private String expiredate;
    /**
    * 消息ID
    */
    private BigDecimal msgid;
    /**
    * 事件ID
    */
    private BigDecimal eventid;
    /**
    * 事件父ID
    */
    private BigDecimal parentid;
    /**
    * 用户ID
    */
    private String userid;
    /**
    * 资产单元列表
    */
    private String projectids;
    /**
    * 所属机构
    */
    private String orgid;
    /**
    * 事件标题
    */
    private String title;
    /**
    * 详细事件类型
    */
    private String subeventtype;
    /**
    * 事件来源
    */
    private String source;
    /**
    * 提醒模式
    */
    private String notifyMode;
    /**
    * 是否开启声音提醒
    */
    private String voice;
    /**
    * 是否全天事件
    */
    private String allday;
    /**
    * 是否今日必做
    */
    private String mustdo;
    /**
    * 摘要
    */
    private String abstract;
    /**
    * 消息通知日期
    */
    private String notifydate;
    /**
    * 消息通知时间
    */
    private String notifytime;
    /**
    * 消息生成日期
    */
    private String createdate;
    /**
    * 消息生成时间
    */
    private String createtime;
    /**
    * 消息更新日期
    */
    private String upddate;
    /**
    * 消息更新时间
    */
    private String updtime;
    /**
    * 消息状态
    */
    private String stat;
    /**
    * 关联基金消息唯一标识
    */
    private String investfundMsgserialno;
    /**
    * 消息ID
    */
    private BigDecimal msgid;
    /**
    * 详细信息
    */
    private String detail;
    /**
    * 存储类型
    */
    private String storetype;
    /**
    * 消息生成日期
    */
    private String createdate;
    /**
    * 用户ID
    */
    private String userid;
    /**
    * 详细事件类型
    */
    private String subeventtype;
    /**
    * 是否关注
    */
    private String attention;
    /**
    * 是否开启声音提醒
    */
    private String voice;
    /**
    * 提醒模式
    */
    private String notifyMode;
    /**
    * 更新日期
    */
    private String upddate;
    /**
    * 更新时间
    */
    private String updtime;
    /**
    * 消息ID
    */
    private BigDecimal msgid;
    /**
    * 事件ID
    */
    private BigDecimal eventid;
    /**
    * 用户ID
    */
    private String userid;
    /**
    * 提醒日期
    */
    private String notifydate;
    /**
    * 提醒时间
    */
    private String notifytime;
    /**
    * 站点地址
    */
    private String netaddr;
    /**
    * 会话id
    */
    private String sessionid;
    /**
    * 终端流水号
    */
    private String msgNo;
    /**
    * 流水日期
    */
    private String busidate;
    /**
    * 流水时间
    */
    private String busitime;
    /**
    * 详细事件类型
    */
    private String subeventtype;
    /**
    * 事件来源
    */
    private String source;
    /**
    * 操作日期
    */
    private String busidate;
    /**
    * 操作员
    */
    private String operid;
    /**
    * 操作时间
    */
    private String opertime;
    /**
    * 执行通过标志
    */
    private String passFlag;
    /**
    * 备注信息
    */
    private String remark;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券内码
    */
    private String stkid;
    /**
    * 银行间代码
    */
    private String bankstkcode;
    /**
    * 证券简称
    */
    private String simplename;
    /**
    * 扩位证券简称
    */
    private String extsimplename;
    /**
    * 上市日期
    */
    private String marketdate;
    /**
    * 面值
    */
    private BigDecimal ticketprice;
    /**
    * 发行价格
    */
    private BigDecimal issueprice;
    /**
    * 票面利率
    */
    private BigDecimal ticketrate;
    /**
    * 起息日
    */
    private String begindate;
    /**
    * 到期日
    */
    private String enddate;
    /**
    * 付息频率
    */
    private String payinterval;
    /**
    * 期限
    */
    private BigDecimal existlimit;
    /**
    * 期限单位
    */
    private String limitunit;
    /**
    * 证券全称
    */
    private String fullname;
    /**
    * 债券类型
    */
    private String bondtype;
    /**
    * 利率类型
    */
    private String ratetype;
    /**
    * 发行方式
    */
    private String issuetype;
    /**
    * 发行人
    */
    private String issuer;
    /**
    * 发行人类型
    */
    private String issuertype;
    /**
    * 主体评级
    */
    private String mainrating;
    /**
    * 债项评级
    */
    private String facilityrating;
    /**
    * 评级机构
    */
    private String ratingorg;
    /**
    * 是否本所上市公司
    */
    private String isthismarket;
    /**
    * 发行量
    */
    private BigDecimal circulation;
    /**
    * 特殊债券类型
    */
    private String specbondtype;
    /**
    * 结构化分档
    */
    private String structgrading;
    /**
    * 资产支持专项计划名称
    */
    private String absname;
    /**
    * 交易方式
    */
    private String tradetype;
    /**
    * 结算方式
    */
    private String settletype;
    /**
    * 价格方式
    */
    private String pricetype;
    /**
    * 投资者适当性要求
    */
    private String appropriateness;
    /**
    * 特殊转让板
    */
    private String spectrans;
    /**
    * 是否基准做市品种
    */
    private String isbasemarkettype;
    /**
    * 摘牌日
    */
    private String delistdate;
    /**
    * 含权类型
    */
    private String rightypes;
    /**
    * 回售选择权
    */
    private String putright;
    /**
    * 赎回选择权
    */
    private String redeemright;
    /**
    * 主承销商
    */
    private String underwriter;
    /**
    * 发行起始日
    */
    private String beginissuedate;
    /**
    * 发行终止日
    */
    private String endissuedate;
    /**
    * 出库起始日
    */
    private String outimpawndate;
    /**
    * 入库起始日
    */
    private String inimpawndate;
    /**
    * 标准券折算率
    */
    private BigDecimal exchrate;
    /**
    * ISIN代码
    */
    private String isincode;
    /**
    * 回售起始日
    */
    private String putbegindate;
    /**
    * 回售终止日
    */
    private String putenddate;
    /**
    * 回售资金发放日
    */
    private String putassetdate;
    /**
    * 回售可撤销起始日
    */
    private String putcancelbegdate;
    /**
    * 回售可撤销结束日
    */
    private String putcancelenddate;
    /**
    * 是否转售
    */
    private String istransput;
    /**
    * 转股类型
    */
    private String transstktype;
    /**
    * A股证券代码(转股)
    */
    private String transstkcode;
    /**
    * A股证券简称(转股)
    */
    private String transstkname;
    /**
    * 转股价格
    */
    private BigDecimal transprice;
    /**
    * 转股起始日
    */
    private String transstkbegdate;
    /**
    * 转股终止日
    */
    private String transstkenddate;
    /**
    * A股证券代码(换股)
    */
    private String exchangestkcode;
    /**
    * A股证券简称(换股)
    */
    private String exchangestkname;
    /**
    * 换股价格
    */
    private BigDecimal exchangeprice;
    /**
    * 换股起始日
    */
    private String exchangebegdate;
    /**
    * 换股结束日
    */
    private String exchangeenddate;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 无条件回售期
    */
    private String mandPutPd;
    /**
    * 无条件回售价
    */
    private BigDecimal mandPutPric;
    /**
    * 无条件回售开始日期
    */
    private String mandPutStartDt;
    /**
    * 无条件回售结束日期
    */
    private String mandPutEndDt;
    /**
    * 无条件回售文字条款
    */
    private String mandPutText;
    /**
    * 有条件回售起始日期
    */
    private String condPutStartDt;
    /**
    * 有条件回售结束日期
    */
    private String condPutEndDt;
    /**
    * 有条件赎回起始日期
    */
    private String condRedpStartDt;
    /**
    * 有条件赎回结束日期
    */
    private String condRedpEndDt;
    /**
    * 到期赎回价
    */
    private BigDecimal redpTermPric;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 回售公告日
    */
    private String putAnnDt;
    /**
    * 回售行使开始日
    */
    private String putStartDt;
    /**
    * 回售行使截止日
    */
    private String putEndDt;
    /**
    * 回售资金到帐日
    */
    private String fndArivlDt;
    /**
    * 每百元面值回售价格(元)
    */
    private BigDecimal repoPric;
    /**
    * 回售履行结果公告日
    */
    private String putExecDt;
    /**
    * 回售总面额(亿元)
    */
    private BigDecimal putAmt;
    /**
    * 回售代码
    */
    private String putCd;
    /**
    * 回售日
    */
    private String putDt;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 业务类型代码
    */
    private String typeCd;
    /**
    * 质押券名称
    */
    private String plgName;
    /**
    * 是否有效
    */
    private String vldFlag;
    /**
    * 备注
    */
    private String remark;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 法人投资者ID
    */
    private String ivstrId;
    /**
    * 法人投资者类型
    */
    private String ivstrType;
    /**
    * 法人投资者
    */
    private String ivstrName;
    /**
    * 获配数量(万股/万张)
    */
    private BigDecimal placShr;
    /**
    * 冻结期限(月)
    */
    private String lockMth;
    /**
    * 实际申购数量
    */
    private BigDecimal actlOrdShr;
    /**
    * 公告日期
    */
    private String annDt;
    /**
    * 配售截止日期
    */
    private String endDt;
    /**
    * 退款或补缴金额
    */
    private BigDecimal refndPaybkAmt;
    /**
    * 股份类型
    */
    private String shrType;
    /**
    * 可流通日期
    */
    private String trdbDt;
    /**
    * 最新持股数量
    */
    private BigDecimal lastHoldShr;
    /**
    * 最新持股数量(配套融资)
    */
    private BigDecimal lastHoldShrFin;
    /**
    * 投资者类型代码
    */
    private String ivstrTypeCd;
    /**
    * 公布获配公司名称
    */
    private String annIvstrName;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 公告日期
    */
    private String annDt;
    /**
    * 转股申报代码
    */
    private String covtCd;
    /**
    * 转股简称
    */
    private String covtAbbr;
    /**
    * 转股价格
    */
    private BigDecimal covtPric;
    /**
    * 关联证券编码
    */
    private String relaSecuId;
    /**
    * 关联证券交易代码
    */
    private String relaScrCd;
    /**
    * 自愿转换期起始日
    */
    private String covtStartDt;
    /**
    * 自愿转换期截止日
    */
    private String covtEndDt;
    /**
    * 可转债停止交易日
    */
    private String lastTrdDt;
    /**
    * 强制转换日
    */
    private String frcCovtDt;
    /**
    * 强制转换价格
    */
    private BigDecimal frcCovtPric;
    /**
    * 是否强制转股
    */
    private String frcFlag;
    /**
    * 强制转换原因
    */
    private String frcCovtRsn;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 债权债务登记日期
    */
    private String debtRtDebtRegDt;
    /**
    * 本次计息周期开始日期
    */
    private String thimIrPrdBgnDt;
    /**
    * 本次计息周期截止日期
    */
    private String thimIrPrdEndDt;
    /**
    * 付息起始日期
    */
    private String intaBgnDt;
    /**
    * 付息截止日期
    */
    private String intaEndDt;
    /**
    * 付息兑付方式
    */
    private String intaCashMode;
    /**
    * 兑付登记日期
    */
    private String cashRegDt;
    /**
    * 兑付起始日期
    */
    private String cashBgnDt;
    /**
    * 兑付截止日期
    */
    private String cashEndDt;
    /**
    * 兑付清算日期
    */
    private String cashClrDt;
    /**
    * 除权除息日期
    */
    private String exRtDt;
    /**
    * 每百元应付利息税前(元)
    */
    private BigDecimal ohyPayIntBtax;
    /**
    * 每百元应付利息税后(元)
    */
    private BigDecimal ohyPayIntAftTax;
    /**
    * 每百元兑付本金(元)
    */
    private BigDecimal ohyCashPrinp;
    /**
    * 每百元兑付本息和(元)
    */
    private BigDecimal ohyCashPrinpInt;
    /**
    * 每百元提前兑付/赎回净价
    */
    private BigDecimal ohyIaCaseNetprice;
    /**
    * 本次兑付本金
    */
    private BigDecimal thimCashPrinp;
    /**
    * 本次支付利息
    */
    private BigDecimal thimPayInt;
    /**
    * 兑付本息和
    */
    private BigDecimal cashPrinpInt;
    /**
    * 本次还本比例%
    */
    private BigDecimal thimBackPrincRati;
    /**
    * 本次还本金额(亿元)
    */
    private String thimBackPrincAmt;
    /**
    * 本次付息和
    */
    private BigDecimal thimIntpAnd;
    /**
    * 本次兑付本金和
    */
    private BigDecimal thimCashPrinpAnd;
    /**
    * 兑付总额(元)
    */
    private BigDecimal cashGamt;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 债券名称
    */
    private String fullName;
    /**
    * 债券简称
    */
    private String abbrName;
    /**
    * 简称拼音
    */
    private String abbrPinyin;
    /**
    * 上市公告日
    */
    private String listAnnDate;
    /**
    * 上市日期
    */
    private String listDate;
    /**
    * 退市日期
    */
    private String delist;
    /**
    * 上网发行截止日期
    */
    private String netIssEndDate;
    /**
    * 上网发行起始日期
    */
    private String netIssBeginDate;
    /**
    * 上网发行数量(亿元)
    */
    private BigDecimal netIssAmount;
    /**
    * 上网发行认购代码
    */
    private String netIssScrpCd;
    /**
    * 付息频率
    */
    private String payIntrFreq;
    /**
    * 债券期限(年)
    */
    private String bondTermYear;
    /**
    * 兑付登记起始日
    */
    private String cashRegBeginDate;
    /**
    * 兑付日
    */
    private String cashDate;
    /**
    * 利率说明
    */
    private String irIntro;
    /**
    * 利差(%)
    */
    private BigDecimal irSpread;
    /**
    * 附息利率品种
    */
    private String irType;
    /**
    * 到期日
    */
    private String dueDate;
    /**
    * 参考收益率
    */
    private BigDecimal refYield;
    /**
    * 发行起始日
    */
    private String issBeginDate;
    /**
    * 发行截止日
    */
    private String issEndDate;
    /**
    * 发行票面利率(%)
    */
    private BigDecimal issCoupRate;
    /**
    * 发行公告日
    */
    private String issAnnDate;
    /**
    * 发行方式
    */
    private String issMethod;
    /**
    * 发行人名称
    */
    private String issrName;
    /**
    * 发行人编号
    */
    private String issrNo;
    /**
    * 发行人类型
    */
    private String issrType;
    /**
    * 发行对象
    */
    private String issObj;
    /**
    * 发行金额上限
    */
    private BigDecimal issAmtUl;
    /**
    * 发行时债券评级
    */
    private String issBondRate;
    /**
    * 发行价格
    */
    private BigDecimal issPric;
    /**
    * 实际发行总量(亿元)
    */
    private BigDecimal actlIssAmts;
    /**
    * 计划发行总量(亿元)
    */
    private BigDecimal planIssAmts;
    /**
    * 面值
    */
    private BigDecimal parVal;
    /**
    * 最新面值
    */
    private BigDecimal lastParVal;
    /**
    * 计息截止日
    */
    private String intaEndDate;
    /**
    * 计息起始日
    */
    private String intaBeginDate;
    /**
    * 计息方式
    */
    private String intaMethod;
    /**
    * 计息基准
    */
    private String intaBasic;
    /**
    * 原债券代码
    */
    private String formerBondCd;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 评级对象名称
    */
    private String objName;
    /**
    * 公告日期
    */
    private String annDate;
    /**
    * 评级日期
    */
    private String ratDate;
    /**
    * 评级机构代码
    */
    private String ratOrgCd;
    /**
    * 评级机构名称
    */
    private String ratOrgName;
    /**
    * 信用评级
    */
    private String credRat;
    /**
    * 评级说明
    */
    private String ratIntro;
    /**
    * 前次信用评级
    */
    private String prevCredRat;
    /**
    * 评级到期日
    */
    private String ratingVldEndDate;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 赎回日
    */
    private String redpDt;
    /**
    * 每百元面值赎回价格(元)
    */
    private BigDecimal redpPric;
    /**
    * 赎回公告日
    */
    private String redpAnnDt;
    /**
    * 赎回履行结果公告日
    */
    private String execRsltAnnDt;
    /**
    * 赎回总面额(亿元)
    */
    private BigDecimal redpTotVol;
    /**
    * 赎回日(公布)
    */
    private String pubRedpDt;
    /**
    * 赎回原因
    */
    private String redpRsn;
    /**
    * 赎回资金到账日
    */
    private String redpAcctDt;
    /**
    * 赎回登记日
    */
    private String redpRegDt;
    /**
    * 每百元面值赎回净价
    */
    private BigDecimal redpNetPric;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 违约发生日
    */
    private String defltDate;
    /**
    * 债券名称
    */
    private String abbrName;
    /**
    * 公告日
    */
    private String annDate;
    /**
    * 违约类型
    */
    private String defltType;
    /**
    * 违约原因
    */
    private String defltRsn;
    /**
    * 违约日债券余额(元)
    */
    private BigDecimal defltDateBondBal;
    /**
    * 违约发生日百元应兑付本金(元)
    */
    private BigDecimal defltDatePayablecapital;
    /**
    * 违约发生日百元应兑付利息(元)
    */
    private BigDecimal defltDatePayableinterest;
    /**
    * 违约发生日百元应兑付本息(元)
    */
    private BigDecimal defltDatePayableCapInt;
    /**
    * 违约发生日实际百元兑付本金(元)
    */
    private BigDecimal defltDatePaymentcapital;
    /**
    * 违约发生日实际百元兑付利息(元)
    */
    private BigDecimal defltDatePaymentinterest;
    /**
    * 违约发生日实际百元兑付本息(元)
    */
    private BigDecimal defltDatePaymentCapInt;
    /**
    * 违约日债券余额(日终)(元)
    */
    private BigDecimal defltDateBondBal1;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 保荐机构
    */
    private String guarAgySht;
    /**
    * 保荐机构简称
    */
    private String guarAgyShtAbb;
    /**
    * 公告日期
    */
    private String annDate;
    /**
    * 上市公告日
    */
    private String listNtcDate;
    /**
    * 上市日期
    */
    private String listDate;
    /**
    * 初始转股价格
    */
    private BigDecimal initTranPric;
    /**
    * 初始转股价溢价比例(%)
    */
    private BigDecimal initTranPricPreRati;
    /**
    * 发行公告日
    */
    private String issNtcDate;
    /**
    * 发行结果公告日
    */
    private String issRlstNtcDate;
    /**
    * 老股东配售日期
    */
    private String oshPrioPlacDate;
    /**
    * 老股东配售股权登记日
    */
    private String oshPrioPlacEquiRegDate;
    /**
    * 老股东配售缴款日
    */
    private String oshPrioPlacPayDate;
    /**
    * 老股东配售代码
    */
    private String oshPrioPlacCd;
    /**
    * 老股东配售简称
    */
    private String oshPrioPlacAbbr;
    /**
    * 老股东配售价格
    */
    private BigDecimal oshPrioPlacPric;
    /**
    * 老股东配售比例分母
    */
    private BigDecimal oshPrioPlacRatiDen;
    /**
    * 老股东配售比例分子
    */
    private BigDecimal oshPrioPlacRatiMole;
    /**
    * 上网发行日期
    */
    private String onleIssDate;
    /**
    * 上网发行申购代码
    */
    private String onleIssPurchCd;
    /**
    * 上网发行申购名称
    */
    private String onleIssPurchName;
    /**
    * 上网发行申购价格
    */
    private BigDecimal onleIssPurchPric;
    /**
    * 上网发行数量(不含优先配售)(张)
    */
    private BigDecimal onleIssNum;
    /**
    * 转股公司ID
    */
    private String tranCorpId;
    /**
    * 发行规模(万元)
    */
    private BigDecimal issScal;
    /**
    * 发行数量(万张)
    */
    private BigDecimal issNum;
    /**
    * 证券ID
    */
    private String scrId;
    /**
    * 网下最小申购数量(机构)
    */
    private BigDecimal ofleMinPurchNum;
    /**
    * 网下定金比例(机构)
    */
    private BigDecimal ofleDepRati;
    /**
    * 网下最大申购数量(机构)
    */
    private BigDecimal ofleMaxPurchNum;
    /**
    * 网上最小申购数量(公众)(元)
    */
    private BigDecimal onleMinPurchNum;
    /**
    * 网上最大申购数量(公众)(万元)
    */
    private BigDecimal onleMaxPurchNum;
    /**
    * 债券期限
    */
    private String bondTerm;
    /**
    * 利率类型
    */
    private String irType;
    /**
    * 利率
    */
    private BigDecimal ir;
    /**
    * 付息频率
    */
    private String intPayFreq;
    /**
    * 利率说明
    */
    private String irIntro;
    /**
    * 备注
    */
    private String remark;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 可分配收益基准日
    */
    private String divdBasiDate;
    /**
    * 每股派息(元)
    */
    private BigDecimal cashDvdPerShr;
    /**
    * 权益登记日
    */
    private String equiRegDate;
    /**
    * 除息日
    */
    private String exDvdDate;
    /**
    * 除息日(场外)
    */
    private String exDvdDateOtc;
    /**
    * 派息日
    */
    private String payDivdDate;
    /**
    * 派息日(场外)
    */
    private String payDivdDateOtc;
    /**
    * 分红实施公告日
    */
    private String implNtcDate;
    /**
    * 份额基准年度
    */
    private String shrBasiY;
    /**
    * 基准基金份额(万份)
    */
    private BigDecimal basiShr;
    /**
    * 可分配收益(元)
    */
    private BigDecimal asgnablePrft;
    /**
    * 净值除权日
    */
    private String netvalExRighDate;
    /**
    * 收益分配金额(元)
    */
    private BigDecimal prftAmts;
    /**
    * 红利再投资到账日
    */
    private String reinvOnacctDate;
    /**
    * 公告日期
    */
    private String annDate;
    /**
    * 收益支付日
    */
    private String prftPayDate;
    /**
    * 基准日基金份额净值
    */
    private BigDecimal basiDateUnitnav;
    /**
    * 红利到帐日
    */
    private String dvdToAcctDate;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 配股价格(元)
    */
    private BigDecimal allotPric;
    /**
    * 配股比例
    */
    private BigDecimal allotRati;
    /**
    * 配股计划数量(万股)
    */
    private BigDecimal allotAmt;
    /**
    * 配股实际数量(万股)
    */
    private BigDecimal allotAmtAct;
    /**
    * 募集资金(元)
    */
    private BigDecimal allotCollFnd;
    /**
    * 股权登记日
    */
    private String allotRegDate;
    /**
    * 除权日
    */
    private String exAllotDate;
    /**
    * 配股上市日
    */
    private String listDate;
    /**
    * 缴款起始日
    */
    private String pymtBegnDate;
    /**
    * 缴款终止日
    */
    private String pymtEndDate;
    /**
    * 配股实施公告日
    */
    private String implAnnDate;
    /**
    * 配股结果公告日
    */
    private String rsltAnnDate;
    /**
    * 上市公告日
    */
    private String listAnnDate;
    /**
    * 配售代码
    */
    private String placCd;
    /**
    * 配股简称
    */
    private String allotScrAbbr;
    /**
    * 预计募集资金(元)
    */
    private BigDecimal expeCollFnd;
    /**
    * 数据日期
    */
    private String busidate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 发行价格(元)
    */
    private BigDecimal issPrice;
    /**
    * 发行市盈率(发行前股本)
    */
    private BigDecimal issBefPer;
    /**
    * 发行市盈率(发行后股本)
    */
    private BigDecimal issAftPer;
    /**
    * 公开及老股发行数量合计(万股)
    */
    private BigDecimal issAmt;
    /**
    * 网上发行数量(万股)
    */
    private BigDecimal onlneIssCnt;
    /**
    * 网下发行数量(万股)
    */
    private BigDecimal ofleIssAmount;
    /**
    * 募集资金(万元)
    */
    private BigDecimal collFnd;
    /**
    * 网上发行中签率(%)
    */
    private BigDecimal onleIssAlloRati;
    /**
    * 网上申购代码
    */
    private String onlePurchCd;
    /**
    * 申购日
    */
    private String purchDate;
    /**
    * 预计上市日期
    */
    private String planListDate;
    /**
    * 申购资金验资日
    */
    private String purchFndVerDate;
    /**
    * 中签率公布日
    */
    private String alloPubDate;
    /**
    * 网上中签结果公告日
    */
    private String onlneAlloPubDate;
    /**
    * 上市日
    */
    private String listDate;
    /**
    * 发行公告日
    */
    private String issPubDate;
    /**
    * 上市公告日
    */
    private String listPubDate;
    /**
    * 网下配售发行公告日
    */
    private String oflePlacIssPubDate;
    /**
    * 网下申购起始日期
    */
    private String oflePursBgnDate;
    /**
    * 网下申购截止日期
    */
    private String oflePurchEndDate;
    /**
    * 网下申购资金到帐截止日
    */
    private String oflePurchFndEndDate;
    /**
    * 网下验资日
    */
    private String ofleVerDate;
    /**
    * 预计募集资金(万元)
    */
    private BigDecimal planCollFnd;
    /**
    * 申购上限(机构)
    */
    private BigDecimal purchMax;
    /**
    * 申购金额上限(机构)
    */
    private BigDecimal purchAmtMax;
    /**
    * 网上发行简称
    */
    private String onlneIssAbbr;
    /**
    * 网上申购上限(个人)（股）
    */
    private BigDecimal onlnePurchMax;
    /**
    * 网下申购上限（万股）
    */
    private BigDecimal oflePurchMax;
    /**
    * 网下申购下限（万股）
    */
    private BigDecimal oflePurchMin;
    /**
    * 新股发行数量
    */
    private BigDecimal newStkIssCnt;
    /**
    * 最新公告日期
    */
    private String newPubDate;
    /**
    * 网上申购缴款日
    */
    private String onlePurchPayDate;
    /**
    * 网下发行数量
    */
    private BigDecimal ofleIssNum;
    /**
    * 挂牌日
    */
    private String listedDate;
    /**
    * 市场
    */
    private String market;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 证券名称
    */
    private String stkname;
    /**
    * 基金状态
    */
    private String ofcodestatus;
    /**
    * 申购最小单位
    */
    private BigDecimal appunit;
    /**
    * 认购/申购的单位
    */
    private BigDecimal subunit;
    /**
    * 赎回最小单位
    */
    private BigDecimal redemptionunit;
    /**
    * 赎回资金到账间隔日期
    */
    private BigDecimal redemptiondate;
    /**
    * 个人追加认购份数
    */
    private BigDecimal indiappsubsvol;
    /**
    * 个人追加认购金额
    */
    private BigDecimal indiappsubsamount;
    /**
    * 个人最低申购金额
    */
    private BigDecimal minsubsvolbyindi;
    /**
    * 个人最低认购金额
    */
    private BigDecimal minsubsamountbyindi;
    /**
    * 法人追加认购份数
    */
    private BigDecimal instappsubsvol;
    /**
    * 法人追加认购金额
    */
    private BigDecimal instappsubsamnt;
    /**
    * 法人最低认购金额
    */
    private BigDecimal minamountbyinst;
    /**
    * 法人最低认购份数
    */
    private BigDecimal minvolbyinst;
    /**
    * 基金认购开始日期
    */
    private BigDecimal ipostartdate;
    /**
    * 基金认购结束日期
    */
    private BigDecimal ipoenddate;
    /**
    * 最高赎回份额
    */
    private BigDecimal maxredemptionvol;
    /**
    * 最低赎回份额
    */
    private BigDecimal minredemptionvol;
    /**
    * 最低持有份额
    */
    private BigDecimal minaccountbalance;
    /**
    * 分红延期天数
    */
    private BigDecimal drawdelaydate;
    /**
    * 担保交收标识
    */
    private String unassureflag;
    /**
    * 首次最低认购金额
    */
    private BigDecimal minfsubbalance;
    /**
    * 修改日期
    */
    private BigDecimal modifydate;
    /**
    * 定位串
    */
    private String positionstr;
    /**
    * 基金名称
    */
    private String fundname;
    /**
    * 协议签署标志
    */
    private String constractflag;
    /**
    * 协议控制串
    */
    private String constractctrlstr;
    /**
    * 证券名称(长)
    */
    private String stocknamelong;
    /**
    * 个人客户维护费比例
    */
    private BigDecimal indimaintenanrate;
    /**
    * 非个人客户维护费比例
    */
    private BigDecimal organmaintenanrate;
    /**
    * 基金产品全称
    */
    private String offullfundname;
    /**
    * 基金管理人全称
    */
    private String offundmanagername;
    /**
    * 基金管理人网站
    */
    private String offundwebaddress;
    /**
    * 法人最高申购金额
    */
    private BigDecimal maxinstsubsvolbyindi;
    /**
    * 评估公司代码
    */
    private String agencyno;
    /**
    * 评估公司名称
    */
    private String agencyname;
    /**
    * 拼音代码
    */
    private String chscode;
    /**
    * 外部代码
    */
    private String outkey;
    /**
    * 更新日期
    */
    private String updatedate;
    /**
    * 机构id
    */
    private String orgid;
    /**
    * 事件类型
    */
    private String busitype;
    /**
    * 导出时间
    */
    private String busitime;
    /**
    * 导出状态
    */
    private String status;
    /**
    * 备注
    */
    private String remark;
    /**
    * 公司代码
    */
    private String sInfoCompcode;
    /**
    * 评级类型
    */
    private String bRateStyle;
    /**
    * 评级机构代码
    */
    private String bInfoCreditratingagency;
    /**
    * 公司名称
    */
    private String sInfoCompname;
    /**
    * 评级日期
    */
    private String annDt;
    /**
    * 公告日期
    */
    private String annDt2;
    /**
    * 信用评级
    */
    private String bInfoCreditrating;
    /**
    * 前次信用评级
    */
    private String bInfoPrecreditrating;
    /**
    * 评级变动方向
    */
    private String bCreditratingChange;
    /**
    * 更新日期
    */
    private String updatedate;
    /**
    * 证券代码
    */
    private String stkcode;
    /**
    * 市场
    */
    private String market;
    /**
    * 评级类型
    */
    private String bRateStyle;
    /**
    * 评级机构代码
    */
    private String bInfoCreditratingagency;
    /**
    * 证券内码
    */
    private String stkid;
    /**
    * 评级日期
    */
    private String annDt;
    /**
    * 公告日期
    */
    private String annDt2;
    /**
    * 交易所代码
    */
    private String exchmarket;
    /**
    * 统一证券代码
    */
    private String sInfoWindcode;
    /**
    * 证券名称
    */
    private String stkname;
    /**
    * 信用评级
    */
    private String bInfoCreditrating;
    /**
    * 前次信用评级
    */
    private String bInfoPrecreditrating;
    /**
    * 评级变动方向
    */
    private String bCreditratingChange;
    /**
    * 公司代码
    */
    private String sInfoCompcode;
    /**
    * 更新日期
    */
    private String updatedate;
    /**
    * 证券代码
    */
    private String stockCode;
    /**
    * 市场类型
    */
    private String exchangeType;
    /**
    * 风险证券级别
    */
    private String stockLevel;
    /**
    * 证券名称
    */
    private String stockName;
    /**
    * 同步日期
    */
    private String syncDate;
    /**
    * 同步时间
    */
    private String syncTime;
    /**
    * 机构id
    */
    private String orgid;
    /**
    * 导出状态
    */
    private String status;
    /**
    * 导出路径
    */
    private String path;
    /**
    * 上传用户名
    */
    private String appid;
    /**
    * 上传密码
    */
    private String appkey;
    /**
    * 更新日期
    */
    private String busidate;
    /**
    * 更新时间
    */
    private String busitime;
    /**
    * 产品代码
    */
    private String stkcode;
    /**
    * 客户编号
    */
    private String custid;
    /**
    * 数据来源
    */
    private String datasource;
    /**
    * 状态
    */
    private String status;
    /**
    * 更新日期
    */
    private String busidate;
    /**
    * 更新时间
    */
    private String busitime;


}
