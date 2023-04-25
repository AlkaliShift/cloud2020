package com.atguigu.springcloud.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author shenghui
 * @version 1.0
 * @since 2020/9/2 10:27
 */
@Service
public class TestService {

    @Async(value = "TestThreadAsync")
    public void async() {
        System.out.println("Method 1 start!");
        // ((TestService) AopContext.currentProxy()).secondAsync();
        secondAsync();
        System.out.println("Method 1 stop!");
    }

    public void secondAsync() {
        System.out.println("Method 2 start!\t" + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 stop!\t" + Thread.currentThread().getName());
    }
}
