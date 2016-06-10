<%@ page import="javaschool.entity.Orders" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->

    <title>Администрация</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/><!-- навигация -->
<jsp:include page="WEB-INF/cabinetbar.jsp" flush="true"/><!-- навигация -->
<jsp:include page="WEB-INF/cabinetbaradmin.jsp" flush="true"/><!-- навигация -->


<div class="container">
    <div class="panel panel-default" id="order">
        <div class="panel-heading">
            Список заказов
        </div>
        <div class="panel-body">
            <table class="table">
                <tr>
                    <th>Номер заказа</th>
                    <th>Клиент</th>
                    <th>Оплата</th>
                    <td>Доставка</td>
                    <td>Статус оплаты</td>
                    <td>Статус заказа</td>
                    <td>Дата заказа</td>
                    <td>Дополнительно</td>
                </tr>
                <%
                    for (Orders orders : (List<Orders>) session.getAttribute("ordersList")) {
                %>
                <tr>
                    <td><%=orders.getId()%>
                    </td>
                    <td><%=orders.getClient().getName()%>
                        <%=orders.getClient().getSurname()%>
                    </td>
                    <td><%=orders.getPayment()%>
                    </td>
                    <td><%=orders.getDelivery()%>
                    </td>
                    <td><%=orders.getPaymentStatus()%>
                    </td>
                    <td><%=orders.getOrderStatus()%>
                    </td>
                    <td><%=orders.getOrderDate()%>
                    </td>
                    <td><form method="get" action="AdminOrders">
                        <input type="submit" value="Подробнее">
                        <input type="hidden" name="orderId" value="<%=orders.getId()%>"></form></td>
                        <%}%>
            </table>
        </div>
    </div>
</div>
<script src="js/bootstrap.js"></script>
</body>
</html>
