package com.example.egorysserver.repo;

import com.example.egorysserver.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Integer> {

}
