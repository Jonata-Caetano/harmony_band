package com.nexus.harmonyband.domain.service;

import com.nexus.harmonyband.domain.model.SongEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SongService {


    Page<SongEntity> getAllSongs(Pageable pageable);

    SongEntity getSong(Long albumId);

    SongEntity save(SongEntity songEntity);

    void delete(Long songId);
}
