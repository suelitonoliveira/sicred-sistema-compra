package com.sicred.desafio.sistema.compra.controller;


import com.sicred.desafio.sistema.compra.model.dtos.ItemCompraDTO;
import com.sicred.desafio.sistema.compra.service.ItensCompraService;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import static com.sicred.desafio.sistema.compra.utils.ValidadorUtil.validarLenght;

@RestController
@RequestMapping("/itens-compra")
@RequiredArgsConstructor
public class ItensCompraController {

    private final ItensCompraService itensCompraService;

    @PostMapping
    public ResponseEntity<ItemCompraDTO> cadastrarCompra(@RequestBody @Valid ItemCompraDTO itensCompraDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(itensCompraService.cadastrar(itensCompraDto));
    }

    @GetMapping
    public ResponseEntity<List<ItemCompraDTO>> buscarCompras(
            @Parameter(description = "CPF do comprador (deve ter no mínimo 3 caracteres) e ser válido")
            @RequestParam(required = false)  String cpfComprador,
            @Parameter(description = "Nome do produto (deve ter no mínimo 3 caracteres)")
            @RequestParam(required = false) String nomeProduto,
            @Parameter(description = "Data e hora no formato ISO 8601 com fuso horário UTC, por exemplo, '2024-10-15T16:20:34.706Z'")
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataInicio,
            @Parameter(description = "Data e hora no formato ISO 8601 com fuso horário UTC, por exemplo, '2024-10-15T16:20:34.706Z'")
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataFim) {
        validarLenght(cpfComprador);
        validarLenght(nomeProduto);
        List<ItemCompraDTO> compras = itensCompraService.buscar(cpfComprador, nomeProduto, dataInicio, dataFim);
        return ResponseEntity.ok(compras);
    }
}
