package com.renostarter.infra.converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "anoConverter")
public class AnoConverter implements Converter {

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object objetcAno) {
		if (objetcAno != "") {
			Date ano = (Date) objetcAno;
			return new SimpleDateFormat("YYYY").format(ano);

		}
		return null;

	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String uuid) {
		Set<Entry<Object, String>> entries = getEntityMap(context).entrySet();
		for (Entry<Object, String> entry : entries) {
			if (entry.getValue().equals(uuid)) {
				return entry.getKey();
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private Map<Object, String> getEntityMap(FacesContext context) {
		Map<String, Object> viewMap = context.getViewRoot().getViewMap();
		Map<Object, String> entities = (Map<Object, String>) viewMap.get("entities");
		if (entities == null) {
			entities = new HashMap<>();
			viewMap.put("entities", entities);
		}
		return entities;
	}
}
