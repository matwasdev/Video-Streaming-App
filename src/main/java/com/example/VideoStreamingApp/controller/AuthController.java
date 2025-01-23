package com.example.VideoStreamingApp.controller;


import com.example.VideoStreamingApp.model.MyUser;
import com.example.VideoStreamingApp.service.MyUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    MyUserService myUserService;

    public AuthController(MyUserService myUserService) {
        this.myUserService = myUserService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody MyUser user) {
        MyUser myUser = myUserService.registerUser(user);
        if(myUser != null)
            return ResponseEntity.status(HttpStatus.CREATED).body("User: " + myUser.getUsername() +  " registered successfully");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User: " + user.getUsername() +  " already exists");
    }







}
