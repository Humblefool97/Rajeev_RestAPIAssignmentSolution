package com.example.employeemanagement.controller;

import com.example.employeemanagement.entity.User;
import com.example.employeemanagement.service.UserCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping
public class UserCreateController {
    @Autowired
    UserCreateService userCreateService;

    @PostMapping("/addUser")
    User addUser(
            @RequestBody  User user) {
        if(user.getUsername() == null || user.getPassword() == null ||user.getUsername().isBlank() || user.getPassword().isBlank()){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,"Username or password cannot be empty!"
            );
        }

        if(user.getRoles().isEmpty())
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,"Roles cannot be null or empty!"
            );

        try {
            userCreateService.addUser(user);
        } catch (Exception e) {
            return null;
        }
        return user;
    }
}
