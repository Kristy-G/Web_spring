package com.spring.rest.entity;

import javax.persistence.*;

@Table(name = "organizations")
@Entity
public class OrganizationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organization_id", nullable = false)
    private Integer id;

    @Column(name = "director")
    private String director;

    @Column(name = "legal_adress")
    private String legalAdress;

    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "physical_adress")
    private String physicalAdress;

    public OrganizationEntity() {}

    public OrganizationEntity(String director, String legalAdress, String organizationName, String physicalAdress) {
        this.director = director;
        this.legalAdress = legalAdress;
        this.organizationName = organizationName;
        this.physicalAdress = physicalAdress;
    }

    public String getPhysicalAdress() {
        return physicalAdress;
    }

    public void setPhysicalAdress(String physicalAdress) {
        this.physicalAdress = physicalAdress;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getLegalAdress() {
        return legalAdress;
    }

    public void setLegalAdress(String legalAdress) {
        this.legalAdress = legalAdress;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}