package com.Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author ibhup
 *ServletConfig & ServletContext
 */
public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out= response.getWriter();
		out.println("Hi");
		
		ServletContext ctx=getServletContext();
		String str =ctx.getInitParameter("name");
		out.print(str);
		String ph= ctx.getInitParameter("phone");
		out.print(", You are using "+ph+" Phone");
	}
}
