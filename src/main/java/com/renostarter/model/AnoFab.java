package com.renostarter.model;

public class AnoFab {
	private Integer id;
	private String Ano;

	public AnoFab(Integer id, String ano) {
		super();
		this.id = id;
		this.Ano = ano;
	}

	public AnoFab() {

	}
	
	 

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAno() {
		return Ano;
	}

	public void setAno(String ano) {
		Ano = ano;
	}

}
