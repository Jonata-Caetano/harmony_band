package com.nexus.harmonyband.domain.service.impl;

import com.nexus.harmonyband.domain.exception.ArtistNotFoundException;
import com.nexus.harmonyband.domain.exception.EntityInUseException;
import com.nexus.harmonyband.domain.model.ArtistEntity;
import com.nexus.harmonyband.domain.service.ArtistService;
import com.nexus.harmonyband.infrastructure.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ArtistServiceImpl implements ArtistService {

    private static final String MSG_ARTIST_EM_USO = "Artista de código %d não pode ser removido, pois está em uso";

    private final ArtistRepository artistRepository;

    @Override
    public Page<ArtistEntity> getAllArtists(Pageable pageable) {

        return artistRepository.findAll(pageable);
    }

    @Override
    public ArtistEntity getArtist(Long artistId) {
        return artistRepository.findById(artistId).orElseThrow(() -> new ArtistNotFoundException(artistId));
    }

    @Override
    @Transactional
    public ArtistEntity save(ArtistEntity artistEntity) {
        return artistRepository.save(artistEntity);
    }

    @Override
    @Transactional
    public void delete(Long artistId) {
        try {
            artistRepository.deleteById(artistId);
            artistRepository.flush();

        } catch (EmptyResultDataAccessException e) {
            throw new ArtistNotFoundException(artistId);

        } catch (DataIntegrityViolationException e) {
            throw new EntityInUseException(String.format(MSG_ARTIST_EM_USO, artistId));
        }
    }
}
