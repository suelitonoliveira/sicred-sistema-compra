package com.sicred.desafio.sistema.compra.model.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemCompraDTO {


    @NotNull(message = "Campo idProduto obrigatório")
    private Long idProduto;

    @NotNull(message = "Campo nomeProduto obrigatório")
    private String nomeProduto;

    @NotNull(message = "Campo valorUnitarioProduto obrigatório")
    private BigDecimal valorUnitarioProduto;

    @NotNull(message = "Campo quantidade obrigatório")
    private BigDecimal quantidade;

    @NotNull(message = "Campo cpfComprador obrigatório")
    private String cpfComprador;

    @NotNull(message = "Campo dataHoraCompra obrigatório")
    private LocalDateTime dataHoraCompra;


}
