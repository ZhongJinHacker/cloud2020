package com.grady.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gradyjiang
 * @title: GateWayConfig
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/22
 */
@Configuration
public class GateWayConfig {


    /**
     * 配置了一个id为route-name的路由规则
     * 当访问localhost:9527/guonei的时候，将会转发至https://news.baidu.com/guonei
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        // path_route_grady 是路由id
        // /guonei 是匹配断言
        // https://news.baidu.com/guonei 是转发的url
        return routes.route("path_route_grady", r -> r.path("/guonei").uri("https://news.baidu.com/guonei")).build();
    }
}
