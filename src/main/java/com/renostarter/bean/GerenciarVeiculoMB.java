package com.renostarter.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.renostarter.model.Veiculo;


@Named
@ViewScoped
public class GerenciarVeiculoMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Veiculo> listaVeiculo;


	@PostConstruct
	public void init() {
		inicializaObjetos();
	}

	public void inicializaObjetos() {
		listaVeiculo = new ArrayList<>();
	}
	
	
	public void salvarVeiculo(Veiculo veiculo){
		veiculo.setId(listaVeiculo.stream()
                .mapToInt(c -> c.getId())
                .max()
                .getAsInt()+1);
        listaVeiculo.add(veiculo);
        System.out.println("Gerenciar veiculo");
		
	}
	
	
	
	

	public List<Veiculo> getListaVeiculo() {
		return listaVeiculo;
	}

	public void setListaVeiculo(List<Veiculo> listaVeiculo) {
		this.listaVeiculo = listaVeiculo;
	}

}
