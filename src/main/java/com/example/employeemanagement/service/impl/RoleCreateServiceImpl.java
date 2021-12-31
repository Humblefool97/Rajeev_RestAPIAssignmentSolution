package com.example.employeemanagement.service.impl;

import com.example.employeemanagement.entity.Role;
import com.example.employeemanagement.repository.RoleRepository;
import com.example.employeemanagement.service.RoleCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleCreateServiceImpl implements RoleCreateService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role createRole(Role role) {
        try {
            roleRepository.saveAndFlush(role);
        }catch (Exception e){
            return null;
        }
        return role;
    }
}
