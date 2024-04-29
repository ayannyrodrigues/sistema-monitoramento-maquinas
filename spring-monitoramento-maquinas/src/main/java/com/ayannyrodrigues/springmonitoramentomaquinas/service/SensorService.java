package com.ayannyrodrigues.springmonitoramentomaquinas.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ayannyrodrigues.springmonitoramentomaquinas.dto.ValorSensorDto;
import com.ayannyrodrigues.springmonitoramentomaquinas.mapper.SensorMapper;
import com.ayannyrodrigues.springmonitoramentomaquinas.repository.ValorSensorRepository;

@Service
public class SensorService {

  private static final String URL_API_SENSORES = "http://localhost:5000/api/v1/sensors?name=";
  private static final List<String> LISTA_NOME_SENSORES = Arrays.asList("sensor1", "sensor2", "sensor3");

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private SensorMapper sensorMapper;

  @Autowired
  private ValorSensorRepository valorSensorRepository;

  public List<ValorSensorDto> obterValorDoSensor() {

    List<ValorSensorDto> listaSensor = new ArrayList<>();

    for (String nome : LISTA_NOME_SENSORES) {
      var urlConexaoApi = URL_API_SENSORES + nome;
      var retorno = restTemplate.getForObject(urlConexaoApi, ValorSensorDto.class);
      salvarValorDoSensor(retorno);

      listaSensor.add(retorno);
    }

    return listaSensor;
  }

  public void salvarValorDoSensor(ValorSensorDto dto) {
    var valorDoSensor = sensorMapper.dtoParaValorSensor(dto);
    valorSensorRepository.save(valorDoSensor);
  }
}
