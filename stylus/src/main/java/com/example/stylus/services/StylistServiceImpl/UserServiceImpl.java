package com.example.stylus.services.StylistServiceImpl;

import com.example.stylus.dto.CreateUserDto;
import com.example.stylus.dto.LoginRequest;
import com.example.stylus.model.User;
import com.example.stylus.repository.UserRepository;
import com.example.stylus.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getUserById(int id) {
        return this.repository.findById(id).get();
    }

    @Override
    public User login(LoginRequest request) {
        User user = this.repository.findByUsername(request.getUsername());
        if (user == null) {
            return null;
        }
        if (user.getPassword().equals(request.getPassword())) {
            return user;
        }
        return null;
    }

    @Override
    public User findUserByUsername(String username) {
        return this.repository.findByUsername(username);
    }

    @Override
    public boolean updateUserProfile(String username, User user) {
        try {
            User result = this.findUserByUsername(username);
            result.setAddress(user.getAddress());
            result.setBirth(user.getBirth());
            result.setEmail(user.getEmail());
            result.setGender(user.getGender());
            result.setImage(user.getImage());
            result.setName(user.getName());
            result.setPhoneNumber(user.getPhoneNumber());
            this.repository.save(result);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public User checkLogin(LoginRequest request) {
        try {
            User user = this.findUserByUsername(request.getUsername());
            System.out.println(user.getPassword());
            if (user.getPassword().equals(request.getPassword())) {
                System.out.println("match");
                return user;
            }
            else{
                System.out.println("not match");
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public User createAccount(CreateUserDto dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setAddress(dto.getAddress());
        user.setBirth("");
        user.setEmail("");
        user.setGender("female");
        user.setImage(null);
        user.setPhoneNumber("");
        return this.repository.save(user);
         
    }

}
