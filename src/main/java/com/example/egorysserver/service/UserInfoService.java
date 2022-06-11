package com.example.egorysserver.service;

import com.example.egorysserver.entity.User;
import com.example.egorysserver.entity.UserInfo;
import com.example.egorysserver.repo.UserInfoRepo;
import com.example.egorysserver.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoRepo userInfoEntityRepo;

    public List<UserInfo> findAll() {
        return userInfoEntityRepo.findAll();
    }
    public void save(UserInfo userInfo){
        userInfoEntityRepo.save(userInfo);
    }
}
