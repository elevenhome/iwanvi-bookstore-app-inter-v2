
package com.iwanvi.bookstore.appinterv2.web.common;

import com.iwanvi.bookstore.appinterv2.common.BaseResponse;
import com.iwanvi.bookstore.sc.common.ResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@Description: 异常统一处理
 *@author zzw
 *@date 2018年9月3日16:25:37
 */
@ControllerAdvice  
@ResponseBody
public class ControllerExceptionHandler {
	protected final transient Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 *@Description: 添加全局异常处理流程，根据需要设置需要处理的异常
	 *@return Object
	 *@author zzw
	 *@date 2018年9月3日16:32:58
	 */
    @ExceptionHandler(value=Exception.class)  
    public Object myHandler(final Exception ex) {
    	logger.error("系统异常={}",ex);
        return new BaseResponse(ResultEnum.FAIL, "系统繁忙,请稍后再试哟");
    }

}
