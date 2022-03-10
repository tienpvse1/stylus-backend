package com.example.stylus.dto;

public class UserDto {
    String name;
    String address;
    String gender;
    String image;
    
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public UserDto(String name, String address, String gender, String image) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.image = image;
    }
    public UserDto() {
    }
    
}
