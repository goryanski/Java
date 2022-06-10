<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05-Apr-22
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<%
    int generalPrice = 18; // with a basement

    String cheeseCountStr = request.getParameter("cheese");
    int cheesePrice = 0;
    if(!cheeseCountStr.equals("")) {
        cheesePrice = Integer.parseInt(cheeseCountStr) * 17;
    }

    String chickenCountStr = request.getParameter("chicken");
    int chickenPrice = 0;
    if(!chickenCountStr.equals("")) {
        chickenPrice = Integer.parseInt(chickenCountStr) * 22;
    }

    String porkCountStr = request.getParameter("pork");
    int porkPrice = 0;
    if(!porkCountStr.equals("")) {
        porkPrice = Integer.parseInt(porkCountStr) * 23;
    }

    String mushroomsCountStr = request.getParameter("mushrooms");
    int mushroomsPrice = 0;
    if(!mushroomsCountStr.equals("")) {
        mushroomsPrice = Integer.parseInt(mushroomsCountStr) * 21;
    }

    String olivesCountStr = request.getParameter("olives");
    int olivesPrice = 0;
    if(!olivesCountStr.equals("")) {
        olivesPrice = Integer.parseInt(olivesCountStr) * 13;
    }
%>
<p>Order:</p>
<p>1. Basement (price: 18)</p>
<p>2. Cheese (price: <%= cheesePrice %>)</p>
<p>3. Chicken (price: <%= chickenPrice %>)</p>
<p>4. Pork (price: <%= porkPrice %>)</p>
<p>5. Mushrooms (price: <%= mushroomsPrice %>)</p>
<p>6. Olives (price: <%= olivesPrice %>)</p>

<p>-----------------------------------------------</p><br>
<p>General price: <%= generalPrice + cheesePrice + chickenPrice + porkPrice + mushroomsPrice + olivesPrice %> </p>
</body>
</html>
