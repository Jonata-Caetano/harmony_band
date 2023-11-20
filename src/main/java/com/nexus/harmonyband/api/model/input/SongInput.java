package com.nexus.harmonyband.api.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SongInput {

    private Long id;
    private String title;
    private AlbumInput album;

}
