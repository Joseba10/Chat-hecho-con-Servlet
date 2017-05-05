package com.ipartek.ejemplos.joseba.dal;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.ejemplos.joseba.tipos.Usuario;

public class UsuariosDalColeccion implements UsuariosDAL {

	private Map<String, Usuario> usuarios = new HashMap<String, Usuario>();

	@Override
	public void alta(Usuario usuario) {
		if (usuarios.containsKey(usuario.getNombre()))
			throw new UsuarioYaExiste("Ya existe el usuario " + usuario.getNombre());
		usuarios.put(usuario.getNombre(), usuario);
	}

	@Override
	public boolean validar(Usuario usuario) {
		return usuarios.containsValue(usuario);

	}
}
