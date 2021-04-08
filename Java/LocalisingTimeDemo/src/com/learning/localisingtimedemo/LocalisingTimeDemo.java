package com.learning.localisingtimedemo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalisingTimeDemo {

	public static void main(String[] args) {
		
//		Locale russianLocale=new Locale("ru","RU");
//		Locale germanLocale=new Locale("de","DE");
		Locale chineseLocale=new Locale("zh","CN");
		DateFormat timeFormat=DateFormat.getTimeInstance(DateFormat.LONG,chineseLocale);
		String formattedTime=timeFormat.format(new Date());
		System.out.println("Date in current locale: "+new Date()+" \n"
				+ "and same date in german format:"+formattedTime);

	}

}
