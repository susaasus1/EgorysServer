package com.example.egorysserver.repo;

import com.example.egorysserver.entity.Follower;
import com.example.egorysserver.entity.FollowerKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FollowerRepo extends JpaRepository<Follower,FollowerKey> {
}
