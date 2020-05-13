package com.Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class addServlet extends HttpServlet 
{
	//doPost function will work only for post requests.
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	//Two objects to get the response of the user
	{
		int i= Integer.parseInt(req.getParameter("num1")); //getting the first parameter and converting it into integer
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k= i+j; // adding the two number
		
		//For getting the output on console
		System.out.println(i+" + "+j+" = "+k);
		
				
		//For output on client machine
		PrintWriter out = res.getWriter();
		out.println("Result is: "+k);
		
		

		
		/*req.setAttribute("k",k);
		
		//Request dispatcher to pass the value to the other servlet
		RequestDispatcher rd= req.getRequestDispatcher("sq");
		//re is the request dispatcher
		rd.forward(req, res);//forwarding the same two objects to the servlet so that data can also be forwarded
		*/
		
		/*//SEND REDIRECT to pass the values to the other servlet
		res.sendRedirect("sq?k="+k); //URL rewriting
		*/
		
		/*//Use of session
		HttpSession session= req.getSession();
		session.setAttribute("k", k);
		
		res.sendRedirect("sq");*/
		
		//use of cookies
		Cookie cookie= new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		
	}
}