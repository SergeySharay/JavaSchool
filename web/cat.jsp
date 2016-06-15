<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
  <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
  <title>Каталог</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/> <!-- навигация -->

  <div class="container">

    <div class="row">
      <div class="container">
        <ol class="breadcrumb">
          <li><a href="index.jsp">
            <i class="fa fa-home"></i>
          </a></li>
          <li><a href="Catalog">Каталог товаров</a></li>
          <li class="active"><a href="Catalog">Бренды</a></li>
        </ol>
      </div><!-- хлебные крошки-->
    </div><!-- хлебные крошки-->

    <div class="container">
      <div class="row">
        <form role="form" method="get" action="Filter" class="btn">
          <input type="submit" value="Подобрать товар" class="btn btn-info">
        </form>
        <c:forEach items="${catalogMenuBrandList}" var="brand">
          <form role="form" method="get" action="Catalog" class="btn">
            <input type="submit" value="<c:out value="${brand}"/>" class="btn btn-primary">
            <input type="hidden" name="Brands" value="<c:out value="${brand}"/>">
          </form>
        </c:forEach>
      </div>
    </div><!-- Бренды-->
    <br>

  </div>

<div class="container">
  <div class="row masonry" data-columns>
    <c:forEach items="${catalogCollectionList}" var="collection">
      <div class="item">
        <div class="thumbnail">
          <img src="../img/col/<c:out value="${collection}.jpg"/> " alt="">
          <div class="caption">
            <form role="form" method="post" action="Collection">
              <p align="center">
                ${collection}
              </p>
              <p align="right">
                <input type="submit" value="Подробнее" class="btn btn-primary buyitem">
                <input type="hidden" name="Brand" value="${catalogBrand}">
                <input type="hidden" name="Collection" value="${collection}">
              </p></form>
          </div>
        </div>
      </div>
    </c:forEach>
    </div>
  </div>



<div id="bucket"><a href="bucket.jsp"><img src="../img/bucket.png"></a></div>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/salvattore.min.js"></script>

</body>
</html>