package com.three.cms.test.common;

import com.three.cms.exception.AppException;

/**
 * 订单未找到异常
 * @author: zlt
 * @date: 2019-09-27 16:34
 */
public class OrderNotFoundException extends AppException {

    public OrderNotFoundException() {
        super(OrderTestErrorCodeEnum.ORDER_NOT_FOUND);
    }


}
