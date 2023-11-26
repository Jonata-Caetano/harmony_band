package com.nexus.harmonyband.api.v1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlbumModel {

    private Long id;
    private String title;
    private ArtistModel artist;

}
