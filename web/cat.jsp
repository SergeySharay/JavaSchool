<%@ page import="java.util.Set" %>
<%@ page import="java.util.HashSet" %>
<%@ page import="java.util.Iterator" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
  <jsp:include page="haeder.html" flush="true"/><!-- header -->
</head>
<body>

<jsp:include page="navbar.html" flush="true"/>

<div class="container">

  <div class="row"><!-- хлебные крошки-->
    <div class="container">
      <ol class="breadcrumb">
        <li><a href="index.jsp">
          <i class="fa fa-home"></i>
        </a></li>
        <li><a href="cat.jsp">Каталог товаров</a></li>
        <li><a href="#">Категория</a></li>
        <li class="active">Название</li>
      </ol>
    </div><!-- хлебные крошки-->
  </div>

  <div class="container"> <!-- вкладки брендов -->
      <ul class="nav nav-tabs">
        <%
          boolean flag = true;
          Set<String> brands = (Set<String>) request.getAttribute("brands");
          int i=1;
          for (String brand : brands) {

            Set<String> collections = (Set<String>) request.getAttribute("colOf"+brand);
            if(collections.size()>0){

            if (flag){out.print("<li class=\"active\">");flag=false;}else out.print("<li>");
        %>
          <a href="#tab-<%out.print(i++);%>" data-toggle="tab">
          <% out.print(brand); %>
          <span class="badge">
          <% out.print(collections.size()); %>
          </span></a></li>
        <% } }%>
       <!-- <li><a href="#">Бренд 2 <span class="badge">5</span></a></li>
        <li><a href="#">Бренд 3 <span class="badge">6</span></a></li> -->
        </ul>

    <div class="tab-content">
      <%
        int j=1;
        for (String brand2 : brands) {
      %>
        <div class="tab-pane in active" id="tab-<%out.print(j++);%>">
        <p>тело <%out.print(j);%></p>
        </div>
        <%}%>
    </div>



      <hr>

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

</div>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/salvattore.min.js"></script>
</body>
</html>