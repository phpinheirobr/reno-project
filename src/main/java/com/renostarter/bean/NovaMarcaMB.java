package com.renostarter.bean;

import static com.renostarter.util.Utils.addDetailMessage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
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
		inicializaObjetos();
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

	public void recuperarMarcaPorId() {

		List<Marca> marcas = UtilMock.getMarcas(5);
		for (Marca marca : marcas) {
			if (marca.getId().equals(marcaId)) {
				this.marca = marca;
			}
		}
	}

	public void salvarMarca() {

		if (validarMarca(marca)) {

			UtilMock.addMarca(marca);
			System.out.println("salvando veículo");

			if (marca.getId() == null) {
				addDetailMessage("Nova marca salva com sucesso!");
			} else {
				addDetailMessage("Marca alterada com sucesso!");
			}
		}
		addDetailMessage("O nome deve ser preenchido",FacesMessage.SEVERITY_ERROR);
			
	}

	public boolean validarMarca(Marca marca) {
		if (marca.getNome() == null || marca.getNome().isEmpty()) {
			return false;
		}
		return true;
	}

	public void limpar() {
		marca = new Marca();
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
