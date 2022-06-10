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

<h2>Welcome to Quiz! Select a category:</h2>
<a href="/history">1. History</a><br>
<a href="/sport">2. Sport</a><br>
<a href="/music">3. Music</a><br>
<a href="/space">4. Space</a><br>

</body>
</html>
