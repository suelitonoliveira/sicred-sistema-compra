package com.sicred.desafio.sistema.compra.service;

import com.sicred.desafio.sistema.compra.mappers.ProdutoMapper;
import com.sicred.desafio.sistema.compra.model.dtos.ProdutoDTO;
import com.sicred.desafio.sistema.compra.model.entidades.Produto;
import com.sicred.desafio.sistema.compra.model.repository.ProdutoRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private static final int QUANTIDADE_PRODUTOS = 20;
    private final ProdutoRepository produtoRepository;

    @PostConstruct
    public void gerarProdutosAleatorios() {
        Random random = new Random();

        produtoRepository.saveAll(Stream.generate(() -> Produto.builder()
                        .nome("Produto " + UUID.randomUUID())
                        .valorUnitario(BigDecimal.valueOf(random.nextInt(10000)))
                        .build())
                .limit(QUANTIDADE_PRODUTOS)
                .toList());
    }

    public List<ProdutoDTO> buscarProdutos() {
        return produtoRepository.findAll().stream().map(ProdutoMapper::retornaProdutoDTO).toList();
    }

}
