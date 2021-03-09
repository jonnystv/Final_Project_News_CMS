package com.example.codeclan.newscmsserver.repositories;

import com.example.codeclan.newscmsserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
