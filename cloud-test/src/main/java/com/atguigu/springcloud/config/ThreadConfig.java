package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author shenghui
 * @version 1.0
 * @since 2020/9/2 10:22
 */
@Configuration
@EnableAsync(proxyTargetClass = true)
public class ThreadConfig {

    @Bean(name = "TestThreadAsync")
    public ThreadPoolTaskExecutor getAsyncExecutor2() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //配置核心线程数
        executor.setCorePoolSize(5);
        //配置最大线程数
        executor.setMaxPoolSize(10);
        //配置队列大小
        executor.setQueueCapacity(20);
        //活跃时间
        executor.setKeepAliveSeconds(60);
        //配置线程池中的线程的名称前缀
        executor.setThreadNamePrefix("LOC-SIF-");
        //饱和策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        executor.initialize();
        return executor;
    }
}
