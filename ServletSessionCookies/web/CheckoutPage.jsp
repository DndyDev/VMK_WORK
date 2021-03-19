<%@page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Login Success Page</title>
</head>
<body>
<%
if (session.getAttribute("user") == null){
    response.sendRedirect("login.html");
}
String userName = null;
String sessionID = null;
Cookie cookies [] = request.getCookies();
if (cookies != null){
    for (Cookie cookie : cookies){
        if (cookie.getName().equals("user")) userName = cookie.getValue();

    }
}
%>
<h3>Hi <%=userName%>, do the checkout </h3>
<br>
<form action="LogoutServlet" method="post"></form>
<input type="submit" value="Logout">
</body>
</html>