package com.example.egorysserver.repo;

import com.example.egorysserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
