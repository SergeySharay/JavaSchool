<%@ page import="javaschool.entity.Orders" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="windows-1251"%>
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
    <div class="col-xs-12 col-sm-6 col-md-6">
        <div class="panel panel-default" id="order">
            <div class="panel-heading">
                Заказ №<%=((Orders) session.getAttribute("orderPage")).getId()%>
            </div>
            <div class="panel-body">
                <table class="table">
                    <tr>
                        <td>Id клиента</td>
                        <td><%=((Orders) session.getAttribute("orderPage")).getClient().getClientId()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Данные клиента</td>
                        <td><%=((Orders) session.getAttribute("orderPage")).getClient().getName()%>
                            <%=((Orders) session.getAttribute("orderPage")).getClient().getSurname()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Оплата</td>
                        <td><%=((Orders) session.getAttribute("orderPage")).getPayment()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Доставка</td>
                        <td><%=((Orders) session.getAttribute("orderPage")).getDelivery()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Статус оплаты</td>
                        <td><%=((Orders) session.getAttribute("orderPage")).getPaymentStatus()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Статус заказа</td>
                        <td><%=((Orders) session.getAttribute("orderPage")).getOrderStatus()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Дата заказа</td>
                        <td><%=((Orders) session.getAttribute("orderPage")).getOrderDate()%>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
    <div class="col-xs-12 col-sm-6 col-md-6">
        <div class="panel panel-default">
            <div class="panel-heading">
                Изменить заказ
            </div>
            <div class="panel-body">
                <form role="form" method="POST" action="AdminOrderPage">
                    <div class="form-group">
                        <input type="text" name="payment" class="form-control input-sm"
                               placeholder="Оплата" maxlength="80">
                    </div>
                    <div class="form-group">
                        <input type="text" name="delivery" class="form-control input-sm"
                               maxlength="80" placeholder="Доставка">
                    </div>
                    <div class="form-group">
                        <input type="text" name="pamentstatus" class="form-control input-sm"
                               maxlength="80" placeholder="Статус оплаты">
                    </div>
                    <div class="form-group">
                        <input type="text" name="orderstatus" class="form-control input-sm"
                               maxlength="25" placeholder="Статус заказа">
                    </div>
                    <input type="hidden" name="orderId"
                           value="<%=((Orders) session.getAttribute("orderPage")).getId()%>">
                    <input type="submit" value="Сохранить" class="btn btn-info btn-block">
                </form>
            </div>
        </div>
    </div>
</div>

<script src="js/bootstrap.js"></script>
</body>
</html>
