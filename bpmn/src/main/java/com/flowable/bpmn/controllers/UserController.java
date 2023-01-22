package com.flowable.bpmn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.flowable.bpmn.services.UserService;

@RestController("/user")
public class UserController {
    @Autowired
    UserService userService;

}
