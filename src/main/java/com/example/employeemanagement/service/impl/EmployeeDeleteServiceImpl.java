package com.example.employeemanagement.service.impl;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import com.example.employeemanagement.service.EmployeeDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public String deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);
        return "Deleted employee with Id - "+id;
    }
}
