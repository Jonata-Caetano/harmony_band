package com.nexus.harmonyband.api.v1.assembler;

import com.nexus.harmonyband.api.v1.model.ArtistPhotoModel;
import com.nexus.harmonyband.domain.model.ArtistPhotoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArtistPhotoModelAssembler {

    private final ModelMapper modelMapper;

    @Autowired
    public ArtistPhotoModelAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ArtistPhotoModel toModel(ArtistPhotoEntity artistEntity) {

        return modelMapper.map(artistEntity, ArtistPhotoModel.class);
    }
}
