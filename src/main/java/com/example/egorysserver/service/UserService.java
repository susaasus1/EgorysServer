package com.example.egorysserver.service;

import com.example.egorysserver.entity.User;
import com.example.egorysserver.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userEntityRepo;

    public List<User> findAll() {
        return userEntityRepo.findAll();
    }
}
