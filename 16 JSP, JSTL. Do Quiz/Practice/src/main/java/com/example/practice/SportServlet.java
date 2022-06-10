package com.example.practice;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

@WebServlet(name = "sportServlet", value = "/sport")
public class SportServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        Question question1 = new Question("In Australian football, what is the maximum number of players allowed on the field at a time?", "40", "36", "28", "14");
        Question question2 = new Question("Where can you find arnis being widely practiced?", "The Philippines", "Suriname", "India", "China");
        Question question3 = new Question("What player was the first to win five straight Wimbledon tennis titles?", "Arthur Ashe", "Roger Federer", "Bjorn Borg", "Andre Agassi");
        Question question4 = new Question("Who ran the first four-minute mile?", "Roger Ramjet", "Roger Bannister", "Roger Moore", "Banastre Tarleton");
        Question question5 = new Question("In polo, what is a period of play called?", "set", "quarter", "chukka", "half");
        Question question6 = new Question("How many years old are horses that run in the Kentucky Derby?", "2", "4", "3", "1");
        Question question7 = new Question("In tennis, what follows a deuce?", "advertisement", "advection", "adverb", "advantage");
        Question question8 = new Question("In what sport would one find an Albion round?");
        Question question9 = new Question("How many points is required for a win in association croquet?");
        Question question10 = new Question("What variation might one play in tennis?");


        ArrayList<Question> questions = new ArrayList<>();
        Collections.addAll(questions, question1, question2, question3, question4, question5, question6, question7, question8, question9, question10);


        request.setAttribute("quiz", questions);
        request.setAttribute("testName", "sport");
        getServletContext()
                .getRequestDispatcher("/quiz.jsp")
                .forward(request, response);
    }
}