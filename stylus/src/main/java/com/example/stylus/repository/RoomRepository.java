package com.example.stylus.repository;

import java.util.List;

import com.example.stylus.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room , Integer> {

    List<Room> findBySender(String sender);

    Room findBySenderAndReciever(String sender, String reciever);
    
}
