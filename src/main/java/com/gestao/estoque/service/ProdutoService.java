package com.gestao.estoque.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestao.estoque.entity.ProdutoEntity;
import com.gestao.estoque.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoEntity> listarTudo() {
        return produtoRepository.findAll();
    }

    public Optional<ProdutoEntity> listarPorId(BigInteger id) {
        return produtoRepository.findById(id);
    }

    public ProdutoEntity salvar(ProdutoEntity produto) {
        return produtoRepository.save(produto);
    }

    public void deletar(BigInteger id) {
        produtoRepository.deleteById(id);
    }

}
