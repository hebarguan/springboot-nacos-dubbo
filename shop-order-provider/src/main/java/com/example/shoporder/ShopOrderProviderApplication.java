package com.example.shoporder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@NacosPropertySource(dataId = "shop-order-provider", autoRefreshed = true)
public class ShopOrderProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopOrderProviderApplication.class, args);
    }
}
