package controladores;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ejemplos.joseba.dal.UsuariosDAL;
import com.ipartek.ejemplos.joseba.dal.UsuariosDalFijo;
import com.ipartek.ejemplos.joseba.tipos.Usuario;

@WebServlet("/alta")
public class AltaServlet extends HttpServlet {
	/* Package */static final String USUARIO_DAL = "usuariosDAL";
	private static final long serialVersionUID = 1L;

	/* Package */static final String RUTA_ALTA = LoginServer.RUTA + "alta.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");
		String pass2 = request.getParameter("pass2");

		// Inicio sin datos
		// Datos incorrectos: sin rellenar,limite de caracteres,no coinciden
		// contraseñas
		// Las contraseñas deben de ser iguales
		// Datos correctos: guardar
		Usuario usuario = new Usuario(nombre, pass);
		boolean hayDatos = nombre != null && pass != null && pass2 != null;
		boolean datosCorrectos = validarCampo(nombre) && validarCampo(pass) && validarCampo(pass2);
		boolean passIguales = pass != null && pass.equals(pass2);

		if (hayDatos) {

			if (!datosCorrectos) {

				usuario.setErrores("Todos los campos son requeridos y con un minimo " + LoginServer.MINIMO_DE_CARACTERES + " caracteres");
				request.setAttribute("usuario", usuario);

			} else if (!passIguales) {
				usuario.setErrores("Las contraseñas deben de ser iguales");
				request.setAttribute("usuario", usuario);
			} else {
				ServletContext application = request.getServletContext();
				// Recoge datos
				UsuariosDAL usuariosDAL = (UsuariosDAL) application.getAttribute(USUARIO_DAL);
				// Si no existe el dato se crea
				if (usuariosDAL == null) {
					usuariosDAL = new UsuariosDalFijo();
				}
				usuariosDAL.alta(usuario);
				application.setAttribute(USUARIO_DAL, usuariosDAL);

			}

		}
		request.getRequestDispatcher(RUTA_ALTA).forward(request, response);
	}

	private boolean validarCampo(String campo) {
		return campo != null && campo.length() >= LoginServer.MINIMO_DE_CARACTERES;
	}
}
