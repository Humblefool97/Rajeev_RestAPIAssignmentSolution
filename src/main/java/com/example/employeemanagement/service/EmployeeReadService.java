package com.example.employeemanagement.service;

import com.example.employeemanagement.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeReadService {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(long id);
}
