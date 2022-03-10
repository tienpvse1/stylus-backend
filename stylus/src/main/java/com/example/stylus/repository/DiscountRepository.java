package com.example.stylus.repository;

import com.example.stylus.model.Discount;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Integer> {
    
}
