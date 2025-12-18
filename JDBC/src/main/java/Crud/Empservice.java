package Crud;

import java.sql.*;

public class Empservice {
    private static final String URL = "jdbc:postgresql://localhost:5432/demodb";
    private static final String USER = "postgres"; // your DB username
    private static final String PASSWORD = "123"; // your DB password

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void add(Emp emp) {
        String sql = "INSERT INTO employee(id, name, age, salary) VALUES (?, ?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, emp.getid());
            ps.setString(2, emp.getname());
            ps.setInt(3, emp.getage());
            ps.setDouble(4, emp.getsalary());
            ps.executeUpdate();
            System.out.println("Employee added successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Emp getEmp(int id) {
        String sql = "SELECT * FROM employee WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Emp(
                );
            } else {
                System.out.println("Employee not found.");
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void update(Emp emp) {
        String sql = "UPDATE employee SET name = ?, age = ?, salary = ? WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, emp.getname());
            ps.setInt(2, emp.getage());
            ps.setDouble(3, emp.getsalary());
            ps.setInt(4, emp.getid());
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee updated successfully.");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM employee WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
