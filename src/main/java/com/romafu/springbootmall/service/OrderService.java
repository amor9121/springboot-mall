package com.romafu.springbootmall.service;

import com.romafu.springbootmall.dto.CreateOrderRequest;
import com.romafu.springbootmall.dto.OrderQueryParams;
import com.romafu.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
    Order getOrderById(Integer orderId);
}
