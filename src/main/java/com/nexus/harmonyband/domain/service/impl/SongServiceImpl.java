package com.nexus.harmonyband.domain.service.impl;

import com.nexus.harmonyband.domain.model.SongEntity;
import com.nexus.harmonyband.domain.repository.SongRepository;
import com.nexus.harmonyband.domain.service.AlbumService;
import com.nexus.harmonyband.domain.service.ArtistService;
import com.nexus.harmonyband.domain.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SongServiceImpl implements SongService {
    private final SongRepository songRepository;
    private final AlbumService albumService;
    private final ArtistService artistService;

    @Override
    public Page<SongEntity> getAllSongs(Pageable pageable) {
        return songRepository.findAll(pageable);
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
