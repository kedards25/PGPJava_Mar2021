package com.learning.localisingcurrencydemo;

import java.text.NumberFormat;
import java.util.Locale;

public class LocalisingCurrencyDemo {

	public static void main(String[] args) {
		
		//Locale germanLocale=new Locale("de","DE");
		//Locale russianLocale=new Locale("ru","RU");
		Locale chineseLocale=new Locale("zh","CN");
		NumberFormat numberFormat =NumberFormat.getCurrencyInstance(chineseLocale);
		String formattedCurrency=numberFormat.format(100000);
		System.out.println("Rs 100000 in german format:"+formattedCurrency);

	}

}
