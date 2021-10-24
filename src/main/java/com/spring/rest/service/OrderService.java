package com.spring.rest.service;

import com.spring.rest.entity.OrderEntity;
import com.spring.rest.entity.OrderEntity;

import java.util.List;

public interface OrderService {
    public List<OrderEntity> getAllOrders();
    public void saveOrder(OrderEntity order);
    public OrderEntity getOrder(int id);
    public void deleteOrder(int id);
}
