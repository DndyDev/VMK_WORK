<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 26.03.2021
  Time: 4:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload a photo</title>
</head>
<body>
<form method="post" action="image" enctype="multipart/form-data">
    <input type="file" name="picture" id="picture" alt="your picture" accept="image/*">
    <input type="submit" value="Send!">
</form>
</body>
</html>
