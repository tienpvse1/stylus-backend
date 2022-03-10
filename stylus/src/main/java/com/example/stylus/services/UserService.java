package com.example.stylus.services;

import com.example.stylus.dto.CreateUserDto;
import com.example.stylus.dto.LoginRequest;
import com.example.stylus.model.User;

public interface UserService {
    User getUserById(int id);
    User login(LoginRequest request);
    User findUserByUsername(String username);
    boolean updateUserProfile(String username, User user);
    User checkLogin(LoginRequest request);
    User createAccount(CreateUserDto dto);
}
