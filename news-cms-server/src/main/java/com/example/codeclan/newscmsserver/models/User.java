package com.example.codeclan.newscmsserver.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String firstName;

    private String lastName;

    private String userName;

    private String email;

    private UserType type;

    private List<Article> userArticles;

    public User(String firstName, String lastName, String userName, String email, UserType type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.type = type;
        this.userArticles = new ArrayList<Article>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getType() {
        return type;
    }

    public String getEnumValue() {
        return this.type.getType();
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public int getUserArticleCount() {
        return this.userArticles.size();
    }

    public void addArticle(Article article) {
        this.userArticles.add(article);
    }

    public void removeArticle(Article article) {
        this.userArticles.remove(article);
    }

    public List<Article> getUserArticles() {
        return userArticles;
    }

    public void setUserArticles(List<Article> userArticles) {
        this.userArticles = userArticles;
    }
}
