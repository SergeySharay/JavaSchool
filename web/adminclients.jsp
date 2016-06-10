<%@ page import="javaschool.entity.Client" %>
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
      Список клиентов
    </div>
    <div class="panel-body">
      <table class="table">
        <tr>
        <th>Id</th>
        <th>Имя</th>
         <td>Фамилия</td>
          <td>Почта</td>
          <td>Дата рождения</td>
          <td>Статус клиента</td>
          <td>Изменить полномочия</td>
        </tr>
      <%for(Client client: (List<Client>)session.getAttribute("clientList")) {
        %>
        <tr>
          <td><%=client.getClientId()%></td>
          <td><%=client.getName()%></td>
          <td><%=client.getSurname()%></td>
          <td><%=client.getEmail()%></td>
          <td><%=client.getBirthday()%></td>
          <td><%=client.getPermission()%></td>
          <td><form method="get" action="AdminClients">
            <input type="submit" value="изменить">
            <input type="hidden" name="clientId" value="<%=client.getClientId()%>"></form></td>
        </tr>
      <%}%>
        </table>
    </div>
  </div>
</div>


<script src="js/bootstrap.js"></script>
</body>
</html>
