package com.example.egorysserver.repo;

import com.example.egorysserver.entity.TextPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextPostRepo extends JpaRepository<TextPost, Integer> {
}
