package com.example.employeemanagement.controller;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.service.EmployeeCreateService;
import com.example.employeemanagement.service.EmployeeDeleteService;
import com.example.employeemanagement.service.EmployeeReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeCreateService employeeCreateService;

    @Autowired
    EmployeeReadService employeeReadService;

    @Autowired
    EmployeeDeleteService employeeDeleteService;

    @PostMapping("/addEmployee")
    Employee addEmployee(@RequestBody Employee employee) {
        return employeeCreateService.addEmployee(employee);
    }

    @GetMapping("/all")
    List<Employee> getAllEmployees() {
        return employeeReadService.getAllEmployees();
    }

    @GetMapping("/{id}")
    Employee getEmployeeById(
            @PathVariable Long id
    ) {
        return employeeReadService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    String deleteEmployeeById(
            @PathVariable Long id
    ) {
        return employeeDeleteService.deleteEmployeeById(id);
    }
}
