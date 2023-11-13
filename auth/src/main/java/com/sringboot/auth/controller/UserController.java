package com.sringboot.auth.controller;

import com.sringboot.auth.model.User;
import com.sringboot.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user){
       return userService.registerNewUser(user);
    }
}
