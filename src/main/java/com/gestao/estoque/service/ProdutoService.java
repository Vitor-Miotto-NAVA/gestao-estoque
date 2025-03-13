package com.gestao.estoque.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gestao.estoque.dto.ProdutoDto;
import com.gestao.estoque.entity.ProdutoEntity;
import com.gestao.estoque.repository.ProdutoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProdutoService {

    private ObjectMapper objectMapper;   

    private ProdutoRepository produtoRepository;

    public List<ProdutoDto> listarTudo() {
        return produtoRepository.findAll().stream().map(this::convertToDto).toList();
    }

    private ProdutoDto convertToDto(ProdutoEntity produtoEntity) {
        ProdutoDto produtoDto = new ProdutoDto();
        try {
            produtoDto = objectMapper.convertValue(produtoEntity, ProdutoDto.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return produtoDto;
    }

    public Optional<ProdutoDto> listarPorId(BigInteger id) {
        return produtoRepository.findById(id).map(this::convertToDto);
    }

    public ProdutoDto salvar(ProdutoDto produto) {
        ProdutoEntity produtoEntity = convertToEntity(produto);
        ProdutoEntity savedEntity = produtoRepository.save(produtoEntity);
        return convertToDto(savedEntity);
    }

    private ProdutoEntity convertToEntity(ProdutoDto produtoDto) {
        ProdutoEntity produtoEntity = new ProdutoEntity();
        try {
            produtoEntity = objectMapper.convertValue(produtoDto, ProdutoEntity.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return produtoEntity;
    }

    public void deletar(BigInteger id) {
        produtoRepository.deleteById(id);
    }
}

