package com.example.egorysserver.service;

import com.example.egorysserver.entity.Music;
import com.example.egorysserver.repo.MusicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {
    @Autowired
    private MusicRepo musicRepo;

    public List<Music> findAll() {
        return musicRepo.findAll();
    }


}
