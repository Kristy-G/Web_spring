package com.spring.rest.service;

import com.spring.rest.dao.EmployeeDAO;
import com.spring.rest.entity.EmployeeEntity;
import com.spring.rest.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<EmployeeEntity> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(EmployeeEntity employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public EmployeeEntity getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
