package com.example.secure.secureApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name ="secure")
public class user {

    @Id
    private int id;
    private String username;
    private String password;
}

