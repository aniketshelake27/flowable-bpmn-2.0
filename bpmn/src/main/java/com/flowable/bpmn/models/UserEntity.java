package com.flowable.bpmn.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userId;
    String userName;
    String password;
    String fname;
    String lname;
    String userRole;
    String userEmail;
    String userMobile;
    Object userPhoto;
    boolean isDeletedUser;
    boolean isWarneduser;
    boolean isLogout;
}