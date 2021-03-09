package com.example.codeclan.newscmsserver.repositories;

import com.example.codeclan.newscmsserver.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
