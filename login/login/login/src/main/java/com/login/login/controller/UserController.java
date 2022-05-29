package com.login.login.controller;

import com.login.login.entity.SignUpEntity;
import com.login.login.repo.UserRepo;
import com.login.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepo userRepo;

//    @PostMapping("/create")
//    public SignUpEntity createUser(@RequestBody SignUpEntity signUpEntity) {
//
//        SignUpEntity signUpEntity1 = userRepo.save(signUpEntity);
//        return signUpEntity1;
//    }

    @PostMapping("/save")
    public SignUpEntity createUser(@RequestBody SignUpEntity signUpEntity) {

        SignUpEntity signUpEntity1 = userService.saveUser(signUpEntity);
        return signUpEntity1;
    }

    @GetMapping("/UserList")
    public List<SignUpEntity> getAllUsers() {

        List<SignUpEntity> signUpEntities = userService.findAllStudent();
        return signUpEntities;
    }
}
