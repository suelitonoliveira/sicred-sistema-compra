package com.sicred.desafio.sistema.compra.model.specifications;

import com.sicred.desafio.sistema.compra.model.entidades.ItemCompra;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ItemCompraSpecification {
    public static Specification<ItemCompra> comFiltro(String cpfComprador, String nomeProduto, LocalDateTime dataInicio, LocalDateTime dataFim) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (Objects.nonNull(cpfComprador) && cpfComprador.length() >= 3) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("cpfComprador")), "%" + cpfComprador.toLowerCase() + "%"));
            }

            if (Objects.nonNull(nomeProduto) && nomeProduto.length() >= 3) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("nomeProduto")), "%" + nomeProduto.toLowerCase() + "%"));
            }

            if (Objects.nonNull(dataInicio) && Objects.nonNull(dataFim)) {
                predicates.add(criteriaBuilder.between(root.get("dataHoraCompra"), dataInicio, dataFim));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
