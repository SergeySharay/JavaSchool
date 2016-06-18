<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="javaschool.dao.ProductDaoImpl" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="windows-1251"%>
<html>
<head>
    <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
    <title>���������� ������></title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/>
<!-- ��������� -->
<div class="container">
    <div class="row masonry2" data-columns>
        <div class="item">
            <div class="panel panel-default">
                <div class="panel-heading"><p>���������� � ������</p></div>
                <div class="panel-body privatetable">
                    <%
                        Float sum = 0f;
                        Map<Long, Integer> products = (Map<Long, Integer>) session.getAttribute("Order");
                        ProductDaoImpl productDao = new ProductDaoImpl();
                        for (Map.Entry entry : products.entrySet())
                        sum += (productDao.get((Long) entry.getKey()).getPrice() * (Integer) entry.getValue());
                    %>

                    <p>��� ����� �� �����, ������: <%=sum%>
                    </p>

                    <p>����� ������� � ������, ��: <%=products.size()%>
                    </p>

                    <form action="bucket.jsp">
                        <button type="submit" value="" class="btn btn-primary">�������� �����</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="panel panel-default">
                <div class="panel-heading"><p>���������� ��� ������</p></div>
                <div class="panel-body privatetable">
                    <form id="nextorder" action="GetOrder" method="Post">
                        <fieldset class="fieldset">
                            <div class="control-group">
                                <label class="control-label">������</label>

                                <div class="controls" id="pay">
                                    <label class="radio">
                                        <input type="radio" name="Rad1" id="optionsRadios1" value="��������" checked="">
                                        ��������
                                    </label>
                                    <label class="radio">
                                        <input type="radio" name="Rad1" id="optionsRadios2" value="����������� ������">
                                        ����������� ������
                                    </label>
                                    <label class="radio">
                                        <input type="radio" name="Rad1" id="optionsRadios3" value="������ ������">
                                        ������ ������
                                    </label>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label">���������</label>

                                <div class="controls" id="delivery">
                                    <label class="radio">
                                        <input type="radio" name="Rad2" id="optionsRadios4" value="���������" checked="">
                                        ���������
                                    </label>
                                    <label class="radio">
                                        <input type="radio" name="Rad2" id="optionsRadios5" value="��������">
                                        ��������
                                    </label>
                                    <label class="radio">
                                        <input type="radio" name="Rad2" id="optionsRadios6" value="�����������">
                                        �����������
                                    </label>
                                </div>
                            </div>
                            <hr>
                            <div class="control-group">
                                <label class="control-label" id="inputtext" for="textarea">��� ����������� �
                                    ������</label>

                                <div class="controls">
                                    <textarea class="input" name="Rad3" id="textarea" rows="3"></textarea>
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="panel panel-default">
                <div class="panel-heading"><p>����� ��������</p></div>
                <div class="panel-body privatetable">
                    <table class="table">
                        <tr>
                            <td>������</td>
                            <td>
                                <c:out value="${clientAdress.country}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>�����</td>
                            <td><c:out value="${clientAdress.city}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>�����</td>
                            <td><c:out value="${clientAdress.street}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>���</td>
                            <td><c:out value="${clientAdress.house}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>��������</td>
                            <td><c:out value="${clientAdress.flat}"/>
                            </td>
                        </tr>
                        <tr>
                            <td>�������� ������</td>
                            <td><c:out value="${clientAdress.zipcode}"/></td>
                        </tr>
                    </table><form action="adress.jsp">
                        <button type="submit" value="" class="btn btn-primary">�������� �����</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="panel panel-default">
                <div class="panel-heading"><p>������������ ������</p></div>
                <div class="panel-body privatetable">
                    <%if (sum>0){%>
                    <button type="submit" form="nextorder" class="btn btn-primary">�������� �����</button>
                    <%}else{ out.print("�������� ������ � �������");}%>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="js/bootstrap.js"></script>
<script src="js/salvattore.min.js"></script>
</body>
</html>
