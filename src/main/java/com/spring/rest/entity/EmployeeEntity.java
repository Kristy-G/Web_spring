package com.spring.rest.entity;

import javax.persistence.*;

@Table(name = "employees")
@Entity
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "\"position\"")
    private String position;

    @Column(name = "second_name")
    private String secondName;

    @ManyToOne
    @JoinColumn(name = "subdivision_id")
    private SubdivisionEntity subdivision;

    @Column(name = "surname")
    private String surname;

    public EmployeeEntity() {}

    public EmployeeEntity(String name, String position, String secondName, SubdivisionEntity subdivision, String surname) {
        this.name = name;
        this.position = position;
        this.secondName = secondName;
        this.subdivision = subdivision;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public SubdivisionEntity getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(SubdivisionEntity subdivision) {
        this.subdivision = subdivision;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}