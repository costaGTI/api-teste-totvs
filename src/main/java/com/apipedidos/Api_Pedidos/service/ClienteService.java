package com.apipedidos.Api_Pedidos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apipedidos.Api_Pedidos.domain.Cliente;
import com.apipedidos.Api_Pedidos.repository.ClienteRepository;
import com.apipedidos.Api_Pedidos.service.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Cliente não Encontado"));
	}

}
