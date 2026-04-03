package com.example.secure.secureApp.controller;

import com.example.secure.secureApp.model.user;
import com.example.secure.secureApp.service.registerService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class registerController {
    private registerService registerService;
//construtor autowired
    public registerController(registerService registerService) {
        this.registerService = registerService;
    }
    @PostMapping("register")
    public user registerUser(@RequestBody user user){
        registerService.addUser(user);
        return user;
    }
}
