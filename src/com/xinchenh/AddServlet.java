package com.xinchenh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;
        //System.out.println(k);
        PrintWriter out = res.getWriter(); //print data on a response object
        out.println("The result is " + k);


        // 1. Request Dispatcher
        //req.setAttribute("k", k);
        //RequestDispatcher rd = req.getRequestDispatcher("sq");
        //rd.forward(req,res);

        // 2. Redirect
        //res.sendRedirect("sq?k=" + k); // method 1 URL Rewriting
        //drawback: multiple values, multiple servlet

        // 3. Session
        //HttpSession session = req.getSession();
        //session.setAttribute("k", k);
        //res.sendRedirect("sq");

        // 4. cookie
        Cookie cookie = new Cookie("k", k + ""); //change it to string
        res.addCookie(cookie);
        res.sendRedirect("sq");

    }
}
