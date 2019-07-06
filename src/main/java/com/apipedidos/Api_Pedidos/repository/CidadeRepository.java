package com.apipedidos.Api_Pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apipedidos.Api_Pedidos.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>  {

}
