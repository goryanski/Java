package com.example.practice;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

@WebServlet(name = "spaceServlet", value = "/space")
public class SpaceServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        Question question1 = new Question("The day on which the Sun’s direct rays cross the celestial equator is called:", "the ecliptic", "the equinox", "the solstice", "the aphelion");
        Question question2 = new Question("Who invented the telescope?", "Hans Lippershey", "Johannes Kepler", "Hypatia", "Galileo");
        Question question3 = new Question("Which of these objects is the farthest from the Sun?", "90377 Sedna", "Kuiper belt", "Saturn", "Neptune");
        Question question4 = new Question("What term describes the alignment of three celestial bodies?", "sizzle", "syzygy", "symbologye", "suzerainty");
        Question question5 = new Question("What is the smallest planet in the solar system by mass?", "Jupiter", "Mercury", "Earth", "Mars");
        Question question6 = new Question("What is the visible part of the Sun called?", "the lithosphere", "the atmosphere", "the stratosphere", "the photosphere");
        Question question7 = new Question("What makes a planet a dwarf planet?", "smell", "size and shape", "distance from the Sun", "color");
        Question question8 = new Question("How many times larger is the radius of the Sun than that of the Earth?");
        Question question9 = new Question("What two motions do all planets have?");
        Question question10 = new Question("Which is the name of a radio source that is very far from Earth?");


        ArrayList<Question> questions = new ArrayList<>();
        Collections.addAll(questions, question1, question2, question3, question4, question5, question6, question7, question8, question9, question10);


        request.setAttribute("quiz", questions);
        request.setAttribute("testName", "space");
        getServletContext()
                .getRequestDispatcher("/quiz.jsp")
                .forward(request, response);
    }
}