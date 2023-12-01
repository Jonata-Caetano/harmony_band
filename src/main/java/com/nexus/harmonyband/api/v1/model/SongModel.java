package com.nexus.harmonyband.api.v1.model;

import com.nexus.harmonyband.domain.model.AlbumEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SongModel {

    private Long id;
    private String title;
    private String key;
    private String bpm;
    private String timeSig;
    private Boolean status = true;
    private String chart;
    private String song;
    private String playback;
    private AlbumEntity album;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

}
