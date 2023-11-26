package com.nexus.harmonyband.api.v1.controller;

import com.nexus.harmonyband.api.v1.assembler.SongInputDisassembler;
import com.nexus.harmonyband.api.v1.assembler.SongModelAssembler;
import com.nexus.harmonyband.api.v1.model.SongModel;
import com.nexus.harmonyband.api.v1.model.input.SongInput;
import com.nexus.harmonyband.domain.model.SongEntity;
import com.nexus.harmonyband.domain.service.impl.SongServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/songs")
public class SongController {

    private final SongServiceImpl service;
    private final SongInputDisassembler songInputDisassembler;
    private final SongModelAssembler songModelAssembler;

    @GetMapping
    public List<SongModel> getAllSongs() {
        List<SongEntity> songs = service.getAllSongs();
        return songModelAssembler.toCollectionModel(songs);
    }

    @GetMapping("/{songId}")
    public SongModel getSong(@PathVariable Long songId) {
        var song = service.getSong(songId);
        return songModelAssembler.toModel(song);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SongModel add(@RequestBody SongInput songInput) {
        var songEntity = songInputDisassembler.toDomainObject(songInput);
        var song = service.save(songEntity);
        return songModelAssembler.toModel(song);
    }

    @PutMapping("/{songId}")
    public SongModel update(@PathVariable Long songId, @RequestBody @Valid SongInput songInput) {
        var currentSong = service.getSong(songId);
        songInputDisassembler.copytoDomainObject(songInput, currentSong);
        currentSong = service.save(currentSong);

        return songModelAssembler.toModel(currentSong);
    }

    @DeleteMapping("/{songId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> remove(@PathVariable Long songId) {
        service.delete(songId);
        return ResponseEntity.noContent().build();
    }
}

