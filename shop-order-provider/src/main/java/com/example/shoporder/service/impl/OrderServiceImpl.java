package com.example.shoporder.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.shoporder.dao.mapper.OrderMapper;
import com.example.shoporder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Map<String, Object> makeOrder(String goods) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("msg", "success");
        result.put("data", orderMapper.makeOrder(goods));

        return result;
    }
}
