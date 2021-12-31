package com.example.employeemanagement.service;

import com.example.employeemanagement.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeCreateService {
    Employee addEmployee(Employee employee);
}
