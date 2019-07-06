package com.apipedidos.Api_Pedidos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apipedidos.Api_Pedidos.domain.Categoria;
import com.apipedidos.Api_Pedidos.repository.CategoriaRepository;

@SpringBootApplication
public class ApiPedidosApplication implements CommandLineRunner {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "informatica");
		Categoria cat2 = new Categoria(null, "escritorio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}
	
	

}
