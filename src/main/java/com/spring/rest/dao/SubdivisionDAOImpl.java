package com.spring.rest.dao;

import com.spring.rest.entity.SubdivisionEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubdivisionDAOImpl implements SubdivisionDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<SubdivisionEntity> getAllSubdivisions() {
        Session session = sessionFactory.getCurrentSession();
        List<SubdivisionEntity> allSubdivisions = session.createQuery("from SubdivisionEntity", SubdivisionEntity.class).getResultList();
        return allSubdivisions;
    }

    @Override
    public void saveSubdivision(SubdivisionEntity subdivision) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(subdivision);
    }

    @Override
    public SubdivisionEntity getSubdivision(int id) {
        Session session = sessionFactory.getCurrentSession();
        SubdivisionEntity subdivision = session.get(SubdivisionEntity.class, id);
        return subdivision;
    }

    @Override
    public void deleteSubdivision(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<SubdivisionEntity> query = session.createQuery("delete from SubdivisionEntity where id =:SubId");
        query.setParameter("SubId", id);
        query.executeUpdate();
    }
}
