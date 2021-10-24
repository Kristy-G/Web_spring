package com.spring.rest.dao;

import com.spring.rest.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<EmployeeEntity> allEmployees = session.createQuery("from EmployeeEntity", EmployeeEntity.class).getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(EmployeeEntity employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public EmployeeEntity getEmployee(int id) {
        Session session =sessionFactory.getCurrentSession();
        EmployeeEntity employee = session.get(EmployeeEntity.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<EmployeeEntity> query = session.createQuery("delete from EmployeeEntity where id =:EmpId");
        query.setParameter("EmpId", id);
        query.executeUpdate();
    }
}
