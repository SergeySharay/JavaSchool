<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="windows-1251" %>
<html lang="ru">
<head>
  <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
  <title>�������</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/>
<div class="container">
  <div class="row"><!-- ������� ������-->
    <div class="container">
      <ol class="breadcrumb">
        <li><a href="index.jsp">
          <i class="fa fa-home"></i>
        </a></li>
        <li><a href="Catalog">������� �������</a></li>
        <li><a href="Catalog?Brands=<c:out value="${Brand}"/>"><c:out value="${Brand}"/></a></li>
        <li><a href="Collection?Brand=<c:out value="${Brand}"/>&Collection=<c:out value="${Collection}"/>"><c:out value="${Collection}"/></a></li>
        <li class="active"><a href="#"><c:out value="${Product.name}"/></a></li>
      </ol>
    </div>
    <!-- ������� ������-->
  </div>
  </div>
<div class="container">
<div class="col-xs-12 col-sm-6 col-md-6">
  <div class="panel panel-default">
    <div class="panel-body privatetable">
      <p>����������</p>
    </div>
    <table class="table">
      <tr>
        <td>���������</td>
        <td>
          <c:out value="${Product.category}"/>
        </td>
      </tr>
      <tr>
        <td>���</td>
        <td><c:out value="${Product.brand}"/>
        </td>
      </tr>
      <tr>
        <td>������</td>
        <td><c:out value="${Product.collection}"/>
        </td>
      </tr>
      <tr>
        <td>���</td>
        <td><c:out value="${Product.name}"/>
        </td>
      </tr>
      <tr>
        <td>����</td>
        <td><c:out value="${Product.price}"/>
        </td>
      </tr>
      <tr>
        <td>�����</td>
        <td><c:out value="${Product.length}"/></td>
      </tr>
      <tr>
        <td>������</td>
        <td><c:out value="${Product.width}"/></td>
      </tr>
      <tr>
        <td>���</td>
        <td><c:out value="${Product.weight}"/></td>
      </tr>
      <tr>
      <td>����</td>
      <td><c:out value="${Product.color}"/></td>
    </tr>
      <tr>
        <td>����������</td>
        <td><c:out value="${Product.quantity}"/></td>
      </tr>

    </table>
  </div>
</div>
  <div class="col-xs-12 col-sm-6 col-md-6">
    <div class="panel panel-default">
      <div class="panel-heading"><p>��������</p></div>
      <div class="panel-body privatetable">
      <p align="center"><img src="../img/pic/<c:out value="${Product.id}"/>.jpg" alt=""></p>
        <form role="form" method="POST" action="Order">
          <p align="center">
            <input type="submit" value="������" class="btn btn-primary">
            <input type="hidden" name="Brand" value="<c:out value="${Brand}"/>">
            <input type="hidden" name="Collection" value="<c:out value="${Collection}"/>">
            <input type="hidden" name="Product" value="<c:out value="${Product.id}"/>">
          </p>
        </form>
      </div>
  </div>
  </div>
</div>





</body>
</html>
