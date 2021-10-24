package com.spring.rest.dao;

import com.spring.rest.entity.OrderEntity;

import java.util.List;

public interface OrderDAO {
    public List<OrderEntity> getAllOrders();

    public void saveOrder(OrderEntity order);

    public OrderEntity getOrder(int id);

    public void deleteOrder(int id);
}
