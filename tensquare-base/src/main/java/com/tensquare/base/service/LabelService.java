package com.tensquare.base.service;

import com.tensquare.base.pojo.Label;
import com.tensquare.common.entity.CommonResult;


public interface LabelService {

    /**
     * 添加
     * @param label
     * @throws Exception
     */
    public void addLabel(Label label) throws Exception;

    /**
     * 更新
     * @param label
     * @throws Exception
     */
    public void updateLabel(Label label) throws Exception;

    /**
     * 删除
     * @param id
     * @throws Exception
     */
    public void deleteLabel(String id) throws Exception;

    /**
     * 根据ID查询
     * @param id
     * @return
     * @throws Exception
     */
    public CommonResult getLabelById(String id) throws Exception;

    /**
     * 多条件查询
     * @param label
     * @return
     * @throws Exception
     */
    public CommonResult getLabelList(Label label) throws Exception;

}
