package com.sicred.desafio.sistema.compra.model.dtos;

import com.sicred.desafio.sistema.compra.model.entidades.Compra;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemCompraDTO {

    private Long id;

    private Long idProduto;

    private Compra idCompra;

    private BigDecimal quantidade;

}
