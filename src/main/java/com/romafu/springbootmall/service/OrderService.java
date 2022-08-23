package com.romafu.springbootmall.service;

import com.romafu.springbootmall.dto.CreateOrderRequest;
import com.romafu.springbootmall.model.Order;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
