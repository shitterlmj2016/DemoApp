package com.xinchenh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.valueOf(req.getParameter("num1"));
		int j = Integer.valueOf(req.getParameter("num2"));
		
		int k = i + j;
		//System.out.println(k);
		PrintWriter out = res.getWriter(); //print data on a response object
		out.println("The result is "+k);
		
		// Request Dispac
	}
}
