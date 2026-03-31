package com.example.secure.secureApp.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class secureController {
    @GetMapping("/home")
    public String show(HttpServletRequest servletRequest){
        return "hello"+ servletRequest.getSession().getId();
    }
    @GetMapping("/about")
    public String go(HttpServletRequest servletRequest){

        return "hello"+ servletRequest.getSession().getId();
    }
}
