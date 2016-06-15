<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <div class="col-xs-12 col-sm-8 col-md-6">
        <div class="panel panel-default">
            <div class="panel-body privatetable">
                <p>Личные данные</p>
            </div>
            <table class="table">
                <tr>
                    <td>Имя</td>
                    <td><c:out value="${User.name}"/>
                    </td>
                </tr>
                <tr>
                    <td>Фамиилия</td>
                    <td><c:out value="${User.surname}"/>
                    </td>
                </tr>
                <tr>
                    <td>Почта</td>
                    <td><c:out value="${User.email}"/>
                    </td>
                </tr>
                <tr>
                    <td>Пароль</td>
                    <td><c:out value="${User.password}"/>
                    </td>
                </tr>
                <tr>
                    <td>Дата рождения</td>
                    <td>
                        ${User.birthday == null ? "Отсутсвует" : format.format(User.birthday)}
                    </td>
                </tr>
                <tr>
                    <td>Статус</td>
                    <td>${User.permission == 1 ? "Сотрудник" : "Покупатель"}
                    </td>
                </tr>
            </table>
        </div>
    </div>
    <div class="col-xs-12 col-sm-8 col-md-6">
        <div class="panel panel-default">
            <div class="panel-body privatetable">
                <p>Адрес доставки</p>
            </div>

            <table class="table">
                <tr>
                    <td>Страна</td>
                    <td><c:out value="${clientAdress.country}"/></td>
                </tr>
                <tr>
                    <td>Город</td>
                    <td><c:out value="${clientAdress.city}"/></td>
                </tr>
                <tr>
                    <td>Улица</td>
                    <td><c:out value="${clientAdress.street}"/></td>
                </tr>
                <tr>
                    <td>Дом</td>
                    <td><c:out value="${clientAdress.house}"/></td>
                </tr>
                <tr>
                    <td>Квартира</td>
                    <td><c:out value="${clientAdress.flat}"/></td>
                </tr>
                <tr>
                    <td>Почтовый индекс</td>
                    <td><c:out value="${clientAdress.zipcode}"/></td>
                </tr>
            </table>
        </div>
    </div>
</div>
<script src="js/bootstrap.js"></script>
</body>
</html>
