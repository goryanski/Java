<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05-Apr-22
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <p>Name: <%= request.getParameter("name") %></p>
    <p>Gender: <%= request.getParameter("gender") %></p>
    <p>Auto: <%= request.getParameter("auto") %></p>
    <p>City: <%= request.getParameter("city") %></p>
</body>
</html>
