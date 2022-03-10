package com.example.stylus.dto;

public class CreateUserDto {
    private String name;
    private String password;
    private String address;
    private String username;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public CreateUserDto() {
    }
    public CreateUserDto(String name, String password, String address, String username) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.username = username;
    }
    
}
