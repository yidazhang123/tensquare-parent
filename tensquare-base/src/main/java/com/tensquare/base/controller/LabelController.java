package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import com.tensquare.common.base.BaseController;
import com.tensquare.common.entity.BaseResult;
import com.tensquare.common.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/label")
public class LabelController extends BaseController{

    @Autowired
    private LabelService labelService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseResult getLabelById(@PathVariable("id") String id) {
        try {
            CommonResult content = labelService.getLabelById(id);
            return this.responseSuccessResponse(content);
        } catch (Exception e) {
            return this.responseFailResponse(null);
        }
    }

    @RequestMapping(value = "/getLabelByCondition")
    public BaseResult getLabelByCondition(@RequestBody Label label) {
        try {
            CommonResult content = labelService.getLabelList(label);
            return this.responseSuccessResponse(content);
        } catch (Exception e) {
            return this.responseFailResponse(null);
        }
    }
}
