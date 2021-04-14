package com.learning.jframedemo;

import javax.swing.JFrame;

public class JframeDemo {
	//acts as a container for your components
	JFrame jFrame;
	
	JframeDemo()
	{
		jFrame=new JFrame();
		jFrame.setVisible(true);
		jFrame.setSize(400, 400);
		jFrame.setTitle("Demo Frame");
	}
	
	public static void main(String[] args) {
		
		JframeDemo demo=new JframeDemo();
		
	}

}
