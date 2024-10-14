package com.sicred.desafio.sistema.compra.mappers;

import com.sicred.desafio.sistema.compra.exceptions.RecursoNaoEncontradoException;
import com.sicred.desafio.sistema.compra.model.dtos.ItemCompraDTO;
import com.sicred.desafio.sistema.compra.model.entidades.ItemCompra;
import com.sicred.desafio.sistema.compra.model.repository.CompraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ItemCompraMapper {


    public static ItemCompra retornaItemCompra(ItemCompraDTO itemCompraDTO, CompraRepository compraRepository) {
        var compra = compraRepository.findById(itemCompraDTO.getIdCompra())
                .orElseThrow(() ->
                        new RecursoNaoEncontradoException(
                                String.format("Compra com id:%d não encontrado", itemCompraDTO.getIdCompra())));
        return ItemCompra
                .builder()
                .id(itemCompraDTO.getId())
                .compra(compra)
                .build();
    }
}
