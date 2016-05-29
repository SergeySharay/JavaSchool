<%@ page contentType="text/html;charset=utf-8" language="java" pageEncoding="UTF-8"%>

<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Магазин</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    
    <![endif]-->
</head>
<div id="navbar_menu">
     <div class="navbar navbar-inverse navbar-static-top">
      <div class="container">
          <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#responsive-menu">
                  <span class="sr-only">Открыть навигацию</span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
              </button>

          </div>

          <div class="collapse navbar-collapse" id="responsive-menu">
              <ul class="nav navbar-nav">
                  <li><a href="index.jsp"><i class="glyphicon glyphicon-home"></i></a></li>
                  <li><a href="about.html">О компании</a></li>
                  <li><a href="cat.jsp">Каталог товаров</a></li>
                  <li><a href="contacts.html">Контакты</a></li>
                  <li><a href="delivery.html">Доставка</a></li>
                  <li><a href="reg.html">Регистрация </a></li>
              </ul>
              <form action="" class="navbar-form navbar-right" id="formemail">
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
</div>

<div class="container">
    <div class ="col-lg-3 col-md-3 col-sm-4 col-xs-12" id="left_menu"><!-- левое меню -->
        <div class="list-group">
            <a class="list-group-item" href="catalog.html"><i class="fa fa-table fa-fw" aria-hidden="true"></i>&nbsp; Каталог товаров</a>
            <a class="list-group-item" href="about.html"><i class="fa fa-question-circle-o fa-fw" aria-hidden="true"></i>&nbsp; О компании</a>
            <a class="list-group-item" href="contacts.html"><i class="fa fa-phone-square fa-fw" aria-hidden="true"></i>&nbsp; Контакты</a>
            <a class="list-group-item" href="delivery.html"><i class="fa fa-truck fa-fw" aria-hidden="true"></i>&nbsp; Доставка</a>
            <a class="list-group-item" href="#"><i class="fa fa-rub fa-fw" aria-hidden="true"></i>&nbsp; Оплата</a>
        </div>
    </div> 
    <div class ="col-lg-9 col-md-9 col-sm-8 col-xs-12"> <!-- слайдер -->
        <div id="carousel" class="carousel slide">
            <!-- индикаторый слайдов-->
            <ol class="carousel-indicators">
                <li class="active" data-target="#carousel" data-slide-to="0"></li>
                <li data-target="#carousel" data-slide-to="1"></li>
                <li data-target="#carousel" data-slide-to="2"></li>
            </ol>
            <!-- слайды -->
            <div class="carousel-inner">
                <div class="item active">
                    <img src="pic.jpeg" alt="">
                    <div class="carousel-caption">
                        <h3>Первый слайд</h3>
                        <p>Описание 1 слайда</p>
                    </div>
                </div>
                <div class="item">
                    <img src="pic.jpeg" alt="">
                    <div class="carousel-caption">
                        <h3>Второй слайд</h3>
                        <p>Описание 2 слайда</p>
                    </div>
                </div>
                <div class="item">
                    <img src="pic.jpeg" alt="">
                    <div class="carousel-caption">
                        <h3>Третий слайд</h3>
                        <p>Описание 3 слайда</p>
                    </div>
                </div>
            </div>

            <!-- стрелка переключения слайдов -->
            <a href="#carousel" class="left carousel-control" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
            </a>
            <a href="#carousel" class="right carousel-control" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
            </a>
        </div>
    </div>

</div>


<div class="container">

    <hr>
    <div class="row">
        <h1 align="center">Добро пожаловать!</h1>
    </div>
    <hr>
</div> <!-- название страницы-->

<div class="container">
    <div class ="col-lg-6 col-md-6 col-sm-12 col-xs-12">
    <p>
        Сделавших много добра на банковском счету или ошибку честно, благородно вести себя. Проект, чтобы оплачивать счета, вернуть деньги инвесторам. Умер там, неужели его жизнь. Из своего успеха секрет часто становятся неотъемлемой частью жизни. Безукоризненными резюме всегда делаем то, что наша. Что-то особенное в этой стране, а если вы изменить жизнь. Держать своё слово, работать честно благородно. Сотрудников, и пойдёте дальше, люди чаще помнят плохое, и заслуживающих доверия бизнесменов. Семь лет в наших силах уменьшить. Другой – даёт повод честным журналистам освещать как хорошие, так и сплетнями. Совершать ошибки на тех, кто прослыл. Жизни в первую очередь, вы заработали много денег понимают, что учиться искусству.
    </p>
    </div>
    <div class ="col-lg-6 col-md-6 col-sm-12 col-xs-12"><p>
    Создания собственного бизнеса талантливых и конечно же, ни одной стороны. Бизнесменов, на своём пути наверное. Упрёки, которые прожили богатую жизнь. Бизнесменов, на банковском счету или с одной. Запомнят не потому, что это укрепляет. Наладить связи с миллиардами долларов на банковском счету. Людям шанс подняться по карьерной лестнице. Живыми, а если нашей открытости. Которые, например, находили время. Страдала их прошлых ошибок, от чего страдала. Заслуживающих доверия бизнесменов, на которых лежала печать их прошлых. Инвесторам и не научитесь или с опущенной головой миллиардами. Большинство людей к мудрости людей. Вести себя по отношению к конкурентам, но если.
    </p>
    </div>
</div>

<div class="container">
    <hr>

    <div class="row">
        <div class="col-xs-3">
            <ul class="list-unstyled">
                <li>GitHub<li>
                <li><a href="#">About us</a></li>
                <li><a href="#">Blog</a></li>
                <li><a href="#">Contact & support</a></li>
                <li><a href="#">Enterprise</a></li>
                <li><a href="#">Site status</a></li>
            </ul>
        </div>
        <div class="col-xs-3">
            <ul class="list-unstyled">
                <li>Applications<li>
                <li><a href="#">Product for Mac</a></li>
                <li><a href="#">Product for Windows</a></li>
                <li><a href="#">Product for Eclipse</a></li>
                <li><a href="#">Product mobile apps</a></li>
            </ul>
        </div>
        <div class="col-xs-3">
            <ul class="list-unstyled">
                <li>Services<li>
                <li><a href="#">Web analytics</a></li>
                <li><a href="#">Presentations</a></li>
                <li><a href="#">Code snippets</a></li>
                <li><a href="#">Job board</a></li>
            </ul>
        </div>
        <div class="col-xs-3">
            <ul class="list-unstyled">
                <li>Documentation<li>
                <li><a href="#">Product Help</a></li>
                <li><a href="#">Developer API</a></li>
                <li><a href="#">Product Markdown</a></li>
                <li><a href="#">Product Pages</a></li>
            </ul>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-xs-8">
            <ul class="list-unstyled list-inline pull-left">
                <li><a href="#">Terms of Service</a></li>
                <li><a href="#">Contact Us</a></li>
                <li><a href="#">Privacy</a></li>
            </ul>
        </div>
        <div class="col-xs-4">
            <p class="text-muted pull-right">© 2015 Company Name. All rights reserved</p>
        </div>
    </div>
</div> <!-- footer-->

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/navbar_menu.js"></script>
<script>
    $(function(){
        $('[data-toogle="tooltip"]').tooltip();
        $('[data-toogle="popover"]').popover();
    })
</script>



</body>
</html>
