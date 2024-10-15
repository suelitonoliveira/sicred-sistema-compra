package com.sicred.desafio.sistema.compra.model.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_item_compra")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idProduto;

    private String nomeProduto;

    private BigDecimal valorUnitarioProduto;

    private BigDecimal quantidade;

    private String cpfComprador;

    private LocalDateTime dataHoraCompra;
}
