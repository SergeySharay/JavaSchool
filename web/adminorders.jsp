<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                    <th>Доставка</th>
                    <th>Статус оплаты</th>
                    <th>Статус заказа</th>
                    <th>Дата заказа</th>
                    <th>Дополнительно</th>
                </tr>
                <c:forEach items="${ordersList}" var="orders">
                    <tr>
                        <td><c:out value="${orders.id}"/></td>
                        <td><c:out value="${orders.client.name}"/>
                            <c:out value="${orders.client.surname}"/></td>
                        <td><c:out value="${orders.payment}"/></td>
                        <td><c:out value="${orders.delivery}"/></td>
                        <td><c:out value="${orders.paymentStatus}"/></td>
                        <td><c:out value="${orders.orderStatus}"/></td>
                        <td><c:out value="${format.format(orders.orderDate)}"/></td>
                        <td>
                            <form method="get" action="AdminOrderPage">
                                <input type="submit" value="Подробнее">
                                <input type="hidden" name="orderId" value="<c:out value="${orders.id}"/>"></form>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
<script src="js/bootstrap.js"></script>
</body>
</html>
