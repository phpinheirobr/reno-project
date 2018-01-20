package com.renostarter.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.renostarter.model.Marca;
import com.renostarter.util.UtilMock;

@Named
@ViewScoped
public class NovaMarcaMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Marca marca;
	private Integer marcaId;

	@PostConstruct
	public void init() {

		recuperaIdMarca();
		recuperarMarcaPorId();
	}

	public void inicializaObjetos() {
		marca = new Marca();
	}

	public void recuperaIdMarca() {

		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		String marcaId;
		marcaId = params.get("marcaId");
		if (marcaId != null) {
			this.marcaId = Integer.parseInt(marcaId);
		}
	}
	
	public void recuperarMarcaPorId(){
		 
		List<Marca> marcas = UtilMock.getMarcas(5);
		for (Marca marca : marcas) {
			if(marca.getId().equals(marcaId)){
				this.marca = marca;
			}
		}
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Integer getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(Integer marcaId) {
		this.marcaId = marcaId;
	}

}
