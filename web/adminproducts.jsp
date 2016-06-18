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
             <div align="right">
            <form role="form" method="get" action="adminproductadd.jsp" class="btn">
                <input type="submit" value="Добавить товар" class="btn btn-info">
            </form></div>
        </div>
        <div class="panel-body">
            <table class="table">
                <tr>
                    <th>Номер</th>
                    <th>Бренд</th>
                    <th>Коллекция</th>
                    <th>Наименование</th>
                    <th>Цена</th>
                    <th>Дополнительно</th>
                </tr>
                <c:forEach items="${productList}" var="product">
                    <tr>
                        <td><c:out value="${product.id}"/></td>
                        <td><c:out value="${product.brand}"/></td>
                        <td><c:out value="${product.collection}"/></td>
                        <td><c:out value="${product.name}"/></td>
                        <td><c:out value="${product.price}"/></td>
                        <td>
                            <form method="get" action="AdminProductPage">
                                <input type="submit" value="Подробнее">
                                <input type="hidden" name="productId" value="<c:out value="${product.id}"/>"></form>
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
