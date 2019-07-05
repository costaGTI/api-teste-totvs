package com.apipedidos.Api_Pedidos.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apipedidos.Api_Pedidos.domain.Categoria;
import com.apipedidos.Api_Pedidos.service.CategoriaServece;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {
	
	@Autowired
	CategoriaServece categoriaServece;
	
	
	@RequestMapping( value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria categoria = categoriaServece.find(id);
		return ResponseEntity.ok().body(categoria);
		
	}

}
