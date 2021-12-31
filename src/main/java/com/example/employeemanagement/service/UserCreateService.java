package com.example.employeemanagement.service;

import com.example.employeemanagement.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserCreateService {
    User addUser(User user);
}
