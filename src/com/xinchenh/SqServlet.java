package com.xinchenh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class SqServlet
 */
@WebServlet("/SqServlet")
public class SqServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter(); //print data on a response object

        //int k = (int) req.getAttribute("k");

        //int k = Integer.parseInt(req.getParameter("k"));

        //HttpSession session = req.getSession();
        //int k = (int)session.getAttribute("k");

        int k = 0;
        Cookie cookies[] = req.getCookies();
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
