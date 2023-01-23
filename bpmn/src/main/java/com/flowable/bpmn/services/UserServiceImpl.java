package com.flowable.bpmn.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.flowable.bpmn.models.UserEntity;
import com.flowable.bpmn.repository.UserRepository;

public class UserServiceImpl implements UserService{
    
    @Autowired
    UserRepository userRepo;

    public void saveUser(UserEntity user){
        userRepo.save(user);
    }

}
