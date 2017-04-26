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

		String nombre = request.getParameter("nombre");

		HttpSession session = request.getSession();

		session.setAttribute("nombre", nombre);

		PrintWriter out = response.getWriter();

		out.println(nombre);

		response.setContentType("text/html");

		out.println("<html>");

		out.println("<body>");

		out.println("<a href='/chatver'>Al servidor</a>");

		out.println("</body>");

		out.println("</html>");
	}

}
