package com.nexus.harmonyband.api.v1.assembler;

import com.nexus.harmonyband.api.v1.model.AlbumModel;
import com.nexus.harmonyband.domain.model.AlbumEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AlbumModelAssembler {

    private final ModelMapper modelMapper;

    @Autowired
    public AlbumModelAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public AlbumModel toModel(AlbumEntity albumEntity) {
        return modelMapper.map(albumEntity, AlbumModel.class);
    }

    public List<AlbumModel> toCollectionModel(List<AlbumEntity> albums) {
        return albums.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }
}
