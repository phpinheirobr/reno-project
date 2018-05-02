package com.renostarter.bean;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.renostarter.model.Marca;
import com.renostarter.util.UtilMock;

@FacesConverter(value="MarcaConverter")
public class MarcaConverter implements Converter {
	
	
	private List<Marca> listaMarcas = UtilMock.getMarcas(5);
	
	
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Marca marca = (Marca) value;
		if(marca.getId() != null){
		return marca.getId().toString();
	}
	return null;
	}
	

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		if (value == null || value.equals("")) 
			return null;
		
		Marca marca = new Marca();
		marca.setId(Integer.parseInt(value));
		int index = listaMarcas.indexOf(marca);
		
		return listaMarcas.get(index);
	
	}
}
