package Employee_Management;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {

    private static final Scanner sc = new Scanner(System.in);
    private static final String url = "jdbc:postgresql://localhost:5432/employee";
    private static final String user = "postgres";
    private static final String pswd = "123";

    private static Connection conn;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, pswd);
            System.out.println("✅ Database connected successfully.");
        } catch (ClassNotFoundException e) {
            System.err.println("❌ PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("❌ Failed to connect to database.");
            e.printStackTrace();
        }
    }

    public int save() {
        System.out.print("Enter how many Employees you want to add: ");
        int n = sc.nextInt();
        String sql = "INSERT INTO employee(id, name, age, sal) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstm = conn.prepareStatement(sql)) {
            for (int k = 0; k < n; k++) {
                System.out.println("\nEnter details for Employee " + (k + 1));
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Employee Name: ");
                String name = sc.next();
                System.out.print("Enter Employee Age: ");
                int age = sc.nextInt();
                System.out.print("Enter Employee Salary: ");
                int sal = sc.nextInt();

                pstm.setInt(1, id);
                pstm.setString(2, name);
                pstm.setInt(3, age);
                pstm.setInt(4, sal);
                pstm.addBatch();
            }

            int[] results = pstm.executeBatch();
            for (int res : results) {
                System.out.println(res + " row(s) added.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }

    public int fetch() {
        String sql = "SELECT * FROM employee";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("\nID\tName\tAge\tSalary");
            System.out.println("-----------------------------------");
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + "\t" +
                        rs.getString(2) + "\t" +
                        rs.getInt(3) + "\t" +
                        rs.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public List<Entity> getall() {
        List<Entity> empList = new ArrayList<>();
        String sql = "SELECT * FROM employee";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                empList.add(new Entity(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getInt("sal")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empList;
    }

    public int update() {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        System.out.print("Enter new name: ");
        String name = sc.next();
        System.out.print("Enter new age: ");
        int age = sc.nextInt();
        System.out.print("Enter new salary: ");
        int sal = sc.nextInt();

        String sql = "UPDATE employee SET name = ?, age = ?, sal = ? WHERE id = ?";
        int res = 0;
        try (PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, name);
            pstm.setInt(2, age);
            pstm.setInt(3, sal);
            pstm.setInt(4, id);

            res = pstm.executeUpdate();
            System.out.println(res + " row(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public int delete() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        String sql = "DELETE FROM employee WHERE id = ?";
        int res = 0;

        try (PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, id);
            res = pstm.executeUpdate();
            System.out.println(res + " row(s) deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }
}
