package com.example.secure.secureApp.repo;

import com.example.secure.secureApp.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface userRepo extends JpaRepository<user,Integer> {
    user findByUsername(String username);
}
