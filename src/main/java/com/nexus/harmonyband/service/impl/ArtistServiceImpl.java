package com.nexus.harmonyband.service.impl;

import com.nexus.harmonyband.domain.ArtistEntity;
import com.nexus.harmonyband.infrastructure.ArtistRepository;
import com.nexus.harmonyband.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    @Override
    public List<ArtistEntity> getAllArtists() {
        return artistRepository.findAll();
    }

    @Override
    @Transactional
    public ArtistEntity save(ArtistEntity artistEntity) {
        return artistRepository.save(artistEntity);
    }
}
