package com.apipedidos.Api_Pedidos.domain;

import javax.persistence.Entity;

import com.apipedidos.Api_Pedidos.domain.enums.EstadoPagamento;

@Entity
public class PagamentoCartao extends Pagamento {
	
	private static final long serialVersionUID = 1L;
	
	private int numParcelas;
	
	public PagamentoCartao () {
		
	}

	public PagamentoCartao(Integer id, EstadoPagamento estadoDoPedido, Pedido pedido, int numParcelas) {
		super(id, estadoDoPedido, pedido);
		this.numParcelas = numParcelas;
	}

	public int getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}
	
	
	
	
}
