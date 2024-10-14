package com.sicred.desafio.sistema.compra.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ProdutoDTO {

    private Long id;

    private String nome;

    private BigDecimal valorUnitario;
}
