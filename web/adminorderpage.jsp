<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="windows-1251" %>
<html>
<head>
    <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->

    <title>�������������</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/><!-- ��������� -->
<jsp:include page="WEB-INF/cabinetbar.jsp" flush="true"/><!-- ��������� -->
<jsp:include page="WEB-INF/cabinetbaradmin.jsp" flush="true"/><!-- ��������� -->

<div class="container">
    <div class="col-xs-12 col-sm-6 col-md-6">
        <div class="panel panel-default" id="order">
            <div class="panel-heading">
                ����� �<c:out value="${orderPage.id}"/>
            </div>
            <div class="panel-body">
                <table class="table">
                    <tr>
                        <td>Id �������</td>
                        <td><c:out value="${orderPage.client.clientId}"/></td>
                    </tr>
                    <tr>
                        <td>������ �������</td>
                        <td>
                            <c:out value="${orderPage.client.name}"/>
                            <c:out value="${orderPage.client.surname}"/>
                        </td>
                    </tr>
                    <tr>
                        <td>������</td>
                        <td><c:out value="${orderPage.payment}"/></td>
                    </tr>
                    <tr>
                        <td>��������</td>
                        <td><c:out value="${orderPage.delivery}"/></td>
                    </tr>
                    <tr>
                        <td>������ ������</td>
                        <td><c:out value="${orderPage.paymentStatus}"/></td>
                        </td>
                    </tr>
                    <tr>
                        <td>������ ������</td>
                        <td><c:out value="${orderPage.orderStatus}"/>
                        </td>
                    </tr>
                    <tr>
                        <td>���� ������</td>
                        <td><c:out value="${format.format(orderPage.orderDate)}"/>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
    <div class="col-xs-12 col-sm-6 col-md-6">
        <div class="panel panel-default">
            <div class="panel-heading">
                �������� �����
            </div>
            <div class="panel-body">
                <form role="form" method="POST" action="AdminOrderPage">
                    <div class="form-group">
                        <input type="text" name="payment" class="form-control input-sm"
                               placeholder="������" maxlength="80">
                    </div>
                    <div class="form-group">
                        <input type="text" name="delivery" class="form-control input-sm"
                               maxlength="80" placeholder="��������">
                    </div>
                    <div class="form-group">
                        <input type="text" name="pamentstatus" class="form-control input-sm"
                               maxlength="80" placeholder="������ ������">
                    </div>
                    <div class="form-group">
                        <input type="text" name="orderstatus" class="form-control input-sm"
                               maxlength="25" placeholder="������ ������">
                    </div>
                    <input type="hidden" name="orderId"
                           value="<c:out value="${orderPage.id}"/>">
                    <input type="submit" value="���������" class="btn btn-info btn-block">
                </form>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="col-xs-12 col-sm-12 col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading">����������� ������ �<c:out value="${orderPage.id}"/>
            </div>
            <div class="panel-body"></div>
            <table class="table">
                <tr>
                    <th>������������</th>
                    <th>����, ���.</th>
                    <th>�����������, ��</th>
                </tr>
                <c:set var="sum" value="0"/>
                <c:forEach items="${orderPage.bucket}" var="orderProduct">
                    <tr>
                        <td><c:out value="${orderProduct.productId.name}"/></td>
                        <td><c:out value="${orderProduct.productId.price}"/></td>
                        <td><c:out value="${orderProduct.quantity}"/></td>
                        <c:set var="sum" value="${sum + orderProduct.productId.price * orderProduct.quantity}"/>
                    </tr>
                </c:forEach>
                <tr>
                    <td></td>
                    <td>����� ���������, ���</td>
                    <td><c:out value="${sum}"/>
                    </td>
                </tr>
            </table>
        </div>
    </div>
</div>
<script src="js/bootstrap.js"></script>
</body>
</html>
