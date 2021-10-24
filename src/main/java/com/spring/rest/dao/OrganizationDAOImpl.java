package com.spring.rest.dao;

import com.spring.rest.entity.OrganizationEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrganizationDAOImpl implements OrganizationDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<OrganizationEntity> getAllOrganization() {
        Session session = sessionFactory.getCurrentSession();
        Query<OrganizationEntity> query = session.createQuery("from OrganizationEntity", OrganizationEntity.class);
        List<OrganizationEntity> allOrganizations = query.getResultList();
        return allOrganizations;
    }

    @Override
    public void saveOrganization(OrganizationEntity organization) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(organization);
    }

    @Override
    public OrganizationEntity getOrganization(int id) {
        Session session = sessionFactory.getCurrentSession();
        OrganizationEntity organization = session.get(OrganizationEntity.class, id);
        return organization;
    }

    @Override
    public void deleteOrganization(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<OrganizationEntity> query = session.createQuery("delete from OrganizationEntity where id =:EmpId");
        query.setParameter("EmpId", id);
        query.executeUpdate();
    }
}
