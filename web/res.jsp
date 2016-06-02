<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp servlet</title>
</head>
<body>
<%Integer styles = (Integer)request.getAttribute("styles");
  out.println("hello");
  out.println("jsp servlet" + styles);
%>
</body>
</html>
