package com.example.orders.service;

import com.example.orders.dto.OrderDto;
import com.example.orders.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetail);
    OrderDto getOrderByOrderID(String orderId);
    Iterable<OrderEntity> getOrdersByUserID(String userId);
}
