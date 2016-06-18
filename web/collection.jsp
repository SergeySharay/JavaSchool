<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="windows-1251" %>
<html lang="ru">
<head>
    <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
    <title>Каталог</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/>
<!-- навигация -->
<div class="container">
    <div class="row"><!-- хлебные крошки-->
        <div class="container">
            <ol class="breadcrumb">
                <li><a href="index.jsp">
                    <i class="fa fa-home"></i>
                </a></li>
                <li><a href="Catalog">Каталог товаров</a></li>
                <li><a href="Catalog?Brands=<c:out value="${Brand}"/>"><c:out value="${Brand}"/></a></li>
                <li class="active"><a href="#"><c:out value="${Collection}"/></a></li>
            </ol>
        </div>
        <!-- хлебные крошки-->
    </div>
    <!-- хлебные крошки-->
    <div class="row">
        <div class="container">
            <div class="row">
                <c:forEach items="${Collections}" var="collection">
                    <form role="form" method="GET" action="Collection" class="btn">
                        <input type="submit" value="<c:out value="${collection}"/>" class="btn btn-primary">
                        <input type="hidden" name="Brand" value="<c:out value="${Brand}"/>">
                        <input type="hidden" name="Collection" value="<c:out value="${collection}"/>">
                    </form>
                </c:forEach>
            </div>
        </div>
    </div>
    <hr>
</div>
<div class="container">
    <div class="row masonry" data-columns>
        <c:forEach items="${ProductsInCollection}" var="product">
            <div class="item">
                <div class="thumbnail">
                    <img src="../img/pic/<c:out value="${product.id}"/>.jpg" alt="">

                    <div class="caption">
                        <div id="blok4">
                        <form role="form" method="post" action="ProductPage">

                            <input type="submit" value="Инфо" class="btn btn-info">
                            <input type="hidden" name="Product" value="<c:out value="${product.id}"/>">
                            <input type="hidden" name="Brand" value="<c:out value="${Brand}"/>">
                            <input type="hidden" name="Collection" value="<c:out value="${Collection}"/>">
                        </form>
                        </div>
                        <form role="form" method="POST" action="Order">
                            <div id="blok1" class="btn btn-primary">
                                <c:out value="${product.name}"/>
                            </div>
                            <div id="blok2" class="btn btn-primary">
                                <c:out value="${product.price}"/>
                            </div>
                            <p align="right">
                                <input type="submit" value="Купить" class="btn btn-success buyitem">
                                <input type="hidden" name="Brand" value="<c:out value="${Brand}"/>">
                                <input type="hidden" name="Collection" value="<c:out value="${Collection}"/>">
                                <input type="hidden" name="Product" value="<c:out value="${product.id}"/>">
                            </p>
                        </form>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<div id="bucket"><a href="bucket.jsp"><img src="../img/bucket.png"></a></div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/salvattore.min.js"></script>
</body>
</html>