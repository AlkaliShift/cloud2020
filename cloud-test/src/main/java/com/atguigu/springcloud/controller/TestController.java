package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shenghui
 * @version 1.0
 * @since 2020/9/2 10:27
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/testAsync")
    public boolean testAsync(){
        testService.async();
        return true;
    }
}
