package com.app.sacbin.vehiculo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.sacbin.vehiculo.model.entity.Vehiculo;
import com.app.sacbin.vehiculo.model.service.IVehiculoService;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping("/mostrar")
	public List<Vehiculo> findAll(){
		return vehiculoService.getAll();
	}
	

}
