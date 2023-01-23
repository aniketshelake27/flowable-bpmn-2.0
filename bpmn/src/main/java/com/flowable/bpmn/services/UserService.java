package com.flowable.bpmn.services;

import org.springframework.stereotype.Service;

import com.flowable.bpmn.models.UserEntity;

@Service
public interface UserService {

    public void saveUser(UserEntity user);
    
}
