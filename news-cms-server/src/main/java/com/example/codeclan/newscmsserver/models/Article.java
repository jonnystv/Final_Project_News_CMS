package com.example.codeclan.newscmsserver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "headline")
    private String headline;

    @Column(name = "summary")
    private String summary;

    @Column(name = "full_text", length = 1000)
    private String fullText;


    //MANY TO ONE WITH USERS
    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne
    @JsonIgnoreProperties(value="articles")
    private User user;

    @Column(name = "date")
    private String date;

    //ONE TO MANY WITH CATEGORIES
    @JsonIgnoreProperties(value="article")
    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY)
    private List<Category> categories;

    public Article(String headline, String summary, String fullText, User user, String date) {
        this.headline = headline;
        this.summary = summary;
        this.fullText = fullText;
        this.user = user;
        this.date = date;
        this.categories = new ArrayList<>();
    }

    public Article() {
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

//    public User getAuthor() {
//        return user;
//    }
//
//    public void setAuthor(User user) {
//        this.user = user;
//    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCategoryCount() {
        return categories.size();
    }

    public void addCategory(Category category) {
        this.categories.add(category);
    }

    public void removeCategory(Category category) {
        this.categories.remove(category);
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
