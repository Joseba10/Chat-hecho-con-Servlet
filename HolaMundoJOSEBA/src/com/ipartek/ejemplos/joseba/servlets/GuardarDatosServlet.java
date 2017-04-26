package com.ipartek.ejemplos.joseba.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/guardar")
public class GuardarDatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String dato = request.getParameter("dato"); // Recoges el dato despues del signo ?

		HttpSession session = request.getSession(); // Coges una session

		session.setAttribute("dato", dato); // El indice del valor que entra es el primero
											// y en el segundo se metera el dato que has
											// insertado

		ServletContext application = getServletContext();
		application.setAttribute("todos", "Comun");
	}
}
