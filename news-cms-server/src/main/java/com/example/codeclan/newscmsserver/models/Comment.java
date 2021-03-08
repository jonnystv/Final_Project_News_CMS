package com.example.codeclan.newscmsserver.models;

public class Comment {

    private String commentTitle;

    private String commentText;

    private User commentAuthor;

    private String commentDate;

    public Comment(String commentTitle, String commentText, User commentAuthor, String commentDate) {
        this.commentTitle = commentTitle;
        this.commentText = commentText;
        this.commentAuthor = commentAuthor;
        this.commentDate = commentDate;
    }

    public String getCommentTitle() {
        return commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public User getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(User commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }
}
