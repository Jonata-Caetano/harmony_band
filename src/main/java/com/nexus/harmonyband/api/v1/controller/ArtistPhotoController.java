package com.nexus.harmonyband.api.v1.controller;

import com.nexus.harmonyband.api.v1.assembler.ArtistPhotoModelAssembler;
import com.nexus.harmonyband.api.v1.model.ArtistPhotoModel;
import com.nexus.harmonyband.api.v1.model.input.PhotoArtistInput;
import com.nexus.harmonyband.domain.model.ArtistEntity;
import com.nexus.harmonyband.domain.model.ArtistPhotoEntity;
import com.nexus.harmonyband.domain.service.impl.ArtistPhotoServiceImpl;
import com.nexus.harmonyband.domain.service.impl.ArtistServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/artists/{artistId}/photo")
public class ArtistPhotoController {

    private final ArtistPhotoServiceImpl artistPhotoService;
    private final ArtistServiceImpl artistService;
    private final ArtistPhotoModelAssembler artistPhotoModelAssembler;

    @PutMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ArtistPhotoModel updatePhoto(@PathVariable Long artistId, @Valid PhotoArtistInput artistPhotoInput) {
        ArtistEntity artist = artistService.getArtist(artistId);

        MultipartFile file = artistPhotoInput.getFile();

        ArtistPhotoEntity artistPhoto = new ArtistPhotoEntity();
        artistPhoto.setArtist(artist);
        artistPhoto.setName(file.getOriginalFilename());
        artistPhoto.setDescription(artistPhotoInput.getDescription());
        artistPhoto.setContentType(file.getContentType());
        artistPhoto.setFileSize(file.getSize());

        var artistSavedPhoto = artistPhotoService.save(artistPhoto);

        return artistPhotoModelAssembler.toModel(artistSavedPhoto);
    }
}
