package com.ipartek.ejemplos.joseba.chat;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChatTextoServlet
 */
@WebServlet("/cattext")
public class ChatTextoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String texto = request.getParameter("texto"); // Coges el parametro del html

		HttpSession session = request.getSession();// Creas una sesion
		String nombre = (String) session.getAttribute("nombre");// Recoges los datos
																// que va a tener la
																// sesion

		ServletContext application = getServletContext(); // Defines la variable como
															// global,por lo que todos lo
															// ven
		String chat = (String) application.getAttribute("texto"); // le das un valor

		if (chat == null) { // En caso de que la primera vez que reciba la informacion sea
							// nula

			chat = "Empezando a chatear...";
		}
		application.setAttribute("texto", chat + " <br>" + nombre + " ha dicho:" + texto);

		PrintWriter out = response.getWriter();

		out.println(texto);

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
