package it.skedenpio.names.controllers;

import it.skedenpio.names.services.INameLookup;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@WebServlet("/")
public class NameListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		INameLookup nameList = (INameLookup) context.getBean("names");
		request.setAttribute("names", nameList.getNames());
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/name-list.jsp");
		dispatcher.forward(request, response);
	}
}
