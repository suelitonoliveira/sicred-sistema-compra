package com.sicred.desafio.sistema.compra.service;

import com.sicred.desafio.sistema.compra.model.repository.CompraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompraService {

    private final CompraRepository compraRepository;


}
