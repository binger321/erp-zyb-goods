package com.binger.goods.controller.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 人员
 */
@ApiModel("人员列表query")
@Data
public class PersonQuery {
    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

    /**
     * 工号
     */
    @ApiModelProperty(value="工号",required = true)
    private String personCode;

    /**
     * 姓名
     */
    @ApiModelProperty(value="姓名",required = true)
    private String personName;

    /**
     * 证件类型
     */
    @ApiModelProperty(value="证件类型",required = false)
    private String idType;

    /**
     * 证件号码
     */
    @ApiModelProperty(value="证件号码",required = false)
    private String idCardNo;

    /**
     * 性别,0女,1男
     */
    @ApiModelProperty(value="性别,0女,1男",required = false)
    private Boolean sex;

    /**
     * 联系电话
     */
    @ApiModelProperty(value="联系电话",required = false)
    private String phone;

    /**
     * 人员类型(常量字典编码)
     */
    @ApiModelProperty(value="人员类型(常量字典编码)",required = false)
    private String category;

    /**
     * 0离职, 1在职
     */
    @ApiModelProperty(value="0离职, 1在职",required = false)
    private Integer status;

}
