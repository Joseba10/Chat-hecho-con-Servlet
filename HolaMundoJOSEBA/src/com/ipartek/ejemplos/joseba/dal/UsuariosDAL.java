package com.ipartek.ejemplos.joseba.dal;

import com.ipartek.ejemplos.joseba.tipos.Usuario;

public interface UsuariosDAL {

	public void alta(Usuario usuario);

	public boolean validar(Usuario usuario);
}
