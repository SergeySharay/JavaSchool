<%@ page import="javaschool.entity.Client" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="navbar navbar-inverse container">
    <div class="container">
        <div class="collapse navbar-collapse" id="responsive-menu">
            <ul class="nav navbar-nav">
                <li><a href="Cabinet"><i class="glyphicon glyphicon-refresh"></i> Кабинет</a></li>
                <li><a href="History">Заказы</a></li>
                <li><a href="../private.jsp">Изменить личные данные</a></li>
                <li><a href="../adress.jsp">Изменить адрес доставки</a></li>
                <li><a href="../bucket.jsp">Корзина</a></li>
                <%if(session.getAttribute("Order")!=null)
                {%>
                <li><a href="../getorder.jsp">Текущий заказ</a></li>
                <%}%>
                <%if (((Client)session.getAttribute("User")).getPermission()<2){
                    %><li><a href="../admin.jsp">Администрирование</a></li> <%
                }
                %>
            </ul>
        </div>
    </div>
</div>

