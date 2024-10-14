package com.sicred.desafio.sistema.compra.service;

import com.sicred.desafio.sistema.compra.mappers.CompraMapper;
import com.sicred.desafio.sistema.compra.model.dtos.CompraDTO;
import com.sicred.desafio.sistema.compra.model.entidades.Compra;
import com.sicred.desafio.sistema.compra.model.repository.CompraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompraService {

    private final CompraRepository compraRepository;


    public CompraDTO cadastrar(CompraDTO compraDTO) {
        Compra compra = compraRepository.save(CompraMapper.retornaCompra(compraDTO, compraRepository));
        return CompraMapper.retornaCompraDTO(compra);
    }
}
