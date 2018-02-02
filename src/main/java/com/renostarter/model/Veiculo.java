package com.renostarter.model;

public class Veiculo {

	private Integer id;
	private String nome;
	private String placa;
	private Integer qtdPorta;
	private Integer quilometragem;
	private Cor cor;
	private AnoFab anoFabricacao;
	private Marca marca;

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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getQtdPorta() {
		return qtdPorta;
	}

	public void setQtdPorta(Integer qtdPorta) {
		this.qtdPorta = qtdPorta;
	}

	public Integer getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public AnoFab getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(AnoFab anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
