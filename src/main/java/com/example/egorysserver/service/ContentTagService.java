package com.example.egorysserver.service;

import com.example.egorysserver.entity.ContentTag;
import com.example.egorysserver.repo.ConentTagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentTagService {
    @Autowired
    private ConentTagRepo conentTagRepo;

    public List<ContentTag> findAll() {
        return conentTagRepo.findAll();
    }
}
