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
            <div class="panel-heading">
                <h3 class="panel-title">Адрес доставки</h3>
            </div>
            <div class="panel-body privatetable">
                <form role="form" method="POST" action="Adress">

                    <div class="form-group">
                        <input type="text" name="country" id="country" class="form-control input-sm"
                               placeholder="Страна" maxlength="40" pattern="^[A-Za-zА-Яа-яЁё]+$">
                    </div>
                    <div class="form-group">
                        <input type="text" name="city" id="city" class="form-control input-sm"
                               maxlength="40" placeholder="Город">
                    </div>
                    <div class="form-group">
                        <input type="text" name="street" id="street" class="form-control input-sm"
                               maxlength="40" placeholder="Улица">
                    </div>
                    <div class="form-group">
                        <input type="text" name="house" id="house" class="form-control input-sm"
                               maxlength="25" placeholder="Дом">
                    </div>
                    <div class="form-group">
                        <input type="text" name="flat" id="flat" class="form-control input-sm"
                               maxlength="25" placeholder="Квартира">
                    </div>
                    <div class="form-group">
                        <input type="number" name="zipcode" id="zipcode" class="form-control input-sm"
                               placeholder="Почтовый индекс" size="6" min="100000" max="999999">
                    </div>
                    <input type="submit" value="Сохранить" class="btn btn-info btn-block">

                </form>
            </div>
        </div>
    </div>
    <div class="col-xs-12 col-sm-6 col-md-6">
        <div class="panel panel-default">
            <div class="panel-body privatetable">
                <p>Адрес доставки</p>
            </div>
            <table class="table">
                <tr>
                    <td>Страна</td>
                    <td>
                        <c:out value="${clientAdress.country}"/>
                    </td>
                </tr>
                <tr>
                    <td>Город</td>
                    <td><c:out value="${clientAdress.city}"/>
                    </td>
                </tr>
                <tr>
                    <td>Улица</td>
                    <td><c:out value="${clientAdress.street}"/>
                    </td>
                </tr>
                <tr>
                    <td>Дом</td>
                    <td><c:out value="${clientAdress.house}"/>
                    </td>
                </tr>
                <tr>
                    <td>Квартира</td>
                    <td><c:out value="${clientAdress.flat}"/>
                    </td>
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
