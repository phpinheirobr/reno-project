package com.renostarter.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.renostarter.model.Marca;
import com.renostarter.util.UtilMock;
  

@Named
@ViewScoped
public class ConverterMarcaTeste implements Serializable {

	private static final long serialVersionUID = 8596844463291359887L;
	private List<Marca> listaMarcas = UtilMock.getMarcas(5);
	private Marca marca = new Marca();
	
	
	
	public List<Marca> getListaMarcas() {
		System.out.println("converter marca teste");
		
		return listaMarcas;
	}

	public void setListaMarcas(List<Marca> listaMarcas) {
		this.listaMarcas = listaMarcas;
	}


	public Marca getMarca() {
		marca.setId(1);
		marca.setNome("Marca Teste");
		System.out.println("converterMarcaTeste");
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
