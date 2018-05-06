package com.renostarter.util;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import com.renostarter.model.Marca;

public class UtilMock implements Serializable {

	private static final long serialVersionUID = 1L;
	private static List<Marca> marcas;
	private static List<SelectItem> ListaMarca;
	private static List<SelectItem> cor;
	private static List<SelectItem> ano;

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

	public static List<SelectItem> getCor(Integer value) {
		cor = new ArrayList<>();
		for (int i = 1; i < value + 1; i++) {
			cor.add(new SelectItem(i, "cor-teste" + i));
		}
		return cor;
	}

	public static List<String> getAnos() {

		List<String> anos = new ArrayList<String>();
		Calendar now = Calendar.getInstance();

		for (int i = 0; i < 40; i++) {

			now.add(now.YEAR, -1);
			Date nextYear = now.getTime();
			anos.add(new SimpleDateFormat("YYYY").format(nextYear));

		}
		return anos;
	}

	public static List<SelectItem> getAno(Integer data) {
		ano = new ArrayList<>();
		for (int i = data; i < 2019; i++) {
			ano.add(new SelectItem(i, "" + i));
		}
		return ano;
	}

	public static List<SelectItem> getListaMarca() {
		return ListaMarca;

	}

}