package com.example.secure.secureApp.service;

import com.example.secure.secureApp.model.user;
import com.example.secure.secureApp.repo.userRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class registerService {
    @Autowired
    private userRepo repo;
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion.$2A,12);

    public user addUser(user user) {
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(encoder.encode(user.getPassword()));
        return repo.save(user);
    }


}
