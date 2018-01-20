package com.renostarter.util;

import java.util.ArrayList;
import java.util.List;

import com.renostarter.model.Marca;

public class UtilMock {

	private static List<Marca> marcas;

	public static List<Marca> getMarcas(Integer quantidade) {

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

}