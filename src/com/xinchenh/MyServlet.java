package com.xinchenh;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("Hi<br>"); //br是换行
//        ServletContext ctx = getServletContext();
//        String str = ctx.getInitParameter("name"); //<context-param>
//        out.println(str);
//        out.println(ctx.getInitParameter("phone"));

        ServletConfig cg = getServletConfig();
        String str = cg.getInitParameter("name");
        out.println(str);
    }
}
