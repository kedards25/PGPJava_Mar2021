package com.learning.mvc_demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserRegistrationForm extends JFrame {

	JLabel lblFname,lblLname,lblMailId;
	JTextField txtFname,txtLname,txtMailId;
	JButton btnSubmit,btnReset;
	
	public UserRegistrationForm() {
		
		lblFname=new JLabel("Enter First Name:");
		lblFname.setBounds(50, 50, 100, 30);
		txtFname=new JTextField();
		txtFname.setBounds(180, 50, 100, 30);
		
		lblLname=new JLabel("Enter Last Name:");
		lblLname.setBounds(50, 100, 100, 30);
		txtLname=new JTextField();
		txtLname.setBounds(180, 100, 100, 30);
		
		lblMailId=new JLabel("Enter email id:");
		lblMailId.setBounds(50, 150, 100, 30);
		txtMailId=new JTextField();
		txtMailId.setBounds(180, 150, 150, 30);
		
		btnSubmit=new JButton("Register");
		btnSubmit.setBounds(70, 200, 120, 30);
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SuccessFrame success=new SuccessFrame();
				setVisible(false);
				success.setVisible(true);
				
			}
		});
		btnReset=new JButton("Cancel");
		btnReset.setBounds(200, 200, 120, 30);
		
		
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		
		add(lblFname);
		add(lblLname);
		add(lblMailId);
		add(txtFname);
		add(txtLname);
		add(txtMailId);
		add(btnSubmit);
		add(btnReset);
	}
	
}
