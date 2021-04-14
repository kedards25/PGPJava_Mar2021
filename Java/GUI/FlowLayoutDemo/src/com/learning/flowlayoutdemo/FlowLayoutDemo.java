package com.learning.flowlayoutdemo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {

	JButton jCreate,jEdit,jDelete;
	
	public FlowLayoutDemo() {
		jCreate=new JButton("Create");
		jEdit=new JButton("Edit");
		jDelete=new JButton("Delete");
		
		setSize(400, 400);
		setLayout(new FlowLayout());
		setVisible(true);
		
		add(jCreate);
		add(jEdit);
		add(jDelete);
	}
	
	public static void main(String[] args) {
		
		FlowLayoutDemo demo=new FlowLayoutDemo();

	}

}
