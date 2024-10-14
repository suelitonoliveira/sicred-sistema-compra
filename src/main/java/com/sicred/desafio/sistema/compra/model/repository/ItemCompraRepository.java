package com.sicred.desafio.sistema.compra.model.repository;

import com.sicred.desafio.sistema.compra.model.entidades.ItemCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCompraRepository extends JpaRepository<ItemCompra, Long> {
}
