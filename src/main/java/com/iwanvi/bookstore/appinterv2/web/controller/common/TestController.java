package com.iwanvi.bookstore.appinterv2.web.controller.common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试
 * @Author zzw
 * @Date 2019年3月10日15:25:06
 */
@Api(description = "首页")
@RestController
public class TestController {


    @ApiOperation(value = "异常测试", httpMethod = "GET")
    @ApiResponses({@ApiResponse(code = 600, message = "")})
    @GetMapping("/home/throwsException")
    public String throwsException(){
        int i = (2/0);
        return "succ";
    }

}

