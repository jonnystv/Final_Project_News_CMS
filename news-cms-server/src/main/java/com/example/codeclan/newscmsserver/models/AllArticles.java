package com.example.codeclan.newscmsserver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "all_articles")
public class AllArticles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    //ONE TO MANY WITH ARTICLES
    @JsonIgnoreProperties({"allArticles"})
    @OneToMany(mappedBy = "allArticles")
    private List<Article> articleList;

    public AllArticles(String name) {
        this.name = name;
        this.articleList = new ArrayList<>();
    }

    public AllArticles() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public int getArticleCount() {
        return this.articleList.size();
    }

    public void addArticle(Article article) {
        this.articleList.add(article);
    }

    public void removeArticle(Article article) {
        this.articleList.remove(article);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
