package com.example.egorysserver.repo;

import com.example.egorysserver.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepo extends JpaRepository<UserInfo, Integer> {
}
