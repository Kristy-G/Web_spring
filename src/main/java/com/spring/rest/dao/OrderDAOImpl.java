package com.spring.rest.dao;

import com.spring.rest.entity.OrderEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<OrderEntity> getAllOrders() {
        Session session = sessionFactory.getCurrentSession();
        List<OrderEntity> allOrders = session.createQuery("from OrderEntity",  OrderEntity.class).getResultList();
        return allOrders;
    }

    @Override
    public void saveOrder(OrderEntity order) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(order);
    }

    @Override
    public OrderEntity getOrder(int id) {
        Session session = sessionFactory.getCurrentSession();
        OrderEntity order = session.get(OrderEntity.class, id);
        return order;
    }

    @Override
    public void deleteOrder(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<OrderEntity> query = session.createQuery("delete from OrderEntity where id =:OrdId");
        query.setParameter("OrdId", id);
        query.executeUpdate();
    }
}
