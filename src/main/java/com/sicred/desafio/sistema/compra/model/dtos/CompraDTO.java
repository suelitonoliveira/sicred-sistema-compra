package com.sicred.desafio.sistema.compra.model.dtos;

import com.sicred.desafio.sistema.compra.model.entidades.ItemCompra;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class CompraDTO {

    private Long id;

    private String cpfComprador;

    private LocalDateTime dataHoraCompra = LocalDateTime.now();

    private List<ItemCompra> itens = new ArrayList<>();
}
