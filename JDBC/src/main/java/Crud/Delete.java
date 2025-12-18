package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    private static String url = "jdbc:postgresql://localhost:5432/demodb";
    private static String user = "postgres";
    private static String pswd = "123"; 

 public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver"); // Fixed driver class name
            try (Connection con = DriverManager.getConnection(url, user, pswd);
                 Statement stm = con.createStatement()) {

                String sql = "DELETE FROM employee WHERE id = 21";
                int rowsAffected = stm.executeUpdate(sql);
                System.out.println(rowsAffected + " row(s) deleted.");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL error occurred.");
            e.printStackTrace();
        }
    }
}
