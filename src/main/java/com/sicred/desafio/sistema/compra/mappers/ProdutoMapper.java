package com.sicred.desafio.sistema.compra.mappers;

import com.sicred.desafio.sistema.compra.model.dtos.ProdutoDTO;
import com.sicred.desafio.sistema.compra.model.entidades.Produto;

public class ProdutoMapper {

    public static ProdutoDTO retornaProdutoDTO(Produto produto) {
        return ProdutoDTO
                .builder()
                .id(produto.getId())
                .nome(produto.getNome())
                .valorUnitario(produto.getValorUnitario())
                .build();

    }
}
