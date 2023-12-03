package com.nexus.harmonyband.domain.service;

import com.nexus.harmonyband.domain.model.ArtistEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ArtistService {

    Page<ArtistEntity> getAllArtists(Pageable pageable);

    ArtistEntity getArtist(Long artistId);

    ArtistEntity save(ArtistEntity artistEntity);

    void delete(Long artistId);

}
