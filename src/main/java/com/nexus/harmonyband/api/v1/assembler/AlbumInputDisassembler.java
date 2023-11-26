package com.nexus.harmonyband.api.v1.assembler;

import com.nexus.harmonyband.api.v1.model.input.AlbumInput;
import com.nexus.harmonyband.domain.model.AlbumEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlbumInputDisassembler {

    private final ModelMapper modelMapper;

    @Autowired
    public AlbumInputDisassembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public AlbumEntity toDomainObject(AlbumInput albumInput) {
        return modelMapper.map(albumInput, AlbumEntity.class);
    }

    public void copytoDomainObject(AlbumInput albumInput, AlbumEntity albumEntity) {
        modelMapper.map(albumInput, albumEntity);
    }
}
