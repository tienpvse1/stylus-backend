package com.example.stylus.dto;

public class SuggestServiceDto {
    private int Id;
    private String stylistName;
    private int stylistId;
    private String name;
    private float price;
    private String image;
    private int slotConsume;
    private int categoryId;
    private String feedback;
    private float vote;
    private int liked;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStylistName() {
        return stylistName;
    }

    public void setStylistName(String stylistName) {
        this.stylistName = stylistName;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

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

    public int getStylistId() {
        return stylistId;
    }

    public void setStylistId(int stylistId) {
        this.stylistId = stylistId;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public SuggestServiceDto(int id, String stylistName, String name, float price, String image, int slotConsume,
            int categoryId, String feedback, float vote, int liked, int stylistId) {
        Id = id;
        this.stylistName = stylistName;
        this.name = name;
        this.price = price;
        this.image = image;
        this.slotConsume = slotConsume;
        this.categoryId = categoryId;
        this.feedback = feedback;
        this.vote = vote;
        this.liked = liked;
        this.stylistId = stylistId;
    }

    public SuggestServiceDto() {
    }

    

}
