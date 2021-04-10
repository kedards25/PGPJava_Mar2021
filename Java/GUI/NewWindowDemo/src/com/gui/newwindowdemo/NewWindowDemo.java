package com.gui.newwindowdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class NewWindowDemo extends JFrame implements ActionListener{

	JButton btnClick;
	
	public NewWindowDemo() {
		btnClick=new JButton("Click to open new window");
		btnClick.setBounds(80, 50, 200, 20);
		
		btnClick.addActionListener(this);
		
		add(btnClick);
		setSize(400, 300);
		setLayout(null);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		setVisible(false);
		NewFrame frame=new NewFrame();
		
	}
	
	public static void main(String[] args) {
		
		NewWindowDemo demo=new NewWindowDemo();
	}




}
