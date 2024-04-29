package com.ayannyrodrigues.springmonitoramentomaquinas.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ayannyrodrigues.springmonitoramentomaquinas.dto.ValorSensorDto;
import com.ayannyrodrigues.springmonitoramentomaquinas.model.ValorSensor;

@Mapper(componentModel = "spring")
public interface SensorMapper {

  ValorSensorDto valorSensorParaDto(ValorSensor valorSensor);

  @Mapping(source = "name", target = "nome")
  @Mapping(source = "data", target = "valorDoSensor")
  @Mapping(source = "timestamp", target = "dataHora")
  ValorSensor dtoParaValorSensor(ValorSensorDto dtoValorSensor);
}
