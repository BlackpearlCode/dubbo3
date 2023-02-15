package com.example.dubbo.service.impl;

import com.example.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "hello dubbo";
    }
}
