package com.renostarter.model;

public abstract class Pessoa {

	protected Contato contato;
	protected Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
