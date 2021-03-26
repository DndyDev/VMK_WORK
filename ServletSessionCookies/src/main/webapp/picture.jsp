<%@ page import="ru.vmk.ServletCookiesSession.User" %><%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 26.03.2021
  Time: 4:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your photos</title>
</head>
<body>
<h2>Your photos</h2>
<a href="upload.jsp">Upload new photo</a>

<ul>
    <%
        PhotoServer server = new PhotoServer();
        UserServer userServer = new UserServer();
        ArrayList<Photo> photos = server.getPhotosList((User) session.getAttribute("user"));
        for (Photo photo : photos) {
            out.println("<li><a href=photo?id=" + photo.id + ">" + photo.name + "</a>  "
                    + "<button><a href=delete?id=" + photo.id + " >Delete</a></button>" + "</li>");
        }
    %>
</ul>

</body>
</html>
