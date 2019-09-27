package com.three.cms.exception;

import com.three.cms.common.RespCodeBaseEnum;
import lombok.Getter;

/**
 * 异常基础类,所有异常都应继承此类
 * @author: zlt
 * @date: 2019-09-27 16:28
 */
public class AppException extends RuntimeException{

    /**
     * 返回码
     */
    @Getter
    private RespCodeBaseEnum responseEnum;

    public AppException(RespCodeBaseEnum responseEnum) {
        super(responseEnum.getSubMsg());
        this.responseEnum = responseEnum;
    }

    public AppException(RespCodeBaseEnum responseEnum, String message) {
        super(message);
        this.responseEnum = responseEnum;
    }

    public AppException(RespCodeBaseEnum responseEnum, String message, Throwable cause) {
        super(message, cause);
        this.responseEnum = responseEnum;
    }
}
