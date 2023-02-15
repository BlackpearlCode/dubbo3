package com.example.dubbo.controller;

import com.example.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @DubboReference
    private UserService userService;

    @RequestMapping("/user")
    public String getUser(){
        return userService.getUser();
    }
}
