package com.sicred.desafio.sistema.compra.mappers;

import com.sicred.desafio.sistema.compra.model.dtos.CompraDTO;
import com.sicred.desafio.sistema.compra.model.entidades.Compra;
import com.sicred.desafio.sistema.compra.model.repository.CompraRepository;


public class CompraMapper {

    public static Compra retornaCompra(CompraDTO compraDTO, CompraRepository compraRepository) {
        var itensCompra  = compraDTO.getItens().stream().map(i -> ItemCompraMapper.retornaItemCompra(i, compraRepository)).toList();
        return Compra
                .builder()
                .id(compraDTO.getId())
                .dataHoraCompra(compraDTO.getDataHoraCompra())
                .cpfComprador(compraDTO.getCpfComprador())
                .itens(itensCompra)
                .build();
    }

    public static CompraDTO retornaCompraDTO(Compra compra) {
        return CompraDTO
                .builder()
                .id(compra.getId())
                .cpfComprador(compra.getCpfComprador())
                .dataHoraCompra(compra.getDataHoraCompra())
                .build();
    }
}
