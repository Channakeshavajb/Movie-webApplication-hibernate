package com.xworkz.movie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MovieServlet")
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MovieServlet() {

		System.out.println("movie Servlet..!!!");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		try
		{
		MovieDTO dto=new MovieDTO();
		String name=request.getParameter("name");
		String language=request.getParameter("Lang");
		String budget=request.getParameter("budget");
		String recomend=request.getParameter("rec");
		
		dto.setMovieName(name);
		dto.setLanguage(language);
		dto.setBudget(Double.parseDouble(budget));
		dto.setRecomend(Boolean.parseBoolean(recomend));

		MovieDAO dao=new MovieDAO();
		dao.save(dto);
		System.out.println(name+" "+language+" "+budget+" "+recomend);


	}
		catch(Exception exp)
		{
			System.err.println("error in Movie Servlet"+exp.getMessage());
		}
	}
}
