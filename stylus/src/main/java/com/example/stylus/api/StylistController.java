package com.example.stylus.api;

import java.util.List;

import com.example.stylus.dto.LoginRequest;
import com.example.stylus.dto.StylistCreateAccountDto;
import com.example.stylus.model.Stylist;
import com.example.stylus.services.StylistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("api/v1/stylist")
@CrossOrigin(origins = "*")
public class StylistController {

    @Autowired
    private StylistService service;

    @GetMapping("/hello")
    public String sayHello(){
        return "hello my pal";
    }

    @PostMapping("/create")
    public boolean createStylist(@RequestBody Stylist stylist){
        return this.service.createStylist(stylist);
    }

    @PostMapping(value="/login")
    public Stylist postMethodName(@RequestBody LoginRequest request) {
        return this.service.checkLogin(request);
    }
    @GetMapping(value="/get-id/{username}")
    public int getStylistIdByUsername(@PathVariable("username") String username) {
        return this.service.getStylistIdByUsername(username);
    }
    @GetMapping(value="/get/{username}")
    public Stylist getStylistByUsername(@PathVariable("username") String username) {
        return this.service.getStylistByUsername(username);
    }
    @PutMapping("/update-image")
    public boolean updateImage(@RequestParam MultipartFile image , @RequestParam String stylistUsername ) {
        return this.service.updateImage(image, stylistUsername);
    }   

    @GetMapping("/get-stylist-by-id/{id}")
    public Stylist getStylistById(@PathVariable int id){
        return this.service.getStylistById(id);
    }

    @GetMapping("/get-all")
    public List<Stylist> getAllStylist(){
        return this.service.getAllStylist();
    }

    @PostMapping("/create-account")
    public Stylist createAccount(@RequestBody StylistCreateAccountDto dto){
        return this.service.createStylistAccount(dto);
    }

    @GetMapping("/check-username-exist/{username}")
    public boolean checkUsernameExist(@PathVariable("username")String username){
        if(this.service.getStylistByUsername(username) != null){
            return true;
        }
        return false;
    }
}
