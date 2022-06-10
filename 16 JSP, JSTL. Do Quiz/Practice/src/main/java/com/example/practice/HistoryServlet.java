package com.example.practice;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

@WebServlet(name = "historyServlet", value = "/history")
public class HistoryServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        Question question1 = new Question("Who was the first emperor of the Holy Roman Empire?", "Lothair I", "Louis I", "Henry IV", "Charlemagne");
        Question question2 = new Question("Which Holy Roman emperor was forced to apologize to Pope Gregory VII as a result of the Investiture Controversy?", "Ferdinand", "Henry IV", "Otto II", "Henry III");
        Question question3 = new Question("Which Holy Roman empress led Austria through the War of the Austrian Succession and the Seven Years’ War?", "Isabella II", "Maria Theresa", "Matilda", "Constance");
        Question question4 = new Question("Which Chinese empress rose from concubinage to become empress of China during the Tang dynasty?", "Cixi", "Wuhou", "Gaohou", "Ci’an");
        Question question5 = new Question("Which Yuan emperor is famous for reunifying China as well as for his encounters with Marco Polo?", "Genghis Khan", "Kublai Khan", "Möngke Khan", "Bogd Gegeen Khan");
        Question question6 = new Question("Which Chinese emperor is known for being the creator of the first unified Chinese empire and for his contributions to the Great Wall of China?", "Gaozu", "Kublai Khan", "Qin Shi Huang", "Wudi");
        Question question7 = new Question("Which Qing emperor wrote a letter to King George III denying all British requests to establish trade and diplomatic relations with the Qing?", "Qianlong emperor", "Kangxi emperor", "Jiaqing emperor", "Yongzheng emperor");
        Question question8 = new Question("Which French emperor initiated a series of wars named after him until he was exiled to St. Helena?");
        Question question9 = new Question("During which Japanese emperor’s reign did the Westernization of Japan start?");
        Question question10 = new Question("Which Japanese emperor reigned during World War II?");



        ArrayList<Question> questions = new ArrayList<>();
        Collections.addAll(questions, question1, question2, question3, question4, question5, question6, question7, question8, question9, question10);


        request.setAttribute("quiz", questions);
        request.setAttribute("testName", "history");
        getServletContext()
                .getRequestDispatcher("/quiz.jsp")
                .forward(request, response);
    }
}