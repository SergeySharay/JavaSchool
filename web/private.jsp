<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="windows-1251" %>
<html>
<head>
    <jsp:include page="WEB-INF/header.html" flush="true"/><!-- header -->

    <title>������ �������</title>
</head>
<body>
<jsp:include page="WEB-INF/navbar.jsp" flush="true"/><!-- ��������� -->
<jsp:include page="WEB-INF/cabinetbar.jsp" flush="true"/><!-- ��������� -->

<div class="container">
    <div class="col-xs-12 col-sm-6 col-md-6">
        <div class="panel panel-default">
            <div class="panel-body privatetable">
                <p>������ ������</p>
            </div>
            <table class="table">
                <%List<String> clientAtributes = (List<String>) session.getAttribute("clienAtributes");%>
                <tr>
                    <td>���</td>
                    <td><%=clientAtributes.get(0)%>
                    </td>
                </tr>
                <tr>
                    <td>��������</td>
                    <td><%=clientAtributes.get(1)%>
                    </td>
                </tr>
                <tr>
                    <td>�����</td>
                    <td><%=clientAtributes.get(2)%>
                    </td>
                </tr>
                <tr>
                    <td>������</td>
                    <td><%=clientAtributes.get(3)%>
                    </td>
                </tr>
                <tr>
                    <td>���� ��������</td>
                    <td><%=clientAtributes.get(4)%>
                    </td>
                </tr>
                <tr>
                    <td>������</td>
                    <td><%=clientAtributes.get(5)%>
                    </td>
                </tr>
            </table>
        </div>
    </div>
    <div class="col-xs-12 col-sm-6 col-md-6">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">������ ������</h3>
            </div>
            <div class="panel-body privatetable">
                <form role="form" method="POST" action="Private">
                    <div class="form-group">
                        <input type="text" name="firstName" id="firstName" class="form-control input-sm"
                               maxlength="50" placeholder="���">
                    </div>
                    <div class="form-group">
                        <input type="text" name="lastName" id="lastName" class="form-control input-sm"
                               maxlength="50" placeholder="�������">
                    </div>
                    <div class="form-group">
                        <input type="email" name="email" id="email" class="form-control input-sm"
                               maxlength="60" placeholder="�����">
                    </div>
                    <div class="form-group">
                        <input type="password" name="pass" id="pass" class="form-control input-sm"
                               maxlength="30" placeholder="������">
                    </div>
                    <div class="form-group">
                        <input type="text" name="date" id="date" class="form-control input-sm"
                               placeholder="������ dd.mm.yyyy">
                    </div>
                    <input type="submit" value="���������" class="btn btn-info btn-block">
                </form>
            </div>
        </div>
    </div>
</div>
<script src="js/bootstrap.js"></script>
</body>
</html>
