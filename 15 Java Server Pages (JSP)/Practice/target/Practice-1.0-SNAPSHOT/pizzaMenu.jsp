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
<form action="orderMenuResult.jsp">
    <label for="pizza"><%= request.getParameter("name") %>, choose a pizza:</label>
    <select name="pizza" id="pizza">
        <option value="Margarita">Margarita (price: 100)</option>
        <option value="Four cheeses">Four cheeses (price: 110)</option>
        <option value="Caprichoza">Caprichoza (price: 120)</option>
        <option value="Gavai">Gavai (price: 90)</option>
    </select><br><br>

    <p>Add something?</p>
    <input type="checkbox" name="products" value="cheese">Cheese (price: 18)<br>
    <input type="checkbox" name="products" value="meat">Meat (price: 20)<br>
    <input type="checkbox" name="products" value="olives">Olives (price: 15)<br>
    <input type="checkbox" name="products" value="mushrooms">Mushrooms (price: 16)<br>
    <br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
