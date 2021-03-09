package com.example.codeclan.newscmsserver.repositories;

import com.example.codeclan.newscmsserver.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
