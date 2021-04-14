package com.learning.mvc_demo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SuccessFrame extends JFrame {

	JLabel lblSuccess;
	
	public SuccessFrame() {
		lblSuccess=new JLabel("Registered Successfully");
		lblSuccess.setBounds(80, 80, 200, 30);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		
		add(lblSuccess);
	}
	
}
