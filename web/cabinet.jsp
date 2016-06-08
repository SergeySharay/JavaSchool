<%@ page import="java.util.List" %>
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
                <%List<String> clientAtributes = (List<String>) session.getAttribute("clienAtributes");%>
                <tr>
                    <td>Имя</td>
                    <td><%=clientAtributes.get(0)%>
                    </td>
                </tr>
                <tr>
                    <td>Фамиилия</td>
                    <td><%=clientAtributes.get(1)%>
                    </td>
                </tr>
                <tr>
                    <td>Почта</td>
                    <td><%=clientAtributes.get(2)%>
                    </td>
                </tr>
                <tr>
                    <td>Пароль</td>
                    <td><%=clientAtributes.get(3)%>
                    </td>
                </tr>
                <tr>
                    <td>Дата рождения</td>
                    <td><%=clientAtributes.get(4)%>
                    </td>
                </tr>
                <tr>
                    <td>Статус</td>
                    <td><%=clientAtributes.get(5)%>
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
                <%List<String> adressAtributes = (List<String>) session.getAttribute("clienAdressAtributes");%>
                <tr>
                    <td>Страна</td>
                    <td><%=adressAtributes.get(0)%>
                    </td>
                </tr>
                <tr>
                    <td>Город</td>
                    <td><%=adressAtributes.get(1)%>
                    </td>
                </tr>
                <tr>
                    <td>Улица</td>
                    <td><%=adressAtributes.get(2)%>
                    </td>
                </tr>
                <tr>
                    <td>Дом</td>
                    <td><%=adressAtributes.get(3)%>
                    </td>
                </tr>
                <tr>
                    <td>Квартира</td>
                    <td><%=adressAtributes.get(4)%>
                    </td>
                </tr>
                <tr>
                    <td>Почтовый индекс</td>
                    <td><%=adressAtributes.get(5)%>
                    </td>
                </tr>
            </table>
        </div>
    </div>
</div>
<script src="js/bootstrap.js"></script>
</body>
</html>
