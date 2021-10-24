package com.spring.rest.entity;

import javax.persistence.*;

@Table(name = "subdivisions")
@Entity
public class SubdivisionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subdivision_id", nullable = false)
    private Integer id;

    @Column(name = "contact_details")
    private String contactDetails;

    @Column(name = "manager")
    private String manager;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private OrganizationEntity organization;

    @Column(name = "subdivision_name")
    private String subdivisionName;

    public SubdivisionEntity() {}

    public SubdivisionEntity(String contactDetails, String manager, OrganizationEntity organization, String subdivisionName) {
        this.contactDetails = contactDetails;
        this.manager = manager;
        this.organization = organization;
        this.subdivisionName = subdivisionName;
    }

    public String getSubdivisionName() {
        return subdivisionName;
    }

    public void setSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
    }

    public OrganizationEntity getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationEntity organization) {
        this.organization = organization;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}