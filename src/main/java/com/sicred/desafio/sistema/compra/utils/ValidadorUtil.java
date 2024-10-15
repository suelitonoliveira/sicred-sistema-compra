package com.sicred.desafio.sistema.compra.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

public class ValidadorUtil {
    public static void validarLenght(String valor) {
        if (Objects.nonNull(valor) && valor.length() < 3) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Esse campo deve ter no mínimo 3 caracteres.");
        }

    }
}
