<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="ru">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Bootstrap Template</title>

  <!-- Bootstrap -->
  <link href="css/bootstrap.css" rel="stylesheet">
  <link href="css/font-awesome.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">
  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body>
<div class="navbar navbar-inverse navbar-static-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#responsive-menu">
        <span class="sr-only">Открыть навигацию</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <!-- <a class="navbar-brand" href="mypage.html">Лого</a> -->
    </div>

    <div class="collapse navbar-collapse" id="responsive-menu">
      <ul class="nav navbar-nav">
        <li><a href="/"><i class="glyphicon glyphicon-home"></i></a></li>
        <li><a href="about.html">О компании</a></li>
        <li><a href="cat.jsp">Каталог товаров</a></li>
        <li><a href="contacts.html">Контакты</a></li>
        <li><a href="delivery.html">Доставка</a></li>
        <li><a href="#">Регистрация </a></li>
      </ul>
      <form action="" class="navbar-form navbar-right">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="E-mail" value="">

        </div>
        <div class="form-group">

          <input type="password" class="form-control" placeholder="Пароль" value="">
        </div>
        <button type="submit" class="btn btn-primary">
          <i class="fa fa-sign-in"></i>Войти
        </button>
      </form>
    </div>
  </div>
</div>

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
      <%!
        //ProductService productService = new ProductService();
        //Set<String> products2 = productService.brandGetAll();
        //for(String c : products2){
        //out.println(c);
      //}
      %>
        <li class="active"><a href="#"> <span class="badge">5</span></a></li>

      <!--  <li class="active"><a href="#">Бренд 1 <span class="badge">5</span></a></li>
        <li><a href="#">Бренд 2 <span class="badge">6</span></a></li> -->
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