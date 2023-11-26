package com.nexus.harmonyband.domain.exception;

import java.io.Serial;

public abstract class EntityNotFoundException extends BusinessException {

    @Serial
    private static final long serialVersionUID = 1L;

    protected EntityNotFoundException(String mensagem) {
        super(mensagem);
    }

}
