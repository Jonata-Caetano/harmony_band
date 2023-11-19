package com.nexus.harmonyband.api.controller;

import com.nexus.harmonyband.domain.SongEntity;
import com.nexus.harmonyband.infrastructure.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/songs")
public class SongController {

    private final SongRepository songRepository;

    @GetMapping
    public List<SongEntity> getAllSongs() {

        return songRepository.findAll();
    }
}

