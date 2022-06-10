<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05-Apr-22
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <% String name = request.getParameter("userName"); %>
    <p>Hello, <%= name %></p>
    <p>Select option: </p>
    <a href="pizzaMenu.jsp?name=<%= name %>">1. Order pizza from menu</a><br>
    <a href="customPizza.jsp?name=<%= name %>">2. Order a custom pizza</a>
</body>
</html>
