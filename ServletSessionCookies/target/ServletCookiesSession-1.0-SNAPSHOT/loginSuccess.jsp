<%@ page import="ru.vmk.ServletCookiesSession.User" %>
<%--

  Created by IntelliJ IDEA.
  User: Sergey
  Date: 21.03.2021
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello there !</title>
</head>
<body>
<% User user = (User) request.getAttribute("user");%>
<h3> Hello <%=user.getName()%> !</h3>
<a href="${pageContext.request.contextPath}/login.jsp">Logout</a>
</body>
</html>
