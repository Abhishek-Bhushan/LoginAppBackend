package com.assignment.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.login.model.User;
import com.assignment.login.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String checkLogin(@RequestBody User user)
    {
        return userService.checkLogin(user);
    }

    @PostMapping("/register")
    public boolean saveUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }
}
