package com.gui.jtextareademo;

import javax.swing.*;

public class JTextAreaDemo extends JFrame {

	JTextArea txtArAddress;
	JPanel jPanel;
	
	public JTextAreaDemo() {
		
		jPanel=new JPanel();
		txtArAddress=new JTextArea(5,15);
		
		jPanel.add(txtArAddress);
		
		add(jPanel);
		setSize(400, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		JTextAreaDemo demo=new JTextAreaDemo();
	}

}
