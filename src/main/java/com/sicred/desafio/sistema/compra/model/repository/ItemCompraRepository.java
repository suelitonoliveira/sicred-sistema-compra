package com.sicred.desafio.sistema.compra.model.repository;

import com.sicred.desafio.sistema.compra.model.entidades.ItemCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCompraRepository extends JpaRepository<ItemCompra, Long> {

    @Query("SELECT SUM(ic.quantidade) FROM ItemCompra ic WHERE ic.cpfComprador = :cpfComprador AND ic.idProduto = :idProduto")
    Long contarQuantidadePorCpfEProduto(@Param("cpfComprador") String cpfComprador, @Param("idProduto") Long idProduto);

    @Query(value = "SELECT count(*) FROM TB_ITEM_COMPRA ic WHERE ic.CPF_COMPRADOR = :cpfComprador", nativeQuery = true)
    Long contar(@Param("cpfComprador") String cpfComprador);



}
