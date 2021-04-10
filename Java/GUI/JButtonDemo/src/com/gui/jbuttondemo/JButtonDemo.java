package com.gui.jbuttondemo;

import javax.swing.*;

public class JButtonDemo extends JFrame {

	JPanel jp;
	JButton btnSubmit;
	
	public JButtonDemo() {
		jp=new JPanel();
		
		btnSubmit=new JButton();
		btnSubmit.setText("Enter");
		
		jp.add(btnSubmit);
		
		add(jp);
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JButtonDemo demo=new JButtonDemo();

	}

}
