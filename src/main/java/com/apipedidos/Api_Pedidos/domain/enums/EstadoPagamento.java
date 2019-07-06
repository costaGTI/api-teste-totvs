package com.apipedidos.Api_Pedidos.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quidado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String tipo;

	private EstadoPagamento (int cod, String tipo) {
		this.cod = cod;
		this.tipo = tipo;
	}

	public int getCod() {
		return cod;
	}
 
	public String getTipo() {
		return tipo;
	}

	public static EstadoPagamento toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (EstadoPagamento pagamento : EstadoPagamento.values()) {
			if (cod.equals(pagamento.getCod())) {
				return pagamento;
			}
		}
		throw new IllegalArgumentException("Id invalido " + cod);
	}

	
}
