package com.nexus.harmonyband.api.model;

import com.nexus.harmonyband.domain.AlbumEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SongModel {

    private Long id;
    private String title;
    private AlbumEntity album;

}
