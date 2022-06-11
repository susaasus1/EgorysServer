package com.example.egorysserver.repo;

import com.example.egorysserver.entity.ContentTag;
import com.example.egorysserver.entity.ContentTagKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConentTagRepo extends JpaRepository<ContentTag, ContentTagKey> {
}
