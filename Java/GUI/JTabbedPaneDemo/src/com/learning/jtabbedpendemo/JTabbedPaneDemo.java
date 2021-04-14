package com.learning.jtabbedpendemo;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPaneDemo extends JFrame {

	JTabbedPane jt;
	
	public JTabbedPaneDemo() {
		jt=new JTabbedPane();
		jt.addTab("Tab1", null);
		jt.addTab("Tab2", null);
		jt.addTab("Tab3", null);
		jt.setSize(300, 300);
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		add(jt);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTabbedPaneDemo demo=new JTabbedPaneDemo();
	}

}
