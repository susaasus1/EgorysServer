package com.example.egorysserver.repo;

import com.example.egorysserver.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepo extends JpaRepository<Video,Integer> {

}
