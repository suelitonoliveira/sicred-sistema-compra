package com.sicred.desafio.sistema.compra.controller;


import com.sicred.desafio.sistema.compra.model.dtos.ItemCompraDTO;
import com.sicred.desafio.sistema.compra.service.ItensCompraService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itens-compra")
@RequiredArgsConstructor
public class ItensCompraController {

    private final ItensCompraService itensCompraService;

    @PostMapping
    public ResponseEntity<ItemCompraDTO> cadastrarCompra(@RequestBody @Valid ItemCompraDTO itensCompraDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(itensCompraService.cadastrar(itensCompraDto));
    }
}
