import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	
//	private String name;
//	private int  id;
//	private int age;
	public static void main(String args[]) throws SQLException {
		Connection con = null ;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb", "postgres", "123");
			stmt = con.createStatement();

			 rs = stmt.executeQuery("SELECT * from employee");

            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2)+" "+rs.getString(3));

            }


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
            rs.close();
            stmt.close();
			con.close();
		}

	}
}