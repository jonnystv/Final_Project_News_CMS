package com.example.codeclan.newscmsserver.models;

import java.util.ArrayList;
import java.util.List;

public class Article {

    private String title;

    private String headline;

    private String summary;

    private String fullText;

    private User author;

    private String date;

    private List<Category> categories;

    private List<Comment> comments;

    public Article(String title, String headline, String summary, String fullText, User author, String date) {
        this.title = title;
        this.headline = headline;
        this.summary = summary;
        this.fullText = fullText;
        this.author = author;
        this.date = date;
        this.categories = new ArrayList<Category>();
        this.comments = new ArrayList<Comment>();
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
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
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
}
