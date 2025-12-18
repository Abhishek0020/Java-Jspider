package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.Query;

public class Update {
		private static final String url = "jdbc:postgresql://localhost:5432/demodb";
	    private static final String user = "postgres";
	    private static final String pswd= "123";
public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver class get loaded");
							
			Connection con = DriverManager.getConnection(url, user, pswd);
			System.out.println("connection has been established");
//			Statement stmt = con.createStatement();
//			String sql="update employee set age=? where id=?";
			String sql="delete from employee where id=?";
			//PreparedStatement pstm=con.prepareStatement(sql);//dynamic operation perform 
			// pstm.setInt(1,3);
//			pstm.setInt(2, 3);
			//pstm.execute();
			Statement stmStatement=con.createStatement();
			
			con.close();	
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();	
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
	}

}
