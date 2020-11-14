package com.app.sacbin.vehiculo.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.sacbin.vehiculo.model.entity.Vehiculo;

public interface IVehiculoDao extends JpaRepository<Vehiculo, Long> {

}
