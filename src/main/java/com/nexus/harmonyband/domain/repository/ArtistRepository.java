package com.nexus.harmonyband.domain.repository;

import com.nexus.harmonyband.domain.model.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<ArtistEntity, Long> , ArtistRepositoryQueries {
}
