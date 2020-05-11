package com.example.shoporder.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.shoporder.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class OrderController {

    @Reference
    private OrderService orderService;

    @Value("${testValue}")
    private String testValue;

    @RequestMapping(value = "/order/make.do")
    public Map<String, Object> makeOder(@RequestParam String name) {

        System.out.println(orderService);
        return orderService.makeOrder(name);
    }

    @RequestMapping("/order/test")
    public String test(@RequestParam String name)
    {
        return testValue;
    }
}
