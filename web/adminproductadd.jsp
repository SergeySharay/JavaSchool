<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="windows-1251"%>
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
  <div class="col-xs-12 col-sm-6 col-md-6">
    <div class="panel panel-default">
      <div class="panel-heading">
        Создать товар
      </div>
      <div class="panel-body">
        <form role="form" method="post" action="AdminProductAdd">
          <div class="form-group">
            <input type="text" name="brand" class="form-control input-sm"
                   placeholder="Бренд" maxlength="80" required>
          </div>
          <div class="form-group">
            <input type="text" name="collection" class="form-control input-sm"
                   maxlength="80" placeholder="Коллекция" required>
          </div>
          <div class="form-group">
            <input type="text" name="name" class="form-control input-sm"
                   maxlength="80" placeholder="Название" required>
          </div>
          <div class="form-group">
            <input type="number" name="price" class="form-control input-sm"
                   maxlength="25" placeholder="Цена" min="1" max="999999" required>
          </div>

          <div class="form-group">
            <input type="number" name="length" class="form-control input-sm"
                   maxlength="25" placeholder="Длина" min="1" max="1000" required>
          </div>
          <div class="form-group">
            <input type="number" name="width" class="form-control input-sm"
                   maxlength="25" placeholder="Ширина" min="1" max="1000" required>
          </div>
          <div class="form-group">
            <input type="number" name="weight" class="form-control input-sm"
                   maxlength="25" placeholder="Вес" min="1" max="1000" required>
          </div>
          <div class="form-group">
            <input type="number" name="quantity" class="form-control input-sm"
                   maxlength="25" placeholder="Количество" min="0" max="5000" required>
          </div>
          <div class="form-group">
            <input type="text" name="color" class="form-control input-sm"
                   maxlength="80" placeholder="Цвет" required>
          </div>
          <div class="form-group">
            <input type="text" name="picture" class="form-control input-sm"
                   maxlength="80" placeholder="Изображение">
          </div>
          <input type="submit" value="Сохранить" class="btn btn-info btn-block">
        </form>
      </div>
    </div>
  </div>
</div>
</body>
</html>
