package com.spring.rest.service;

import com.spring.rest.dao.OrganizationDAO;
import com.spring.rest.entity.OrganizationEntity;
import com.spring.rest.entity.OrganizationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService{

    @Autowired
    private OrganizationDAO organizationDAO;

    @Override
    @Transactional
    public List<OrganizationEntity> getAllOrganizations() {
        return organizationDAO.getAllOrganization();
    }

    @Override
    @Transactional
    public void saveOrganization(OrganizationEntity organization) {
        organizationDAO.saveOrganization(organization);
    }

    @Override
    @Transactional
    public OrganizationEntity getOrganization(int id) {
        return organizationDAO.getOrganization(id);
    }

    @Override
    @Transactional
    public void deleteOrganization(int id) {
        organizationDAO.deleteOrganization(id);
    }
}
