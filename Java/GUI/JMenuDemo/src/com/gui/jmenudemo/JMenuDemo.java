package com.gui.jmenudemo;

import javax.swing.*;

public class JMenuDemo extends JFrame {

	JMenuBar jMenuBar;
	JMenu fileMenu,editMenu,viewMenu;
	JMenuItem newItem,openItem;
	
	public JMenuDemo() {
		jMenuBar=new JMenuBar();
		
		fileMenu=new JMenu("File");
		editMenu=new JMenu("Edit");
		viewMenu=new JMenu("View");
		
		newItem=new JMenuItem("New");
		openItem=new JMenuItem("Open");
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		
		jMenuBar.add(fileMenu);
		jMenuBar.add(editMenu);
		jMenuBar.add(viewMenu);
		
		setJMenuBar(jMenuBar);
		setTitle("Menu Bar Demo");
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JMenuDemo demo=new JMenuDemo();

	}

}
