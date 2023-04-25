package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author shenghui
 * @version 1.0
 * @since 2020/8/24 16:54
 */
public interface LoadBalancer {

    /**
     * 自定义轮循负载均衡
     *
     * @param serviceInstanceList 服务器实例列表
     * @return 选中服务器实例
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);
}
