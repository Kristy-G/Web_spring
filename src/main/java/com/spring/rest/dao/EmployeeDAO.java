package com.spring.rest.dao;

import com.spring.rest.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeDAO {
    public List<EmployeeEntity> getAllEmployees();

    public void saveEmployee(EmployeeEntity employee);

    public EmployeeEntity getEmployee(int id);

    public void deleteEmployee(int id);
}
