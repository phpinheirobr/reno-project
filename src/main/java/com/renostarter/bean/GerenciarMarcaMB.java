package com.renostarter.bean;

import static com.renostarter.util.Utils.addDetailMessage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.renostarter.model.Marca;
import com.renostarter.util.UtilMock;

@Named
@ViewScoped
public class GerenciarMarcaMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private Marca marca;
	private List<Marca> listaMarca;
	private List<Marca> listaMarcaExcluir;

	@PostConstruct
	public void init() {

		inicializaObjetos();
	}

	public void inicializaObjetos() {
		marca = new Marca();
		listaMarca = new ArrayList<>();
		listaMarcaExcluir = new ArrayList<>();
		listaMarca.addAll(UtilMock.getMarcas(5));

	}

	
	public void excluirMarca() {

	}

	public String redirectEditarMarca(Integer marcaId) {

		return "nova-marca.xhtml?faces-redirect=true&marcaId=" + marcaId;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Marca> getListaMarca() {
		return listaMarca;
	}

	public void setListaMarca(List<Marca> listaMarca) {
		this.listaMarca = listaMarca;
	}

	public List<Marca> getListaMarcaExcluir() {
		return listaMarcaExcluir;
	}

	public void setListaMarcaExcluir(List<Marca> listaMarcaExcluir) {
		this.listaMarcaExcluir = listaMarcaExcluir;
	}

}
