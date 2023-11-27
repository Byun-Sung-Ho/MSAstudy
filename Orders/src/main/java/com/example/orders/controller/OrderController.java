package com.example.orders.controller;

import com.example.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-service")
public class OrderController {
    OrderService orderService;
    Environment env;

    @Autowired
    public OrderController(OrderService orderService, Environment env) {
        this.orderService = orderService;
        this.env = env;
    }


}
