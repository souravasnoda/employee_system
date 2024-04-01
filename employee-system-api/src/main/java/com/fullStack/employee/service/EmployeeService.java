package com.fullStack.employee.service;

import com.fullStack.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee updateEmployee(Long id, Employee employee);

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);
}
