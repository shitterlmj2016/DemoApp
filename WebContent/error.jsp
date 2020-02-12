<%--
  Created by IntelliJ IDEA.
  User: 91593
  Date: 2020/2/11
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%--this page should know this is an error page--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
    <head>
        <title>Error</title>
    </head>
    <body>
        Error 123
        <%--        只有isErrorPage是true的情况下才能用exception类--%>
        <%= exception.getMessage()%>
    </body>
</html>
