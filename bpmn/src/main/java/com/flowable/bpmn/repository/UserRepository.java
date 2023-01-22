package com.flowable.bpmn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowable.bpmn.models.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
    
}
