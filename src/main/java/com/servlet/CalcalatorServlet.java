package com.servlet;

import java.io.IOException;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calcalate")

public class CalcalatorServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		double i = Double.valueOf(req.getParameter("num1"));
		double j = Double.valueOf(req.getParameter("num2"));
		/*ServletInputStream in=req.getInputStream();
		byte[]buffer=new byte[4096];
		int n1;
		
		in.read();*/
		
	    String operator = req.getParameter("operator");
		
		double result=0;
		/*ServletInputStream number=new ServletInputStream(i);
		int num1 = number.read();
		int num2 = number.read();*/
		
		
		ServletOutputStream out;
		out=res.getOutputStream();
		
		if("+".equals(operator)){
			result = i + j;
		}
		else if("-".equals(operator)){
			result = i - j;
			out.println("Result= "+ result);
		}
		else if("*".equals(operator)){
			result = i * j;
			out.println("Result= "+ result);
		}
		else if("/".equals(operator)){
			result = i / j;
			out.println("Result= "+ result);
		}
		else if("/".equals(operator)){
			result = i / j;
			out.println("Result= "+ result);
		}
		else if("mod".equals(operator)){
			result = i % j;
			out.println("Result= "+ result);
		}
		else if("power".equals(operator)){
			result = Math.pow(i, j);
			out.println("Result= "+ result);
		}
		else if("-1".equals(operator)){
			out.println("Please select an operator!");
		}
		
		out.close();
		
	}

}
