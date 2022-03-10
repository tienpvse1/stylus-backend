package com.example.stylus.api;

import java.util.List;

import com.example.stylus.model.Category;
import com.example.stylus.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/category")
public class CategoryController {
    
    @Autowired 
    public CategoryRepository repository;

    @GetMapping("/listout")
    public List<Category> getAllCategories(){
        return this.repository.findAll();
    }
}
