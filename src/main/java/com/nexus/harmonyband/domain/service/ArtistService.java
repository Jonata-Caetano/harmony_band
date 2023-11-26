package com.nexus.harmonyband.domain.service;

import com.nexus.harmonyband.domain.model.ArtistEntity;

import java.util.List;

public interface ArtistService {

    List<ArtistEntity> getAllArtists();

    ArtistEntity getArtist(Long artistId);

    ArtistEntity save(ArtistEntity artistEntity);

    void delete(Long artistId);

}
