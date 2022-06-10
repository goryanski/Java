package com.example.practice;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

@WebServlet(name = "musicServlet", value = "/music")
public class MusicServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        Question question1 = new Question("Where is it thought that the banjo originated?", "Bangladesh", "Africa", "New York City", "Coolsville");
        Question question2 = new Question("What was Buddy Holly’s backup band called?", "the Grasshoppers", "the Crickets", "the Beatles", "the Bugs");
        Question question3 = new Question("Which of the following instruments does not employ valves to change pitch?", "flute", "trumpet", "flugelhorn", "trombone");
        Question question4 = new Question("What does the name \"ukulele\" mean in Hawaiian?", "small guitar", "island banjo", "small bug fiddle", "jumping flea");
        Question question5 = new Question("Which of these is not a true horn?", "English horn", "trombone", "French horn", "cornet");
        Question question6 = new Question("In Greek mythology, from what was the first lyre constructed?", "a turtle shell", "a gourd", "twigs and resin", "thin air");
        Question question7 = new Question("What was the name of the Who’s second rock opera?", "Hair", "Quadrophenia", "All That Jazz", "Pat Garrett and Billy the Kid");
        Question question8 = new Question("Who was known as the \"King of Swing\"?");
        Question question9 = new Question("Which of these musical movements did Ludwig van Beethoven help introduce?");
        Question question10 = new Question("Which of these bands was led by a singer from Africa?");


        ArrayList<Question> questions = new ArrayList<>();
        Collections.addAll(questions, question1, question2, question3, question4, question5, question6, question7, question8, question9, question10);


        request.setAttribute("quiz", questions);
        request.setAttribute("testName", "music");
        getServletContext()
                .getRequestDispatcher("/quiz.jsp")
                .forward(request, response);
    }
}