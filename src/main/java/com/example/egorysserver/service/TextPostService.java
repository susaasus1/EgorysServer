package com.example.egorysserver.service;

import com.example.egorysserver.entity.TextPost;
import com.example.egorysserver.repo.TextPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;

@Service
public class TextPostService {
    @Autowired
    private TextPostRepo textPostRepo;

    public List<TextPost> findAll() {
        return textPostRepo.findAll();
    }
}
