package com.example.stylus.api;

import java.util.List;

import com.example.stylus.model.Room;
import com.example.stylus.services.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/message")
public class RoomController {
    //localhost:8080/api/v1/message/create
    @Autowired
    private RoomService service;

    @PostMapping("/create")
    public boolean createRoom(@RequestBody Room room){    
        return this.service.createRoom(room);
    }

    @GetMapping("/listout")
    public List<Room> getContacts(@RequestParam String username){
        return this.service.getContacts(username);
    }

    @GetMapping("/connect")
    public Room getContact(@RequestBody Room room ){
        return this.getContact(room);
    }

}
