<%@page import="javaschool.crud.ProductService" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
  <jsp:include page="haeder.html" flush="true"/><!-- header -->
</head>
<body>

<jsp:include page="navbar.html" flush="true"/>

<div class="container">
  <div class="row">
    <div class="container">
      <ol class="breadcrumb">
        <li><a href="index.jsp">
          <i class="fa fa-home"></i>
        </a></li>
        <li><a href="cat.jsp">Каталог товаров</a></li>
        <li><a href="#">Категория</a></li>
        <li class="active">Название</li>
      </ol>
    </div>

    <div class="container">
      <ul class="nav nav-tabs">

        <li class="active"><a href="#"> Бренд 1<span class="badge">5</span></a></li>
        <li><a href="#">Бренд 2 <span class="badge">5</span></a></li>
        <li><a href="#">Бренд 3 <span class="badge">6</span></a></li>
        </ul>
      <hr>
    </div>

  </div>

  <div class="row masonry" data-columns>
    <div class="item">
      <div class="thumbnail">
        <img src="http://placehold.it/400x240" alt="">
        <div class="caption">
          <h3><a href="#">Название нашего поста</a></h3>
          <p>Текст текст текст текст Текст текст текст текст Текст текст текст текст Текст текст текст текст</p>
          <a href="#" class="btn btn-success">Подробнее <i class="fa fa-arrow-right"></i></a>
        </div>
      </div>
    </div>
    <div class="item">
      <div class="thumbnail">
        <img src="http://placehold.it/400x240" alt="">
        <div class="caption">
          <h3><a href="#">Название нашего поста</a></h3>
          <p>Текст текст текст текст Текст текст текст текст Текст текст текст текст Текст текст текст текст</p>
          <a href="#" class="btn btn-success">Подробнее <i class="fa fa-arrow-right"></i></a>
        </div>
      </div>
    </div>
    <div class="item">
      <div class="thumbnail">
        <img src="http://placehold.it/400x240" alt="">
        <div class="caption">
          <h3><a href="#">Название нашего поста</a></h3>
          <p>Текст текст текст текст Текст текст текст текст Текст текст текст текст Текст текст текст текст</p>
          <a href="#" class="btn btn-success">Подробнее <i class="fa fa-arrow-right"></i></a>
        </div>
      </div>
    </div>
    <div class="item">
      <div class="thumbnail">
        <img src="http://placehold.it/400x240" alt="">
        <div class="caption">
          <h3><a href="#">Название нашего поста</a></h3>
          <p>Текст текст текст текст Текст текст текст текст Текст текст текст текст Текст текст текст текст</p>
          <a href="#" class="btn btn-success">Подробнее <i class="fa fa-arrow-right"></i></a>
        </div>
      </div>
    </div>
    <div class="item">
      <div class="thumbnail">
        <img src="http://placehold.it/400x240" alt="">
        <div class="caption">
          <h3><a href="#">Название нашего поста</a></h3>
          <p>Текст текст текст текст Текст текст текст текст Текст текст текст текст Текст текст текст текст</p>
          <a href="#" class="btn btn-success">Подробнее <i class="fa fa-arrow-right"></i></a>
        </div>
      </div>
    </div>
    <div class="item">
      <div class="thumbnail">
        <img src="http://placehold.it/400x240" alt="">
        <div class="caption">
          <h3><a href="#">Название нашего поста</a></h3>
          <p>Текст текст текст текст Текст текст текст текст Текст текст текст текст Текст текст текст текст</p>
          <a href="#" class="btn btn-success">Подробнее <i class="fa fa-arrow-right"></i></a>
        </div>
      </div>
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
  </nav>
  <nav>
    <ul class="pager">
      <li class="previous"><a href="#">&larr; Назад</a></li>
      <li class="next disabled"><a href="#">Вперёд &rarr;</a></li>
    </ul>
  </nav>
</div>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/salvattore.min.js"></script>
</body>
</html>