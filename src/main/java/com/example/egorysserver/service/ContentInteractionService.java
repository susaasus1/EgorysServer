package com.example.egorysserver.service;

import com.example.egorysserver.entity.ContentInteraction;
import com.example.egorysserver.repo.ContentInteractionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentInteractionService {
    @Autowired
    private ContentInteractionRepo contentInteractionRepo;

    public List<ContentInteraction> findAll() {
        return contentInteractionRepo.findAll();
    }
}
