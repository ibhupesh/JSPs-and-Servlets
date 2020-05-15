package com.Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/sq") //uncomment for using annotations
public class squareServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out= res.getWriter();
		out.println("Welcome to the Squaring Servlet");
		System.out.println("sq called");
		//int k= Integer.parseInt(req.getParameter("k")); //URL rewriting
		
		/*HttpSession session= req.getSession();  //use of session
		int k= (int)session.getAttribute("k");*/
		
		int  k=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		
		System.out.print(k+" * " +k+" = ");
		k=k*k;
		System.out.print(k);
		out.println("The square of the sum = "+k);
		
		//using servlet config
				ServletConfig cgr = getServletConfig();
				String s=cgr.getInitParameter("name");
				out.println("Hello !"+s);
	}
}