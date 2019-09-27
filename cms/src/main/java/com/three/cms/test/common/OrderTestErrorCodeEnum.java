package com.three.cms.test.common;

import com.three.cms.common.RespCodeBaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 按照模块来划分,取特定数字开头,4位数字
 * 订单都以4开头
 * @author zlt
 * @date
 */
@Getter
@AllArgsConstructor
public enum OrderTestErrorCodeEnum implements RespCodeBaseEnum {

    ORDER_NOT_FOUND(40001, "未找到订单")

    ;

    private int subCode;

    private String subMsg;
}
