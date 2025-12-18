package com.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.student.Students;

public class Service {

	private static final String url = "jdbc:postgresql://localhost:5432/demodb";
	private static final String user = "postgres";
	private static final String paswd = "123";

	public static void saveStudent(Students s) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, user, paswd);
			String query = "INSERT INTO students (id, name, age, gender, mailId, bloodGroup) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setInt(3, s.getAge());
			ps.setString(4, s.getGender());
			ps.setString(5, s.getMailId());
			ps.setString(6, s.getBloodGroup());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
