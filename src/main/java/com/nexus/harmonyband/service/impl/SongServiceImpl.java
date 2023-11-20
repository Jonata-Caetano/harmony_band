package com.nexus.harmonyband.service.impl;

import com.nexus.harmonyband.domain.SongEntity;
import com.nexus.harmonyband.infrastructure.SongRepository;
import com.nexus.harmonyband.service.AlbumService;
import com.nexus.harmonyband.service.ArtistService;
import com.nexus.harmonyband.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SongServiceImpl implements SongService {
    private final SongRepository songRepository;
    private final AlbumService albumService;
    private final ArtistService artistService;

    @Override
    public List<SongEntity> getAllSongs() {
        return songRepository.findAll();
    }

    @Override
    public SongEntity getSong(Long songId) {
        return songRepository.findById(songId).orElseThrow();
    }

    @Override
    @Transactional
    public SongEntity save(SongEntity songEntity) {
        Long albumId = songEntity.getAlbum().getId();
        var albumEntity = albumService.getAlbum(albumId);
        Long artistId = albumEntity.getArtist().getId();
        songEntity.setAlbum(albumEntity);
        songEntity.getAlbum().setArtist(artistService.getArtist(artistId));
        return songRepository.save(songEntity);
    }

    @Override
    @Transactional
    public void delete(Long songId) {
        songRepository.deleteById(songId);
        songRepository.flush();
    }
}
