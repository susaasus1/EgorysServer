package com.example.egorysserver.repo;

import com.example.egorysserver.entity.UserPlaylist;
import com.example.egorysserver.entity.UserPlaylistKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPlaylistRepo extends JpaRepository<UserPlaylist, UserPlaylistKey> {
    List<UserPlaylist> findAll();
}
