<%@ page import="javaschool.entity.OrderProduct" %>
<%@ page import="javaschool.entity.Orders" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Set" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->

    <title>Личные данные</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/><!-- навигация -->
<jsp:include page="WEB-INF/cabinetbar.jsp" flush="true"/><!-- навигация -->

<div class="container">


        <%
            int i = 1;
            for (Orders orders : (Set<Orders>) session.getAttribute("OrdersSet")) {
        %>
    <div class="col-xs-12 col-sm-8 col-md-4" id="<%=i%>">

    <div class="panel panel-default" id="order">
            <div class="panel-heading">Заказ №<%=orders.getId()%>
            </div>
            <div class="panel-body">
                <table class="table">
                    <tr>
                        <td>Оплата</td>
                        <td><%=orders.getPayment()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Доставка</td>
                        <td><%=orders.getDelivery()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Статус оплаты</td>
                        <td><%=orders.getPaymentStatus()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Статус заказа</td>
                        <td><%=orders.getOrderStatus()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Дата заказа</td>
                        <td><%
                            DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                            out.print(format.format(orders.getOrderDate()));%></td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
    <div class="col-xs-12 col-sm-8 col-md-8">
        <div class="panel panel-default">
            <div class="panel-heading">Подробности заказа №<%=orders.getId()%></div>
            <div class="panel-body"></div>
            <table class="table">
                <tr>
                    <th>Наименование</th>
                    <th>Цена, руб.</th>
                    <th>Колличество, шт</th>
                </tr>
                <%float sum=0;
                    for (OrderProduct orderProduct: orders.getBucket()){
                    %>

                <tr>
                    <td><%=orderProduct.getProductId().getName()%></td>
                    <td><%=orderProduct.getQuantity()%></td>
                    <td><%=orderProduct.getProductId().getPrice()%></td=
                    <%sum+=(orderProduct.getProductId().getPrice())*(orderProduct.getQuantity());%>
                </tr>

                <%}%>
                <tr>
                    <td></td>
                    <td>Общая стоимость, руб</td>
                    <td><%=sum%></td>
                </tr>
            </table>
        </div>
    </div>
        <%
            }
        %>




</div>
<script src="js/bootstrap.js"></script>
</body>
</html>
