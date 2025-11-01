package com.example.jpa_commerce.entity;

import jakarta.persistence.*;
import lombok.Setter;

@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}