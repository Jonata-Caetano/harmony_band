package com.nexus.harmonyband.api.v1.assembler;

import com.nexus.harmonyband.api.v1.model.input.ArtistInput;
import com.nexus.harmonyband.domain.model.ArtistEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArtistInputDisassembler {

    private final ModelMapper modelMapper;

    @Autowired
    public ArtistInputDisassembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ArtistEntity toDomainObject(ArtistInput artistInput) {
        return modelMapper.map(artistInput, ArtistEntity.class);
    }

    public void copytoDomainObject(ArtistInput artistInput, ArtistEntity artistEntity) {
        modelMapper.map(artistInput, artistEntity);
    }
}
