package com.login.login.service;

import com.login.login.entity.SignUpEntity;
import com.login.login.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<SignUpEntity> findAllStudent() {

        List<SignUpEntity> signUpEntities = userRepo.findAll();

        return signUpEntities;
    }

    public SignUpEntity saveUser(SignUpEntity signUpEntity){

        return userRepo.save(signUpEntity);
    }
}
