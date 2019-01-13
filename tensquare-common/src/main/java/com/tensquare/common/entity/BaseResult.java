package com.tensquare.common.entity;

import com.tensquare.common.constant.ENUM_RESULT_CODE;
import lombok.Data;

/**
 * 基础响应结果
 */
@Data
public class BaseResult {

    private String code;

    private Boolean flag;

    private String message;

    private Object content;

    public BaseResult(String code, Boolean flag, String message) {
        this.code = code;
        this.flag = flag;
        this.message = message;
    }

    public BaseResult(String code, Boolean flag, String message, Object content) {
        this.code = code;
        this.flag = flag;
        this.message = message;
        this.content = content;
    }

    public static BaseResult ok() {
        return new BaseResult(ENUM_RESULT_CODE.SUCCESS.getCode(),true,ENUM_RESULT_CODE.SUCCESS.getValue());
    }

    public static BaseResult ok(Object content) {
        return new BaseResult(ENUM_RESULT_CODE.SUCCESS.getCode(),true,ENUM_RESULT_CODE.SUCCESS.getValue(),content);
    }

    public static BaseResult error() {
        return new BaseResult(ENUM_RESULT_CODE.FAIL.getCode(),false,ENUM_RESULT_CODE.FAIL.getValue());
    }

    public static BaseResult error(Object content) {
        return new BaseResult(ENUM_RESULT_CODE.FAIL.getCode(),false,ENUM_RESULT_CODE.FAIL.getValue(),content);
    }

}
