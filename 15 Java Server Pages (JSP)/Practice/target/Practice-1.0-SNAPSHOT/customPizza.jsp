<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05-Apr-22
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <p><%= request.getParameter("name") %>, choose ingredients:</p>
    <form action="customPizzaResult.jsp">
        <input type="checkbox" onclick="return false;"  checked>Basement (price: 18)<br><br>

        <label for="cheese">Cheese (50gr, price: 17)&nbsp;&nbsp;&nbsp;</label>
        <input type="number" id="cheese" name="cheese" placeholder="amount"><br><br>

        <label for="chicken">Chicken (50gr, price: 22)&nbsp;&nbsp;&nbsp;</label>
        <input type="number" id="chicken" name="chicken" placeholder="amount"><br><br>

        <label for="pork">Pork (50gr, price: 23)&nbsp;&nbsp;&nbsp;</label>
        <input type="number" id="pork" name="pork" placeholder="amount"><br><br>

        <label for="mushrooms">Mushrooms (50gr, price: 21)&nbsp;&nbsp;&nbsp;</label>
        <input type="number" id="mushrooms" name="mushrooms" placeholder="amount"><br><br>

        <label for="olives">Olives (50gr, price: 13)&nbsp;&nbsp;&nbsp;</label>
        <input type="number" id="olives" name="olives" placeholder="amount"><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
