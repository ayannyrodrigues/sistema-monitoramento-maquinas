package com.ayannyrodrigues.springmonitoramentomaquinas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "valores_dos_sensores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValorSensor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NonNull
  private String nome;

  @NonNull
  private Long dataHora;

  @NonNull
  @Column(name = "valor_do_sensor")
  private Double valorDoSensor;
}