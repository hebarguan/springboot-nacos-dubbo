package com.example.shoporder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.example.shoporder.annotation.EnableHuaihaiNacos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@EnableHuaihaiNacos(app = "shop-order-provider")
public class ShopOrderProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopOrderProviderApplication.class, args);
    }
}
