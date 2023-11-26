package com.nexus.harmonyband.domain.exception;

import java.io.Serial;

public class EntityInUseException extends BusinessException {

    @Serial
    private static final long serialVersionUID = 1L;

    public EntityInUseException(String mensagem) {
        super(mensagem);
    }

}

