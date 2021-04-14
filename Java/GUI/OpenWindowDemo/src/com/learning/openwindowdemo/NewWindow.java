package com.learning.openwindowdemo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow extends JFrame {

	JLabel jMsg;
	
	public NewWindow() {
		jMsg = new JLabel("Hello From New Window");
		jMsg.setBounds(120, 180, 100, 30);

		setSize(400, 300);
		setLayout(null);
		setVisible(true);
		
		add(jMsg);
	}
	
}
