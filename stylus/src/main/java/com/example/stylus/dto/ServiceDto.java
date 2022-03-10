package com.example.stylus.dto;

import org.springframework.web.multipart.MultipartFile;

public class ServiceDto {
    private int Id;
    private int stylistId;
    private String name;
    private float price;
    private MultipartFile image;
    private int slotConsume;
    private int categoryId;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public int getSlotConsume() {
        return slotConsume;
    }

    public void setSlotConsume(int slotConsume) {
        this.slotConsume = slotConsume;
    }

    public ServiceDto(int stylistId, String name, float price, MultipartFile image, int slotConsume, int categoryId) {
        this.stylistId = stylistId;
        this.name = name;
        this.price = price;
        this.image = image;
        this.slotConsume = slotConsume;
        this.categoryId = categoryId;
    }

    public ServiceDto(String name, float price, MultipartFile image, int slotConsume, int categoryId) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.slotConsume = slotConsume;
        this.categoryId = categoryId;
    }

    public ServiceDto() {
    }

}
