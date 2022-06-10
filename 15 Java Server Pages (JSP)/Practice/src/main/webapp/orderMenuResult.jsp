<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05-Apr-22
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <%
        String pizzaName = request.getParameter("pizza");
        int pizzaPrice = 0;
        switch (pizzaName) {
            case "Margarita":
                pizzaPrice = 100;
                break;
            case "Four cheeses":
                pizzaPrice = 110;
                break;
            case "Caprichoza":
                pizzaPrice = 120;
                break;
            case "Gavai":
                pizzaPrice = 90;
                break;
        }

        String products = "none";
        int productsPrice = 0;
        String [] productsArray = request.getParameterValues("products");
        System.out.println("productsArray: " +  productsArray);
        if(productsArray != null) {
            products = "";
           for (String product : productsArray) {
               products += product + "; ";
               productsPrice += getProductPrice(product);
           }
        }
    %>

<p>Pizza name: <%= pizzaName %></p>
<p>Pizza price: <%= pizzaPrice %></p>
<p>Additional products list: <%= products %></p>
<p>Products price: <%= productsPrice %></p>
<p>-----------------------------------------------</p><br>
<p>General price: <%= pizzaPrice + productsPrice %> </p>
</body>
</html>

<%!
    private int getProductPrice(String product) {
        switch (product) {
            case "cheese":
                return 18;
            case "meat":
                return 20;
            case "olives":
                return 15;
            case "mushrooms":
                return 16;
            default: return 0;
        }
    }
%>