package com.example.codeclan.newscmsserver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment_title")
    private String commentTitle;

    @Column(name = "comment_text")
    private String commentText;

    //MANY TO ONE WITH USERS
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnoreProperties({"comments"})
    private User commentAuthor;

    @Column(name = "comment_date")
    private String commentDate;

    public Comment(String commentTitle, String commentText, User commentAuthor, String commentDate) {
        this.commentTitle = commentTitle;
        this.commentText = commentText;
        this.commentAuthor = commentAuthor;
        this.commentDate = commentDate;
    }

    public Comment() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
