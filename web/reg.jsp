<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
</head>

<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/> <!-- навигация -->
<div class="container">
    <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Котики Вас ждут!</h3>
                </div>
                <div class="panel-body">
                    <form role="form" method="POST" action="RegistrationServlet">
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="first_name" id="first_name" class="form-control input-sm" placeholder="Имя">
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="last_name" id="last_name" class="form-control input-sm" placeholder="Фамилия">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="email" name="user_name" id="email" class="form-control input-sm" placeholder="Email">
                        </div>
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="password" name="pass_word" id="password" class="form-control input-sm" placeholder="Пароль">
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="password" name="password_confirmation" id="password_confirmation" class="form-control input-sm" placeholder="Повторите пароль">
                                </div>
                            </div>
                        </div>
                        <input type="submit" value="Зарегистрироваться" class="btn btn-info btn-block">
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>