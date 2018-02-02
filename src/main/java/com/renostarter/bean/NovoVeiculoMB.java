package com.renostarter.bean;

import static com.renostarter.util.Utils.addDetailMessage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.renostarter.model.Marca;
import com.renostarter.model.Veiculo;
import com.renostarter.util.UtilMock;

@Named
@ViewScoped
public class NovoVeiculoMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Veiculo veiculo;
	private Integer vaiculoId;
	private List<SelectItem> listaAno;
	private List<SelectItem> listaCor;
	private List<SelectItem> listaMarca;

	@PostConstruct
	public void init() {
		recuperaIdVeiculo();
		inicializaObjetos();

	}

	public void inicializaObjetos() {

		veiculo = new Veiculo();
		listaCor = new ArrayList<>();
		listaAno = new ArrayList<>();
		listaMarca = new ArrayList<>();

	}

	public void recuperaIdVeiculo() {

		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		String vaiculoId;
		vaiculoId = params.get("vaiculoId");
		if (vaiculoId != null) {
			this.vaiculoId = Integer.parseInt(vaiculoId);
		}
	}

	public void salvarMarca() {

		if (validarVeiculo(veiculo)) {

		} else {
			addDetailMessage("O nome deve ser preenchido", FacesMessage.SEVERITY_ERROR);
		}
	}

	public boolean validarVeiculo(Veiculo veiculo) {
		if (veiculo.getNome() == null || veiculo.getNome().isEmpty()) {
			return false;
		}
		return true;
	}

	public void limpar() {
		veiculo = new Veiculo();
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Integer getVaiculoId() {
		return vaiculoId;
	}

	public void setVaiculoId(Integer vaiculoId) {
		this.vaiculoId = vaiculoId;
	}

	public List<SelectItem> getListaCor() {

		if (listaCor == null || listaCor.isEmpty()) {
			this.listaCor = UtilMock.getCor(5);

		}
		return listaCor;

	}

	public void setListaCor(List<SelectItem> listaCor) {
		this.listaCor = listaCor;
	}

	public List<SelectItem> getListaAno() {
		this.listaAno = UtilMock.getAno(1990);
		return listaAno;
	}

	public void setListaAno(List<SelectItem> listaAno) {
		this.listaAno = listaAno;
	}

	public List<SelectItem> getListaMarca() {
		return listaMarca;

	}

	public void setListaMarca(List<SelectItem> listaMarca) {
		this.listaMarca = listaMarca;
	}
}
