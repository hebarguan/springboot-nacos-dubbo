package com.example.shoporder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.example.shoporder.annotation.EnableHuaihaiNacos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@EnableHuaihaiNacos(app = "shop-order-api")
public class ShopOrderApiAppliaction {

    public static void main(String[] args) {
        SpringApplication.run(ShopOrderApiAppliaction.class, args);
    }
}
