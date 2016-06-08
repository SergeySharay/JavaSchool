<%@ page import="javaschool.dao.ProductDaoImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->
    <title>Оформление заказа></title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/>
<!-- навигация -->
<div class="container">
    <div class="row masonry2" data-columns>
        <div class="item">
            <div class="panel panel-default">
                <div class="panel-heading"><p>Информация о заказе</p></div>
                <div class="panel-body privatetable">
                    <%
                        Float sum = 0f;
                        Map<Long, Integer> products = (Map<Long, Integer>) session.getAttribute("Order");
                        ProductDaoImpl productDao = new ProductDaoImpl();
                        for (Map.Entry entry : products.entrySet())
                            sum += (productDao.get((Long) entry.getKey()).getPrice() * (Integer) entry.getValue());
                    %>
                    <p>Ваш заказ на сумму, рублей: <%=sum%>
                    </p>

                    <p>Всего позиций в заказе, шт: <%=products.size()%>
                    </p>

                    <form action="bucket.jsp">
                        <button type="submit" value="" class="btn btn-primary">Изменить заказ</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="item">

            <div class="panel panel-default">
                <div class="panel-heading"><p>Информация для заказа</p></div>
                <div class="panel-body privatetable">
                    <fieldset class="fieldset">
                        <div class="control-group">
                            <label class="control-label">Оплата</label>

                            <div class="controls" id="pay">
                                <label class="radio">
                                    <input type="radio" name="Rad1" id="optionsRadios1" value="option1" checked="">
                                    Наличные
                                </label>
                                <label class="radio">
                                    <input type="radio" name="Rad1" id="optionsRadios2" value="option2">
                                    Безналичный расчет
                                </label>
                                <label class="radio">
                                    <input type="radio" name="Rad1" id="optionsRadios3" value="option2">
                                    Оплата картой
                                </label>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">Получение</label>

                            <div class="controls" id="delivery">
                                <label class="radio">
                                    <input type="radio" name="Rad2" id="optionsRadios4" value="option1" checked="">
                                    Самовывоз
                                </label>
                                <label class="radio">
                                    <input type="radio" name="Rad2" id="optionsRadios5" value="option2">
                                    Доставка
                                </label>
                                <label class="radio">
                                    <input type="radio" name="Rad2" id="optionsRadios6" value="option2">
                                    Перемещение
                                </label>
                            </div>
                        </div>
                        <hr>
                        <div class="control-group">
                            <label class="control-label" id="inputtext" for="textarea">Ваш комментарий к заказу</label>

                            <div class="controls">
                                <textarea class="input" id="textarea" rows="3"></textarea>
                            </div>
                        </div>
                    </fieldset>
                </div>
            </div>

        </div>
        <div class="item">
            <div class="panel panel-default">
                <div class="panel-heading"><p>Адрес доставки</p></div>
                <div class="panel-body privatetable">
                    <table class="table">
                        <%List<String> adressAtributes = (List<String>) session.getAttribute("clienAdressAtributes");%>
                        <tr>
                            <td>Страна</td>
                            <td><%=adressAtributes.get(0)%>
                            </td>
                        </tr>
                        <tr>
                            <td>Город</td>
                            <td><%=adressAtributes.get(1)%>
                            </td>
                        </tr>
                        <tr>
                            <td>Улица</td>
                            <td><%=adressAtributes.get(2)%>
                            </td>
                        </tr>
                        <tr>
                            <td>Дом</td>
                            <td><%=adressAtributes.get(3)%>
                            </td>
                        </tr>
                        <tr>
                            <td>Квартира</td>
                            <td><%=adressAtributes.get(4)%>
                            </td>
                        </tr>
                        <tr>
                            <td>Почтовый индекс</td>
                            <td><%=adressAtributes.get(5)%>
                            </td>
                        </tr>
                    </table>
                    <form action="adress.jsp">
                        <button type="submit" value="" class="btn btn-primary">Изменить адрес</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="panel panel-default">
                <div class="panel-heading"><p>Подверждение заказа</p></div>
                <div class="panel-body privatetable">
                    <form action="bucket.jsp">
                        <button type="submit" value="" class="btn btn-primary">Оформить заказ</button>
                    </form>
                </div>


            </div>
        </div>

    </div>
</div>
<script src="js/bootstrap.js"></script>
<script src="js/salvattore.min.js"></script>
</body>
</html>
