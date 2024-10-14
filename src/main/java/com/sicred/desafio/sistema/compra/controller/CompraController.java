package com.sicred.desafio.sistema.compra.controller;


import com.sicred.desafio.sistema.compra.model.dtos.CompraDTO;
import com.sicred.desafio.sistema.compra.service.CompraService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compras")
@RequiredArgsConstructor
public class CompraController {

    private final CompraService compraService;

    @PostMapping
    public ResponseEntity<CompraDTO> cadastrarCompra(@RequestBody @Valid CompraDTO compraDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(compraService.cadastrar(compraDTO));
    }
}
