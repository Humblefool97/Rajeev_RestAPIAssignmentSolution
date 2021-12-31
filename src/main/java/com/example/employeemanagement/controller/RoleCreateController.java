package com.example.employeemanagement.controller;

import com.example.employeemanagement.entity.Role;
import com.example.employeemanagement.service.RoleCreateService;
import io.micrometer.core.lang.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RoleCreateController {

    @Autowired
    RoleCreateService roleCreateService;

    @PostMapping("/addRole")
    public @Nullable  Role addRole(
            @RequestBody Role role
    ){
        return roleCreateService.createRole(role);
    }
}
