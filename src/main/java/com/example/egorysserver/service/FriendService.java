package com.example.egorysserver.service;

import com.example.egorysserver.entity.Friend;
import com.example.egorysserver.repo.FriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {
    @Autowired
    private FriendRepo friendRepo;
    public List<Friend> findAll(){
        return friendRepo.findAll();
    }
}
