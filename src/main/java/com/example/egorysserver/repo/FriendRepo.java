package com.example.egorysserver.repo;

import com.example.egorysserver.entity.Friend;
import com.example.egorysserver.entity.FriendKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepo extends JpaRepository<Friend, FriendKey> {
}
