package com.gui.jlabeldemo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLabelDemo extends JFrame {

	JLabel lblFirstName,lblLastName;
	JPanel jPanel;
	
	public JLabelDemo() {
		lblFirstName=new JLabel();
		lblLastName=new JLabel();
		jPanel=new JPanel();
		
		lblFirstName.setText("Enter First Name");
		lblLastName.setText("Enter Last Name");
		
		jPanel.add(lblFirstName);
		jPanel.add(lblLastName);
		
		add(jPanel);
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JLabelDemo demo=new JLabelDemo();
		

	}

}
