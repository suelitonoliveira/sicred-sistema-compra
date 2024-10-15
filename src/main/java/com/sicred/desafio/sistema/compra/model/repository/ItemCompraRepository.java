package com.sicred.desafio.sistema.compra.model.repository;

import com.sicred.desafio.sistema.compra.model.entidades.ItemCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCompraRepository extends JpaRepository<ItemCompra, Long>, JpaSpecificationExecutor<ItemCompra> {

    @Query("SELECT SUM(ic.quantidade) FROM ItemCompra ic WHERE ic.cpfComprador = :cpfComprador AND ic.idProduto = :idProduto")
    Long contarQuantidadePorCpfEProduto(@Param("cpfComprador") String cpfComprador, @Param("idProduto") Long idProduto);

}
