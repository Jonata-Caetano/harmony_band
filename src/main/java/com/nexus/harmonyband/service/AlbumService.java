package com.nexus.harmonyband.service;

import com.nexus.harmonyband.domain.AlbumEntity;

import java.util.List;

public interface AlbumService {

    List<AlbumEntity> getAllAlbums();

    AlbumEntity save(AlbumEntity albumEntity);
}
