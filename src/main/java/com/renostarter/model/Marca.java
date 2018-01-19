package com.renostarter.model;

import java.io.Serializable;

public class Marca implements Serializable, Comparable<Car> {

	private static final long serialVersionUID = 8293090360333433787L;

	private Integer id;
	private String nome;
	private boolean selecionado = false;

	public Marca(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Marca(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	public boolean isSelecionado() {
		return selecionado;
	}
	
	

	public void setSelecionado(boolean selecionado) {
		this.selecionado = selecionado;
	}

	@Override
	public int compareTo(Car o) {

		return 0;
	}
	
	

}
