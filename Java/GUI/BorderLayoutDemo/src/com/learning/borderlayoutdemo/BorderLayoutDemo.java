package com.learning.borderlayoutdemo;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {

	JButton jEast,jWest,jNorth,jSouth;
	
	/**
	 * 
	 */
	BorderLayoutDemo()
	{
		jEast=new JButton("East");
		jWest=new JButton("West");
		jNorth=new JButton("North");
		jSouth=new JButton("South");
		
		setSize(400,400);
		setLayout(new BorderLayout());
		setVisible(true);
		
		add(jEast,BorderLayout.EAST);
		add(jWest,BorderLayout.WEST);
		add(jNorth,BorderLayout.NORTH);
		add(jSouth,BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		
		BorderLayoutDemo demo=new BorderLayoutDemo();
	}

}
