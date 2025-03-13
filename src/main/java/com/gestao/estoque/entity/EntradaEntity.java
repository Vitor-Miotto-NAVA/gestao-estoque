package com.gestao.estoque.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbentrada")
public class EntradaEntity {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLote;

    private Long idProduto;

    private LocalDate dataEntrada;

    private LocalDate dataFabricacao;

    private LocalDate dataValidade;

    private Integer quantidade;

}
