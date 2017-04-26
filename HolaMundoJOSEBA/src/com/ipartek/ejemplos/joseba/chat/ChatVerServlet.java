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

@WebServlet("/chatver")
public class ChatVerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		HttpSession sessiontexto = request.getSession();

		String nombre = (String) session.getAttribute("nombre");
		String texto = (String) sessiontexto.getAttribute("texto");

		PrintWriter out = response.getWriter();

		out.println(nombre + ": " + texto);

		ServletContext application = getServletContext();
		String por_defecto = (String) application.getAttribute("nombre");

		out.println(por_defecto);

	}

}
