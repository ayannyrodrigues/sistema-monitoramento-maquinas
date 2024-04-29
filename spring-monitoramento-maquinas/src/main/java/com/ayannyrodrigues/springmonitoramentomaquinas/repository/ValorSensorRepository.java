package com.ayannyrodrigues.springmonitoramentomaquinas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayannyrodrigues.springmonitoramentomaquinas.model.ValorSensor;

@Repository
public interface ValorSensorRepository extends JpaRepository<ValorSensor, Long> {

}
