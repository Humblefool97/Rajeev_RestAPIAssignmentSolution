package com.example.employeemanagement.service;

import org.springframework.stereotype.Component;

@Component
public interface EmployeeDeleteService {
    String deleteEmployeeById(long id);
}
