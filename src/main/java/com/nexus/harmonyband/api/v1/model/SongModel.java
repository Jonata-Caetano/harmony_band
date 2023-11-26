package com.nexus.harmonyband.api.v1.model;

import com.nexus.harmonyband.domain.model.AlbumEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SongModel {

    private Long id;
    private String title;
    private AlbumEntity album;

}
