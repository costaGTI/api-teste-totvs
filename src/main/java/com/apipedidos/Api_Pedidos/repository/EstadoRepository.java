package com.apipedidos.Api_Pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apipedidos.Api_Pedidos.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>  {

}
