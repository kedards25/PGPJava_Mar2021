package com.learning.jpaneldemo;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Professional way to use panels and other components
 * While setting properties of JFrame
 * follow the sequence of SLV
 public class JPanelDemo extends JFrame  {

	JPanel jPanel;

	
	public JPanelDemo() {
		jPanel=new JPanel();
		jFrame=new JFrame();
		
		setSize(150, 150);
		setLayout(null);
		setVisible(true);
		add(jPanel);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanelDemo demo=new JPanelDemo();
	}

}
 */
public class JPanelDemo  {
	
	
	JPanel jPanel;
	JFrame jFrame;
	
	public JPanelDemo() {
		jPanel=new JPanel();
		jFrame=new JFrame();
		jFrame.setVisible(true);
		jFrame.setSize(150, 150);
		jFrame.setLayout(null);
		jFrame.add(jPanel);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanelDemo demo=new JPanelDemo();
	}

}
