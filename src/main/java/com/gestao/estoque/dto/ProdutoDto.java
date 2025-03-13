package com.gestao.estoque.dto;

import lombok.Data;

@Data
public class ProdutoDto {
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer quantidade;
}
