package com.nexus.harmonyband.domain.repository;

import com.nexus.harmonyband.domain.model.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<SongEntity, Long> {
}
