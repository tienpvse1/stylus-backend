package com.example.stylus.services;

import java.util.List;

import com.example.stylus.model.Room;

public interface RoomService {
    Room getContact(String sender, String reciever);
    List<Room> getContacts(String sender);
    boolean createRoom(Room room);
}
