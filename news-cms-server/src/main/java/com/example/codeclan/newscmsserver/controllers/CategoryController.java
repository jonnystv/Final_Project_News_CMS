package com.example.codeclan.newscmsserver.controllers;

import com.example.codeclan.newscmsserver.models.Category;
import com.example.codeclan.newscmsserver.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping(value = "/categories")
    public ResponseEntity<List<Category>>getAllCategories(){
        return new ResponseEntity<>(categoryRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/categories/{id}")
    public ResponseEntity getCategory(@PathVariable Long id){
        return new ResponseEntity(categoryRepository.findById(id), HttpStatus.OK);
    }

}
