<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
    <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
    <title>Каталог</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/>
<!-- навигация -->
<div class="row">
    <div class="container">
        <ol class="breadcrumb">
            <li><a href="index.jsp">
                <i class="fa fa-home"></i>
            </a></li>
            <li><a href="Catalog">Каталог товаров</a></li>
            <li><a href="Catalog">Бренды</a></li>
            <li class="active"><a href="filter.jsp">Фильтр</a></li>
        </ol>
    </div>
    <!-- хлебные крошки-->
</div>
<!-- хлебные крошки-->

<div class="container">
    <div class="col-xs-3">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Подбор по параметрам</h3>
            </div>
            <div class="panel-body privatetable">
                <div class="container">
                    <div class="col-xs-3">
                        <form role="form" method="get" action="Filter" lass="btn">
                            <select class="filter" id="filter1" name="brand"">
                            <option selected value="">Выберите бренд</option>
                            <c:forEach items="${FilterBrands}" var="brand">
                                <option value="<c:out value="${brand}"/>"><c:out value="${brand}"/></option>
                            </c:forEach>
                            </select>
                            <select class="filter" id="filter1" name="col">
                                <option selected value="">Выберите коллекцию</option>
                                <c:forEach items="${FilterCollections}" var="collection">
                                    <option value="<c:out value="${collection}"/>"><c:out
                                            value="${collection}"/></option>
                                </c:forEach>
                            </select>
                            <select class="filter" id="filter2" name="price">
                                <option selected value="">Выберите стоимость</option>
                                <option value="1">До 500</option>
                                <option value="2">от 500 до 1500</option>
                                <option value="3">от 1500</option>
                            </select>
                            <select class="filter" id="filter3" name="weight">
                                <option selected value="">Выберите вес</option>
                                <option value="1">до 5</option>
                                <option value="2">от 5 до 10</option>
                                <option value="3">от 10 до 15</option>
                                <option value="4">от 15</option>
                            </select>
                            <select class="filter" id="filter4" name="length">
                                <option selected value="">Выберите длину</option>
                                <option value="1">До 20</option>
                                <option value="2">от 20 до 30</option>
                                <option value="3">от 30 до 40</option>
                                <option value="4">более 40</option>
                            </select>
                            <select class="filter" id="filter5" name="width">
                                <option selected value="">Выберите ширину</option>
                                <option value="1">до 10</option>
                                <option value="2">от 10 до 20</option>
                                <option value="3">от 20 до 30</option>
                                <option value="4">от 30</option>
                            </select>
                            <select class="filter" id="filter6" name="color">
                                <option selected value="">Выберите цвет</option>
                                <c:forEach items="${FilterColors}" var="color">
                                    <option value="<c:out value="${color}"/>"><c:out value="${color}"/></option>
                                </c:forEach>
                            </select>
                            <input type="submit" value="Подобрать" class="btn btn-primary">
                            <input type="hidden" name="Brands" value="">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xs-9">
        <c:out value="${Color}"/>
        <div class="row masonry" data-columns>
            <c:forEach items="${FilterProducts}" var="product">
                <div class="item">
                    <div class="thumbnail">
                        <img src="../img/pic/<c:out value="${product.id}"/>.jpg" alt="">

                        <div class="caption">
                            <form role="form" method="GET" action="Order">

                                <div id="blok1" class="btn btn-primary">
                                    <c:out value="${product.name}"/>
                                </div>
                                <div id="blok2" class="btn btn-primary">
                                    <c:out value="${product.price}"/>
                                </div>
                                <p align="right">
                                    <input type="submit" value="Купить" class="btn btn-success buyitem">
                                    <input type="hidden" name="Product" value="<c:out value="${product.id}"/>">
                                </p></form>
                        </div>
                    </div>
                </div>

            </c:forEach>
        </div>
    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/salvattore.min.js"></script>
</body>
</html>
