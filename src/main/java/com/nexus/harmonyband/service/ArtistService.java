package com.nexus.harmonyband.service;

import com.nexus.harmonyband.domain.ArtistEntity;

import java.util.List;

public interface ArtistService {

    List<ArtistEntity> getAllArtists();

    ArtistEntity save(ArtistEntity artistEntity);
}
