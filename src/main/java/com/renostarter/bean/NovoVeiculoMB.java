package com.renostarter.bean;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.renostarter.model.Marca;
import com.renostarter.model.Veiculo;
import com.renostarter.util.DateUtil;
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
	private List<String> listaAnoDate;
	private List<SelectItem> listaCor;
	private List<Marca> listaMarca;
	private List<Veiculo> listSalvarVeiculo;
	private String anoSelecionado;
	private GerenciarVeiculoMB gerenciarVeiculo;

	@PostConstruct
	public void init() {
		recuperaIdVeiculo();
		inicializaObjetos();
		listaAnoDate = UtilMock.getAnos();
		this.listaAno = UtilMock.getAno(30);

	}



	public void inicializaObjetos() {

		veiculo = new Veiculo();
		listaCor = new ArrayList<>();
		listaAno = new ArrayList<>();
		listaAnoDate = new ArrayList<>();
		listaMarca = new ArrayList<>();
		listSalvarVeiculo = new ArrayList<>();

	}

	public void recuperaIdVeiculo() {

		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		String vaiculoId;
		vaiculoId = params.get("Código");
		if (vaiculoId != null) {
			this.vaiculoId = Integer.parseInt(vaiculoId);
		}
	}

	public void salvarVeiculo() {
		System.out.println("salvar veiculo");
		veiculo.setAnoFabricacao(DateUtil.stringToDate(anoSelecionado));
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

	// esse metdo nao esta mais sendo chamdo ele foi la pra cima blz no pos
	// construct
	public List<SelectItem> getListaAno() {

		return listaAno;
	}

	public void setListaAno(List<SelectItem> listaAno) {
		this.listaAno = listaAno;
	}

	public List<Marca> getListaMarca() {
		this.listaMarca = UtilMock.getMarcas(5);
		return listaMarca;
	}

	public void setListaMarca(List<Marca> listaMarca) {
		this.listaMarca = listaMarca;
	}

	public String getAnoSelecionado() {
		return anoSelecionado;
	}

	public void setAnoSelecionado(String anoSelecionado) throws ParseException {
		this.anoSelecionado = anoSelecionado;

	}

	public List<String> getListaAnoDate() {
		return listaAnoDate;
	}

	public void setListaAnoDate(List<String> listaAnoDate) {
		this.listaAnoDate = listaAnoDate;
	}

}
