package com.nexus.harmonyband.api.controller;

import com.nexus.harmonyband.domain.AlbumEntity;
import com.nexus.harmonyband.infrastructure.AlbumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/albums")
public class AlbumController {

    private final AlbumRepository albumRepository;

    @GetMapping
    public List<AlbumEntity> getAllAlbums() {

        return albumRepository.findAll();
    }
}

