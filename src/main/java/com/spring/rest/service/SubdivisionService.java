package com.spring.rest.service;

import com.spring.rest.entity.SubdivisionEntity;
import com.spring.rest.entity.SubdivisionEntity;

import java.util.List;

public interface SubdivisionService {
    public List<SubdivisionEntity> getAllSubdivisions();
    public void saveSubdivision(SubdivisionEntity subdivision);
    public SubdivisionEntity getSubdivision(int id);
    public void deleteSubdivision(int id);
}
