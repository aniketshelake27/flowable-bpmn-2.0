package com.flowable.bpmn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flowable.bpmn.models.UserEntity;
import com.flowable.bpmn.services.UserService;

@RestController("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/save")
    public void createUser(@RequestBody UserEntity user){
        userService.saveUser(user);
    }

    @PostMapping("/login")
    public void validateUser(){
        //todo
    }





}
