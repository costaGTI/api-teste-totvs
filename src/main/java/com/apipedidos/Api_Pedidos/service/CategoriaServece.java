package com.apipedidos.Api_Pedidos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apipedidos.Api_Pedidos.domain.Categoria;
import com.apipedidos.Api_Pedidos.repository.CategoriaRepository;

@Service
public class CategoriaServece {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElse(null);
		}
}
