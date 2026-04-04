package com.example.secure.secureApp.model;

import jakarta.persistence.*;
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

