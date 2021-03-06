package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/10
 * Time: 下午7:51
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("销售主表vo")
@Data
public class SaleOrderMainVo {
    /**
     * 订单ID,自增
     */
    @ApiModelProperty(value="订单ID,自增",required = true)
    private Integer id;

    /**
     * 销售订单编码
     */
    @ApiModelProperty(value="销售订单编码",required = false)
    private String orderSaleCode;

    /**
     * 订单编号,原始订单编号，多个用/分割。当是合并订单时进行拆分处理
     */
    @ApiModelProperty(value="订单编号,原始订单编号，多个用/分割。当是合并订单时进行拆分处理",required = false)
    private String orderCode;

    /**
     * 下单日期,取最早时间
     */
    @ApiModelProperty(value="下单日期,取最早时间",required = false)
    private Date orderTime;

    /**
     * 付款日期,合并订单取最早时间
     */
    @ApiModelProperty(value="付款日期,合并订单取最早时间",required = false)
    private Date payTime;

    /**
     * 汇率
     */
    @ApiModelProperty(value="汇率",required = false)
    private BigDecimal exchangeRate;


    /**
     * 店铺ID
     */
    @ApiModelProperty(value="店铺ID",required = false)
    private String storeId;

    /**
     * 店铺名称
     */
    @ApiModelProperty(value="店铺",required = false)
    private String storeName;

    /**
     * 订单金额（本币）,合并订单要将数额加起来
     */
    @ApiModelProperty(value="订单金额（本币）,合并订单要将数额加起来",required = false)
    private BigDecimal orderLocMny;

    /**
     * 订单状态,0未付款 100已付款 200缺货 300等待派单 310已派单 400已转仓库 410未拣货 420已拣货未核单 430已核单未包装 500已揽收 900退货 910取消单 920退款 990其他异常
     */
    @ApiModelProperty(value="订单状态,0未付款 100已付款 200缺货 300等待派单 310已派单 400已转仓库 410未拣货 420已拣货未核单 430已核单未包装 500已揽收 900退货 910取消单 920退款 990其他异常",required = false)
    private Integer orderStatus;

    /**
     * 订单状态
     */
    @ApiModelProperty(value = "订单状态名称")
    private String orderStatusStr;

    /**
     * 标记发货状态，0未标记发货，1处理中，2标记成功，-1标记失败
     */
    @ApiModelProperty(value="标记发货状态，0未标记发货，1处理中，2标记成功，-1标记失败",required = false)
    private Integer shipMark;

    /**
     * 标记发货时间
     */
    @ApiModelProperty(value="标记发货时间",required = false)
    private Date shipMarkTime;

    /**
     * 标记次数
     */
    @ApiModelProperty(value="标记次数",required = true)
    private Integer shipMarkQty;

    /**
     * 派单日期
     */
    @ApiModelProperty(value="派单日期",required = false)
    private Date assignDate;

    /**
     * 收件人
     */
    @ApiModelProperty(value="收件人",required = false)
    private String customerName;

    /**
     * 平台买家名称(customer_name为收件人)
     */
    @ApiModelProperty(value="平台买家名称(customer_name为收件人)",required = false)
    private String buyerName;

    /**
     * 客户邮件
     */
    @ApiModelProperty(value="客户邮件",required = false)
    private String customerEmail;

    /**
     * 国家,不一致不允许合并
     */
    @ApiModelProperty(value="国家,不一致不允许合并",required = false)
    private String countryName;

    /**
     * 州或省,不一致不允许合并
     */
    @ApiModelProperty(value="州或省,不一致不允许合并",required = false)
    private String state;

    /**
     * 城市,不一致不允许合并
     */
    @ApiModelProperty(value="城市,不一致不允许合并",required = false)
    private String city;

    /**
     * 邮编,不一致不允许合并
     */
    @ApiModelProperty(value="邮编,不一致不允许合并",required = false)
    private String zipCode;

    /**
     * 邮寄地址1,不一致不允许合并
     */
    @ApiModelProperty(value="邮寄地址1,不一致不允许合并",required = false)
    private String address1;

    /**
     * 邮寄地址2,不一致不允许合并
     */
    @ApiModelProperty(value="邮寄地址2,不一致不允许合并",required = false)
    private String address2;

    /**
     * 邮寄地址3,不一致不允许合并
     */
    @ApiModelProperty(value="邮寄地址3,不一致不允许合并",required = false)
    private String address3;

    /**
     * 电话,不一致不允许合并
     */
    @ApiModelProperty(value="电话,不一致不允许合并",required = false)
    private String phoneNumber;

    /**
     * 物流公司名称
     */
    @ApiModelProperty(value="物流公司名称",required = false)
    private String logistCompanyName;

    /**
     * 仓库名称
     */
    @ApiModelProperty(value="仓库名称",required = false)
    private String warehouseName;

    /**
     * 物流跟踪号,只能是一个，多次发货拆分
     */
    @ApiModelProperty(value="物流跟踪号,只能是一个，多次发货拆分",required = false)
    private String trackNumber;

    /**
     * 获取物流跟踪号时间,用于自动标记策略
     */
    @ApiModelProperty(value="获取物流跟踪号时间,用于自动标记策略",required = false)
    private Date trackTime;

    /**
     * 包裹重量
     */
    @ApiModelProperty(value="包裹重量",required = false)
    private BigDecimal weight;

    /**
     * 未开票金额
     */
    @ApiModelProperty(value="未开票金额",required = false)
    private BigDecimal reinvoiceMny;

    /**
     * 店铺运输方式,不同的方式不允许合并
     */
    @ApiModelProperty(value="店铺运输方式,不同的方式不允许合并",required = false)
    private String shippingWay;

    /**
     * 运费
     */
    @ApiModelProperty(value="运费",required = false)
    private BigDecimal shippingFee;

    /**
     * 派单时间
     */
    @ApiModelProperty(value="派单时间",required = false)
    private Date assignTime;

    /**
     * 是否占用库存
     */
    @ApiModelProperty(value="是否占用库存",required = false)
    private Boolean isReserveStock;

    /**
     * 是否预占用库存
     */
    @ApiModelProperty(value="是否预占用库存",required = false)
    private Boolean isOccupy;

    /**
     * 备注1（基本信息）
     */
    @ApiModelProperty(value="备注1（基本信息）",required = false)
    private String remark1;

}
