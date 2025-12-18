package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class demo {			 
		private static String url="jdbc:postgresql://localhost:5432/Jdbc";
	    private static String user="postgres";
		private static String pswd="123"; 
		public static void main(String[] args) {
			String query="select * from student";
		   try {
			   Class.forName("org.postgresql.Driver");
			   System.out.println("Driver class get loaded");
								
				Connection con = DriverManager.getConnection(url, user, pswd);
				System.out.println("connection has been established");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                int age = rs.getInt("age");
	                System.out.println("ID: " + id);
	                System.out.println("Name: " + name);
	                System.out.println("Age: " + age);
	            }				
				stmt.execute(query);				
				} catch (ClassNotFoundException e) {				 
					   e.printStackTrace();
				} catch (SQLException e) {				 
						e.printStackTrace();
			}
		}
	}