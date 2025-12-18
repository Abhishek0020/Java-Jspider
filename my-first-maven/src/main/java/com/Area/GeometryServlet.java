package com.Area;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/geometry")
public class GeometryServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String shape = request.getParameter("shape");
        double val1 = Double.parseDouble(request.getParameter("val1"));
        String v2 = request.getParameter("val2");
        String v3 = request.getParameter("val3");

        double val2 = (v2 == null || v2.isEmpty()) ? 0 : Double.parseDouble(v2);
        double val3 = (v3 == null || v3.isEmpty()) ? 0 : Double.parseDouble(v3);

        double result = 0;
        String resultType = "Area";

        switch (shape) {
            case "triangle":
                result = 0.5 * val1 * val2; // base × height / 2
                break;

            case "pyramid":
                result = (1.0 / 3) * val1 * val2 * val3; // length × width × height / 3
                resultType = "Volume";
                break;

            case "cylinder":
                result = Math.PI * val1 * val1 * val2; // π × r² × h
                resultType = "Volume";
                break;

            case "rhombus":
                result = 0.5 * val1 * val2; // d1 × d2 / 2
                break;

            case "ellipse":
                result = Math.PI * val1 * val2; // π × a × b
                break;

            case "trapezium":
                result = 0.5 * (val1 + val2) * val3; // (a + b)/2 × h
                break;

            default:
                break;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Shape: " + shape.toUpperCase() + "</h2>");
        out.println("<p>" + resultType + ": " + result + "</p>");
        out.println("<a href='index.html'>Back</a>");
        out.println("</body></html>");
    }
}
