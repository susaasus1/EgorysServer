package com.example.egorysserver.repo;

import com.example.egorysserver.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepo extends JpaRepository<Music, Integer> {
}
