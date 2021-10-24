package com.spring.rest.controller;

import com.spring.rest.entity.EmployeeEntity;
import com.spring.rest.entity.OrderEntity;
import com.spring.rest.entity.OrganizationEntity;
import com.spring.rest.entity.SubdivisionEntity;
import com.spring.rest.service.EmployeeService;
import com.spring.rest.service.OrderService;
import com.spring.rest.service.OrganizationService;
import com.spring.rest.service.SubdivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @Autowired
    private OrganizationService organizationService;
    @Autowired
    private SubdivisionService subdivisionService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private OrderService orderService;

    @GetMapping("/organizations")
    public List<OrganizationEntity> showAllOrganizations() {
        List<OrganizationEntity> allOrganizations = organizationService.getAllOrganizations();
        return allOrganizations;
    }

    @GetMapping("/subdivisions")
    public List<SubdivisionEntity> showAllSubdivisions() {
        List<SubdivisionEntity> allSubdivisions = subdivisionService.getAllSubdivisions();
        return allSubdivisions;
    }

    @GetMapping("/employees")
    public List<EmployeeEntity> showAllEmployees() {
        List<EmployeeEntity> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/orders")
    public List<OrderEntity> showAllOrders() {
        List<OrderEntity> allOrders = orderService.getAllOrders();
        return allOrders;
    }

    @GetMapping("/organizations/{id}")
    public OrganizationEntity getOrganization(@PathVariable int id) {
        OrganizationEntity organization = organizationService.getOrganization(id);
        return organization;
    }

    @GetMapping("/subdivisions/{id}")
    public SubdivisionEntity getSubdivision(@PathVariable int id) {
        SubdivisionEntity subdivision = subdivisionService.getSubdivision(id);
        return subdivision;
    }

    @GetMapping("/employees/{id}")
    public EmployeeEntity getEmployee(@PathVariable int id) {
        EmployeeEntity employee = employeeService.getEmployee(id);
        return employee;
    }

    @GetMapping("/orders/{id}")
    public OrderEntity getOrder(@PathVariable int id) {
        OrderEntity order = orderService.getOrder(id);
        return order;
    }

    @PostMapping("/organizations")
    public OrganizationEntity addOrganization(@RequestBody OrganizationEntity organization) {
        organizationService.saveOrganization(organization);
        return organization;
    }

    @PostMapping("/subdivisions")
    public SubdivisionEntity addSubdivision(@RequestBody SubdivisionEntity subdivision) {
        subdivisionService.saveSubdivision(subdivision);
        return subdivision;
    }

    @PostMapping("/employees")
    public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PostMapping("/orders")
    public OrderEntity addOrder(@RequestBody OrderEntity order) {
        orderService.saveOrder(order);
        return order;
    }

    @PutMapping("/organizations")
    public OrganizationEntity updateOrganization(@RequestBody OrganizationEntity organization) {
        organizationService.saveOrganization(organization);
        return organization;
    }

    @PutMapping("/subdivisions")
    public SubdivisionEntity updateSubdivision(@RequestBody SubdivisionEntity subdivision) {
        subdivisionService.saveSubdivision(subdivision);
        return subdivision;
    }

    @PutMapping("/employees")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/orders")
    public OrderEntity updateOrder(@RequestBody OrderEntity order) {
        orderService.saveOrder(order);
        return order;
    }

    @DeleteMapping("/organizations/{id}")
    public void deleteOrganization(@PathVariable int id) {
        organizationService.deleteOrganization(id);
    }

    @DeleteMapping("/subdivisions/{id}")
    public void deleteSubdivision(@PathVariable int id) {
        subdivisionService.deleteSubdivision(id);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable int id) {
        orderService.deleteOrder(id);
    }
}
