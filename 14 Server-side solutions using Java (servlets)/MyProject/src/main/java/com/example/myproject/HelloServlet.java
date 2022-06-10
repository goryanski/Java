package com.example.myproject;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String quote = request.getParameter("quote");

        PrintWriter writer = response.getWriter();
        writer.println("<html> quote: " + quote + "</html>");
        writer.flush();
    }

    public void destroy() {
    }
}