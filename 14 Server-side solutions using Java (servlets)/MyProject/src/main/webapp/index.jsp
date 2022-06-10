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
<a href="hello-servlet">Hello Servlet</a>

<form action="helloServlet" method="post">
    <textarea name="quote" cols="40" rows="5"></textarea>
    &nbsp;&nbsp;
    <input type="submit" value="Show">
</form>

</body>
</html>