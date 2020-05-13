package com.cfm.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zsw
 * @date 2020/5/13 16:13
 */
@Controller
@Api("跳转模块")
public class IndexController {

    @ApiOperation(value = "首页",
            httpMethod = "GET",
            protocols = "HTTP",
            notes = "跳转到首页")
    @RequestMapping(value = "users/{uid}",method = RequestMethod.GET)
    public String index(){
        return "/index";
    }

}
