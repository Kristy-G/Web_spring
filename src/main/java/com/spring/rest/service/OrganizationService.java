package com.spring.rest.service;

import com.spring.rest.entity.OrganizationEntity;
import com.spring.rest.entity.OrganizationEntity;

import java.util.List;

public interface OrganizationService {
    public List<OrganizationEntity> getAllOrganizations();
    public void saveOrganization(OrganizationEntity organization);
    public OrganizationEntity getOrganization(int id);
    public void deleteOrganization(int id);
}
