<%@ page import="javaschool.entity.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Set" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
  <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
  <title>Каталог</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/> <!-- навигация -->
<div class="container">
    <div class="row"><!-- хлебные крошки-->
    <div class="container">
      <ol class="breadcrumb">
        <li><a href="index.jsp">
          <i class="fa fa-home"></i>
        </a></li>
        <li><a href="Catalog">Каталог товаров</a></li>
        <li><a href="Catalog"><%out.print(request.getParameter("Brand"));%></a></li>
        <li class="active"><a href="#">
          <%out.print(request.getParameter("Collection"));%>
        </a></li>

      </ol>
    </div><!-- хлебные крошки-->
  </div>

    <div class="row">
      <div class="container">
          <div class="row">
            <%
          for(String collection: (Set<String>)request.getAttribute("Collections")){
            %>
              <form role="form" method="POST" action="Collection" class="btn">
              <input type="submit" value="<%out.print(collection);%>" class="btn btn-primary">
              <input type="hidden" name="Brand" value="<%out.print(request.getParameter("Brand"));%>">
              <input type="hidden" name="Collection" value="<%out.print(collection);%>">
                </form>

          <%}%>
          </div>
      </div><!-- хлебные крошки-->
    </div>

  <hr>
</div>
<div class="container">
  <div class="row masonry" data-columns>
    <%for(Product product: (List<Product>)request.getAttribute("ProductsInCollection")){%>
    <div class="item">
      <div class="thumbnail">
        <img src="../img/col/<%out.print("noPhoto.jpg");%>" alt="">
        <div class="caption">
          <form role="form" method="POST" action="Collection">
            <p align="center">
            <%out.print(product.getName());%>
            </p></form>
        </div>
      </div>
    </div>
    <%}%>
  </div>


</div>






<nav class="text-center">
  <ul class="pagination pagination-lg">
    <li class="disabled">
      <a href="#">
        <i class="fa fa-chevron-left"></i>
        <i class="fa fa-chevron-left"></i>
      </a>
    </li>
    <li class="disabled">
      <a href="#">
        <i class="fa fa-chevron-left"></i>
      </a>
    </li>
    <li class="active"><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li>
      <a href="#">
        <i class="fa fa-chevron-right"></i>

      </a>
    </li>
    <li>
      <a href="#">
        <i class="fa fa-chevron-right"></i>
        <i class="fa fa-chevron-right"></i>
      </a>
    </li>
  </ul>
</nav><!-- вперёд\назад-->
<nav> <!-- вперёд\назад-->
  <ul class="pager">
    <li class="previous"><a href="#">&larr; Назад</a></li>
    <li class="next disabled"><a href="#">Вперёд &rarr;</a></li>
  </ul>
</nav><!-- вперёд\назад-->



<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/salvattore.min.js"></script>
</body>
</html>