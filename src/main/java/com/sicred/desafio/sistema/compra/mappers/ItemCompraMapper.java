package com.sicred.desafio.sistema.compra.mappers;

import com.sicred.desafio.sistema.compra.model.dtos.ItemCompraDTO;
import com.sicred.desafio.sistema.compra.model.entidades.ItemCompra;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static com.sicred.desafio.sistema.compra.utils.CpfUtils.validarCPF;

@Component
@RequiredArgsConstructor
public class ItemCompraMapper {


    public static ItemCompraDTO retornaItemCompraDTO(ItemCompra itemCompra) {
        return ItemCompraDTO
                .builder()
                .idProduto(itemCompra.getIdProduto())
                .nomeProduto(itemCompra.getNomeProduto())
                .cpfComprador(itemCompra.getCpfComprador())
                .valorUnitarioProduto(itemCompra.getValorUnitarioProduto())
                .dataHoraCompra(itemCompra.getDataHoraCompra())
                .quantidade(itemCompra.getQuantidade())
                .build();
    }

    public static ItemCompra retornaItemCompra(ItemCompraDTO itemCompraDTO) {
        return ItemCompra
                .builder()
                .idProduto(itemCompraDTO.getIdProduto())
                .nomeProduto(itemCompraDTO.getNomeProduto())
                .cpfComprador(validarCPF(itemCompraDTO.getCpfComprador()))
                .valorUnitarioProduto(itemCompraDTO.getValorUnitarioProduto())
                .dataHoraCompra(itemCompraDTO.getDataHoraCompra())
                .quantidade(itemCompraDTO.getQuantidade())
                .build();
    }
}
