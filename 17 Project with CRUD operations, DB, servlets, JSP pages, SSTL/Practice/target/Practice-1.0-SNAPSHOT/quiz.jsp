<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.practice.Question" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06-Apr-22
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<%
    ArrayList<Question> questionsArray =  (ArrayList<Question>) request.getAttribute("quiz");
    request.setAttribute("items", questionsArray);

    int counter = 0;
%>


<form action="resultQuiz.jsp">
    <c:forEach var="item" items="${items}">
        <p>${item.questionText}</p>

        <c:if test="${item.option1 != ''}">
            <input type="radio" name="question<%= counter %>" value="${item.option1}" checked>
            &nbsp;${item.option1}<br>
            <input type="radio" name="question<%= counter %>" value="${item.option2}">
            &nbsp;${item.option2}<br>
            <input type="radio" name="question<%= counter %>" value="${item.option3}">
            &nbsp;${item.option3}<br>
            <input type="radio" name="question<%= counter %>" value="${item.option4}">
            &nbsp;${item.option4}<br>
            <br><br>
        </c:if>
        <c:if test="${item.option1 == ''}">
            <input type="text" name="question<%= counter %>">
        </c:if>

        <% counter++; %> <%-- to make element name unique --%>
    </c:forEach>

    <input type="hidden" name="testName" value="${testName}">
    <br><br>

    <input type="submit" value="Get results">
</form>

</body>
</html>
