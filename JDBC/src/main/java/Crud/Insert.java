package Crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public static void main(String[] args) {

        // Database connection details
        String url = "jdbc:postgresql://localhost:5432/demodb"; // Change DB name if needed
        String user = "postgres";
        String password = "123";

        try {
            // Step 1: Load the PostgreSQL driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver class loaded.");

            // Step 2: Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection has been established: " + con);

            // Step 3: Create SQL INSERT query with placeholder
            String sql = "INSERT INTO student VALUES(?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);

            // First row
            pstm.setInt(1, 123);
            pstm.setString(2, "Gaurav");
            pstm.setInt(3, 21);
            pstm.addBatch();

            // Second row
            pstm.setInt(1, 124);
            pstm.setString(2, "Govind");
            pstm.setInt(3, 23);
            pstm.addBatch();

            // Step 4: Execute all insertions
            int[] result = pstm.executeBatch();
            System.out.println("Records inserted: " + result.length);

            // Step 5: Close connection
            con.close();
            System.out.println("Connection closed.");

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
        }
    }
}
