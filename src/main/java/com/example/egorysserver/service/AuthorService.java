package com.example.egorysserver.service;

import com.example.egorysserver.entity.Author;
import com.example.egorysserver.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo authorRepo;

    public List<Author> findAll() {
        return authorRepo.findAll();
    }
}
