package com.sicred.desafio.sistema.compra.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RelatorioComprasDTO {
    private String nomeProduto;
    private BigDecimal valorUnitarioProduto;
    private Long quantidadeCompras;
    private BigDecimal totalVendido;
}
