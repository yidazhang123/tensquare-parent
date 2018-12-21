package com.tensquare.common.entity;

/**
 * 分页结果
 */
public class PageResult<T> {

    private long total;

    private T rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public T getRows() {
        return rows;
    }

    public void setRows(T rows) {
        this.rows = rows;
    }
}
