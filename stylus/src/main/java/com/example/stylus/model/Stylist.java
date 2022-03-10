package com.example.stylus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stylist {

    // name: "Teletubby",
    // age: 21,
    // address: "113 Nguyễn Xí, Phường 26, Quận Bình Thạnh , TP HCM",
    // service: ["Cắt tóc", "Làm móng"],
    // image: require("../../assets/images/booked/stylist.jpg").default,
    // username: "teletubby",
    // email: "optimusprime7301@gmail.com",
    // phoneNumber: "0779799555",
    // position: "Chuyên viên làm đẹp",
    // birth: "2000-10-27",
    // password: "username7301",
    @Id
    @GeneratedValue
    private int stylistId;
    private String name;
    private String address;
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;
    private String phoneNumber;
    private float longtitude;
    private float latitude;
    private String birth;
    private String username;
    private String email;
    private String password;
    private String position;
    private int served;

    
    public int getServed() {
        return served;
    }

    public void setServed(int served) {
        this.served = served;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public int getStylistId() {
        return stylistId;
    }

    public void setStylistId(int stylistId) {
        this.stylistId = stylistId;
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

    

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(float longtitude) {
        this.longtitude = longtitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public Stylist(int stylistId, String name, String address, String avatar, String dateOfBirth, String phoneNumber,
            float longtitude, float latitude) {
        this.stylistId = stylistId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.longtitude = longtitude;
        this.latitude = latitude;
    }

    public Stylist() {
    }

    public Stylist(String name, String address, String image, String phoneNumber, float longtitude, float latitude,
            String birth, String username, String email, String password, String position ,int served) {
        this.name = name;
        this.address = address;
        this.image = image;
        this.phoneNumber = phoneNumber;
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.birth = birth;
        this.username = username;
        this.email = email;
        this.password = password;
        this.position = position;
        this.served = served;
    }

     

}
