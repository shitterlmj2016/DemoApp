package com.xinchenh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class SqServlet
 */
@WebServlet("/sq")
public class SqServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter(); //print data on a response object

        // 1. Request Dispatcher
        // int k = (int) req.getAttribute("k");

        // 2.1 Redirect - URL Rewriting
        // int k = Integer.parseInt(req.getParameter("k"));

        // 2.2 Redirect - Session
        // HttpSession session = req.getSession();
        // int k = (int)session.getAttribute("k");

        int k = 0;

        // 3. cookie
        Cookie cookies[] = req.getCookies(); // can have multiple cookies
        for (Cookie c : cookies) {
            if (c.getName().equals("k")) {
                k = Integer.parseInt(c.getValue());
            }
        }

        k = k * k;
        out.println("Result is " + k);
        System.out.println("sq called");
    }
}
