package com.tensquare.common.entity;

import com.tensquare.common.exception.ENUM_RESULT_CODE;
import lombok.Data;

/**
 * 通用响应结果
 */
@Data
public class CommonResult<T> {

    private String code;

    private String message;

    private T data;

    public CommonResult() {
        super();
    }

    public CommonResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult error() {
        return new CommonResult(ENUM_RESULT_CODE.FAIL.getCode(), ENUM_RESULT_CODE.FAIL.getValue());
    }

    public CommonResult success() {
        return new CommonResult(ENUM_RESULT_CODE.SUCCESS.getCode(), ENUM_RESULT_CODE.SUCCESS.getValue());
    }

    public CommonResult error(String code, String message) {
        return new CommonResult(code, message);
    }

    public CommonResult success(T data) {
        return new CommonResult(ENUM_RESULT_CODE.SUCCESS.getCode(), ENUM_RESULT_CODE.SUCCESS.getValue(),data);
    }

    public boolean isSuccess() {
        return ENUM_RESULT_CODE.SUCCESS.getCode().equals(code);
    }

}
