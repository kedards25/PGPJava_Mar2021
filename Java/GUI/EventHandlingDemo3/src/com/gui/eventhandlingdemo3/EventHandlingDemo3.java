package com.gui.eventhandlingdemo3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class EventHandlingDemo3 extends JFrame{

	JButton btnSubmit,btnReset;
	JLabel lblMsg;
	
	public EventHandlingDemo3() {
		btnSubmit=new JButton("Submit");
		btnSubmit.setBounds(80, 50, 100, 20);
		
		btnReset=new JButton("Cancel");
		btnReset.setBounds(200, 50, 100, 20);
		
		lblMsg=new JLabel();
		lblMsg.setBounds(120, 100, 150, 20);
		
		//we are implementing an anonymous interface
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				lblMsg.setText("Submit Button Clicked");
				
			}
		});
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				lblMsg.setText("Reset Button Clicked");
				
			}
		});
		
		add(btnSubmit);
		add(btnReset);
		add(lblMsg);
		setSize(400, 300);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		EventHandlingDemo3 demo=new EventHandlingDemo3();

	}

}
