package com.three.cms.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: zlt
 * @date: 2019-09-27 16:43
 */
@Getter
@AllArgsConstructor
public class BaseResponse<T> {

    private int code;

    private String msg;

    private T data;

    private String subCode;

    private String subMsg;


}
