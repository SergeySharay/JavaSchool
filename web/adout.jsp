<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="haeder.html" flush="true"/><!-- навигация -->
</head>

<body>

<jsp:include page="navbar.html" flush="true"/><!-- навигация -->

<div align="center" style="margin-top: 50px;">

  <form action="Brands">
    Please enter your Username:  <input type="text" name="username" size="20px"> <br>
    Please enter your Password:  <input type="text" name="password" size="20px"> <br><br>
    <input type="submit" value="submit">
  </form>

</div>
</body>
</html>
