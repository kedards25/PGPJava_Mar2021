package com.learning.actionlistenerdemo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionListenerDemo2 extends JFrame implements ActionListener {

	JLabel jMsg;
	JButton jClick, jClick2;
	// JPanel jPanel;

	public ActionListenerDemo2() {

		// Event source is jClick button
		jClick = new JButton();
		// setting dimensions of button
		jClick.setBounds(50, 120, 100, 30);
		jClick.setText("Click Here");
		// Associating Event Handler with jClick using eventListener
		jClick.addActionListener(this);

		// Event source is jClick button
		jClick2 = new JButton();
		// setting dimensions of button
		jClick2.setBounds(50, 200, 100, 30);
		jClick2.setText("Click Here");
		// Associating Event Handler with jClick using eventListener
		jClick2.addActionListener(this);

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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jClick))
			jMsg.setText("Button 1 Clicked");
		else
			jMsg.setText("Button 2 Clicked");	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListenerDemo2 demo=new ActionListenerDemo2();
	}

}
