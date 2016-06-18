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
            Список клиентов
        </div>
        <div class="panel-body">
            <table class="table">
                <tr>
                    <th>Id</th>
                    <th>Имя</th>
                    <th>Фамилия</th>
                    <th>Почта</th>
                    <th>Дата рождения</th>
                    <th>Статус клиента</th>
                    <th>Изменить полномочия</th>
                </tr>
                <c:forEach items="${clientList}" var="client">
                    <tr>
                        <td><c:out value="${client.clientId}"/></td>
                        <td><c:out value="${client.name}"/></td>
                        <td><c:out value="${client.surname}"/></td>
                        <td><c:out value="${client.email}"/></td>
                        <td>
                                ${client.birthday == null ? "Отсутсвует" : format.format(client.birthday)}
                        </td>
                        <td><c:out value="${client.permission}"/></td>
                        <td>
                            <form method="post" action="AdminClients">
                                <input type="submit" value="изменить">
                                <input type="hidden" name="clientId" value="<c:out value="${client.clientId}"/>"></form>
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
