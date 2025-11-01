package com.example.jpa_commerce.entity;

import jakarta.persistence.*;
import lombok.Setter;

/**
 * 이럴경우 대부분 User 에 매핑관계의 주인을 준다
 */
@Setter
@Entity
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    @OneToOne
    @JoinColumn(name = "user_id")//매핑 관계의 주인 User 수정 가능
    private User user;
}