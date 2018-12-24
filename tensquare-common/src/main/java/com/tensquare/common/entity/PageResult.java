package com.tensquare.common.entity;

import lombok.Data;

/**
 * 分页结果
 */
@Data
public class PageResult<T> {

    private long total;

    private T rows;

}
