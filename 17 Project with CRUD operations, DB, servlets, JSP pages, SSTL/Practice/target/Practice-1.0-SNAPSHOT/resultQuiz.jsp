<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collections" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07-Apr-22
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
  <%
    String testName = request.getParameter("testName");
    int rightAnswersCounter = 0;
    int answersCount = 10;
    String[] rightAnswers = new String[answersCount];
    out.println("<p>Result for test <b>" + testName + "</b>:</p>");


    if(testName.equals("history")) {
      rightAnswers = new String[]{"Charlemagne", "Ferdinand", "Matilda", "Cixi", "Genghis Khan", "Wudi", "Jiaqing emperor", "Napoleon", "Meiji", "Hirohito"};
    }
    else if (testName.equals("music")) {
      rightAnswers = new String[]{"Africa", "the Crickets", "trombone", "jumping flea", "English horn", "a turtle shell", "Quadrophenia", "Benny Goodman", "Romanticism", "Queen"};
    }
    else if (testName.equals("space")) {
      rightAnswers = new String[]{"the equinox", "Hans Lippershey", "90377 Sedna", "syzygy", "Mercury", "the photosphere", "size and shape", "109", "orbit and spin", "quasar"};
    }
    else if (testName.equals("sport")) {
      rightAnswers = new String[]{"36", "Suriname", "Andre Agassi", "Roger Ramjet", "quarter", "3", "advection", "archery", "26", "Australian doubles"};
    }


    for (int i = 0; i < answersCount; i++) {
      String userAnswer = request.getParameter("question" + i);
      // equalsIgnoreCase for last 3 questions (which without options)
      if(userAnswer.equalsIgnoreCase(rightAnswers[i])) {
        out.println("<p>" + "Question #" + (i + 1) + " - right</p>");
        rightAnswersCounter++;
      }
      else {
        out.println("<p>" + "Question #" + (i + 1) + " - wrong</p>");
      }
    }
  %>

  <br><p>--------------------------------------------------------------</p><br>
  <p>Result: <%= rightAnswersCounter %> / <%= answersCount %></p>
</body>
</html>
