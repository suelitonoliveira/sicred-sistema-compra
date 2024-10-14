package com.sicred.desafio.sistema.compra.model.repository;

import com.sicred.desafio.sistema.compra.model.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
