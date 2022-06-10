package com.example.egorysserver.repo;

import com.example.egorysserver.entity.Music;
import com.example.egorysserver.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.Pair;

public interface UserRepo extends JpaRepository<User, Integer> {

}
