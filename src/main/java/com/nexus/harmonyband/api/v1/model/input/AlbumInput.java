package com.nexus.harmonyband.api.v1.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlbumInput {

    private Long id;
    private String title;
    private ArtistInput artist;

}
