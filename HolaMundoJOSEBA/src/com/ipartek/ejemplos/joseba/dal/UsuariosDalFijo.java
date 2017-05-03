package com.ipartek.ejemplos.joseba.dal;

import com.ipartek.ejemplos.joseba.tipos.Usuario;

public class UsuariosDalFijo implements UsuariosDAL {

	private Usuario usuario;

	public void alta(Usuario usuario) {

		this.usuario = usuario;
	}

	public boolean validar(Usuario usuario) {

		return this.usuario != null && this.equals(usuario);
	}
}
