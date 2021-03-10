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

    @Column(name = "title")
    private String title;

    @Column(name = "headline")
    private String headline;

    @Column(name = "summary")
    private String summary;

    @Column(name = "full_text", length = 1000)
    private String fullText;


    //MANY TO ONE WITH USERS
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnoreProperties({"articles"})
    private User user;

    @Column(name = "date")
    private String date;

    //ONE TO MANY WITH CATEGORIES
    @JsonIgnoreProperties({"article"})
    @OneToMany(mappedBy = "article")
    private List<Category> categories;

    //ONE TO MANY WITH COMMENTS
    @JsonIgnoreProperties({"article"})
    @OneToMany(mappedBy = "article")
    private List<Comment> comments;

    public Article(String title, String headline, String summary, String fullText, User user, String date) {
        this.title = title;
        this.headline = headline;
        this.summary = summary;
        this.fullText = fullText;
        this.user = user;
        this.date = date;
        this.categories = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public Article() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public User getAuthor() {
        return user;
    }

    public void setAuthor(User user) {
        this.user = user;
    }

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

    public int getCommentCount() {
        return comments.size();
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void removeComment(Comment comment) {
        this.comments.remove(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
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
