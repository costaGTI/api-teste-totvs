package com.apipedidos.Api_Pedidos.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.apipedidos.Api_Pedidos.domain.enums.EstadoPagamento;

@Entity
public class PagamentoBoleto extends Pagamento {
	
	private static final long serialVersionUID = 1L;

	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoBoleto() {
		
	}

	public PagamentoBoleto(Integer id, EstadoPagamento estadoDoPedido, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estadoDoPedido, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
	
}
