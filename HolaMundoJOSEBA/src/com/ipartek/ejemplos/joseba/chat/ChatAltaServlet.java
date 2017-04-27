package com.ipartek.ejemplos.joseba.chat;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/chatalta")
public class ChatAltaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("nombre"); // Coges el parametro del html

		HttpSession session = request.getSession(); // Creas una sesion

		session.setAttribute("nombre", nombre); // Introduces los datos que va a tener la
												// sesion

		PrintWriter out = response.getWriter(); // Asignas a la variable out la habilidad
												// de escribir

		out.println(nombre);

		response.setContentType("text/html");

		out.println("<html>");
		out.println("<head>");
		out.println("<head>");
		out.println("<body>");
		out.println("<br>");
		out.println("<a href='chatver'>Al servidor</a>");

		out.println("</body>");

		out.println("</html>");
	}

}
