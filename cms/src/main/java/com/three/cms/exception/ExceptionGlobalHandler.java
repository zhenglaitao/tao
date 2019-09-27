package com.three.cms.exception;

import com.three.cms.common.ApiResult;
import com.three.cms.common.BaseResponse;
import com.three.cms.test.common.OrderNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: zlt
 * @date: 2019-09-27 17:10
 */
@RestControllerAdvice
@Slf4j
public class ExceptionGlobalHandler {

    @ExceptionHandler(value= OrderNotFoundException.class)
    public BaseResponse handlerOrderNotFoundException(OrderNotFoundException e){
        log.error(e.getMessage(), e);
        return ApiResult.fail(e.getResponseEnum().getSubCode(), e.getMessage());
    }



    @ExceptionHandler(value= Exception.class)
    public BaseResponse handlerCommonException(Exception e){
        log.error(e.getMessage(), e);
        return ApiResult.fail("500", "系统错误");
    }
}
