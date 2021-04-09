<%@ page import="ru.vmk.ServletCookiesSession.User" %>
<%@ page import="ru.vmk.ServletCookiesSession.CurrentSession" %>
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
<% User user = (User) session.getAttribute("user");%>
<%--<% CurrentSession.getSession(response, request);%>--%>
<h3> Hello <%=user.getName()%> !</h3>
<a href="${pageContext.request.contextPath}/login.jsp">Logout</a>
<a href="${pageContext.request.contextPath}/ImageServlet">Captcha</a>
</body>
</html>
