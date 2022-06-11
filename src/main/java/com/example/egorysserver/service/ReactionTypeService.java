package com.example.egorysserver.service;

import com.example.egorysserver.entity.ReactionType;
import com.example.egorysserver.repo.ReactionTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReactionTypeService {
    @Autowired
    private ReactionTypeRepo reactionTypeRepo;

    public List<ReactionType> findAll() {
        return reactionTypeRepo.findAll();
    }
}
