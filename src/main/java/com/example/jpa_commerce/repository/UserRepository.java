package com.example.jpa_commerce.repository;

import com.example.jpa_commerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
