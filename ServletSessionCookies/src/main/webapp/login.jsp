<%--
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
<form action="user-servlet">
    <label for="password">Login: </label><input id ="login" name="login" type="text">
    <label for="password">Password: </label><input id ="password" name="password" type="password">
    <input type="submit" value="Login">
</form>
</body>
</html>
