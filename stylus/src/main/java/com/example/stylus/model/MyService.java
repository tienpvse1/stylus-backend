package com.example.stylus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyService {
    @Id
    @GeneratedValue
    private int Id;
    private int stylistId;
    private String name;
    private float price;
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;
    private int slotConsume;
    private int categoryId;
    private String feedback;
    private float vote;
    private int liked;
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public float getVote() {
        return vote;
    }

    public void setVote(float vote) {
        this.vote = vote;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getSlotConsume() {
        return slotConsume;
    }

    public void setSlotConsume(int slotConsume) {
        this.slotConsume = slotConsume;
    }

    public MyService() {
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

    public MyService( int stylistId, String name, float price, String image, int slotConsume, int categoryId,
            String feedback, float vote, int liked) {
        this.stylistId = stylistId;
        this.name = name;
        this.price = price;
        this.image = image;
        this.slotConsume = slotConsume;
        this.categoryId = categoryId;
        this.feedback = feedback;
        this.vote = vote;
        this.liked = liked;
    }

    

}
