package com.exercicios.gerenciamentoDeProdutos.Services;

import com.exercicios.gerenciamentoDeProdutos.Models.ProdutoModel;
import com.exercicios.gerenciamentoDeProdutos.Repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoModel criarProduto(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }
    public List<ProdutoModel> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> buscarProduto(Long id) {
        return produtoRepository.findById(id);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
