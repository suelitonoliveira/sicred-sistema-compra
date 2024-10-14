package com.sicred.desafio.sistema.compra.model.dtos;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class CompraDTO {

    private Long id;

    private String cpfComprador;

    private LocalDateTime dataHoraCompra;

    @Valid
    private List<ItemCompraDTO> itens;
}
