package com.nexus.harmonyband.service.impl;

import com.nexus.harmonyband.domain.AlbumEntity;
import com.nexus.harmonyband.infrastructure.AlbumRepository;
import com.nexus.harmonyband.service.AlbumService;
import com.nexus.harmonyband.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlbumServiceImpl implements AlbumService {
    private final AlbumRepository albumRepository;
    private final ArtistService artistService;

    @Override
    public List<AlbumEntity> getAllAlbums() {
        return albumRepository.findAll();
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
