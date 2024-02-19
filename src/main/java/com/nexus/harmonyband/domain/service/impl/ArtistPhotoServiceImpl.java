package com.nexus.harmonyband.domain.service.impl;

import com.nexus.harmonyband.domain.model.ArtistPhotoEntity;
import com.nexus.harmonyband.domain.repository.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ArtistPhotoServiceImpl {

    private final ArtistRepository artistRepository;
    @Transactional
    public ArtistPhotoEntity save(ArtistPhotoEntity artistPhoto) {
        return artistRepository.save(artistPhoto);
    }
}
