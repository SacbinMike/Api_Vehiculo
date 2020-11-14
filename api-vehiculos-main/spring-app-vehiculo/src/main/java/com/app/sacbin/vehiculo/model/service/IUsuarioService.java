package com.app.sacbin.vehiculo.model.service;

import com.app.sacbin.vehiculo.model.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
