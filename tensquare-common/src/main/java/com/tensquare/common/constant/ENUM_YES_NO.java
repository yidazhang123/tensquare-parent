package com.tensquare.common.constant;

public enum ENUM_YES_NO {

    YES("1"),
    NO("0");

    private String code;

    ENUM_YES_NO(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
