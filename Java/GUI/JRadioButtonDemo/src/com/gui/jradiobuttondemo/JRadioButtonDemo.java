package com.gui.jradiobuttondemo;

import javax.swing.*;

public class JRadioButtonDemo extends JFrame{

	JPanel jp;
	JRadioButton rdVeg,rdNonVeg;
	ButtonGroup bg;
	
	public JRadioButtonDemo() {
		jp=new JPanel();
		rdVeg=new JRadioButton("Veg");
		rdNonVeg=new JRadioButton("Non Veg");
		
		bg=new ButtonGroup();
		bg.add(rdVeg);
		bg.add(rdNonVeg);	
		
		jp.add(rdVeg);
		jp.add(rdNonVeg);
		
		add(jp);
		setSize(400,300);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		JRadioButtonDemo demo=new JRadioButtonDemo();
		

	}

}
