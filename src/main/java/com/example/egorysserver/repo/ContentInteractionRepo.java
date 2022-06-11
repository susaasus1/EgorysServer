package com.example.egorysserver.repo;

import com.example.egorysserver.entity.ContentInteraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentInteractionRepo extends JpaRepository<ContentInteraction,Integer> {

}
