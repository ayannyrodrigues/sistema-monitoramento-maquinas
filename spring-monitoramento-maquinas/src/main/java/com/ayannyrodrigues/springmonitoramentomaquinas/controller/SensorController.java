package com.ayannyrodrigues.springmonitoramentomaquinas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayannyrodrigues.springmonitoramentomaquinas.dto.ValorSensorDto;

import com.ayannyrodrigues.springmonitoramentomaquinas.service.SensorService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class SensorController {

  @Autowired
  private SensorService sensorService;

  @GetMapping(value = "/valores-sensores")
  public ResponseEntity<List<ValorSensorDto>> obterValoresSensores() {

    try {
      var response = sensorService.obterValorDoSensor();
      return ResponseEntity.ok(response);

    } catch (Exception e) {
      return ResponseEntity.status(500).body(null);
    }
  }
}
