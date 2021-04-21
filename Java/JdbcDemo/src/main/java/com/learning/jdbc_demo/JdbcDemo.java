package com.learning.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		
		String user="sa";
		String password="";
		String url="jdbc:h2:tcp://localhost/~/test";
		
		try {
			Class.forName("org.h2.Driver");	//registering driver class that will be used to connect
											//to connect to database
			Connection conn=null;
			conn=DriverManager.getConnection(url, user, password);
			if(conn!=null)
			{
				//Select Query
				//query to execute
//				String query="select * from samplemodel";
				
				//Statement object to execute the query on Connection object
//				Statement st=conn.createStatement();
				
				//executing the query with help of Statement object which has reference of
				//Connection object and receiving data back into ResultSet object
//				ResultSet rs=st.executeQuery(query);
//				
//				System.out.println("id      name      	address          mailid");
//				while(rs.next())
//				{
//					System.out.println(rs.getInt("sampleid")+"\tMr."+rs.getString("samplenm")+""
//							+ "\t"+rs.getString("sampleadr")+"\t"+rs.getString("samplemail"));
//				}
				
				
				//insert Query
//				String insertQuery="insert into samplemodel values (?,?,?,?)";
//				PreparedStatement pSt=conn.prepareStatement(insertQuery);
//				pSt.setInt(1, 7);
//				pSt.setString(2, "Goregaon");
//				pSt.setString(3,"sample@gmail.com");
//				pSt.setString(4,"xyz");
//				
//				int rowsAffected=pSt.executeUpdate();
//				
//				if(rowsAffected>0)
//				{
//					System.out.println("Data Saved");
//				}
//				else
//				{
//					System.out.println("Data not saved");
//				}
				
				//Update query
//				String updateQuery="update samplemodel"
//						+ " set samplenm=?"
//						+ " where sampleid=?";
//				PreparedStatement pSt=conn.prepareStatement(updateQuery);
//				pSt.setString(1, "Roshani");
//				pSt.setInt(2, 7);
//				int rowsAffected=pSt.executeUpdate();
//				
//				if(rowsAffected>0)
//				{
//					System.out.println("Data updated");
//				}
//				else
//				{
//					System.out.println("Data not updated");
//				}
				
				//Delete query
				String updateQuery="delete samplemodel"
						+ " where sampleid=?";
				PreparedStatement pSt=conn.prepareStatement(updateQuery);
				pSt.setInt(1, 7);

				
				int rowsAffected=pSt.executeUpdate();
				
				if(rowsAffected>0)
				{
					System.out.println("Data deleted");
				}
				else
				{
					System.out.println("Data not deleted");
				}
			}
			else
			{
				System.out.println("not connected");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e.getMessage());
		}	

	}

}
