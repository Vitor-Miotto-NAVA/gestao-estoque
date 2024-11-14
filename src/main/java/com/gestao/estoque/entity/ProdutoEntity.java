package com.gestao.estoque.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tbproduto")
public class ProdutoEntity {
    
    @Id
    private BigInteger id;
    
    private String nome;

    private String descricao;

    private String observacoes;

    private BigDecimal valor_venda;

    private BigDecimal valor_custo;

    private Date dataCriacao;


    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public BigDecimal getValorVenda() {
        return valor_venda;
    }

    public void setValorVenda(BigDecimal valor_venda) {
        this.valor_venda = valor_venda;
    }

    public BigDecimal getValorCusto() {
        return valor_custo;
    }

    public void setValorCusto(BigDecimal valor_custo) {
        this.valor_custo = valor_custo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

}
