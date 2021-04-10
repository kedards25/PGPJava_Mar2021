package com.gui.jframedemo;

import javax.swing.JFrame;

public class JFrameDemo {

	JFrame jFrame;
	
	JFrameDemo()
	{
		jFrame=new JFrame();
		jFrame.setTitle("Sample Frame");
		jFrame.setSize(400, 300);
		jFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		JFrameDemo demo=new JFrameDemo();
	}
}
