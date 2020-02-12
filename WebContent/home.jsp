<%@ page import="java.util.*" %><%-- directive
  Created by IntelliJ IDEA.
  User: xinchenh
  Date: 2/11/20
  Time: 3:07 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.Statement, java.util.Random"
         errorPage="error.jsp" %>
<%@ include file="header.jsp" %> <%--include anthor page--%>
<html>
    <head>
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World</h1>
        <%!
            int coef = 3; /*Declaration*/
        %>
        <%
            out.println(7 + 5);   /*Scriptlet*/
        %>
        My favourite number is <%=coef%> <%--expression--%>

        <%
            pageContext.setAttribute("name", "xincheng"); //access this attribute under different session
            pageContext.setAttribute("phone", "iPhone", PageContext.SESSION_SCOPE); //设置scope
            out.print(application.getInitParameter("phone"));
        %>
        <% //create an error page
//            try {
//                int k = 9 / 0;
//            } catch (Exception e) {
//                out.println("Error: " + e.getMessage());
//            }
            int k = 9 / 0;
        %>
    </body>
</html>
