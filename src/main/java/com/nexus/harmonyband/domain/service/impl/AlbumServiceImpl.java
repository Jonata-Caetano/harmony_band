package com.nexus.harmonyband.domain.service.impl;

import com.nexus.harmonyband.domain.model.AlbumEntity;
import com.nexus.harmonyband.domain.service.AlbumService;
import com.nexus.harmonyband.domain.service.ArtistService;
import com.nexus.harmonyband.infrastructure.AlbumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AlbumServiceImpl implements AlbumService {
    private final AlbumRepository albumRepository;
    private final ArtistService artistService;

    @Override
    public Page<AlbumEntity> getAllAlbums(Pageable pageable) {
        return albumRepository.findAll(pageable);
    }

    @Override
    public AlbumEntity getAlbum(Long albumId) {
        return albumRepository.findById(albumId).orElseThrow();
    }

    @Override
    @Transactional
    public AlbumEntity save(AlbumEntity albumEntity) {
        Long artistId = albumEntity.getArtist().getId();

        var artist = artistService.getArtist(artistId);
        albumEntity.setArtist(artist);

        return albumRepository.save(albumEntity);
    }

    @Override
    @Transactional
    public void delete(Long albumId) {
        albumRepository.deleteById(albumId);
        albumRepository.flush();

    }
}
