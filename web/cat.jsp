<%@ page import="javaschool.dao.CollectionDaoImpl" %>
<%@ page import="java.util.Set" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
  <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
  <title>Каталог</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/> <!-- навигация -->

  <div class="container"><!-- хлебные крошки-->
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
    </div>
  </div>
  <div class="container"> <!-- вкладки брендов -->
    <ul class="nav nav-tabs">
        <%
          CollectionDaoImpl collectionDao = new CollectionDaoImpl();
          boolean flag = true;
          Set<String> brands = (Set<String>) request.getAttribute("brands");
          int i=1;
          for (String brand : brands) {
            Set<String> collections = (Set<String>) request.getAttribute(brand);
              if (flag){
              out.print("<li class=\"active\">");
              flag=false;
            }else
              out.print("<li>");
        %>
          <a href="#tab-<%out.print(i++);%>" data-toggle="tab">
          <% out.print(brand); %>
          <span class="badge">
          <% out.print(collections.size()); %>
          </span></a></li>
        <% } %>
       <!-- <li><a href="#">Бренд 2 <span class="badge">5</span></a></li>
        <li><a href="#">Бренд 3 <span class="badge">6</span></a></li> -->
        </ul>
    <div class="tab-content">
      <%
        boolean flag2 = true;
        int i2=1;
        for (String brand : brands) {
          Set<String> collections = (Set<String>) request.getAttribute(brand);
          if (flag2){
      %>
        <div class="tab-pane fade in active" id="tab-<%
        flag2=false;
        }else {%>
        <div class="tab-pane fade" id="tab-<%}
              out.print(i2++ +"\">");%>
       <div class="row masonry" data-columns>
      <%for(String collection: collections){%>
      <div class="item">
        <div class="thumbnail">
          <img src="../img/col/<%out.print(collectionDao.getCollectionImage(brand,collection));%>" alt="">
          <div class="caption">
            <form role="form" method="POST" action="Collection">
            <p align="center">
              <input type="submit" value="<%out.print(collection);%>" class="btn btn-primary">
              <input type="hidden" name="Brand" value="<%out.print(brand);%>">
              <input type="hidden" name="Collection" value="<%out.print(collection);%>">
            </p></form>
          </div>
        </div>
      </div>
      <%}%>
        </div>
        </div>
      <%}%>
    </div>
  <hr>


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

<div id="bucket"><a href="bucket.jsp"><img src="../img/bucket.png"></a></div>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/salvattore.min.js"></script>

</body>
</html>