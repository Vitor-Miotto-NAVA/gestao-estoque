package com.gestao.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestao.estoque.entity.ProdutoEntity;
import java.math.BigInteger;

public interface ProdutoRepository extends JpaRepository <ProdutoEntity, BigInteger> {

    
}
