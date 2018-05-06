package com.renostarter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	@SuppressWarnings("unused")
	public static Date stringToDate(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		try {
			return sdf.parse(dateString);

		} catch (ParseException e) {
			System.out.println("nao foi possível converter a data!");
			return null;
		}
	}
}
