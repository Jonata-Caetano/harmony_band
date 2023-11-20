package com.nexus.harmonyband.api.model.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
public class AlbumInput {

    private String title;
    @Valid
    private ArtistInput artist;
}
