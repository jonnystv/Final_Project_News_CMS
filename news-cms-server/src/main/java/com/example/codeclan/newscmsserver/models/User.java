package com.example.codeclan.newscmsserver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "user_type")
    private UserType type;

    //ONE TO MANY WITH ARTICLES
    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user")
    private List<Article> userArticles;

    //ONE TO MANY WITH COMMENTS
    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user")
    private List<Comment> userComments;

    public User(String firstName, String lastName, String userName, String email, UserType type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.type = type;
        this.userArticles = new ArrayList<Article>();
        this.userComments = new ArrayList<Comment>();
    }

    public User() {
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

    public int getUserCommentCount() {
        return this.userComments.size();
    }

    public void addComment(Comment comment) {
        this.userComments.add(comment);
    }

    public void removeComment(Comment comment) {
        this.userComments.remove(comment);
    }


    public List<Comment> getUserComments() {
        return userComments;
    }

    public void setUserComments(List<Comment> userComments) {
        this.userComments = userComments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
