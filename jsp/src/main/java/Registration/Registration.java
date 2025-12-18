package Registration;

import java.io.IOException;

import com.Service.Service;
import com.student.Students;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class Registration extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			String gender = req.getParameter("gender");
			String mailId = req.getParameter("mailId");
			String bloodGroup = req.getParameter("bloodGroup");

			Students s = new Students();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setGender(gender);
			s.setMailId(mailId);
			s.setBloodGroup(bloodGroup);

			Service.saveStudent(s);
			
			resp.getWriter().println("Registration successful!");

		} catch (Exception e) {
			e.printStackTrace();
			resp.getWriter().println("Error: " + e.getMessage());
		}
	}
}
