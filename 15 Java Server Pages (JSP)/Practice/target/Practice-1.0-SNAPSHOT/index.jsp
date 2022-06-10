<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>

<%!
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    ArrayList<String> people = new ArrayList<String>(Arrays.asList("Igor", "Gena", "Vanya", "Nina"));
%>


<p>1. Current date: <%= dtf.format(now) %></p>
<p>2. People:</p>
<ol>
    <%
        for (String person : people) {
            out.println("<li>" + person + "</li>");
        }
    %>
</ol>

<p>--------------------------------------------------------</p>

<p><br><br>3. form:</p>
<form action="userInfo.jsp">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br><br>

    <label for="man">Man:</label>
    <input type="radio" id="man" name="gender" value="man"><br>
    <label for="woman">Woman:</label>
    <input type="radio" id="woman" name="gender" value="woman"><br><br>

    <label for="auto">Auto:</label>
    <input type="text" id="auto" name="auto"><br><br>

    <label for="city">Choose a city:</label>
    <select name="city" id="city">
        <option value="dnipro">Dnipro</option>
        <option value="mariupol">Mariupol</option>
        <option value="lviv">Lviv</option>
        <option value="odessa">Odessa</option>
    </select><br><br>

    <input type="submit" value="Submit">
</form>



<p>--------------------------------------------------------</p>
<br><br>
<p>4. pizza shop</p>
<p>Input your contact info:</p>
<form action="contactInfoConfirm.jsp">
    <label for="userName">Name:</label>
    <input type="text" id="userName" name="userName"><br><br>

    <label for="phone">Phone:</label>
    <input type="text" id="phone" name="phone"><br><br>

    <label for="email">Email:</label>
    <input type="text" id="email" name="email"><br><br>

    <label for="address">Address:</label>
    <input type="text" id="address" name="address"><br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>
