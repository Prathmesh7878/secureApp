package com.example.secure.secureApp.service;

import com.example.secure.secureApp.model.user;
import com.example.secure.secureApp.repo.userRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class registerService {
    @Autowired
    private userRepo repo;

    public user addUser(user user) {
        return repo.save(user);
    }


}
