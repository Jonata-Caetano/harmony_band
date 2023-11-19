package com.nexus.harmonyband.api.controller;

import com.nexus.harmonyband.api.assembler.ArtistInputDisassembler;
import com.nexus.harmonyband.api.assembler.ArtistModelAssembler;
import com.nexus.harmonyband.api.model.ArtistModel;
import com.nexus.harmonyband.api.model.input.ArtistInput;
import com.nexus.harmonyband.domain.ArtistEntity;
import com.nexus.harmonyband.service.impl.ArtistServiceImpl;
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
import javax.validation.Valid;

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

    @GetMapping("/{artistId}")
    public ArtistModel buscar(@PathVariable Long artistId) {
        var artist = service.getArtist(artistId);
        return artistModelAssembler.toModel(artist);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ArtistModel add(@RequestBody ArtistInput artistInput) {
        var artist = service.save(artistInputDisassembler.toDomainObject(artistInput));
        return artistModelAssembler.toModel(artist);
    }

    @PutMapping("/{artistId}")
    public ArtistModel updated(@PathVariable Long artistId, @RequestBody @Valid ArtistInput artistInput){
        var currentArtist = service.getArtist(artistId);
        artistInputDisassembler.copytoDomainObject(artistInput, currentArtist);
        currentArtist = service.save(currentArtist);

        return artistModelAssembler.toModel(currentArtist);
    }

    @DeleteMapping("/{artistId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> delete(@PathVariable Long artistId){
        service.delete(artistId);
        return ResponseEntity.noContent().build();
    }
}

