<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=utf-8" language="java" pageEncoding="UTF-8" %>
<div id="navbar_menu">
    <div class="navbar navbar-inverse navbar-static-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#responsive-menu">
                    <span class="sr-only">Открыть навигацию</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <div class="collapse navbar-collapse" id="responsive-menu">
                <ul class="nav navbar-nav">
                    <li><a href="../index.jsp"><i class="glyphicon glyphicon-home"></i></a></li>
                    <li><a href="../adout.jsp">О компании</a></li>
                    <li><a href="Catalog">Каталог товаров</a></li>
                    <li><a href="../contacts.jsp">Контакты</a></li>
                    <li><a href="../delivery.jsp">Доставка</a></li>
                    <li><a href="../pay.jsp">Оплата</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <%
                        //CheckCookie.check(request);
                        if (session.getAttribute("CheckCookie") == "true") {
                    %>
                    <li><a href="Cabinet"><i class="glyphicon glyphicon-user"></i>
                        <c:out value="${User.email}"/>
                    </a></li>
                    <li><a href="Logout"><i class="glyphicon glyphicon-off"></i> Выйти</a></li>
                    <%} else {%>
                    <li><a href="../login.jsp">Регистрация / Вход</a></li>
                    <%}%>
                </ul>
            </div>
        </div>
    </div>
</div>
<div id="bucket"><a href="bucket.jsp"><img src="../img/bucket.png"></a></div>