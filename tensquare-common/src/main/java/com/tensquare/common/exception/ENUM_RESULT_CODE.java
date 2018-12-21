package com.tensquare.common.exception;

/**
 * 结果编码
 */
public enum ENUM_RESULT_CODE {

    EXCEPTION("50001","系统异常"),
    ERROR("500002","发生错误"),
    SUCCESS("0","成功"),
    FAIL("1","失败");

    private String code;
    private String value;

    ENUM_RESULT_CODE(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
