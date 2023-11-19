package com.nexus.harmonyband.api.controller;

import com.nexus.harmonyband.api.assembler.ArtistInputDisassembler;
import com.nexus.harmonyband.api.assembler.ArtistModelAssembler;
import com.nexus.harmonyband.api.model.ArtistModel;
import com.nexus.harmonyband.api.model.input.ArtistInput;
import com.nexus.harmonyband.domain.ArtistEntity;
import com.nexus.harmonyband.service.impl.ArtistServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/artists")
public class ArtistController {

    private final ArtistServiceImpl service;
    private final ArtistInputDisassembler artistInputDisassembler;
    private final ArtistModelAssembler artistModelAssembler;

    @GetMapping
    public List<ArtistModel> getAllArtists() {
        List<ArtistEntity> artists = service.getAllArtists();
        return artistModelAssembler.toCollectionModel(artists);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ArtistModel add(@RequestBody ArtistInput artistInput) {
        var artist = service.save(artistInputDisassembler.toDomainObject(artistInput));
        return artistModelAssembler.toModel(artist);
    }
}

