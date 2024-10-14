package com.sicred.desafio.sistema.compra.controller;

import com.sicred.desafio.sistema.compra.model.dtos.ProdutoDTO;
import com.sicred.desafio.sistema.compra.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> buscarProdutos() {
        return ResponseEntity.ok(produtoService.buscarProdutos());
    }
}
