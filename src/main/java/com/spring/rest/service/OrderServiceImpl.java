package com.spring.rest.service;

import com.spring.rest.dao.OrderDAO;
import com.spring.rest.entity.OrderEntity;
import com.spring.rest.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDAO orderDAO;

    @Override
    @Transactional
    public List<OrderEntity> getAllOrders() {
        return orderDAO.getAllOrders();
    }

    @Override
    @Transactional
    public void saveOrder(OrderEntity order) {
        orderDAO.saveOrder(order);
    }

    @Override
    @Transactional
    public OrderEntity getOrder(int id) {
        return orderDAO.getOrder(id);
    }

    @Override
    @Transactional
    public void deleteOrder(int id) {
        orderDAO.deleteOrder(id);
    }
}
