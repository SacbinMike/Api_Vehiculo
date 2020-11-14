package com.app.sacbin.vehiculo.model.dao;

import org.springframework.data.repository.CrudRepository;
import com.app.sacbin.vehiculo.model.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
