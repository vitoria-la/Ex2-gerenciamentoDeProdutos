package com.exercicios.gerenciamentoDeProdutos.Controllers;

import com.exercicios.gerenciamentoDeProdutos.Models.ProdutoModel;
import com.exercicios.gerenciamentoDeProdutos.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody ProdutoModel livroModel) {
        ProdutoModel request = produtoService.criarProduto(livroModel);
        return ResponseEntity.status(201).body(request);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> listarProdutos() {
        List<ProdutoModel> request = produtoService.listarProdutos();
        return ResponseEntity.status(200).body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ProdutoModel>> buscarProduto(@PathVariable Long id) {
        Optional<ProdutoModel> request = produtoService.buscarProduto(id);
        return ResponseEntity.status(200).body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable Long id) {
        produtoService.deletarProduto(id);
        return ResponseEntity.status(204).build();
    }

}
