package com.example.employeemanagement.service;

import com.example.employeemanagement.entity.Role;
import org.springframework.stereotype.Component;

@Component
public interface RoleCreateService {
    Role createRole(Role role);
}
