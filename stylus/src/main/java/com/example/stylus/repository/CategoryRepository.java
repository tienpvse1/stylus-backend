package com.example.stylus.repository;

import com.example.stylus.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category , Integer> {
    
}
