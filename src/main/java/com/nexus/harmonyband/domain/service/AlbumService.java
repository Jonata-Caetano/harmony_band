package com.nexus.harmonyband.domain.service;

import com.nexus.harmonyband.domain.model.AlbumEntity;

import java.util.List;

public interface AlbumService {

    List<AlbumEntity> getAllAlbums();

    AlbumEntity getAlbum(Long albumId);

    AlbumEntity save(AlbumEntity albumEntity);

    void delete(Long albumId);
}
