package com.sicred.desafio.sistema.compra.mappers;

import com.sicred.desafio.sistema.compra.model.dtos.CompraDTO;
import com.sicred.desafio.sistema.compra.model.entidades.Compra;


public class CompraMapper {

    public static Compra retornaCompra(CompraDTO compraDTO) {
        return Compra
                .builder()
                .id(compraDTO.getId())
                .dataHoraCompra(compraDTO.getDataHoraCompra())
                .cpfComprador(compraDTO.getCpfComprador())
                .itens(compraDTO.getItens())
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
