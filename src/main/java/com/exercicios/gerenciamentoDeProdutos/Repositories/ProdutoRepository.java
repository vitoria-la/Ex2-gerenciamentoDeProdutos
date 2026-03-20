package com.exercicios.gerenciamentoDeProdutos.Repositories;

import com.exercicios.gerenciamentoDeProdutos.Models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
