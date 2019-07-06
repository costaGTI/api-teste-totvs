package com.apipedidos.Api_Pedidos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apipedidos.Api_Pedidos.domain.Categoria;
import com.apipedidos.Api_Pedidos.domain.Cidade;
import com.apipedidos.Api_Pedidos.domain.Cliente;
import com.apipedidos.Api_Pedidos.domain.Endereco;
import com.apipedidos.Api_Pedidos.domain.Estado;
import com.apipedidos.Api_Pedidos.domain.Produto;
import com.apipedidos.Api_Pedidos.domain.enums.TipoCliente;
import com.apipedidos.Api_Pedidos.repository.CategoriaRepository;
import com.apipedidos.Api_Pedidos.repository.CidadeRepository;
import com.apipedidos.Api_Pedidos.repository.ClienteRepository;
import com.apipedidos.Api_Pedidos.repository.EnderecoRepository;
import com.apipedidos.Api_Pedidos.repository.EstadoRepository;
import com.apipedidos.Api_Pedidos.repository.ProdutoRepository;

@SpringBootApplication
public class ApiPedidosApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	
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
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "Rio de Janeiro");
		Estado est3 = new Estado(null, "Goias");
		
		Cidade cid1 = new Cidade(null, "Uberlandia", est1);
		Cidade cid2 = new Cidade(null, "Rio de Janeiro", est2);
		Cidade cid3 = new Cidade(null, "Goiania", est3);
		Cidade cid4 = new Cidade(null, "Ap de Goiania", est3);
		Cidade cid5 = new Cidade(null, "Anapolis", est3);
		Cidade cid6 = new Cidade(null, "Goianira", est3);
		
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2));
		cat2.getProdutos().addAll(Arrays.asList(p3));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat2));
		
		est1.getCidades().addAll(Arrays.asList(cid1));
		est2.getCidades().addAll(Arrays.asList(cid2));
		est3.getCidades().addAll(Arrays.asList(cid3,cid4,cid5,cid6));
		
		Cliente cli1 = new Cliente(null, "Lucas Marques", "lucas@gmail","03116952132", TipoCliente.PESSOAFISICA);
		
		cli1.getTelefones().addAll(Arrays.asList("12345", "123456"));
		
		Endereco end1 = new Endereco(null, "rua 1", "12b", "casa 2", "Floresta", "78123000", cli1, cid3);
		
		cli1.getEnderecos().addAll(Arrays.asList(end1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		estadoRepository.saveAll(Arrays.asList(est1,est2,est3));
		cidadeRepository.saveAll(Arrays.asList(cid1,cid2,cid3,cid4,cid5,cid6));
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(end1));
	}
	
	

}
