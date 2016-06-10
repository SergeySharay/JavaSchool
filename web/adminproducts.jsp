<%@ page import="javaschool.entity.Product" %>
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
            Список товаров
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
                <%
                    for (Product product : (List<Product>) session.getAttribute("productList")) {
                %>
                <tr>
                    <td><%=product.getId()%>
                    </td>
                    <td><%=product.getBrand()%>
                    </td>
                    <td><%=product.getCollection()%>
                    </td>
                    <td><%=product.getName()%>
                    </td>
                    <td><%=product.getPrice()%>
                    </td>
                    <td><form method="get" action="AdminProducts">
                        <input type="submit" value="Подробнее">
                        <input type="hidden" name="productId" value="<%=product.getId()%>"></form>
                    </td>

                </tr>
                        <%}%>
            </table>
        </div>
    </div>
</div>
<script src="js/bootstrap.js"></script>
</body>
</html>
