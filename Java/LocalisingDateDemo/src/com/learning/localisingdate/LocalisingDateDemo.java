package com.learning.localisingdate;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalisingDateDemo {

	public static void main(String[] args) {
		//Locale russianLocale=new Locale("ru","RU");
		Locale germanLocale=new Locale("de","DE");
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.SHORT,germanLocale);
		//System.out.println(new Date());
		String formattedDate=dateFormat.format(new Date());
		System.out.println("Date in current locale: "+new Date()+" \n"
				+ "and same date in russian format:"+formattedDate);

	}

}
