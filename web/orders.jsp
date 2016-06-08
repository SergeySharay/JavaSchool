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
      <div class="panel-body" id="privatetable">
        <p>Итория заказов</p>
      </div>
      <table class="table">
          <td></td>
      </table>
    </div>
  </div>
</div>
<script src="js/bootstrap.js"></script>
</body>
</html>
