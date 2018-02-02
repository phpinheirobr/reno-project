package com.renostarter.model;

public class Cor {

	private Integer id;

	private String cor;

	public Cor(Integer id, String cor) {
		super();
		this.id = id;
		this.cor = cor;
	}

	public Cor() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
