package com.ipartek.ejemplos.joseba;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ejemplos.joseba.dal.UsuariosDAL;
import com.ipartek.ejemplos.joseba.dal.UsuariosDalFijo;
import com.ipartek.ejemplos.joseba.tipos.Usuario;

@WebServlet(name = "Saludo", urlPatterns = { "/hola" })
public class HolaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		String nombre = request.getParameter("nombre"); /*
														 * http://localhost:8080/pruebas/hola
														 * ?nombre=Joseba Cuando pongamos
														 * en la url lo cogera (Ejemplo ?
														 * nombre=Joseba)
														 */

		String pass = request.getParameter("pass");

		Usuario usuario = new Usuario(nombre, pass);

		UsuariosDAL usuarioDAL = new UsuariosDalFijo();
		usuarioDAL.alta(new Usuario("joseba", "SuperS3creta"));

		if (usuarioDAL.validar(usuario))
			out.println("Bienvenido");
		else
			out.println("Usuario no valido");
		// if (nombre == null || nombre.trim().length() == 0) {
		// nombre = "Desconocido";
		// out.println("Hola Desconocido");

		// } else if ("joseba".equals(nombre) && "SuperS3creta".equals(pass))
		// out.println("Bienvenido " + nombre.toUpperCase());

		// else
		// out.println("No ha colado el usuario y contraseña");

		// out.println("Hola " + nombre);
		// out.println(new java.util.Date());
	}
}
