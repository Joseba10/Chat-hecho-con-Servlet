package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ejemplos.joseba.dal.UsuariosDAL;
import com.ipartek.ejemplos.joseba.dal.UsuariosDalFijo;
import com.ipartek.ejemplos.joseba.tipos.Usuario;

@WebServlet("/loginserver")
public class LoginServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Recoger datos de vistas
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");

		// Crear modelos en base a los datos
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPass(pass);

		// Llamada a la logica de negocio
		UsuariosDAL usuarioDal = new UsuariosDalFijo();

		// Solo para crear una base de datos falsa con el contenido de un usuario
		// "joseba","clemente"
		usuarioDal.alta(new Usuario("joseba", "clemente"));

		boolean esValido = usuarioDal.validar(usuario);

		// Redirigir a una nueva vista

		if (esValido) {
			request.getSession().setAttribute("usuario", usuario);

			response.sendRedirect("principal.jsp");
		}

		else

			response.sendRedirect("error.jsp");
	}

}
