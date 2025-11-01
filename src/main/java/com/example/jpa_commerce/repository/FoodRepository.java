package com.example.jpa_commerce.repository;

import com.example.jpa_commerce.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
