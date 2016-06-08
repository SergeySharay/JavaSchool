<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
  <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
</head>

<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/> <!-- навигация -->

<div class="container">
  <div class="row centered-form">
    <div class="col-xs-10 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4 col-xs-offset-1" >
      <div class="panel panel-default">
        <div class="panel-heading">
          <h3 class="panel-title">Введите Ваши данные</h3>
        </div>
        <div class="panel-body">
          <form role="form" method="POST" action="Login">
              <div class="form-group">
              <input type="email" name="user_name" id="email" class="form-control input-sm" placeholder="Email">
              </div>
              <div class="form-group">
              <input type="password" name="pass_word" id="password" class="form-control input-sm" placeholder="Пароль">
              </div>
            <input type="submit" value="Войти" class="btn btn-info btn-block">
          </form>
        </div>
      </div>
      <p align="center"><a href="reg.jsp" >Зарегистрироваться</a></p>
    </div>
  </div>
</div>
<script src="js/bootstrap.js"></script>
</body>
</html>