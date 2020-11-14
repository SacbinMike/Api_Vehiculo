package com.app.sacbin.vehiculo.model.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.sacbin.vehiculo.model.dao.IVehiculoDao;
import com.app.sacbin.vehiculo.model.entity.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{
	
	@Autowired
	private IVehiculoDao vehiculoDao;

	@Override
	public List<Vehiculo> getAll() {
	
		return vehiculoDao.findAll();
	}

	@Override
	public Vehiculo store(Vehiculo vehiculo) {
		
		return vehiculoDao.save(vehiculo);
	}

}
