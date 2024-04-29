package com.ayannyrodrigues.springmonitoramentomaquinas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "sensores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sensor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NonNull
  private String nome;

  @NonNull
  private String tipo;

  @NonNull
  @Column(name = "unidade_de_medicao")
  private String unidadeDeMedicao;

  private Double setpoint;

  @ManyToOne
  @JoinColumn(name = "id_maquina")
  private Maquina maquina;
}
