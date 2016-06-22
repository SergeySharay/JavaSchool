<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="javaschool.dao.ProductDaoImpl" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
    <title>Корзина</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/>
<!-- навигация -->
<% Map<Long, Integer> products = (Map<Long, Integer>) session.getAttribute("Order");
    ProductDaoImpl productDao = new ProductDaoImpl();
%>
<div class="container">
    <div class="col-xs-12 col-sm-12 col-md-12">
        <div class="panel panel-default" id="order">
            <div class="panel-heading">Заказ</div>
            <div class="panel-body">
                <p><%
                    if (products == null || products.size() == 0)
                        out.print("Ваша корзина пуста. Перейдите в каталог и добавьте товары в корзину.");
                %></p>

                <!-- Table -->
                <table class="table">
                    <tr>
                        <th>Наименование</th>
                        <th>Цена</th>
                        <th>Колличество</th>
                        <th>Сумма</th>
                    </tr>
                    <% float sum = 0;
                        if (products != null) for (Map.Entry entry : products.entrySet()) {

                            sum += (productDao.get((Long) entry.getKey()).getPrice() * (Integer) entry.getValue());
                    %>
                    <tr>
                        <td><%=productDao.get((Long) entry.getKey()).getName()%>
                        </td>
                        <td><%=productDao.get((Long) entry.getKey()).getPrice()%>
                        </td>
                        <td>
                            <form method="GET" action="Bucket" class="count_button">
                                <input class="btn minus" type="submit" name="Quantity" value="-1">

                                <div class="getv"><%=entry.getValue()%>
                                </div>
                                <input class="btn plus" type="submit" name="Quantity" value="+1">
                                <input type="hidden" name="ProductId" value="<%=entry.getKey()%>">
                            </form>
                        </td>
                        <td><%=(productDao.get((Long) entry.getKey()).getPrice() * (Integer) entry.getValue())%>
                        </td>
                    </tr>
                    <%}%>
                    <tr>
                        <td></td>
                        <td></td>
                        <td>Общая стоимость</td>
                        <td><%=sum%>
                        </td>
                    </tr>
                </table>
                <p><%
                if (session.getAttribute("CheckCookie") == "true") {
                    if (sum > 0) {
                    %>

                <form method="get" action="../getorder.jsp" id="getorder"></form>
                <button type="submit" form="getorder" class="btn btn-primary">Оформить заказ</button>
                    <%
                        } else {
                            out.print("Для того что бы оформить заказ, необходимо добавить товары в корзину");
                        }
                    } else {out.print("Для того что бы оформить заказ, необходимо зарегистрироваться или войти в аккаунт");}
                %></p>
            </div>
        </div>
    </div>
</div>
<script src="js/bootstrap.js"></script>
</body>
</html>
