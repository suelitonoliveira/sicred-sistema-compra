package com.sicred.desafio.sistema.compra.model.repository;

import com.sicred.desafio.sistema.compra.model.dtos.RelatorioComprasDTO;
import com.sicred.desafio.sistema.compra.model.entidades.ItemCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ItemCompraRepository extends JpaRepository<ItemCompra, Long>, JpaSpecificationExecutor<ItemCompra> {

    @Query("SELECT SUM(ic.quantidade) FROM ItemCompra ic WHERE ic.cpfComprador = :cpfComprador AND ic.idProduto = :idProduto")
    Long contarQuantidadePorCpfEProduto(@Param("cpfComprador") String cpfComprador, @Param("idProduto") Long idProduto);

    @Query("SELECT new com.sicred.desafio.sistema.compra.model.dtos.RelatorioComprasDTO(ic.nomeProduto, ic.valorUnitarioProduto, COUNT(ic), SUM(ic.quantidade * ic.valorUnitarioProduto)) " +
            "FROM ItemCompra ic " +
            "WHERE ic.dataHoraCompra BETWEEN :dataInicio AND :dataFim " +
            "GROUP BY ic.nomeProduto, ic.valorUnitarioProduto")
    List<RelatorioComprasDTO> gerarRelatorioComprasPorPeriodo(LocalDateTime dataInicio, LocalDateTime dataFim);

}
