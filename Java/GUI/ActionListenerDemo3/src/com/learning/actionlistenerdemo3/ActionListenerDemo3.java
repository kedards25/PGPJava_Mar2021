package com.learning.actionlistenerdemo3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionListenerDemo3 extends JFrame {

	JLabel jMsg;
	JButton jClick, jClick2;
	// JPanel jPanel;

	public ActionListenerDemo3() {

		// Event source is jClick button
		jClick = new JButton();
		// setting dimensions of button
		jClick.setBounds(50, 120, 100, 30);
		jClick.setText("Click Here");
		// Associating Event Handler with jClick using eventListener
		//by using new keyword we are invoking an anonymous interface
		jClick.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jMsg.setText("Button 1 clicked");
				
			}
		});

		// Event source is jClick button
		jClick2 = new JButton();
		// setting dimensions of button
		jClick2.setBounds(50, 200, 100, 30);
		jClick2.setText("Click Here");
		// Associating Event Handler with jClick using eventListener
		jClick2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jMsg.setText("Button 2 clicked");
				
			}
		});

		// component to display message after the event is handled
		jMsg = new JLabel();
		jMsg.setBounds(120, 180, 100, 30);

		add(jClick);
		add(jClick2);
		add(jMsg);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);

	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListenerDemo3 demo=new ActionListenerDemo3();
	}

}
