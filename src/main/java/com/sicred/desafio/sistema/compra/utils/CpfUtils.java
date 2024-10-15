package com.sicred.desafio.sistema.compra.utils;

import br.com.caelum.stella.validation.CPFValidator;

import java.util.Objects;

public class CpfUtils {


    public static String validarCPF(String cpf) throws IllegalArgumentException {
        cpf = removerMascara(cpf);
        CPFValidator cpfValidator = new CPFValidator();
        cpfValidator.assertValid(cpf);
        return cpf;
    }


    public static String removerMascara(String cpf) {
        if (Objects.isNull(cpf)) {
            return null;
        }
        return cpf.replaceAll("[^\\d]", "");
    }

}
