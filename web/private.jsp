<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="windows-1251" %>
<html>
<head>
    <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->

    <title>Личный кабинет</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/><!-- навигация -->
<jsp:include page="WEB-INF/cabinetbar.jsp" flush="true"/><!-- навигация -->

<div class="container">
    <div class="col-xs-12 col-sm-6 col-md-6">
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
    <div class="col-xs-12 col-sm-6 col-md-6">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Личные данные</h3>
            </div>
            <div class="panel-body privatetable">
                <form role="form" method="POST" action="Private">
                    <div class="form-group">
                        <input type="text" name="firstName" id="firstName" class="form-control input-sm"
                               maxlength="50" placeholder="Имя">
                    </div>
                    <div class="form-group">
                        <input type="text" name="lastName" id="lastName" class="form-control input-sm"
                               maxlength="50" placeholder="Фамилия">
                    </div>
                    <div class="form-group">
                        <input type="email" name="email" id="email" class="form-control input-sm"
                               maxlength="60" placeholder="Почта">
                    </div>
                    <div class="form-group">
                        <input type="password" name="pass" id="pass" class="form-control input-sm"
                               maxlength="30" placeholder="Пароль">
                    </div>
                    <div class="form-group">
                        <input type="text" name="date" id="date" class="form-control input-sm"
                               placeholder="Пароль dd.mm.yyyy">
                    </div>
                    <input type="submit" value="Сохранить" class="btn btn-info btn-block">
                </form>
            </div>
        </div>
    </div>
</div>
<script src="js/bootstrap.js"></script>
</body>
</html>
