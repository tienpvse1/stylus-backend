package com.example.stylus.services.StylistServiceImpl;

import java.util.List;

import com.example.stylus.model.Room;
import com.example.stylus.repository.RoomRepository;
import com.example.stylus.services.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    private RoomRepository repository;

    @Autowired
    public RoomServiceImpl(RoomRepository repository) {
        this.repository = repository;
    }

    @Override
    public Room getContact(String sender, String reciever) {
        return this.getContact(sender, reciever);
    }

    @Override
    public List<Room> getContacts(String sender) {
        return this.repository.findBySender(sender);
    }


    @Override
    public boolean createRoom(Room room) {
        try {
            this.repository.save(room);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
