<%@ page import="ru.vmk.ServletCookiesSession.image.CaptchaImageServlet" %><%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 21.03.2021
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<form action="login-servlet">
    <label for="password">Login: </label><input id ="login" name="login" type="text">
    <label for="password">Password: </label><input id ="password" name="password" type="password">
    <br>
    <br>
    <img src="CaptchaImageServlet">
    <input type="text" name="insert" placeholder="captcha">
    <br>
    <input type="submit" value="Login">
</form>
</body>
</html>
