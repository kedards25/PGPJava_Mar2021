package com.gui.eventhandlingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventHandlingDemo2 extends JFrame implements ActionListener {

	JButton btnSubmit,btnReset;
	JLabel lblMsg;
	
	public EventHandlingDemo2() {
		btnSubmit=new JButton("Submit");
		btnSubmit.setBounds(80, 50, 100, 20);
		
		btnReset=new JButton("Cancel");
		btnReset.setBounds(200, 50, 100, 20);
		
		lblMsg=new JLabel();
		lblMsg.setBounds(120, 100, 150, 20);
		
		btnSubmit.addActionListener(this);
		btnReset.addActionListener(this);
		
		add(btnSubmit);
		add(btnReset);
		add(lblMsg);
		setSize(400, 300);
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnSubmit))
			lblMsg.setText("Submit Button Clicked");
		else
			lblMsg.setText("Reset Button Clicked");
	}
	
	public static void main(String[] args) {
		EventHandlingDemo2 demo=new EventHandlingDemo2();

	}



}
