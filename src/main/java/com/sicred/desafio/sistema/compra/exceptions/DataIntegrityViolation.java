package com.sicred.desafio.sistema.compra.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.dao.DataIntegrityViolationException;

@EqualsAndHashCode(callSuper = true)
@Data
public class DataIntegrityViolation extends RuntimeException {

    private final DataIntegrityViolationException dataIntegrityViolationException;

    public DataIntegrityViolation(String message, DataIntegrityViolationException e) {
        super(message);
        this.dataIntegrityViolationException = e;
    }
}
