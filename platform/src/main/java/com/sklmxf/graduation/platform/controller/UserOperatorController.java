package com.sklmxf.graduation.platform.controller;

import com.sklmxf.graduation.platform.entity.User;
import com.sklmxf.graduation.platform.server.UserOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserOperatorController {

    @Autowired
    private UserOperatorService userOperatorService;

    @GetMapping(value = "/getUserInfo")
    public User getUserInfo(@RequestParam(value = "email",required = true) String email){
        User user  = userOperatorService.getUserInfo(email);
        return user == null?new User():user;
    }
    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user){
        User result = userOperatorService.addUser(user);
        return user == null?new User():user;
    }
}
