package com.learning.jdialogdemo;

import javax.swing.JDialog;

public class JDialogDemo {
	
	JDialog jDialog;
	
	public JDialogDemo() {
		jDialog=new JDialog();
		jDialog.setTitle("Demo Dialog");
		jDialog.setSize(200, 200);
		jDialog.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDialogDemo demo=new JDialogDemo();
		
	}

}
