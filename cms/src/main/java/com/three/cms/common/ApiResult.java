package com.three.cms.common;

/**
 * 请求结果集处理
 * @author: zlt
 * @date: 2019-09-27 14:55
 */
public class ApiResult {

    private static final int SUCCESS_CODE = 1;

    private static final String SUCCESS_MSG = "请求成功";

    private static final int FAIL_CODE = 0;

    private static final String FAIL_MSG = "请求失败";

    public static BaseResponse success(){
        return new BaseResponse(SUCCESS_CODE,
                SUCCESS_MSG, null, null, null);
    }

    public static BaseResponse success(Object data){
        return new BaseResponse(SUCCESS_CODE,
                SUCCESS_MSG, data, null, null);
    }

    public static BaseResponse fail(RespCodeBaseEnum respCodeBaseEnum){
        return new BaseResponse(FAIL_CODE,
                FAIL_MSG, null, respCodeBaseEnum.getSubCode(), respCodeBaseEnum.getSubMsg());
    }

    public static BaseResponse fail(String subCode, String subMsg){
        return new BaseResponse(FAIL_CODE,
                FAIL_MSG, null, subCode, subMsg);
    }
}

