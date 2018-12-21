package com.tensquare.common.base;

import com.tensquare.common.entity.BaseResult;
import com.tensquare.common.entity.CommonResult;

public class BaseController {

    public BaseResult responseSuccessResponse(CommonResult commonResult) {
        return BaseResult.ok(commonResult);
    }

    public BaseResult responseFailResponse(CommonResult commonResult) {
        return BaseResult.error(commonResult);
    }

    public BaseResult responseResult(Object... obj) {
        if(obj != null && obj.length > 0) {
            return BaseResult.ok(obj[0]);
        } else {
            return BaseResult.ok();
        }
    }


}
