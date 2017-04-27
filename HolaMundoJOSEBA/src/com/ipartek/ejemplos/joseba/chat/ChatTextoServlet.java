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

		String texto = request.getParameter("texto");

		HttpSession session = request.getSession();
		String nombre = (String) session.getAttribute("nombre");

		ServletContext application = getServletContext();
		String chat = (String) application.getAttribute("texto");

		if (chat == null) {

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
