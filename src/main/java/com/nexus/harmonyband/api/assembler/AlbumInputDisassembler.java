package com.nexus.harmonyband.api.assembler;

import com.nexus.harmonyband.api.model.input.AlbumInput;
import com.nexus.harmonyband.domain.AlbumEntity;
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
