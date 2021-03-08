package com.example.codeclan.newscmsserver.models;

import java.util.ArrayList;
import java.util.List;

public class AllArticles {

    private String name;

    private List<Article> articleList;

    public AllArticles(String name) {
        this.name = name;
        this.articleList = new ArrayList<Article>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }
}
