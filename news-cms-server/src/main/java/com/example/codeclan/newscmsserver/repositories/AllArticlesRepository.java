package com.example.codeclan.newscmsserver.repositories;

import com.example.codeclan.newscmsserver.models.AllArticles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllArticlesRepository extends JpaRepository<AllArticles, Long> {
}
