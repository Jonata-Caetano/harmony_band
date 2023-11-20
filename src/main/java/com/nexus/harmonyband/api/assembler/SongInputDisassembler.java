package com.nexus.harmonyband.api.assembler;

import com.nexus.harmonyband.api.model.input.SongInput;
import com.nexus.harmonyband.domain.SongEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SongInputDisassembler {

    private final ModelMapper modelMapper;

    @Autowired
    public SongInputDisassembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public SongEntity toDomainObject(SongInput songInput) {
        return modelMapper.map(songInput, SongEntity.class);
    }

    public void copytoDomainObject(SongInput songInput, SongEntity songEntity) {
        modelMapper.map(songInput, songEntity);
    }
}
