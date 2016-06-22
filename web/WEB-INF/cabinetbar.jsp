<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="navbar navbar-inverse container">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#responsive-menu2">
                <span class="sr-only">Открыть навигацию</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse" id="responsive-menu2">
            <ul class="nav navbar-nav">
                <li><a href="Cabinet"><i class="glyphicon glyphicon-refresh"></i> Кабинет</a></li>
                <li><a href="History">Заказы</a></li>
                <li><a href="../private.jsp">Изменить личные данные</a></li>
                <li><a href="../adress.jsp">Изменить адрес доставки</a></li>
                <li><a href="../bucket.jsp">Корзина</a></li>
                <c:if test="${(Order!=null) && Order.size()>0 }">
                    <li><a href="../getorder.jsp">Текущий заказ</a></li>
                </c:if>
                <c:if test="${User.permission < 2}">
                    <li><a href="../admin.jsp">Администрирование</a></li>
                </c:if>
            </ul>
        </div>
    </div>
</div>

