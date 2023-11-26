package com.nexus.harmonyband.api.v1.assembler;

import com.nexus.harmonyband.api.v1.model.SongModel;
import com.nexus.harmonyband.domain.model.SongEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SongModelAssembler {

    private final ModelMapper modelMapper;

    @Autowired
    public SongModelAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public SongModel toModel(SongEntity songEntity) {
        return modelMapper.map(songEntity, SongModel.class);
    }

    public List<SongModel> toCollectionModel(List<SongEntity> songs) {
        return songs.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }
}
