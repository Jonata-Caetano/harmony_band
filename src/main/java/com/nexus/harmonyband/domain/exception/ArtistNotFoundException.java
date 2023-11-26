package com.nexus.harmonyband.domain.exception;

import java.io.Serial;

public class ArtistNotFoundException extends EntityNotFoundException {

    @Serial
    private static final long serialVersionUID = 1L;

    public ArtistNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ArtistNotFoundException(Long artistId) {
        this(String.format("Não existe um cadastro de artista com código %d", artistId));
    }

}
