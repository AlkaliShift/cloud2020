package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shenghui
 * @version 1.0
 * @since 2020/9/3 14:23
 */
@Configuration
public class GatewayConfig {

    /**
     * 配置一个id为path_route_atguigu的路由规则
     * 当访问地址http://localhost:9527/guonei时会自动转发到地址 http://news.baidu.com/guonei
     *
     * @param routeLocatorBuilder 路由定位创建器
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
