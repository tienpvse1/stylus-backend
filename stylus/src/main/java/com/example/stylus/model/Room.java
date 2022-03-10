package com.example.stylus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Room {
    @Id
    @GeneratedValue
    private int id;
    private String sender;
    private String reciever;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getReciever() {
        return reciever;
    }
    public void setReciever(String reciever) {
        this.reciever = reciever;
    }
    public Room(String sender, String reciever) {
        this.sender = sender;
        this.reciever = reciever;
    }
    public Room() {
    }
   
    
}
