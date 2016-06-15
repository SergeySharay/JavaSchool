<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
  <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
  <title>Каталог</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/> <!-- навигация -->
  <div class="row">
  <div class="container">
    <ol class="breadcrumb">
      <li><a href="index.jsp">
        <i class="fa fa-home"></i>
      </a></li>
      <li><a href="Catalog">Каталог товаров</a></li>
      <li><a href="Catalog">Бренды</a></li>
      <li class="active"><a href="filter.jsp">Фильтр</a></li>
    </ol>
  </div><!-- хлебные крошки-->
</div><!-- хлебные крошки-->

  <div class="container">
    <div class="col-xs-3">
      <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Подбор по параметрам</h3>
      </div>
      <div class="panel-body privatetable">
        <div class="container">
          <div class="col-xs-3">
            <form role="form" method="get" action="Filter" class="btn">
            <label for="filter1">Выберите коллекцию</label>
            <select class="filter" id="filter1" name="col">
              <c:forEach items="${FilterCollections}" var="collection">
                <option value="1"><c:out value="${collection}"/></option>
              </c:forEach>
              <option value="1"></option>
              <option value="2">Синий</option>
              <option value="3">Белый</option>
              <option value="4">Желтый</option>
            </select>
            <label for="filter1">Выберите стоимость</label>
            <select class="filter" id="filter2" name="price">
              <option value="1">До 500</option>
              <option value="2">от 500 до 1500</option>
              <option value="3">от 1500</option>
            </select>
            <label for="filter1">Выберите вес</label>
            <select class="filter" id="filter3" name="weight">
              <option value="1">до 5 </option>
              <option value="2">от 5 до 10</option>
              <option value="3">от 10 до 15</option>
              <option value="4">от 15</option>
            </select>
            <label for="filter1">Выберите длину</label>
            <select class="filter" id="filter4" name="length">
              <option value="1">До 20</option>
              <option value="2">от 20 до 30</option>
              <option value="3">от 30 до 40</option>
              <option value="4">более 40</option>
            </select>
            <label for="filter1">Выберите ширину</label>
            <select class="filter" id="filter5" name="width">
              <option value="1">до 10</option>
              <option value="2">от 10 до 20</option>
              <option value="3">от 20 до 30</option>
              <option value="4">от 30</option>
            </select>
            <label for="filter1">Выберите цвет</label>
            <select class="filter" id="filter6" name="color">
              <option value="1">Красный</option>
              <option value="2">Синий</option>
              <option value="2">Белый</option>
              <option value="3">Желтый</option>
            </select>
            <input type="submit" value="Подобрать" class="btn btn-primary">
            <input type="hidden" name="Brands" value="">
            </form>
          </div>
        </div>
      </div>
    </div>
    </div>
    <div class="col-xs-9">
      <div class="row masonry" data-columns>
    <c:forEach items="${FilterProducts}" var="product">
      <div class="item">
        <div class="thumbnail">
          <img src="../img/pic/<c:out value="${product.id}"/>.jpg" alt="">

          <div class="caption">
            <form role="form" method="POST" action="Order">
              <p align="center">
                <c:out value="${product.name}"/>
              </p>

              <p align="right">
                <input type="submit" value="Купить" class="btn btn-primary buyitem">
                <input type="hidden" name="Brand" value="<c:out value="${Brand}"/>">
                <input type="hidden" name="Collection" value="<c:out value="${Collection}"/>">
                <input type="hidden" name="Product" value="<c:out value="${product.id}"/>">
              </p></form>
          </div>
        </div>
      </div>

    </c:forEach>
    </div>
  </div>
</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/salvattore.min.js"></script>
</body>
</html>
