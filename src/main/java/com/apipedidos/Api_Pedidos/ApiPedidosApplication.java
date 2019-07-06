package com.apipedidos.Api_Pedidos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apipedidos.Api_Pedidos.domain.Categoria;
import com.apipedidos.Api_Pedidos.domain.Produto;
import com.apipedidos.Api_Pedidos.repository.CategoriaRepository;
import com.apipedidos.Api_Pedidos.repository.ProdutoRepository;

@SpringBootApplication
public class ApiPedidosApplication implements CommandLineRunner {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	@Autowired
	ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "informatica");
		Categoria cat2 = new Categoria(null, "escritorio");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impresora", 200.00);
		Produto p3 = new Produto(null, "Mesa", 300.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2));
		cat2.getProdutos().addAll(Arrays.asList(p3));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat2));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
	}
	
	

}
