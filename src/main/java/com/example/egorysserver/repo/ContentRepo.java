package com.example.egorysserver.repo;

import com.example.egorysserver.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepo extends JpaRepository<Content, Integer> {

}
