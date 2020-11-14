package com.app.sacbin.vehiculo.model.service;

import java.util.List;
import com.app.sacbin.vehiculo.model.entity.Vehiculo;

public interface IVehiculoService{
	
	public List<Vehiculo>  getAll();
	public Vehiculo store(Vehiculo vehiculo);

}
