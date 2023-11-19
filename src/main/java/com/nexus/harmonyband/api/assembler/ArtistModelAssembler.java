package com.nexus.harmonyband.api.assembler;

import com.nexus.harmonyband.api.model.ArtistModel;
import com.nexus.harmonyband.domain.ArtistEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ArtistModelAssembler {

    private final ModelMapper modelMapper;

    @Autowired
    public ArtistModelAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ArtistModel toModel(ArtistEntity artistEntity) {
        return modelMapper.map(artistEntity, ArtistModel.class);
    }

    public List<ArtistModel> toCollectionModel(List<ArtistEntity> artists) {
        return artists.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }
}
