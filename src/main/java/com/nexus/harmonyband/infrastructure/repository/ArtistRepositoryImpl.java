package com.nexus.harmonyband.infrastructure.repository;

import com.nexus.harmonyband.domain.model.ArtistPhotoEntity;
import com.nexus.harmonyband.domain.repository.ArtistRepositoryQueries;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ArtistRepositoryImpl implements ArtistRepositoryQueries {

    @PersistenceContext
    private EntityManager manager;

    @Transactional
    @Override
    public ArtistPhotoEntity save(ArtistPhotoEntity artistPhoto) {
        return manager.merge(artistPhoto);
    }
}
