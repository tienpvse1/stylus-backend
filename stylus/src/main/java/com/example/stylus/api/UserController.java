package com.example.stylus.api;

import com.example.stylus.dto.CreateUserDto;
import com.example.stylus.dto.LoginRequest;
import com.example.stylus.dto.UserDto;
import com.example.stylus.model.User;
import com.example.stylus.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/user/")
public class UserController {

    @Autowired
    public UserService service;

    @GetMapping("get-user/{username}")
    public User getUser(@PathVariable("username") String username) {
        return this.service.findUserByUsername(username);
    }

    @GetMapping("stylist-get-user/{username}")
    public UserDto getUserForStylist(@PathVariable("username") String username) {
        User user = this.service.findUserByUsername(username);
        UserDto dto = new UserDto(user.getName(), user.getAddress(), user.getGender(), user.getImage());
        return dto;
    }

    @PutMapping(value = "update-user/{username}")
    public boolean putMethodName(@PathVariable("username") String username, @RequestBody User user) {
        return this.service.updateUserProfile(username, user);

    }

    @PostMapping(value="login")
    public User postMethodName(@RequestBody LoginRequest request) {

        System.out.println(request.getUsername());
        User entity = this.service.checkLogin(request);
        return entity;
    }

    @PostMapping("create")
    public User createAccount(@RequestBody CreateUserDto dto){
        return this.service.createAccount(dto);
    }
    
}
