package com.spring.rest.dao;

import com.spring.rest.entity.SubdivisionEntity;

import java.util.List;

public interface SubdivisionDAO {
    public List<SubdivisionEntity> getAllSubdivisions();

    public void saveSubdivision(SubdivisionEntity subdivision);

    public SubdivisionEntity getSubdivision(int id);

    public void deleteSubdivision(int id);
}
