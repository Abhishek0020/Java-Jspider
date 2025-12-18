package com.controller;


import com.dao.StudentDAO;
import com.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import java.io.*;
import java.util.stream.Collectors;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader reader = request.getReader();
        String json = reader.lines().collect(Collectors.joining());
        Student student = new Gson().fromJson(json, Student.class);
        

        StudentDAO dao = new StudentDAO();
        dao.addStudent(student);

        response.setStatus(HttpServletResponse.SC_OK);
    }
}

