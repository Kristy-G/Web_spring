package com.spring.rest.service;

import com.spring.rest.dao.SubdivisionDAO;
import com.spring.rest.entity.SubdivisionEntity;
import com.spring.rest.entity.SubdivisionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubdivisionServiceImpl implements SubdivisionService{

    @Autowired
    private SubdivisionDAO subdivisionDAO;

    @Override
    @Transactional
    public List<SubdivisionEntity> getAllSubdivisions() {
        return subdivisionDAO.getAllSubdivisions();
    }

    @Override
    @Transactional
    public void saveSubdivision(SubdivisionEntity subdivision) {
        subdivisionDAO.saveSubdivision(subdivision);
    }

    @Override
    @Transactional
    public SubdivisionEntity getSubdivision(int id) {
        return subdivisionDAO.getSubdivision(id);
    }

    @Override
    @Transactional
    public void deleteSubdivision(int id) {
        subdivisionDAO.deleteSubdivision(id);
    }
}
