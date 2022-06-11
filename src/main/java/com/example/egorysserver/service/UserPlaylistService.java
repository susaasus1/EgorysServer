package com.example.egorysserver.service;

import com.example.egorysserver.entity.UserPlaylist;
import com.example.egorysserver.repo.UserPlaylistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPlaylistService {
    @Autowired
    private UserPlaylistRepo userPlaylistRepo;

    public List<UserPlaylist> findAll() {
        return userPlaylistRepo.findAll();
    }
}
