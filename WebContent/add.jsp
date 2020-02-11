<%--
  Created by IntelliJ IDEA.
  User: xinchenh
  Date: 2/11/20
  Time: 2:36 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#e6e6fa">
<%--所有代码放在 <% %>里面--%>
<%
    //自带request
    int i = Integer.parseInt(request.getParameter("num1"));
    int j = Integer.parseInt(request.getParameter("num2"));

    int k = i + j;
    //自带out
    out.println("output: " + k);
%>
</body>
</html>
