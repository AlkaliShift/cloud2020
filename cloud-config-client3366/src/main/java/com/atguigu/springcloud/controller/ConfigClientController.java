package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenghui
 * @version 1.0
 * @since 2021/3/16 15:11
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("{server.port")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return "serverPort: " + serverPort + "\t\n\n configInfo: " + configInfo;
    }
}
