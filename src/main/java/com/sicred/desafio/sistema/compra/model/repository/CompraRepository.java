package com.sicred.desafio.sistema.compra.model.repository;

import com.sicred.desafio.sistema.compra.model.entidades.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
}
