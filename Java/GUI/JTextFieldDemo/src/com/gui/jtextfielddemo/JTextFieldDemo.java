package com.gui.jtextfielddemo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldDemo extends JFrame{

	JTextField txtName;
	JPanel jp;
	
	public JTextFieldDemo() {
		txtName=new JTextField();
		txtName.setText("Kedar");
		jp=new JPanel();
		
		jp.add(txtName);
		add(jp);
		
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		JTextFieldDemo demo=new JTextFieldDemo();
	}

}
