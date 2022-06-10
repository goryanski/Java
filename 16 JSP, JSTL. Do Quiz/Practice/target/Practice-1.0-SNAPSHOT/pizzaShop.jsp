<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05-Apr-22
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<p>Take an order:</p>
<form action="orderResult.jsp">
<%--    <label for="name">Name:</label>--%>
<%--    <input type="text" id="name" name="name"><br><br>--%>

<%--    <label for="man">Man:</label>--%>
<%--    <input type="radio" id="man" name="gender" value="man"><br>--%>
<%--    <label for="woman">Woman:</label>--%>
<%--    <input type="radio" id="woman" name="gender" value="woman"><br><br>--%>

<%--    <label for="auto">Auto:</label>--%>
<%--    <input type="text" id="auto" name="auto"><br><br>--%>

<%--    <label for="city">Choose a city:</label>--%>
<%--    <select name="city" id="city">--%>
<%--        <option value="dnipro">Dnipro</option>--%>
<%--        <option value="mariupol">Mariupol</option>--%>
<%--        <option value="lviv">Lviv</option>--%>
<%--        <option value="odessa">Odessa</option>--%>
<%--    </select><br><br>--%>
    <label for="man">Man:</label>
    <input type="radio" id="man" name="gender" value="man"><br>
    <label for="woman">Woman:</label>
    <input type="radio" id="woman" name="gender" value="woman"><br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
