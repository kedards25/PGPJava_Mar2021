package com.learning.localisingtextdemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalisingTextDemo {

	public static void main(String[] args) {
		
		Locale germanLocale=new Locale("de","DE");
		Locale frLocale=new Locale("fr","FR");
		Locale esLocale=new Locale("en","ES");
		
		ResourceBundle deBundle=ResourceBundle.getBundle("message",germanLocale);
		ResourceBundle frBundle=ResourceBundle.getBundle("message",frLocale);
		ResourceBundle esBundle=ResourceBundle.getBundle("message",esLocale);
		
		//System.out.println("Greeting in German: "+deBundle.getString("msg"));
//		System.out.println("Greeting in French: "+frBundle.getString("msg"));
		System.out.println("Greeting in Spanish: "+esBundle.getString("msg"));

	}

}
