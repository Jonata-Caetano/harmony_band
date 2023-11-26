package com.nexus.harmonyband.api.v1.controller;

import com.nexus.harmonyband.api.v1.assembler.AlbumInputDisassembler;
import com.nexus.harmonyband.api.v1.assembler.AlbumModelAssembler;
import com.nexus.harmonyband.api.v1.model.AlbumModel;
import com.nexus.harmonyband.api.v1.model.input.AlbumInput;
import com.nexus.harmonyband.domain.model.AlbumEntity;
import com.nexus.harmonyband.domain.service.impl.AlbumServiceImpl;
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
@RequestMapping("/v1/albums")
public class AlbumController {

    private final AlbumServiceImpl service;
    private final AlbumInputDisassembler albumInputDisassembler;
    private final AlbumModelAssembler albumModelAssembler;

    @GetMapping
    public List<AlbumModel> getAllAlbums() {
        List<AlbumEntity> albums = service.getAllAlbums();
        return albumModelAssembler.toCollectionModel(albums);
    }

    @GetMapping("/{albumId}")
    public AlbumModel getAlbum(@PathVariable Long albumId) {
        var album = service.getAlbum(albumId);
        return albumModelAssembler.toModel(album);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlbumModel add(@RequestBody AlbumInput albumInput) {
        var albumEntity = albumInputDisassembler.toDomainObject(albumInput);
        var album = service.save(albumEntity);
        return albumModelAssembler.toModel(album);
    }

    @PutMapping("/{albumId}")
    public AlbumModel update(@PathVariable Long albumId, @RequestBody @Valid AlbumInput albumInput) {
        var currentAlbum = service.getAlbum(albumId);
        albumInputDisassembler.copytoDomainObject(albumInput, currentAlbum);
        currentAlbum = service.save(currentAlbum);

        return albumModelAssembler.toModel(currentAlbum);
    }

    @DeleteMapping("/{albumId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> remove(@PathVariable Long albumId) {
        service.delete(albumId);
        return ResponseEntity.noContent().build();
    }
}

