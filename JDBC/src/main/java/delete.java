import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {

    public static void main(String[] args) {

        // Database connection details
        String url = "jdbc:postgresql://localhost:5432/demodb"; // Change to your DB name
        String user = "postgres";
        String password = "123";

        try {
        	Class.forName("org.postgresql.Driver");
            System.out.println("Driver class loaded.");

            // Step 2: Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection has been established: " + con);

            // Step 3: Prepare DELETE SQL query
            String sql = "DELETE FROM employee WHERE id = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, 101); // Set the ID of the student to delete

            // Step 4: Execute the DELETE query
            int rowsAffected = pstm.executeUpdate();
            System.out.println("Rows deleted: " + rowsAffected);

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
