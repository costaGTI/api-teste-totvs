package com.apipedidos.Api_Pedidos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apipedidos.Api_Pedidos.domain.Categoria;
import com.apipedidos.Api_Pedidos.repository.CategoriaRepository;
import com.apipedidos.Api_Pedidos.service.exception.ObjectNotFoundException;


@Service
public class CategoriaServece {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + 
																  ", Tipo: " + Categoria.class.getName()));
							
		}
}
