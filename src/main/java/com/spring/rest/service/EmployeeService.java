package com.spring.rest.service;

import com.spring.rest.entity.EmployeeEntity;
import com.spring.rest.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    public List<EmployeeEntity> getAllEmployees();
    public void saveEmployee(EmployeeEntity employee);
    public EmployeeEntity getEmployee(int id);
    public void deleteEmployee(int id);
}
