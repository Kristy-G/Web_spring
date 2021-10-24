package com.spring.rest.dao;

import com.spring.rest.entity.OrganizationEntity;

import java.util.List;

public interface OrganizationDAO {
    public List<OrganizationEntity> getAllOrganization();

    public void saveOrganization(OrganizationEntity organization);

    public OrganizationEntity getOrganization(int id);

    public void deleteOrganization(int id);
}
