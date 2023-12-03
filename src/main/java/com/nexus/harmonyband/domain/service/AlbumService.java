package com.nexus.harmonyband.domain.service;

import com.nexus.harmonyband.domain.model.AlbumEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AlbumService {

    Page<AlbumEntity> getAllAlbums(Pageable pageable);

    AlbumEntity getAlbum(Long albumId);

    AlbumEntity save(AlbumEntity albumEntity);

    void delete(Long albumId);
}
