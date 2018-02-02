package com.renostarter.util;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;


import com.renostarter.model.Marca;

public class UtilMock {

	private static List<Marca> marcas;
	private static List<SelectItem> cor;
	private static List<SelectItem> ano;

	
	
	public static List<Marca> getMarcas(Integer quantidade) {
System.out.println("lista marca");
		marcas = new ArrayList<>();

		for (int i = 1; i < quantidade + 1; i++) {
			marcas.add(new Marca(i, "marca-teste" + i));
			
		}
		return marcas;
	}


	public static List<Marca> addMarca(Marca marca) {
		marcas.add(marca);
		return marcas;
	}

	public static List<SelectItem> getCor(Integer value) {
		System.out.println("lista cor");
		cor = new ArrayList<>();

		for (int i = 1; i < value + 1; i++) {
			cor.add(new SelectItem(i, "cor-teste" + i));
		}
		return cor;
	}
	
	public static List<SelectItem> getAno(Integer data){
		System.out.println("lista ano");
		ano = new ArrayList<>();
		for (int i = data; i < 2019; i++){
			ano.add(new SelectItem(i, "" +i));
		}
		return ano;
	}

}