package com.example.egorysserver.service;

import com.example.egorysserver.entity.Video;
import com.example.egorysserver.repo.VideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    private VideoRepo videoRepo;

    public List<Video> findAll() {
        return videoRepo.findAll();
    }
}
