package com.tensquare.common.exception;
/**
 * 自定义业务异常类
 */

import lombok.Data;

@Data
public class BusinessException extends Exception{

    public String code;

    public String msg;

    public Object data;

    public BusinessException(String message, String code, String msg, Object data) {
        super(message);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BusinessException(String message, Throwable cause, String code, String msg, Object data) {
        super(message, cause);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BusinessException(String message, Throwable cause, String code, String msg) {
        super(message, cause);
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(String message, String code, String msg) {
        super(message);
        this.code = code;
        this.msg = msg;
    }
}
