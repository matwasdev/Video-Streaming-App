package com.example.VideoStreamingApp.service;

import com.example.VideoStreamingApp.model.MyUser;
import com.example.VideoStreamingApp.repository.MyUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserService {

    private MyUserRepository myUserRepository;
    private PasswordEncoder passwordEncoder;

    public MyUserService(MyUserRepository myUserRepository, PasswordEncoder passwordEncoder) {
        this.myUserRepository = myUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public MyUser registerUser(MyUser myUser){
        if(myUserRepository.findByUsername(myUser.getUsername()).isPresent()) {
            return null;
        }
        if(myUser.getRole()==null)
            myUser.setRole("USER");
        myUser.setPassword(passwordEncoder.encode(myUser.getPassword()));
        return myUserRepository.save(myUser);
    }





}
