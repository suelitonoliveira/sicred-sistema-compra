package com.sicred.desafio.sistema.compra.model.dtos;

import jakarta.validation.constraints.NotNull;
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

    @NotNull(message = "Campo idProduto obrigatório")
    private Long idProduto;

    @NotNull(message = "Campo quantidade obrigatório")
    private BigDecimal quantidade;

}
