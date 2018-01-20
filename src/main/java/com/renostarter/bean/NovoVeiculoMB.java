package com.renostarter.bean;

import static com.renostarter.util.Utils.addDetailMessage;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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

	@PostConstruct
	public void init() {
		recuperaIdVeiculo();
	}

	public void inicializaObjetos() {

		veiculo = new Veiculo();
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
			
		}else{
			addDetailMessage("O nome deve ser preenchido",FacesMessage.SEVERITY_ERROR);
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

}
