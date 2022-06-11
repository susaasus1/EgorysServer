package com.example.egorysserver.repo;

import com.example.egorysserver.entity.ReactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionTypeRepo extends JpaRepository<ReactionType,Integer> {

}
