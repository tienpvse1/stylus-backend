package com.example.stylus.api;

import java.util.List;

import com.example.stylus.dto.ServiceDto;
import com.example.stylus.dto.SuggestServiceDto;
import com.example.stylus.model.MyService;
import com.example.stylus.services.ServiceService;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/service")
public class ServiceController {
    @Autowired
    public ServiceService service;

    @GetMapping("/get/{id}")
    public MyService getService(@PathVariable("id") int id) {
        return this.service.getService(id);
    }

    @PostMapping("/create")
    public boolean createService(@RequestParam String dto, @RequestParam MultipartFile image) {
        JSONObject root = new JSONObject(dto);
        ServiceDto serviceDto = new ServiceDto();
        serviceDto.setStylistId(root.getInt("stylistId"));
        serviceDto.setName(root.getString("name"));
        serviceDto.setPrice(root.getFloat("price"));
        serviceDto.setSlotConsume(root.getInt("slotConsume"));
        serviceDto.setCategoryId(root.getInt("categoryId"));
        serviceDto.setImage(image);
        return this.service.createService(serviceDto);
    }

    @GetMapping("/listout")
    public List<MyService> getAllServices() {
        return this.service.getServices();
    }

    @GetMapping("/list-by-id/{stylistId}")
    public List<MyService> getAllServiceByStylistId(@PathVariable("stylistId")int stylistId) {
        return this.service.getServicesByStylistId(stylistId);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteService(@PathVariable("id") int id) {
        return this.service.deleteService(id);
    }

    @PutMapping("/update")
    public boolean updateService(@RequestParam String dto, @RequestParam MultipartFile image) {
        JSONObject root = new JSONObject(dto);
        ServiceDto serviceDto = new ServiceDto();
        serviceDto.setStylistId(root.getInt("stylistId"));
        serviceDto.setName(root.getString("name"));
        serviceDto.setPrice(root.getFloat("price"));
        serviceDto.setSlotConsume(root.getInt("slotConsume"));
        serviceDto.setCategoryId(root.getInt("categoryId"));
        serviceDto.setImage(image);
        return this.service.updateService(serviceDto, root.getInt("id"));
    }

    @GetMapping("/get-random")
    public List<SuggestServiceDto> getRandomService(){
        return this.service.getRandomService();
    } 
    @GetMapping("/get-most-liked")
    public List<SuggestServiceDto> getMostLikedServices(){
        return this.service.getMostLikedServices();
    } 

    @GetMapping("/get-by-category/{categoryId}")
    public List<SuggestServiceDto> getServiceByCategory(@PathVariable("categoryId") int categoryId){
        return this.service.getServicesByCategory(categoryId);
    }

    @GetMapping("/get-by-stylistId/{stylistId}")
    public List<SuggestServiceDto> getServiceByStylistId(@PathVariable("stylistId") int stylistId){
        return this.service.getServiceByStylistId(stylistId);
    }
}
