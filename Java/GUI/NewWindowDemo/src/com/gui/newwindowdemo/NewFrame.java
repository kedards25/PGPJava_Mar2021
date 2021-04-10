package com.gui.newwindowdemo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewFrame extends JFrame {

	JLabel lblGreet;
	
	public NewFrame() {
		lblGreet=new JLabel("Welcome to Second Frame");
		lblGreet.setBounds(80, 50, 200, 20);
		
		add(lblGreet);
		setSize(400, 300);
		setLayout(null);
		setVisible(true);
	}
	
}

