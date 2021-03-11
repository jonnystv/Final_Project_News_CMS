package com.example.codeclan.newscmsserver.controllers;

import com.example.codeclan.newscmsserver.models.Article;
import com.example.codeclan.newscmsserver.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping(value = "/articles")
    public ResponseEntity<List<Article>> getAllArticles(){
        return new ResponseEntity<>(articleRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/articles/{id}")
    public ResponseEntity getArticle(@PathVariable Long id){
        return new ResponseEntity(articleRepository.findById(id), HttpStatus.OK);
    }
}
