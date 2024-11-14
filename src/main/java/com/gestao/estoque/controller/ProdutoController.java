package com.gestao.estoque.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestao.estoque.entity.ProdutoEntity;
import com.gestao.estoque.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoEntity> listarTudo() {
        return produtoService.listarTudo();
    }

    @GetMapping("/id")
    public Optional<ProdutoEntity> listarPorId(BigInteger id) {
        return produtoService.listarPorId(id);
    }

    @PostMapping
    public ProdutoEntity salvar(ProdutoEntity produto) {
        return produtoService.salvar(produto);
    }

    @DeleteMapping("/id")
    public void deletar(BigInteger id) {
        produtoService.deletar(id);
    }
}
