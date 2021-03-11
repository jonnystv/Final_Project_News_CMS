package com.example.codeclan.newscmsserver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    //MANY TO MANY WITH USERS
    @JsonIgnoreProperties(value = "categories")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "articles_categories",
            joinColumns = {@JoinColumn(name = "category_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="article_id", nullable = false, updatable = false)}
    )
    private List<Article> articles;;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.articles = new ArrayList<Article>();
    }

    public Category() {

    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Article> getCategoryArticles() {
        return articles;
    }

    public void setCategoryArticles(List<Article> categoryArticles) {
        this.articles = categoryArticles;
    }

    public void addCategoryArticle(Article article) {
        this.articles.add(article);
    }

    public void removeCategoryArticle(Article article) {
        this.articles.remove(article);
    }

}
