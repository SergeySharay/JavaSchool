<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->

    <title>Администрация</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/><!-- навигация -->
<jsp:include page="WEB-INF/cabinetbar.jsp" flush="true"/><!-- навигация -->
<jsp:include page="WEB-INF/cabinetbaradmin.jsp" flush="true"/><!-- навигация -->

<div class="container">
    <div class="col-xs-12 col-sm-6 col-md-6">
        <div class="panel panel-default">
            <div class="panel-heading">
                Товар №<c:out value="${productPage.id}"/>
            </div>
            <div class="panel-body">
                <table class="table">
                    <table class="table">
                        <tr>
                            <td>Бренд</td>
                            <td><c:out value="${productPage.brand}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>Коллекция</td>
                            <td><c:out value="${productPage.collection}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>Название товара</td>
                            <td><c:out value="${productPage.name}"/>

                            </td>
                        </tr>
                        <tr>
                            <td>Цена, руб.</td>
                            <td><c:out value="${productPage.price}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>Длина, см.</td>
                            <td><c:out value="${productPage.length}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>Ширина, см.</td>
                            <td><c:out value="${productPage.width}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>Вес, кг.</td>
                            <td><c:out value="${productPage.weight}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>Количество, шт.</td>
                            <td><c:out value="${productPage.quantity}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>Цвет</td>
                            <td><c:out value="${productPage.color}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>Изображение</td>
                            <td><c:out value="${productPage.picture}"/>
                            </td>
                        </tr>
                    </table>
                </table>
            </div>
        </div>
    </div>
    <div class="col-xs-12 col-sm-6 col-md-6">
        <div class="panel panel-default">
            <div class="panel-heading">
                Изменить товар
            </div>
            <div class="panel-body">
                <form role="form" method="POST" action="AdminProductPage">
                    <div class="form-group">
                        <input type="text" name="brand" class="form-control input-sm"
                               placeholder="Бренд" maxlength="80">
                    </div>
                    <div class="form-group">
                        <input type="text" name="collection" class="form-control input-sm"
                               maxlength="80" placeholder="Коллекция">
                    </div>
                    <div class="form-group">
                        <input type="text" name="name" class="form-control input-sm"
                               maxlength="80" placeholder="Название">
                    </div>
                    <div class="form-group">
                        <input type="number" name="price" class="form-control input-sm"
                               maxlength="25" placeholder="Цена" min="1" max="999999">
                    </div>

                    <div class="form-group">
                        <input type="number" name="length" class="form-control input-sm"
                               maxlength="25" placeholder="Длина" min="1" max="1000">
                    </div>
                    <div class="form-group">
                        <input type="number" name="width" class="form-control input-sm"
                               maxlength="25" placeholder="Ширина" min="1" max="1000">
                    </div>
                    <div class="form-group">
                        <input type="number" name="weight" class="form-control input-sm"
                               maxlength="25" placeholder="Вес" min="1" max="1000">
                    </div>
                    <div class="form-group">
                        <input type="number" name="quantity" class="form-control input-sm"
                               maxlength="25" placeholder="Количество" min="0" max="5000">
                    </div>
                    <div class="form-group">
                        <input type="text" name="color" class="form-control input-sm"
                               maxlength="80" placeholder="Цвет">
                    </div>
                    <div class="form-group">
                        <input type="text" name="picture" class="form-control input-sm"
                               maxlength="80" placeholder="Изображение">
                    </div>
                    <input type="hidden" name="productId"
                           value="<c:out value="${productPage.id}"/>">
                    <input type="submit" value="Сохранить" class="btn btn-info btn-block">
                </form>
            </div>
        </div>
    </div>
</div>

<script src="js/bootstrap.js"></script>

</body>
</html>
