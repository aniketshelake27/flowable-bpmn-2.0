package com.flowable.bpmn.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.flowable.bpmn.repository.UserRepository;

public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userReo;

}
