package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author shenghui
 * @version 1.0
 * @since 2020/8/24 10:53
 */
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class TestMain extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(TestMain.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TestMain.class);
    }
}
