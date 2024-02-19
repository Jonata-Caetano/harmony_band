package com.nexus.harmonyband.api.v1.model.input;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlbumInput {

    private Long id;
    @NotBlank
    private String title;
    private ArtistInput artist;

}
