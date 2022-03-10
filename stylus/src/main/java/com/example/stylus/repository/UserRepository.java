package com.example.stylus.repository;

import com.example.stylus.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Integer> {
    User findByUsername(String username);
}
