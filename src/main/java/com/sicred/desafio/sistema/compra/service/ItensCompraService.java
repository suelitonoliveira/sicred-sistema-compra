package com.sicred.desafio.sistema.compra.service;

import com.sicred.desafio.sistema.compra.exceptions.RecursoNaoEncontradoException;
import com.sicred.desafio.sistema.compra.mappers.ItemCompraMapper;
import com.sicred.desafio.sistema.compra.model.dtos.ItemCompraDTO;
import com.sicred.desafio.sistema.compra.model.entidades.ItemCompra;
import com.sicred.desafio.sistema.compra.model.repository.ItemCompraRepository;
import com.sicred.desafio.sistema.compra.model.specifications.ItemCompraSpecification;
import com.sicred.desafio.sistema.compra.utils.CpfUtils;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.sicred.desafio.sistema.compra.mappers.ItemCompraMapper.retornaItemCompra;

@Service
@RequiredArgsConstructor
public class ItensCompraService {

    private final ItemCompraRepository itemCompraRepository;

    @Transactional(rollbackOn = Exception.class)
    public ItemCompraDTO cadastrar(ItemCompraDTO compraDTO) {
        ItemCompra itemCompra = retornaItemCompra(compraDTO);
        validarQuantidadePedido(itemCompra);
        return ItemCompraMapper.retornaItemCompraDTO(itemCompraRepository.saveAndFlush(itemCompra));
    }

    private void validarQuantidadePedido(ItemCompra itemCompra) {
        Long quantidadeTotal = itemCompraRepository.contarQuantidadePorCpfEProduto(itemCompra.getCpfComprador(), itemCompra.getIdProduto());
        if (Objects.nonNull(quantidadeTotal) && quantidadeTotal >= 3) {
            throw new RecursoNaoEncontradoException("Um mesmo CPF não pode comprar mais de 3 unidades do mesmo produto.");
        }
    }

    public List<ItemCompraDTO> buscar(String cpfComprador, String nomeProduto, LocalDateTime dataInicio, LocalDateTime dataFim) {
        String cpfValidado = CpfUtils.validarCPF(cpfComprador);
        List<ItemCompra> compras = itemCompraRepository.findAll(ItemCompraSpecification.comFiltro(cpfValidado, nomeProduto, dataInicio, dataFim));
        return compras.stream().map(ItemCompraMapper::retornaItemCompraDTO).toList();
    }
}
