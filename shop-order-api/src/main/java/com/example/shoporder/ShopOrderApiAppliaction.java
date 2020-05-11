package com.example.shoporder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@NacosPropertySource(dataId = "shop-order-api", autoRefreshed = true)
public class ShopOrderApiAppliaction {

    public static void main(String[] args) {
        SpringApplication.run(ShopOrderApiAppliaction.class, args);
    }
}
