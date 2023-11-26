package com.nexus.harmonyband.api.v1.model.input;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SongInput {

    private Long id;
    @NotBlank
    private String title;
    @JsonIgnore
    private String tempo;

    private AlbumInput album;

}
