package com.example.egorysserver.service;

import com.example.egorysserver.entity.Content;
import com.example.egorysserver.repo.ContentRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {
    @Autowired
    private ContentRepo contentRepo;

    public List<Content> findAll() {
        return contentRepo.findAll();
    }
}
