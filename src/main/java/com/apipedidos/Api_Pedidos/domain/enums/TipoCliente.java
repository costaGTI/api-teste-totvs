package com.apipedidos.Api_Pedidos.domain.enums;

public enum TipoCliente {
	PESSOAFISICA(1, "Pessoa Fisica"), PESSOAJURIDICA(2, "PEssoa Juridica");

	private int cod;
	private String tipo;

	private TipoCliente(int cod, String tipo) {
		this.cod = cod;
		this.tipo = tipo;
	}

	public int getCod() {
		return cod;
	}

	public String getTipo() {
		return tipo;
	}

	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoCliente cliente : TipoCliente.values()) {
			if (cod.equals(cliente.getCod())) {
				return cliente;
			}
		}
		throw new IllegalArgumentException("Id invalido " + cod);
	}

}
