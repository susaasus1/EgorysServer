package com.example.egorysserver.service;

import com.example.egorysserver.entity.Follower;
import com.example.egorysserver.repo.FollowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowerService {
    @Autowired
    private FollowerRepo followerRepo;

    public List<Follower> findAll() {
        return followerRepo.findAll();
    }
}
