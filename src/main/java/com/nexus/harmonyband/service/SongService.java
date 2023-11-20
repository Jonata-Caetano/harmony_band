package com.nexus.harmonyband.service;

import com.nexus.harmonyband.domain.SongEntity;

import java.util.List;

public interface SongService {

    List<SongEntity> getAllSongs();

    SongEntity getSong(Long albumId);

    SongEntity save(SongEntity songEntity);

    void delete(Long songId);
}